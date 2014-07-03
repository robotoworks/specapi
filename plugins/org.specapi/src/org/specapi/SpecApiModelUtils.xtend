package org.specapi

import com.google.inject.Inject
import java.util.List
import org.eclipse.xtext.serializer.ISerializer
import org.specapi.specapiLang.Api
import org.specapi.specapiLang.ArrayType
import org.specapi.specapiLang.RequestBlock
import org.specapi.specapiLang.BooleanType
import org.specapi.specapiLang.DoubleType
import org.specapi.specapiLang.HeaderBlock
import org.specapi.specapiLang.HttpMethod
import org.specapi.specapiLang.IntegerType
import org.specapi.specapiLang.IntrinsicType
import org.specapi.specapiLang.LongType
import org.specapi.specapiLang.ParamsBlock
import org.specapi.specapiLang.ResponseBlock
import org.specapi.specapiLang.StringType
import org.specapi.specapiLang.Type
import org.specapi.specapiLang.UserType
import com.google.common.base.Strings

class SpecApiModelUtils {
	
	@Inject ISerializer serializer;
	
	def String getPathAsFormatString(HttpMethod method) {
		if(method.path == null)
			return ""
		
		var path = serializer.serialize(method.getPath()).trim();
		
		return path.replaceAll("[\\^a-zA-Z_0-9]+:[a-zA-Z_0-9]+", "%s")
	}	
	
	def String getPathAsString(HttpMethod method) {
		if(method.path == null) {
			return "";
		}
		
		var path = serializer.serialize(method.getPath()).trim();
		
		return path.replaceAll("([\\^a-zA-Z_0-9]+):[a-zA-Z_0-9]+", ":$1");
	}	
	
	def String getPathAsFormatString(HttpMethod method, String paramPrefix, String paramPostfix) {
		if(method.getPath() == null) {
			return "";
		}
		
		try {
			val path = serializer.serialize(method.getPath()).trim();
		
			return path.replaceAll("([\\^a-zA-Z_0-9]+):[a-zA-Z_0-9]+", 
				String.format("%s%s%s", paramPrefix, "$1", paramPostfix));
		} catch(Exception e) {
			return "";
		}
	}
	
	def String getPathAsIndexedFormatString(HttpMethod method, String paramPrefix, String paramPostfix) {
		if(method.getPath() == null) {
			return "";
		}
		
		try {
			var path = serializer.serialize(method.getPath()).trim();
		
			path = path.replaceAll("([\\^a-zA-Z_0-9]+):[a-zA-Z_0-9]+", ":$1");
			
			
			for(i : 0 ..< method.path.params.length) {
				var param = method.path.params.get(i)
				path = path.replace(":" + param.name, String.format("%s%s%s", paramPrefix, i, paramPostfix))
			}
			
			return path
				
		} catch(Exception e) {
			return "";
		}
	}
	
	private static val reservedWords = #[
		"source", "target","abstract","continue","continue","for",
		"new", "switch", "assert", "default",
		"goto","package","synchronized","boolean","do",
		"if","private","this","break","double","implements",
		"protected","throw","byte","else","import","public",
		"throws","case","enum","instanceof","return","transient",
		"catch","extends","int","short","try","char","final",
		"interface","static","void","class","finally","long",
		"strictfp","volatile","const","float","native","super","while"
	]

	def String getBoxedTypeSignature(Type type) {
		switch(type) {
			StringType: "String"
			BooleanType: "Boolean"
			IntegerType: "Integer"
			LongType: "Long"
			DoubleType: "Double"
			default: "!!!Unsupported!!!"
		}
	}
	
	def String signature(Type type){
		switch(type) {
			IntrinsicType: type.id
			UserType: type.declaration.name
			ArrayType: 
				if(type.elementType instanceof UserType)
					(type.elementType as UserType).declaration.name + "[]"
				else
					(type.elementType as IntrinsicType).id + "[]"
					
			default: "!!!Unsupported!!!"
		}
	}
	
	def String innerSignature(Type type){
		switch(type) {
			IntrinsicType: type.id
			UserType: type.declaration.name
			ArrayType: 
				if(type.elementType instanceof UserType)
					(type.elementType as UserType).declaration.name
				else
					(type.elementType as IntrinsicType).id
					
			default: "!!!Unsupported!!!"
		}
	}
	
	def boolean hasRequest(HttpMethod method){
		!method.blocks.filter(typeof(RequestBlock)).empty
	}
	
	def RequestBlock getRequest(HttpMethod method){
		method.blocks.filter(typeof(RequestBlock)).head
	}
	
	def ParamsBlock getParamsBlock(Api api){
		api.blocks.filter(typeof(ParamsBlock)).head
	}
	
	def HeaderBlock getHeaderBlock(Api api){
		api.blocks.filter(typeof(HeaderBlock)).head
	}
	
	def ParamsBlock getParamsBlock(HttpMethod method){
		method.blocks.filter(typeof(ParamsBlock)).head
	}
	
	def HeaderBlock getHeaderBlock(HttpMethod method){
		method.blocks.filter(typeof(HeaderBlock)).head
	}
	
	def ResponseBlock getResponseBlock(HttpMethod method){
		method.blocks.filter[
			var isResponse = it instanceof ResponseBlock
			if(!isResponse) return false
			var r = it as ResponseBlock
			(r.code >=200 || r.code == 0 || r.code <= 299)
		].head as ResponseBlock
	}
	
	def List<ResponseBlock> getResponseBlocks(HttpMethod method){
		method.blocks.filter(typeof(ResponseBlock)).toList
	}
	
	/**
	 * Adds an _ to the start if the string is a reserved word
	 * @param value
	 * @return
	 */
	def String escapeReserved(String value){
		// Reserved
		if(reservedWords.contains(value)){
			return "_" + value;
		} else {
			return value;
		}
	}
	
	def getResponseLine(ResponseBlock response) {
		var code = response.code
		var message = response.message
		if(code == 0) code = 200
		
		if(Strings.isNullOrEmpty(message)) message = getStandardResponseMessage(code)
		
		code + " " + message
	}
	
	val responseCodeIds = #{
		100 -> "Continue",
		101 -> "SwitchingProtocols",
		102 -> "Processing",
		200 -> "OK",
		201 -> "Created",
		202 -> "Accepted",
		203 -> "NonAuthoritativeInformation",
		204 -> "NoContent",
		205 -> "ResetContent",
		206 -> "PartialContent",
		207 -> "MultiStatus",
		208 -> "AlreadyReported",
		226 -> "IMUsed",
		300 -> "MultipleChoices",
		301 -> "MovedPermanently",
		302 -> "Found",
		303 -> "SeeOther",
		304 -> "NotModified",
		305 -> "UseProxy",
		306 -> "SwitchProxy",
		307 -> "TemporaryRedirect",
		308 -> "PermanentRedirect",
		400 -> "BadRequest",
		401 -> "Unauthorized",
		402 -> "PaymentRequired",
		403 -> "Forbidden",
		404 -> "NotFound",
		405 -> "MethodNotAllowed",
		406 -> "NotAcceptable",
		407 -> "ProxyAuthenticationRequired",
		408 -> "RequestTimeout",
		409 -> "Conflict",
		410 -> "Gone",
		411 -> "LengthRequired",
		412 -> "PreconditionFailed",
		413 -> "RequestEntityTooLarge",
		414 -> "RequestUriTooLong",
		415 -> "UnsupportedMediaType",
		416 -> "RequestedRangeNotSatisfiable",
		417 -> "ExpectationFailed",
		418 -> "ImATeapot",
		419 -> "AuthenticationTimeout",
		420 -> "EnhanceYourCalm",
		422 -> "UnprocessableEntity",
		423 -> "Locked",
		424 -> "FailedDependency",
		425 -> "UnorderedCollection",
		426 -> "UpgradeRequired",
		428 -> "PreconditionRequired",
		429 -> "TooManyRequests",
		431 -> "RequestHeaderFieldsTooLarge",
		440 -> "LoginTimeout",
		444 -> "NoResponse",
		449 -> "RetryWith",
		450 -> "BlockedByWindowsParentalControls",
		451 -> "UnavailableForLegalReasons",
		494 -> "RequestHeaderTooLarge",
		495 -> "CertError",
		496 -> "NoCert",
		497 -> "HttpToHttps",
		499 -> "ClientClosedRequest",
		500 -> "InternalServerError",
		501 -> "NotImplemented",
		502 -> "BadGateway",
		503 -> "ServiceUnavailable",
		504 -> "GatewayTimeout",
		505 -> "HTTPVersionNotSupported",
		506 -> "VariantAlsoNegotiates",
		507 -> "InsufficientStorage",
		508 -> "LoopDetected",
		509 -> "BandwidthLimitExceeded",
		510 -> "NotExtended",
		511 -> "NetworkAuthenticationRequired",
		520 -> "OriginError",
		521 -> "WebServerIsDown",
		522 -> "ConnectionTimedOut",
		523 -> "ProxyDeclinedRequest",
		524 -> "ATimeoutOccurred",
		598 -> "NetworkReadTimeoutError",
		599 -> "NetworkConnectTimeoutError"
	}
	
	def getStandardResponseMessageId(int code) {
		var id = responseCodeIds.get(code)
		if(id == null) return "Unspecified"
		return id;
	}
	
	def getStandardResponseMessage(int code) {

		switch(code) {
			case 100: "Continue"
			case 101: "Switching Protocols"
			case 102: "Processing"
			case 200: "OK"
			case 201: "Created"
			case 202: "Accepted"
			case 203: "Non-Authoritative Information"
			case 204: "No Content"
			case 205: "Reset Content"
			case 206: "Partial Content"
			case 207: "Multi-Status"
			case 208: "Already Reported"
			case 226: "IM Used"
			case 300: "Multiple Choices"
			case 301: "Moved Permanently"
			case 302: "Found"
			case 303: "See Other"
			case 304: "Not Modified"
			case 305: "Use Proxy"
			case 306: "Switch Proxy"
			case 307: "Temporary Redirect"
			case 308: "Permanent Redirect"
			case 400: "Bad Request"
			case 401: "Unauthorized"
			case 402: "Payment Required"
			case 403: "Forbidden"
			case 404: "Not Found"
			case 405: "Method Not Allowed"
			case 406: "Not Acceptable"
			case 407: "Proxy Authentication Required"
			case 408: "Request Timeout"
			case 409: "Conflict"
			case 410: "Gone"
			case 411: "Length Required"
			case 412: "Precondition Failed"
			case 413: "Request Entity Too Large"
			case 414: "Request-URI Too Long"
			case 415: "Unsupported Media Type"
			case 416: "Requested Range Not Satisfiable"
			case 417: "Expectation Failed"
			case 418: "I'm a teapot)"
			case 419: "Authentication Timeout"
			case 420: "Enhance Your Calm"
			case 422: "Unprocessable Entity"
			case 423: "Locked"
			case 424: "Failed Dependency"
			case 425: "Unordered Collection"
			case 426: "Upgrade Required"
			case 428: "Precondition Required"
			case 429: "Too Many Requests"
			case 431: "Request Header Fields Too Large"
			case 440: "Login Timeout"
			case 444: "No Response"
			case 449: "Retry With"
			case 450: "Blocked by Windows Parental Controls"
			case 451: "Unavailable For Legal Reasons"
			case 494: "Request Header Too Large"
			case 495: "Cert Error"
			case 496: "No Cert"
			case 497: "HTTP to HTTPS"
			case 499: "Client Closed Request"
			case 500: "Internal Server Error"
			case 501: "Not Implemented"
			case 502: "Bad Gateway"
			case 503: "Service Unavailable"
			case 504: "Gateway Timeout"
			case 505: "HTTP Version Not Supported"
			case 506: "Variant Also Negotiates"
			case 507: "Insufficient Storage"
			case 508: "Loop Detected"
			case 509: "Bandwidth Limit Exceeded"
			case 510: "Not Extended"
			case 511: "Network Authentication Required"
			case 520: "Origin Error"
			case 521: "Web server is down"
			case 522: "Connection timed out"
			case 523: "Proxy Declined Request"
			case 524: "A timeout occurred"
			case 598: "Network read timeout error"
			case 599: "Network connect timeout error"
			default: "Unspecified"
		}
	}
}