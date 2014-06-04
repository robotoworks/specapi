package org.specapi.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.specapi.services.SpecApiLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecApiLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_URL", "RULE_INTEGER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'get'", "'put'", "'post'", "'delete'", "'patch'", "'true'", "'false'", "'package'", "'api'", "'{'", "'}'", "'headers'", "','", "'/'", "'-'", "'params'", "'body'", "'response'", "'mixin'", "':'", "'='", "'extends'", "'.'", "'[]'", "'entity'", "'enum'", "'string'", "'boolean'", "'int'", "'long'", "'double'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=6;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_URL=7;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;
    public static final int RULE_INTEGER=8;

    // delegates
    // delegators


        public InternalSpecApiLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpecApiLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpecApiLangParser.tokenNames; }
    public String getGrammarFileName() { return "../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g"; }


     
     	private SpecApiLangGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SpecApiLangGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleSpecApiDocument"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:60:1: entryRuleSpecApiDocument : ruleSpecApiDocument EOF ;
    public final void entryRuleSpecApiDocument() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:61:1: ( ruleSpecApiDocument EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:62:1: ruleSpecApiDocument EOF
            {
             before(grammarAccess.getSpecApiDocumentRule()); 
            pushFollow(FOLLOW_ruleSpecApiDocument_in_entryRuleSpecApiDocument61);
            ruleSpecApiDocument();

            state._fsp--;

             after(grammarAccess.getSpecApiDocumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecApiDocument68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpecApiDocument"


    // $ANTLR start "ruleSpecApiDocument"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:69:1: ruleSpecApiDocument : ( ( rule__SpecApiDocument__Group__0 ) ) ;
    public final void ruleSpecApiDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:73:2: ( ( ( rule__SpecApiDocument__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:74:1: ( ( rule__SpecApiDocument__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:74:1: ( ( rule__SpecApiDocument__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:75:1: ( rule__SpecApiDocument__Group__0 )
            {
             before(grammarAccess.getSpecApiDocumentAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:76:1: ( rule__SpecApiDocument__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:76:2: rule__SpecApiDocument__Group__0
            {
            pushFollow(FOLLOW_rule__SpecApiDocument__Group__0_in_ruleSpecApiDocument94);
            rule__SpecApiDocument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecApiDocumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecApiDocument"


    // $ANTLR start "entryRuleDeclaration"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:88:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:89:1: ( ruleDeclaration EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:90:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration121);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:97:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:101:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:102:1: ( ( rule__Declaration__Alternatives ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:102:1: ( ( rule__Declaration__Alternatives ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:103:1: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:104:1: ( rule__Declaration__Alternatives )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:104:2: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration154);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleApi"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:116:1: entryRuleApi : ruleApi EOF ;
    public final void entryRuleApi() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:117:1: ( ruleApi EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:118:1: ruleApi EOF
            {
             before(grammarAccess.getApiRule()); 
            pushFollow(FOLLOW_ruleApi_in_entryRuleApi181);
            ruleApi();

            state._fsp--;

             after(grammarAccess.getApiRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApi188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApi"


    // $ANTLR start "ruleApi"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:125:1: ruleApi : ( ( rule__Api__Group__0 ) ) ;
    public final void ruleApi() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:129:2: ( ( ( rule__Api__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:130:1: ( ( rule__Api__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:130:1: ( ( rule__Api__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:131:1: ( rule__Api__Group__0 )
            {
             before(grammarAccess.getApiAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:132:1: ( rule__Api__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:132:2: rule__Api__Group__0
            {
            pushFollow(FOLLOW_rule__Api__Group__0_in_ruleApi214);
            rule__Api__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApiAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApi"


    // $ANTLR start "entryRuleServiceBlock"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:144:1: entryRuleServiceBlock : ruleServiceBlock EOF ;
    public final void entryRuleServiceBlock() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:145:1: ( ruleServiceBlock EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:146:1: ruleServiceBlock EOF
            {
             before(grammarAccess.getServiceBlockRule()); 
            pushFollow(FOLLOW_ruleServiceBlock_in_entryRuleServiceBlock241);
            ruleServiceBlock();

            state._fsp--;

             after(grammarAccess.getServiceBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceBlock248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServiceBlock"


    // $ANTLR start "ruleServiceBlock"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:153:1: ruleServiceBlock : ( ( rule__ServiceBlock__Alternatives ) ) ;
    public final void ruleServiceBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:157:2: ( ( ( rule__ServiceBlock__Alternatives ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:158:1: ( ( rule__ServiceBlock__Alternatives ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:158:1: ( ( rule__ServiceBlock__Alternatives ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:159:1: ( rule__ServiceBlock__Alternatives )
            {
             before(grammarAccess.getServiceBlockAccess().getAlternatives()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:160:1: ( rule__ServiceBlock__Alternatives )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:160:2: rule__ServiceBlock__Alternatives
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Alternatives_in_ruleServiceBlock274);
            rule__ServiceBlock__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getServiceBlockAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceBlock"


    // $ANTLR start "entryRuleHeaderBlock"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:172:1: entryRuleHeaderBlock : ruleHeaderBlock EOF ;
    public final void entryRuleHeaderBlock() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:173:1: ( ruleHeaderBlock EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:174:1: ruleHeaderBlock EOF
            {
             before(grammarAccess.getHeaderBlockRule()); 
            pushFollow(FOLLOW_ruleHeaderBlock_in_entryRuleHeaderBlock301);
            ruleHeaderBlock();

            state._fsp--;

             after(grammarAccess.getHeaderBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderBlock308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHeaderBlock"


    // $ANTLR start "ruleHeaderBlock"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:181:1: ruleHeaderBlock : ( ( rule__HeaderBlock__Group__0 ) ) ;
    public final void ruleHeaderBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:185:2: ( ( ( rule__HeaderBlock__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:186:1: ( ( rule__HeaderBlock__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:186:1: ( ( rule__HeaderBlock__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:187:1: ( rule__HeaderBlock__Group__0 )
            {
             before(grammarAccess.getHeaderBlockAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:188:1: ( rule__HeaderBlock__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:188:2: rule__HeaderBlock__Group__0
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group__0_in_ruleHeaderBlock334);
            rule__HeaderBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeaderBlock"


    // $ANTLR start "entryRuleHttpMethod"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:200:1: entryRuleHttpMethod : ruleHttpMethod EOF ;
    public final void entryRuleHttpMethod() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:201:1: ( ruleHttpMethod EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:202:1: ruleHttpMethod EOF
            {
             before(grammarAccess.getHttpMethodRule()); 
            pushFollow(FOLLOW_ruleHttpMethod_in_entryRuleHttpMethod361);
            ruleHttpMethod();

            state._fsp--;

             after(grammarAccess.getHttpMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpMethod368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHttpMethod"


    // $ANTLR start "ruleHttpMethod"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:209:1: ruleHttpMethod : ( ( rule__HttpMethod__Group__0 ) ) ;
    public final void ruleHttpMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:213:2: ( ( ( rule__HttpMethod__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:214:1: ( ( rule__HttpMethod__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:214:1: ( ( rule__HttpMethod__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:215:1: ( rule__HttpMethod__Group__0 )
            {
             before(grammarAccess.getHttpMethodAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:216:1: ( rule__HttpMethod__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:216:2: rule__HttpMethod__Group__0
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__0_in_ruleHttpMethod394);
            rule__HttpMethod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHttpMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHttpMethod"


    // $ANTLR start "entryRuleHttpMethodBlock"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:228:1: entryRuleHttpMethodBlock : ruleHttpMethodBlock EOF ;
    public final void entryRuleHttpMethodBlock() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:229:1: ( ruleHttpMethodBlock EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:230:1: ruleHttpMethodBlock EOF
            {
             before(grammarAccess.getHttpMethodBlockRule()); 
            pushFollow(FOLLOW_ruleHttpMethodBlock_in_entryRuleHttpMethodBlock421);
            ruleHttpMethodBlock();

            state._fsp--;

             after(grammarAccess.getHttpMethodBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpMethodBlock428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHttpMethodBlock"


    // $ANTLR start "ruleHttpMethodBlock"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:237:1: ruleHttpMethodBlock : ( ( rule__HttpMethodBlock__Alternatives ) ) ;
    public final void ruleHttpMethodBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:241:2: ( ( ( rule__HttpMethodBlock__Alternatives ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:242:1: ( ( rule__HttpMethodBlock__Alternatives ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:242:1: ( ( rule__HttpMethodBlock__Alternatives ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:243:1: ( rule__HttpMethodBlock__Alternatives )
            {
             before(grammarAccess.getHttpMethodBlockAccess().getAlternatives()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:244:1: ( rule__HttpMethodBlock__Alternatives )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:244:2: rule__HttpMethodBlock__Alternatives
            {
            pushFollow(FOLLOW_rule__HttpMethodBlock__Alternatives_in_ruleHttpMethodBlock454);
            rule__HttpMethodBlock__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHttpMethodBlockAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHttpMethodBlock"


    // $ANTLR start "entryRulePath"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:256:1: entryRulePath : rulePath EOF ;
    public final void entryRulePath() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:257:1: ( rulePath EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:258:1: rulePath EOF
            {
             before(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_rulePath_in_entryRulePath481);
            rulePath();

            state._fsp--;

             after(grammarAccess.getPathRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePath488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:265:1: rulePath : ( ( rule__Path__Group__0 ) ) ;
    public final void rulePath() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:269:2: ( ( ( rule__Path__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:270:1: ( ( rule__Path__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:270:1: ( ( rule__Path__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:271:1: ( rule__Path__Group__0 )
            {
             before(grammarAccess.getPathAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:272:1: ( rule__Path__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:272:2: rule__Path__Group__0
            {
            pushFollow(FOLLOW_rule__Path__Group__0_in_rulePath514);
            rule__Path__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleArbitraryPathSegment"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:284:1: entryRuleArbitraryPathSegment : ruleArbitraryPathSegment EOF ;
    public final void entryRuleArbitraryPathSegment() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:285:1: ( ruleArbitraryPathSegment EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:286:1: ruleArbitraryPathSegment EOF
            {
             before(grammarAccess.getArbitraryPathSegmentRule()); 
            pushFollow(FOLLOW_ruleArbitraryPathSegment_in_entryRuleArbitraryPathSegment541);
            ruleArbitraryPathSegment();

            state._fsp--;

             after(grammarAccess.getArbitraryPathSegmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArbitraryPathSegment548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArbitraryPathSegment"


    // $ANTLR start "ruleArbitraryPathSegment"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:293:1: ruleArbitraryPathSegment : ( ( rule__ArbitraryPathSegment__Group__0 ) ) ;
    public final void ruleArbitraryPathSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:297:2: ( ( ( rule__ArbitraryPathSegment__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:298:1: ( ( rule__ArbitraryPathSegment__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:298:1: ( ( rule__ArbitraryPathSegment__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:299:1: ( rule__ArbitraryPathSegment__Group__0 )
            {
             before(grammarAccess.getArbitraryPathSegmentAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:300:1: ( rule__ArbitraryPathSegment__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:300:2: rule__ArbitraryPathSegment__Group__0
            {
            pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group__0_in_ruleArbitraryPathSegment574);
            rule__ArbitraryPathSegment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArbitraryPathSegmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArbitraryPathSegment"


    // $ANTLR start "entryRuleParamsBlock"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:312:1: entryRuleParamsBlock : ruleParamsBlock EOF ;
    public final void entryRuleParamsBlock() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:313:1: ( ruleParamsBlock EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:314:1: ruleParamsBlock EOF
            {
             before(grammarAccess.getParamsBlockRule()); 
            pushFollow(FOLLOW_ruleParamsBlock_in_entryRuleParamsBlock601);
            ruleParamsBlock();

            state._fsp--;

             after(grammarAccess.getParamsBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamsBlock608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParamsBlock"


    // $ANTLR start "ruleParamsBlock"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:321:1: ruleParamsBlock : ( ( rule__ParamsBlock__Group__0 ) ) ;
    public final void ruleParamsBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:325:2: ( ( ( rule__ParamsBlock__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:326:1: ( ( rule__ParamsBlock__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:326:1: ( ( rule__ParamsBlock__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:327:1: ( rule__ParamsBlock__Group__0 )
            {
             before(grammarAccess.getParamsBlockAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:328:1: ( rule__ParamsBlock__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:328:2: rule__ParamsBlock__Group__0
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__0_in_ruleParamsBlock634);
            rule__ParamsBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamsBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParamsBlock"


    // $ANTLR start "entryRuleLiteral"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:340:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:341:1: ( ruleLiteral EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:342:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral661);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:349:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:353:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:354:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:354:1: ( ( rule__Literal__Alternatives ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:355:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:356:1: ( rule__Literal__Alternatives )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:356:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral694);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBodyBlock"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:368:1: entryRuleBodyBlock : ruleBodyBlock EOF ;
    public final void entryRuleBodyBlock() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:369:1: ( ruleBodyBlock EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:370:1: ruleBodyBlock EOF
            {
             before(grammarAccess.getBodyBlockRule()); 
            pushFollow(FOLLOW_ruleBodyBlock_in_entryRuleBodyBlock721);
            ruleBodyBlock();

            state._fsp--;

             after(grammarAccess.getBodyBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyBlock728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBodyBlock"


    // $ANTLR start "ruleBodyBlock"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:377:1: ruleBodyBlock : ( ( rule__BodyBlock__Group__0 ) ) ;
    public final void ruleBodyBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:381:2: ( ( ( rule__BodyBlock__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:382:1: ( ( rule__BodyBlock__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:382:1: ( ( rule__BodyBlock__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:383:1: ( rule__BodyBlock__Group__0 )
            {
             before(grammarAccess.getBodyBlockAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:384:1: ( rule__BodyBlock__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:384:2: rule__BodyBlock__Group__0
            {
            pushFollow(FOLLOW_rule__BodyBlock__Group__0_in_ruleBodyBlock754);
            rule__BodyBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBodyBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBodyBlock"


    // $ANTLR start "entryRuleResponseBlock"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:396:1: entryRuleResponseBlock : ruleResponseBlock EOF ;
    public final void entryRuleResponseBlock() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:397:1: ( ruleResponseBlock EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:398:1: ruleResponseBlock EOF
            {
             before(grammarAccess.getResponseBlockRule()); 
            pushFollow(FOLLOW_ruleResponseBlock_in_entryRuleResponseBlock781);
            ruleResponseBlock();

            state._fsp--;

             after(grammarAccess.getResponseBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResponseBlock788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResponseBlock"


    // $ANTLR start "ruleResponseBlock"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:405:1: ruleResponseBlock : ( ( rule__ResponseBlock__Group__0 ) ) ;
    public final void ruleResponseBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:409:2: ( ( ( rule__ResponseBlock__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:410:1: ( ( rule__ResponseBlock__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:410:1: ( ( rule__ResponseBlock__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:411:1: ( rule__ResponseBlock__Group__0 )
            {
             before(grammarAccess.getResponseBlockAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:412:1: ( rule__ResponseBlock__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:412:2: rule__ResponseBlock__Group__0
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__0_in_ruleResponseBlock814);
            rule__ResponseBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResponseBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResponseBlock"


    // $ANTLR start "entryRuleBlockType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:424:1: entryRuleBlockType : ruleBlockType EOF ;
    public final void entryRuleBlockType() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:425:1: ( ruleBlockType EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:426:1: ruleBlockType EOF
            {
             before(grammarAccess.getBlockTypeRule()); 
            pushFollow(FOLLOW_ruleBlockType_in_entryRuleBlockType841);
            ruleBlockType();

            state._fsp--;

             after(grammarAccess.getBlockTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockType848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlockType"


    // $ANTLR start "ruleBlockType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:433:1: ruleBlockType : ( ( rule__BlockType__Alternatives ) ) ;
    public final void ruleBlockType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:437:2: ( ( ( rule__BlockType__Alternatives ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:438:1: ( ( rule__BlockType__Alternatives ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:438:1: ( ( rule__BlockType__Alternatives ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:439:1: ( rule__BlockType__Alternatives )
            {
             before(grammarAccess.getBlockTypeAccess().getAlternatives()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:440:1: ( rule__BlockType__Alternatives )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:440:2: rule__BlockType__Alternatives
            {
            pushFollow(FOLLOW_rule__BlockType__Alternatives_in_ruleBlockType874);
            rule__BlockType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBlockTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlockType"


    // $ANTLR start "entryRuleMember"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:452:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:453:1: ( ruleMember EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:454:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember901);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:461:1: ruleMember : ( ( rule__Member__Group__0 ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:465:2: ( ( ( rule__Member__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:466:1: ( ( rule__Member__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:466:1: ( ( rule__Member__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:467:1: ( rule__Member__Group__0 )
            {
             before(grammarAccess.getMemberAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:468:1: ( rule__Member__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:468:2: rule__Member__Group__0
            {
            pushFollow(FOLLOW_rule__Member__Group__0_in_ruleMember934);
            rule__Member__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:480:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:481:1: ( ruleType EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:482:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType961);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:489:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:493:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:494:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:494:1: ( ( rule__Type__Alternatives ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:495:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:496:1: ( rule__Type__Alternatives )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:496:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType994);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleArrayType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:508:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:509:1: ( ruleArrayType EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:510:1: ruleArrayType EOF
            {
             before(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType1021);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:517:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:521:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:522:1: ( ( rule__ArrayType__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:522:1: ( ( rule__ArrayType__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:523:1: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:524:1: ( rule__ArrayType__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:524:2: rule__ArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType1054);
            rule__ArrayType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleUserType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:536:1: entryRuleUserType : ruleUserType EOF ;
    public final void entryRuleUserType() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:537:1: ( ruleUserType EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:538:1: ruleUserType EOF
            {
             before(grammarAccess.getUserTypeRule()); 
            pushFollow(FOLLOW_ruleUserType_in_entryRuleUserType1081);
            ruleUserType();

            state._fsp--;

             after(grammarAccess.getUserTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserType1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUserType"


    // $ANTLR start "ruleUserType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:545:1: ruleUserType : ( ( rule__UserType__DeclarationAssignment ) ) ;
    public final void ruleUserType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:549:2: ( ( ( rule__UserType__DeclarationAssignment ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:550:1: ( ( rule__UserType__DeclarationAssignment ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:550:1: ( ( rule__UserType__DeclarationAssignment ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:551:1: ( rule__UserType__DeclarationAssignment )
            {
             before(grammarAccess.getUserTypeAccess().getDeclarationAssignment()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:552:1: ( rule__UserType__DeclarationAssignment )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:552:2: rule__UserType__DeclarationAssignment
            {
            pushFollow(FOLLOW_rule__UserType__DeclarationAssignment_in_ruleUserType1114);
            rule__UserType__DeclarationAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUserTypeAccess().getDeclarationAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUserType"


    // $ANTLR start "entryRuleUserTypeDeclaration"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:564:1: entryRuleUserTypeDeclaration : ruleUserTypeDeclaration EOF ;
    public final void entryRuleUserTypeDeclaration() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:565:1: ( ruleUserTypeDeclaration EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:566:1: ruleUserTypeDeclaration EOF
            {
             before(grammarAccess.getUserTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleUserTypeDeclaration_in_entryRuleUserTypeDeclaration1141);
            ruleUserTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getUserTypeDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserTypeDeclaration1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUserTypeDeclaration"


    // $ANTLR start "ruleUserTypeDeclaration"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:573:1: ruleUserTypeDeclaration : ( ( rule__UserTypeDeclaration__Alternatives ) ) ;
    public final void ruleUserTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:577:2: ( ( ( rule__UserTypeDeclaration__Alternatives ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:578:1: ( ( rule__UserTypeDeclaration__Alternatives ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:578:1: ( ( rule__UserTypeDeclaration__Alternatives ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:579:1: ( rule__UserTypeDeclaration__Alternatives )
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getAlternatives()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:580:1: ( rule__UserTypeDeclaration__Alternatives )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:580:2: rule__UserTypeDeclaration__Alternatives
            {
            pushFollow(FOLLOW_rule__UserTypeDeclaration__Alternatives_in_ruleUserTypeDeclaration1174);
            rule__UserTypeDeclaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUserTypeDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUserTypeDeclaration"


    // $ANTLR start "entryRuleComplexTypeDeclaration"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:592:1: entryRuleComplexTypeDeclaration : ruleComplexTypeDeclaration EOF ;
    public final void entryRuleComplexTypeDeclaration() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:593:1: ( ruleComplexTypeDeclaration EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:594:1: ruleComplexTypeDeclaration EOF
            {
             before(grammarAccess.getComplexTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleComplexTypeDeclaration_in_entryRuleComplexTypeDeclaration1201);
            ruleComplexTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getComplexTypeDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeDeclaration1208); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplexTypeDeclaration"


    // $ANTLR start "ruleComplexTypeDeclaration"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:601:1: ruleComplexTypeDeclaration : ( ( rule__ComplexTypeDeclaration__Group__0 ) ) ;
    public final void ruleComplexTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:605:2: ( ( ( rule__ComplexTypeDeclaration__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:606:1: ( ( rule__ComplexTypeDeclaration__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:606:1: ( ( rule__ComplexTypeDeclaration__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:607:1: ( rule__ComplexTypeDeclaration__Group__0 )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:608:1: ( rule__ComplexTypeDeclaration__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:608:2: rule__ComplexTypeDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__0_in_ruleComplexTypeDeclaration1234);
            rule__ComplexTypeDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexTypeDeclaration"


    // $ANTLR start "entryRuleEnumTypeDeclaration"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:620:1: entryRuleEnumTypeDeclaration : ruleEnumTypeDeclaration EOF ;
    public final void entryRuleEnumTypeDeclaration() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:621:1: ( ruleEnumTypeDeclaration EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:622:1: ruleEnumTypeDeclaration EOF
            {
             before(grammarAccess.getEnumTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleEnumTypeDeclaration_in_entryRuleEnumTypeDeclaration1261);
            ruleEnumTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getEnumTypeDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumTypeDeclaration1268); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumTypeDeclaration"


    // $ANTLR start "ruleEnumTypeDeclaration"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:629:1: ruleEnumTypeDeclaration : ( ( rule__EnumTypeDeclaration__Group__0 ) ) ;
    public final void ruleEnumTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:633:2: ( ( ( rule__EnumTypeDeclaration__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:634:1: ( ( rule__EnumTypeDeclaration__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:634:1: ( ( rule__EnumTypeDeclaration__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:635:1: ( rule__EnumTypeDeclaration__Group__0 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:636:1: ( rule__EnumTypeDeclaration__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:636:2: rule__EnumTypeDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__0_in_ruleEnumTypeDeclaration1294);
            rule__EnumTypeDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumTypeDeclaration"


    // $ANTLR start "entryRuleEnumTypeLiteral"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:648:1: entryRuleEnumTypeLiteral : ruleEnumTypeLiteral EOF ;
    public final void entryRuleEnumTypeLiteral() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:649:1: ( ruleEnumTypeLiteral EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:650:1: ruleEnumTypeLiteral EOF
            {
             before(grammarAccess.getEnumTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumTypeLiteral_in_entryRuleEnumTypeLiteral1321);
            ruleEnumTypeLiteral();

            state._fsp--;

             after(grammarAccess.getEnumTypeLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumTypeLiteral1328); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumTypeLiteral"


    // $ANTLR start "ruleEnumTypeLiteral"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:657:1: ruleEnumTypeLiteral : ( ( rule__EnumTypeLiteral__Group__0 ) ) ;
    public final void ruleEnumTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:661:2: ( ( ( rule__EnumTypeLiteral__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:662:1: ( ( rule__EnumTypeLiteral__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:662:1: ( ( rule__EnumTypeLiteral__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:663:1: ( rule__EnumTypeLiteral__Group__0 )
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:664:1: ( rule__EnumTypeLiteral__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:664:2: rule__EnumTypeLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__0_in_ruleEnumTypeLiteral1354);
            rule__EnumTypeLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumTypeLiteral"


    // $ANTLR start "entryRuleEnumMember"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:676:1: entryRuleEnumMember : ruleEnumMember EOF ;
    public final void entryRuleEnumMember() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:677:1: ( ruleEnumMember EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:678:1: ruleEnumMember EOF
            {
             before(grammarAccess.getEnumMemberRule()); 
            pushFollow(FOLLOW_ruleEnumMember_in_entryRuleEnumMember1381);
            ruleEnumMember();

            state._fsp--;

             after(grammarAccess.getEnumMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMember1388); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumMember"


    // $ANTLR start "ruleEnumMember"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:685:1: ruleEnumMember : ( ( rule__EnumMember__Group__0 ) ) ;
    public final void ruleEnumMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:689:2: ( ( ( rule__EnumMember__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:690:1: ( ( rule__EnumMember__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:690:1: ( ( rule__EnumMember__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:691:1: ( rule__EnumMember__Group__0 )
            {
             before(grammarAccess.getEnumMemberAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:692:1: ( rule__EnumMember__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:692:2: rule__EnumMember__Group__0
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__0_in_ruleEnumMember1414);
            rule__EnumMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumMember"


    // $ANTLR start "entryRuleComplexTypeLiteral"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:704:1: entryRuleComplexTypeLiteral : ruleComplexTypeLiteral EOF ;
    public final void entryRuleComplexTypeLiteral() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:705:1: ( ruleComplexTypeLiteral EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:706:1: ruleComplexTypeLiteral EOF
            {
             before(grammarAccess.getComplexTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_entryRuleComplexTypeLiteral1441);
            ruleComplexTypeLiteral();

            state._fsp--;

             after(grammarAccess.getComplexTypeLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeLiteral1448); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplexTypeLiteral"


    // $ANTLR start "ruleComplexTypeLiteral"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:713:1: ruleComplexTypeLiteral : ( ( rule__ComplexTypeLiteral__Group__0 ) ) ;
    public final void ruleComplexTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:717:2: ( ( ( rule__ComplexTypeLiteral__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:718:1: ( ( rule__ComplexTypeLiteral__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:718:1: ( ( rule__ComplexTypeLiteral__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:719:1: ( rule__ComplexTypeLiteral__Group__0 )
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:720:1: ( rule__ComplexTypeLiteral__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:720:2: rule__ComplexTypeLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__0_in_ruleComplexTypeLiteral1474);
            rule__ComplexTypeLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexTypeLiteral"


    // $ANTLR start "entryRuleIntrinsicType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:732:1: entryRuleIntrinsicType : ruleIntrinsicType EOF ;
    public final void entryRuleIntrinsicType() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:733:1: ( ruleIntrinsicType EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:734:1: ruleIntrinsicType EOF
            {
             before(grammarAccess.getIntrinsicTypeRule()); 
            pushFollow(FOLLOW_ruleIntrinsicType_in_entryRuleIntrinsicType1501);
            ruleIntrinsicType();

            state._fsp--;

             after(grammarAccess.getIntrinsicTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntrinsicType1508); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntrinsicType"


    // $ANTLR start "ruleIntrinsicType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:741:1: ruleIntrinsicType : ( ( rule__IntrinsicType__Alternatives ) ) ;
    public final void ruleIntrinsicType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:745:2: ( ( ( rule__IntrinsicType__Alternatives ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:746:1: ( ( rule__IntrinsicType__Alternatives ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:746:1: ( ( rule__IntrinsicType__Alternatives ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:747:1: ( rule__IntrinsicType__Alternatives )
            {
             before(grammarAccess.getIntrinsicTypeAccess().getAlternatives()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:748:1: ( rule__IntrinsicType__Alternatives )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:748:2: rule__IntrinsicType__Alternatives
            {
            pushFollow(FOLLOW_rule__IntrinsicType__Alternatives_in_ruleIntrinsicType1534);
            rule__IntrinsicType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntrinsicTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntrinsicType"


    // $ANTLR start "entryRuleStringType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:760:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:761:1: ( ruleStringType EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:762:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType1561);
            ruleStringType();

            state._fsp--;

             after(grammarAccess.getStringTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType1568); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:769:1: ruleStringType : ( ( rule__StringType__IdAssignment ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:773:2: ( ( ( rule__StringType__IdAssignment ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:774:1: ( ( rule__StringType__IdAssignment ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:774:1: ( ( rule__StringType__IdAssignment ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:775:1: ( rule__StringType__IdAssignment )
            {
             before(grammarAccess.getStringTypeAccess().getIdAssignment()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:776:1: ( rule__StringType__IdAssignment )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:776:2: rule__StringType__IdAssignment
            {
            pushFollow(FOLLOW_rule__StringType__IdAssignment_in_ruleStringType1594);
            rule__StringType__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getIdAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleBooleanType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:788:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:789:1: ( ruleBooleanType EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:790:1: ruleBooleanType EOF
            {
             before(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType1621);
            ruleBooleanType();

            state._fsp--;

             after(grammarAccess.getBooleanTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType1628); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:797:1: ruleBooleanType : ( ( rule__BooleanType__IdAssignment ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:801:2: ( ( ( rule__BooleanType__IdAssignment ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:802:1: ( ( rule__BooleanType__IdAssignment ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:802:1: ( ( rule__BooleanType__IdAssignment ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:803:1: ( rule__BooleanType__IdAssignment )
            {
             before(grammarAccess.getBooleanTypeAccess().getIdAssignment()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:804:1: ( rule__BooleanType__IdAssignment )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:804:2: rule__BooleanType__IdAssignment
            {
            pushFollow(FOLLOW_rule__BooleanType__IdAssignment_in_ruleBooleanType1654);
            rule__BooleanType__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTypeAccess().getIdAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleNumericType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:816:1: entryRuleNumericType : ruleNumericType EOF ;
    public final void entryRuleNumericType() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:817:1: ( ruleNumericType EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:818:1: ruleNumericType EOF
            {
             before(grammarAccess.getNumericTypeRule()); 
            pushFollow(FOLLOW_ruleNumericType_in_entryRuleNumericType1681);
            ruleNumericType();

            state._fsp--;

             after(grammarAccess.getNumericTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericType1688); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumericType"


    // $ANTLR start "ruleNumericType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:825:1: ruleNumericType : ( ( rule__NumericType__Alternatives ) ) ;
    public final void ruleNumericType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:829:2: ( ( ( rule__NumericType__Alternatives ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:830:1: ( ( rule__NumericType__Alternatives ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:830:1: ( ( rule__NumericType__Alternatives ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:831:1: ( rule__NumericType__Alternatives )
            {
             before(grammarAccess.getNumericTypeAccess().getAlternatives()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:832:1: ( rule__NumericType__Alternatives )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:832:2: rule__NumericType__Alternatives
            {
            pushFollow(FOLLOW_rule__NumericType__Alternatives_in_ruleNumericType1714);
            rule__NumericType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumericType"


    // $ANTLR start "entryRuleIntegerType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:844:1: entryRuleIntegerType : ruleIntegerType EOF ;
    public final void entryRuleIntegerType() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:845:1: ( ruleIntegerType EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:846:1: ruleIntegerType EOF
            {
             before(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_ruleIntegerType_in_entryRuleIntegerType1741);
            ruleIntegerType();

            state._fsp--;

             after(grammarAccess.getIntegerTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerType1748); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:853:1: ruleIntegerType : ( ( rule__IntegerType__IdAssignment ) ) ;
    public final void ruleIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:857:2: ( ( ( rule__IntegerType__IdAssignment ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:858:1: ( ( rule__IntegerType__IdAssignment ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:858:1: ( ( rule__IntegerType__IdAssignment ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:859:1: ( rule__IntegerType__IdAssignment )
            {
             before(grammarAccess.getIntegerTypeAccess().getIdAssignment()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:860:1: ( rule__IntegerType__IdAssignment )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:860:2: rule__IntegerType__IdAssignment
            {
            pushFollow(FOLLOW_rule__IntegerType__IdAssignment_in_ruleIntegerType1774);
            rule__IntegerType__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerTypeAccess().getIdAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleLongType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:872:1: entryRuleLongType : ruleLongType EOF ;
    public final void entryRuleLongType() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:873:1: ( ruleLongType EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:874:1: ruleLongType EOF
            {
             before(grammarAccess.getLongTypeRule()); 
            pushFollow(FOLLOW_ruleLongType_in_entryRuleLongType1801);
            ruleLongType();

            state._fsp--;

             after(grammarAccess.getLongTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongType1808); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLongType"


    // $ANTLR start "ruleLongType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:881:1: ruleLongType : ( ( rule__LongType__IdAssignment ) ) ;
    public final void ruleLongType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:885:2: ( ( ( rule__LongType__IdAssignment ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:886:1: ( ( rule__LongType__IdAssignment ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:886:1: ( ( rule__LongType__IdAssignment ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:887:1: ( rule__LongType__IdAssignment )
            {
             before(grammarAccess.getLongTypeAccess().getIdAssignment()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:888:1: ( rule__LongType__IdAssignment )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:888:2: rule__LongType__IdAssignment
            {
            pushFollow(FOLLOW_rule__LongType__IdAssignment_in_ruleLongType1834);
            rule__LongType__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLongTypeAccess().getIdAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLongType"


    // $ANTLR start "entryRuleDoubleType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:900:1: entryRuleDoubleType : ruleDoubleType EOF ;
    public final void entryRuleDoubleType() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:901:1: ( ruleDoubleType EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:902:1: ruleDoubleType EOF
            {
             before(grammarAccess.getDoubleTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleType_in_entryRuleDoubleType1861);
            ruleDoubleType();

            state._fsp--;

             after(grammarAccess.getDoubleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleType1868); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoubleType"


    // $ANTLR start "ruleDoubleType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:909:1: ruleDoubleType : ( ( rule__DoubleType__IdAssignment ) ) ;
    public final void ruleDoubleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:913:2: ( ( ( rule__DoubleType__IdAssignment ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:914:1: ( ( rule__DoubleType__IdAssignment ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:914:1: ( ( rule__DoubleType__IdAssignment ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:915:1: ( rule__DoubleType__IdAssignment )
            {
             before(grammarAccess.getDoubleTypeAccess().getIdAssignment()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:916:1: ( rule__DoubleType__IdAssignment )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:916:2: rule__DoubleType__IdAssignment
            {
            pushFollow(FOLLOW_rule__DoubleType__IdAssignment_in_ruleDoubleType1894);
            rule__DoubleType__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDoubleTypeAccess().getIdAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoubleType"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:928:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:929:1: ( ruleQualifiedName EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:930:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1921);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1928); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:937:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:941:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:942:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:942:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:943:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:944:1: ( rule__QualifiedName__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:944:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1954);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleSignedNumber"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:956:1: entryRuleSignedNumber : ruleSignedNumber EOF ;
    public final void entryRuleSignedNumber() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:957:1: ( ruleSignedNumber EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:958:1: ruleSignedNumber EOF
            {
             before(grammarAccess.getSignedNumberRule()); 
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber1981);
            ruleSignedNumber();

            state._fsp--;

             after(grammarAccess.getSignedNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber1988); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignedNumber"


    // $ANTLR start "ruleSignedNumber"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:965:1: ruleSignedNumber : ( ( rule__SignedNumber__Group__0 ) ) ;
    public final void ruleSignedNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:969:2: ( ( ( rule__SignedNumber__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:970:1: ( ( rule__SignedNumber__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:970:1: ( ( rule__SignedNumber__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:971:1: ( rule__SignedNumber__Group__0 )
            {
             before(grammarAccess.getSignedNumberAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:972:1: ( rule__SignedNumber__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:972:2: rule__SignedNumber__Group__0
            {
            pushFollow(FOLLOW_rule__SignedNumber__Group__0_in_ruleSignedNumber2014);
            rule__SignedNumber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignedNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignedNumber"


    // $ANTLR start "ruleHttpMethodType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:985:1: ruleHttpMethodType : ( ( rule__HttpMethodType__Alternatives ) ) ;
    public final void ruleHttpMethodType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:989:1: ( ( ( rule__HttpMethodType__Alternatives ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:990:1: ( ( rule__HttpMethodType__Alternatives ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:990:1: ( ( rule__HttpMethodType__Alternatives ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:991:1: ( rule__HttpMethodType__Alternatives )
            {
             before(grammarAccess.getHttpMethodTypeAccess().getAlternatives()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:992:1: ( rule__HttpMethodType__Alternatives )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:992:2: rule__HttpMethodType__Alternatives
            {
            pushFollow(FOLLOW_rule__HttpMethodType__Alternatives_in_ruleHttpMethodType2051);
            rule__HttpMethodType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHttpMethodTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHttpMethodType"


    // $ANTLR start "ruleBooleanValue"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1004:1: ruleBooleanValue : ( ( rule__BooleanValue__Alternatives ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1008:1: ( ( ( rule__BooleanValue__Alternatives ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1009:1: ( ( rule__BooleanValue__Alternatives ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1009:1: ( ( rule__BooleanValue__Alternatives ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1010:1: ( rule__BooleanValue__Alternatives )
            {
             before(grammarAccess.getBooleanValueAccess().getAlternatives()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1011:1: ( rule__BooleanValue__Alternatives )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1011:2: rule__BooleanValue__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanValue__Alternatives_in_ruleBooleanValue2087);
            rule__BooleanValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "rule__Declaration__Alternatives"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1022:1: rule__Declaration__Alternatives : ( ( ruleUserTypeDeclaration ) | ( ruleApi ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1026:1: ( ( ruleUserTypeDeclaration ) | ( ruleApi ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=37 && LA1_0<=38)) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1027:1: ( ruleUserTypeDeclaration )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1027:1: ( ruleUserTypeDeclaration )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1028:1: ruleUserTypeDeclaration
                    {
                     before(grammarAccess.getDeclarationAccess().getUserTypeDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUserTypeDeclaration_in_rule__Declaration__Alternatives2122);
                    ruleUserTypeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getUserTypeDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1033:6: ( ruleApi )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1033:6: ( ruleApi )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1034:1: ruleApi
                    {
                     before(grammarAccess.getDeclarationAccess().getApiParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleApi_in_rule__Declaration__Alternatives2139);
                    ruleApi();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getApiParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__ServiceBlock__Alternatives"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1044:1: rule__ServiceBlock__Alternatives : ( ( ruleHeaderBlock ) | ( ruleParamsBlock ) | ( ruleHttpMethod ) );
    public final void rule__ServiceBlock__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1048:1: ( ( ruleHeaderBlock ) | ( ruleParamsBlock ) | ( ruleHttpMethod ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                alt2=2;
                }
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1049:1: ( ruleHeaderBlock )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1049:1: ( ruleHeaderBlock )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1050:1: ruleHeaderBlock
                    {
                     before(grammarAccess.getServiceBlockAccess().getHeaderBlockParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleHeaderBlock_in_rule__ServiceBlock__Alternatives2171);
                    ruleHeaderBlock();

                    state._fsp--;

                     after(grammarAccess.getServiceBlockAccess().getHeaderBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1055:6: ( ruleParamsBlock )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1055:6: ( ruleParamsBlock )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1056:1: ruleParamsBlock
                    {
                     before(grammarAccess.getServiceBlockAccess().getParamsBlockParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleParamsBlock_in_rule__ServiceBlock__Alternatives2188);
                    ruleParamsBlock();

                    state._fsp--;

                     after(grammarAccess.getServiceBlockAccess().getParamsBlockParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1061:6: ( ruleHttpMethod )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1061:6: ( ruleHttpMethod )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1062:1: ruleHttpMethod
                    {
                     before(grammarAccess.getServiceBlockAccess().getHttpMethodParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleHttpMethod_in_rule__ServiceBlock__Alternatives2205);
                    ruleHttpMethod();

                    state._fsp--;

                     after(grammarAccess.getServiceBlockAccess().getHttpMethodParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceBlock__Alternatives"


    // $ANTLR start "rule__HttpMethodBlock__Alternatives"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1072:1: rule__HttpMethodBlock__Alternatives : ( ( ruleHeaderBlock ) | ( ruleParamsBlock ) | ( ruleBodyBlock ) | ( ruleResponseBlock ) );
    public final void rule__HttpMethodBlock__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1076:1: ( ( ruleHeaderBlock ) | ( ruleParamsBlock ) | ( ruleBodyBlock ) | ( ruleResponseBlock ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt3=1;
                }
                break;
            case 28:
                {
                alt3=2;
                }
                break;
            case 29:
                {
                alt3=3;
                }
                break;
            case 30:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1077:1: ( ruleHeaderBlock )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1077:1: ( ruleHeaderBlock )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1078:1: ruleHeaderBlock
                    {
                     before(grammarAccess.getHttpMethodBlockAccess().getHeaderBlockParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleHeaderBlock_in_rule__HttpMethodBlock__Alternatives2237);
                    ruleHeaderBlock();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodBlockAccess().getHeaderBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1083:6: ( ruleParamsBlock )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1083:6: ( ruleParamsBlock )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1084:1: ruleParamsBlock
                    {
                     before(grammarAccess.getHttpMethodBlockAccess().getParamsBlockParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleParamsBlock_in_rule__HttpMethodBlock__Alternatives2254);
                    ruleParamsBlock();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodBlockAccess().getParamsBlockParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1089:6: ( ruleBodyBlock )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1089:6: ( ruleBodyBlock )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1090:1: ruleBodyBlock
                    {
                     before(grammarAccess.getHttpMethodBlockAccess().getBodyBlockParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBodyBlock_in_rule__HttpMethodBlock__Alternatives2271);
                    ruleBodyBlock();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodBlockAccess().getBodyBlockParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1095:6: ( ruleResponseBlock )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1095:6: ( ruleResponseBlock )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1096:1: ruleResponseBlock
                    {
                     before(grammarAccess.getHttpMethodBlockAccess().getResponseBlockParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleResponseBlock_in_rule__HttpMethodBlock__Alternatives2288);
                    ruleResponseBlock();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodBlockAccess().getResponseBlockParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethodBlock__Alternatives"


    // $ANTLR start "rule__Path__Alternatives_2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1106:1: rule__Path__Alternatives_2 : ( ( ruleArbitraryPathSegment ) | ( ( rule__Path__ParamsAssignment_2_1 ) ) );
    public final void rule__Path__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1110:1: ( ( ruleArbitraryPathSegment ) | ( ( rule__Path__ParamsAssignment_2_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==22||(LA4_1>=26 && LA4_1<=27)||LA4_1==35) ) {
                    alt4=1;
                }
                else if ( (LA4_1==32) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1111:1: ( ruleArbitraryPathSegment )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1111:1: ( ruleArbitraryPathSegment )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1112:1: ruleArbitraryPathSegment
                    {
                     before(grammarAccess.getPathAccess().getArbitraryPathSegmentParserRuleCall_2_0()); 
                    pushFollow(FOLLOW_ruleArbitraryPathSegment_in_rule__Path__Alternatives_22320);
                    ruleArbitraryPathSegment();

                    state._fsp--;

                     after(grammarAccess.getPathAccess().getArbitraryPathSegmentParserRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1117:6: ( ( rule__Path__ParamsAssignment_2_1 ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1117:6: ( ( rule__Path__ParamsAssignment_2_1 ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1118:1: ( rule__Path__ParamsAssignment_2_1 )
                    {
                     before(grammarAccess.getPathAccess().getParamsAssignment_2_1()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1119:1: ( rule__Path__ParamsAssignment_2_1 )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1119:2: rule__Path__ParamsAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Path__ParamsAssignment_2_1_in_rule__Path__Alternatives_22337);
                    rule__Path__ParamsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPathAccess().getParamsAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Alternatives_2"


    // $ANTLR start "rule__Path__Alternatives_3_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1128:1: rule__Path__Alternatives_3_1 : ( ( ruleArbitraryPathSegment ) | ( ( rule__Path__ParamsAssignment_3_1_1 ) ) );
    public final void rule__Path__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1132:1: ( ( ruleArbitraryPathSegment ) | ( ( rule__Path__ParamsAssignment_3_1_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==32) ) {
                    alt5=2;
                }
                else if ( (LA5_1==EOF||LA5_1==22||(LA5_1>=26 && LA5_1<=27)||LA5_1==35) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1133:1: ( ruleArbitraryPathSegment )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1133:1: ( ruleArbitraryPathSegment )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1134:1: ruleArbitraryPathSegment
                    {
                     before(grammarAccess.getPathAccess().getArbitraryPathSegmentParserRuleCall_3_1_0()); 
                    pushFollow(FOLLOW_ruleArbitraryPathSegment_in_rule__Path__Alternatives_3_12370);
                    ruleArbitraryPathSegment();

                    state._fsp--;

                     after(grammarAccess.getPathAccess().getArbitraryPathSegmentParserRuleCall_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1139:6: ( ( rule__Path__ParamsAssignment_3_1_1 ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1139:6: ( ( rule__Path__ParamsAssignment_3_1_1 ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1140:1: ( rule__Path__ParamsAssignment_3_1_1 )
                    {
                     before(grammarAccess.getPathAccess().getParamsAssignment_3_1_1()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1141:1: ( rule__Path__ParamsAssignment_3_1_1 )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1141:2: rule__Path__ParamsAssignment_3_1_1
                    {
                    pushFollow(FOLLOW_rule__Path__ParamsAssignment_3_1_1_in_rule__Path__Alternatives_3_12387);
                    rule__Path__ParamsAssignment_3_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPathAccess().getParamsAssignment_3_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Alternatives_3_1"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1150:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1154:1: ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 18:
            case 19:
                {
                alt6=1;
                }
                break;
            case RULE_STRING:
                {
                alt6=2;
                }
                break;
            case RULE_NUMBER:
            case 27:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1155:1: ( ( rule__Literal__Group_0__0 ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1155:1: ( ( rule__Literal__Group_0__0 ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1156:1: ( rule__Literal__Group_0__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_0()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1157:1: ( rule__Literal__Group_0__0 )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1157:2: rule__Literal__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives2420);
                    rule__Literal__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1161:6: ( ( rule__Literal__Group_1__0 ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1161:6: ( ( rule__Literal__Group_1__0 ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1162:1: ( rule__Literal__Group_1__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_1()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1163:1: ( rule__Literal__Group_1__0 )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1163:2: rule__Literal__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_1__0_in_rule__Literal__Alternatives2438);
                    rule__Literal__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1167:6: ( ( rule__Literal__Group_2__0 ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1167:6: ( ( rule__Literal__Group_2__0 ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1168:1: ( rule__Literal__Group_2__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_2()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1169:1: ( rule__Literal__Group_2__0 )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1169:2: rule__Literal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives2456);
                    rule__Literal__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__BlockType__Alternatives"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1178:1: rule__BlockType__Alternatives : ( ( ruleType ) | ( ruleComplexTypeLiteral ) );
    public final void rule__BlockType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1182:1: ( ( ruleType ) | ( ruleComplexTypeLiteral ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||(LA7_0>=39 && LA7_0<=43)) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1183:1: ( ruleType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1183:1: ( ruleType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1184:1: ruleType
                    {
                     before(grammarAccess.getBlockTypeAccess().getTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleType_in_rule__BlockType__Alternatives2489);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getBlockTypeAccess().getTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1189:6: ( ruleComplexTypeLiteral )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1189:6: ( ruleComplexTypeLiteral )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1190:1: ruleComplexTypeLiteral
                    {
                     before(grammarAccess.getBlockTypeAccess().getComplexTypeLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleComplexTypeLiteral_in_rule__BlockType__Alternatives2506);
                    ruleComplexTypeLiteral();

                    state._fsp--;

                     after(grammarAccess.getBlockTypeAccess().getComplexTypeLiteralParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockType__Alternatives"


    // $ANTLR start "rule__Member__NameAlternatives_0_0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1200:1: rule__Member__NameAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Member__NameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1204:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1205:1: ( RULE_ID )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1205:1: ( RULE_ID )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1206:1: RULE_ID
                    {
                     before(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Member__NameAlternatives_0_02538); 
                     after(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1211:6: ( RULE_STRING )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1211:6: ( RULE_STRING )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1212:1: RULE_STRING
                    {
                     before(grammarAccess.getMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Member__NameAlternatives_0_02555); 
                     after(grammarAccess.getMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__NameAlternatives_0_0"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1222:1: rule__Type__Alternatives : ( ( ruleUserType ) | ( ruleIntrinsicType ) | ( ruleArrayType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1226:1: ( ( ruleUserType ) | ( ruleIntrinsicType ) | ( ruleArrayType ) )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1227:1: ( ruleUserType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1227:1: ( ruleUserType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1228:1: ruleUserType
                    {
                     before(grammarAccess.getTypeAccess().getUserTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUserType_in_rule__Type__Alternatives2587);
                    ruleUserType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getUserTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1233:6: ( ruleIntrinsicType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1233:6: ( ruleIntrinsicType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1234:1: ruleIntrinsicType
                    {
                     before(grammarAccess.getTypeAccess().getIntrinsicTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntrinsicType_in_rule__Type__Alternatives2604);
                    ruleIntrinsicType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getIntrinsicTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1239:6: ( ruleArrayType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1239:6: ( ruleArrayType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1240:1: ruleArrayType
                    {
                     before(grammarAccess.getTypeAccess().getArrayTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleArrayType_in_rule__Type__Alternatives2621);
                    ruleArrayType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getArrayTypeParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__ArrayType__ElementTypeAlternatives_0_0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1250:1: rule__ArrayType__ElementTypeAlternatives_0_0 : ( ( ruleUserType ) | ( ruleIntrinsicType ) );
    public final void rule__ArrayType__ElementTypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1254:1: ( ( ruleUserType ) | ( ruleIntrinsicType ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=39 && LA10_0<=43)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1255:1: ( ruleUserType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1255:1: ( ruleUserType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1256:1: ruleUserType
                    {
                     before(grammarAccess.getArrayTypeAccess().getElementTypeUserTypeParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_ruleUserType_in_rule__ArrayType__ElementTypeAlternatives_0_02653);
                    ruleUserType();

                    state._fsp--;

                     after(grammarAccess.getArrayTypeAccess().getElementTypeUserTypeParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1261:6: ( ruleIntrinsicType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1261:6: ( ruleIntrinsicType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1262:1: ruleIntrinsicType
                    {
                     before(grammarAccess.getArrayTypeAccess().getElementTypeIntrinsicTypeParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_ruleIntrinsicType_in_rule__ArrayType__ElementTypeAlternatives_0_02670);
                    ruleIntrinsicType();

                    state._fsp--;

                     after(grammarAccess.getArrayTypeAccess().getElementTypeIntrinsicTypeParserRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__ElementTypeAlternatives_0_0"


    // $ANTLR start "rule__UserTypeDeclaration__Alternatives"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1272:1: rule__UserTypeDeclaration__Alternatives : ( ( ruleComplexTypeDeclaration ) | ( ruleEnumTypeDeclaration ) );
    public final void rule__UserTypeDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1276:1: ( ( ruleComplexTypeDeclaration ) | ( ruleEnumTypeDeclaration ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==37) ) {
                alt11=1;
            }
            else if ( (LA11_0==38) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1277:1: ( ruleComplexTypeDeclaration )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1277:1: ( ruleComplexTypeDeclaration )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1278:1: ruleComplexTypeDeclaration
                    {
                     before(grammarAccess.getUserTypeDeclarationAccess().getComplexTypeDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleComplexTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2702);
                    ruleComplexTypeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getUserTypeDeclarationAccess().getComplexTypeDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1283:6: ( ruleEnumTypeDeclaration )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1283:6: ( ruleEnumTypeDeclaration )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1284:1: ruleEnumTypeDeclaration
                    {
                     before(grammarAccess.getUserTypeDeclarationAccess().getEnumTypeDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2719);
                    ruleEnumTypeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getUserTypeDeclarationAccess().getEnumTypeDeclarationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserTypeDeclaration__Alternatives"


    // $ANTLR start "rule__IntrinsicType__Alternatives"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1294:1: rule__IntrinsicType__Alternatives : ( ( ruleStringType ) | ( ruleBooleanType ) | ( ruleNumericType ) );
    public final void rule__IntrinsicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1298:1: ( ( ruleStringType ) | ( ruleBooleanType ) | ( ruleNumericType ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt12=1;
                }
                break;
            case 40:
                {
                alt12=2;
                }
                break;
            case 41:
            case 42:
            case 43:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1299:1: ( ruleStringType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1299:1: ( ruleStringType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1300:1: ruleStringType
                    {
                     before(grammarAccess.getIntrinsicTypeAccess().getStringTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringType_in_rule__IntrinsicType__Alternatives2751);
                    ruleStringType();

                    state._fsp--;

                     after(grammarAccess.getIntrinsicTypeAccess().getStringTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1305:6: ( ruleBooleanType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1305:6: ( ruleBooleanType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1306:1: ruleBooleanType
                    {
                     before(grammarAccess.getIntrinsicTypeAccess().getBooleanTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanType_in_rule__IntrinsicType__Alternatives2768);
                    ruleBooleanType();

                    state._fsp--;

                     after(grammarAccess.getIntrinsicTypeAccess().getBooleanTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1311:6: ( ruleNumericType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1311:6: ( ruleNumericType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1312:1: ruleNumericType
                    {
                     before(grammarAccess.getIntrinsicTypeAccess().getNumericTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNumericType_in_rule__IntrinsicType__Alternatives2785);
                    ruleNumericType();

                    state._fsp--;

                     after(grammarAccess.getIntrinsicTypeAccess().getNumericTypeParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntrinsicType__Alternatives"


    // $ANTLR start "rule__NumericType__Alternatives"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1322:1: rule__NumericType__Alternatives : ( ( ruleIntegerType ) | ( ruleLongType ) | ( ruleDoubleType ) );
    public final void rule__NumericType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1326:1: ( ( ruleIntegerType ) | ( ruleLongType ) | ( ruleDoubleType ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt13=1;
                }
                break;
            case 42:
                {
                alt13=2;
                }
                break;
            case 43:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1327:1: ( ruleIntegerType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1327:1: ( ruleIntegerType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1328:1: ruleIntegerType
                    {
                     before(grammarAccess.getNumericTypeAccess().getIntegerTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntegerType_in_rule__NumericType__Alternatives2817);
                    ruleIntegerType();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeAccess().getIntegerTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1333:6: ( ruleLongType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1333:6: ( ruleLongType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1334:1: ruleLongType
                    {
                     before(grammarAccess.getNumericTypeAccess().getLongTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLongType_in_rule__NumericType__Alternatives2834);
                    ruleLongType();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeAccess().getLongTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1339:6: ( ruleDoubleType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1339:6: ( ruleDoubleType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1340:1: ruleDoubleType
                    {
                     before(grammarAccess.getNumericTypeAccess().getDoubleTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDoubleType_in_rule__NumericType__Alternatives2851);
                    ruleDoubleType();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeAccess().getDoubleTypeParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Alternatives"


    // $ANTLR start "rule__HttpMethodType__Alternatives"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1350:1: rule__HttpMethodType__Alternatives : ( ( ( 'get' ) ) | ( ( 'put' ) ) | ( ( 'post' ) ) | ( ( 'delete' ) ) | ( ( 'patch' ) ) );
    public final void rule__HttpMethodType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1354:1: ( ( ( 'get' ) ) | ( ( 'put' ) ) | ( ( 'post' ) ) | ( ( 'delete' ) ) | ( ( 'patch' ) ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt14=1;
                }
                break;
            case 14:
                {
                alt14=2;
                }
                break;
            case 15:
                {
                alt14=3;
                }
                break;
            case 16:
                {
                alt14=4;
                }
                break;
            case 17:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1355:1: ( ( 'get' ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1355:1: ( ( 'get' ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1356:1: ( 'get' )
                    {
                     before(grammarAccess.getHttpMethodTypeAccess().getGetEnumLiteralDeclaration_0()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1357:1: ( 'get' )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1357:3: 'get'
                    {
                    match(input,13,FOLLOW_13_in_rule__HttpMethodType__Alternatives2884); 

                    }

                     after(grammarAccess.getHttpMethodTypeAccess().getGetEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1362:6: ( ( 'put' ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1362:6: ( ( 'put' ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1363:1: ( 'put' )
                    {
                     before(grammarAccess.getHttpMethodTypeAccess().getPutEnumLiteralDeclaration_1()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1364:1: ( 'put' )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1364:3: 'put'
                    {
                    match(input,14,FOLLOW_14_in_rule__HttpMethodType__Alternatives2905); 

                    }

                     after(grammarAccess.getHttpMethodTypeAccess().getPutEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1369:6: ( ( 'post' ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1369:6: ( ( 'post' ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1370:1: ( 'post' )
                    {
                     before(grammarAccess.getHttpMethodTypeAccess().getPostEnumLiteralDeclaration_2()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1371:1: ( 'post' )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1371:3: 'post'
                    {
                    match(input,15,FOLLOW_15_in_rule__HttpMethodType__Alternatives2926); 

                    }

                     after(grammarAccess.getHttpMethodTypeAccess().getPostEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1376:6: ( ( 'delete' ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1376:6: ( ( 'delete' ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1377:1: ( 'delete' )
                    {
                     before(grammarAccess.getHttpMethodTypeAccess().getDeleteEnumLiteralDeclaration_3()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1378:1: ( 'delete' )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1378:3: 'delete'
                    {
                    match(input,16,FOLLOW_16_in_rule__HttpMethodType__Alternatives2947); 

                    }

                     after(grammarAccess.getHttpMethodTypeAccess().getDeleteEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1383:6: ( ( 'patch' ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1383:6: ( ( 'patch' ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1384:1: ( 'patch' )
                    {
                     before(grammarAccess.getHttpMethodTypeAccess().getPatchEnumLiteralDeclaration_4()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1385:1: ( 'patch' )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1385:3: 'patch'
                    {
                    match(input,17,FOLLOW_17_in_rule__HttpMethodType__Alternatives2968); 

                    }

                     after(grammarAccess.getHttpMethodTypeAccess().getPatchEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethodType__Alternatives"


    // $ANTLR start "rule__BooleanValue__Alternatives"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1395:1: rule__BooleanValue__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BooleanValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1399:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            else if ( (LA15_0==19) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1400:1: ( ( 'true' ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1400:1: ( ( 'true' ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1401:1: ( 'true' )
                    {
                     before(grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1402:1: ( 'true' )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1402:3: 'true'
                    {
                    match(input,18,FOLLOW_18_in_rule__BooleanValue__Alternatives3004); 

                    }

                     after(grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1407:6: ( ( 'false' ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1407:6: ( ( 'false' ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1408:1: ( 'false' )
                    {
                     before(grammarAccess.getBooleanValueAccess().getFalseEnumLiteralDeclaration_1()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1409:1: ( 'false' )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1409:3: 'false'
                    {
                    match(input,19,FOLLOW_19_in_rule__BooleanValue__Alternatives3025); 

                    }

                     after(grammarAccess.getBooleanValueAccess().getFalseEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Alternatives"


    // $ANTLR start "rule__SpecApiDocument__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1421:1: rule__SpecApiDocument__Group__0 : rule__SpecApiDocument__Group__0__Impl rule__SpecApiDocument__Group__1 ;
    public final void rule__SpecApiDocument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1425:1: ( rule__SpecApiDocument__Group__0__Impl rule__SpecApiDocument__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1426:2: rule__SpecApiDocument__Group__0__Impl rule__SpecApiDocument__Group__1
            {
            pushFollow(FOLLOW_rule__SpecApiDocument__Group__0__Impl_in_rule__SpecApiDocument__Group__03058);
            rule__SpecApiDocument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpecApiDocument__Group__1_in_rule__SpecApiDocument__Group__03061);
            rule__SpecApiDocument__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecApiDocument__Group__0"


    // $ANTLR start "rule__SpecApiDocument__Group__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1433:1: rule__SpecApiDocument__Group__0__Impl : ( 'package' ) ;
    public final void rule__SpecApiDocument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1437:1: ( ( 'package' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1438:1: ( 'package' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1438:1: ( 'package' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1439:1: 'package'
            {
             before(grammarAccess.getSpecApiDocumentAccess().getPackageKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__SpecApiDocument__Group__0__Impl3089); 
             after(grammarAccess.getSpecApiDocumentAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecApiDocument__Group__0__Impl"


    // $ANTLR start "rule__SpecApiDocument__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1452:1: rule__SpecApiDocument__Group__1 : rule__SpecApiDocument__Group__1__Impl rule__SpecApiDocument__Group__2 ;
    public final void rule__SpecApiDocument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1456:1: ( rule__SpecApiDocument__Group__1__Impl rule__SpecApiDocument__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1457:2: rule__SpecApiDocument__Group__1__Impl rule__SpecApiDocument__Group__2
            {
            pushFollow(FOLLOW_rule__SpecApiDocument__Group__1__Impl_in_rule__SpecApiDocument__Group__13120);
            rule__SpecApiDocument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpecApiDocument__Group__2_in_rule__SpecApiDocument__Group__13123);
            rule__SpecApiDocument__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecApiDocument__Group__1"


    // $ANTLR start "rule__SpecApiDocument__Group__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1464:1: rule__SpecApiDocument__Group__1__Impl : ( ( rule__SpecApiDocument__PackageNameAssignment_1 ) ) ;
    public final void rule__SpecApiDocument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1468:1: ( ( ( rule__SpecApiDocument__PackageNameAssignment_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1469:1: ( ( rule__SpecApiDocument__PackageNameAssignment_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1469:1: ( ( rule__SpecApiDocument__PackageNameAssignment_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1470:1: ( rule__SpecApiDocument__PackageNameAssignment_1 )
            {
             before(grammarAccess.getSpecApiDocumentAccess().getPackageNameAssignment_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1471:1: ( rule__SpecApiDocument__PackageNameAssignment_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1471:2: rule__SpecApiDocument__PackageNameAssignment_1
            {
            pushFollow(FOLLOW_rule__SpecApiDocument__PackageNameAssignment_1_in_rule__SpecApiDocument__Group__1__Impl3150);
            rule__SpecApiDocument__PackageNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecApiDocumentAccess().getPackageNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecApiDocument__Group__1__Impl"


    // $ANTLR start "rule__SpecApiDocument__Group__2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1481:1: rule__SpecApiDocument__Group__2 : rule__SpecApiDocument__Group__2__Impl ;
    public final void rule__SpecApiDocument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1485:1: ( rule__SpecApiDocument__Group__2__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1486:2: rule__SpecApiDocument__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SpecApiDocument__Group__2__Impl_in_rule__SpecApiDocument__Group__23180);
            rule__SpecApiDocument__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecApiDocument__Group__2"


    // $ANTLR start "rule__SpecApiDocument__Group__2__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1492:1: rule__SpecApiDocument__Group__2__Impl : ( ( rule__SpecApiDocument__DeclarationsAssignment_2 )* ) ;
    public final void rule__SpecApiDocument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1496:1: ( ( ( rule__SpecApiDocument__DeclarationsAssignment_2 )* ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1497:1: ( ( rule__SpecApiDocument__DeclarationsAssignment_2 )* )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1497:1: ( ( rule__SpecApiDocument__DeclarationsAssignment_2 )* )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1498:1: ( rule__SpecApiDocument__DeclarationsAssignment_2 )*
            {
             before(grammarAccess.getSpecApiDocumentAccess().getDeclarationsAssignment_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1499:1: ( rule__SpecApiDocument__DeclarationsAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21||(LA16_0>=37 && LA16_0<=38)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1499:2: rule__SpecApiDocument__DeclarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SpecApiDocument__DeclarationsAssignment_2_in_rule__SpecApiDocument__Group__2__Impl3207);
            	    rule__SpecApiDocument__DeclarationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSpecApiDocumentAccess().getDeclarationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecApiDocument__Group__2__Impl"


    // $ANTLR start "rule__Api__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1515:1: rule__Api__Group__0 : rule__Api__Group__0__Impl rule__Api__Group__1 ;
    public final void rule__Api__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1519:1: ( rule__Api__Group__0__Impl rule__Api__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1520:2: rule__Api__Group__0__Impl rule__Api__Group__1
            {
            pushFollow(FOLLOW_rule__Api__Group__0__Impl_in_rule__Api__Group__03244);
            rule__Api__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Api__Group__1_in_rule__Api__Group__03247);
            rule__Api__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__0"


    // $ANTLR start "rule__Api__Group__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1527:1: rule__Api__Group__0__Impl : ( 'api' ) ;
    public final void rule__Api__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1531:1: ( ( 'api' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1532:1: ( 'api' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1532:1: ( 'api' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1533:1: 'api'
            {
             before(grammarAccess.getApiAccess().getApiKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Api__Group__0__Impl3275); 
             after(grammarAccess.getApiAccess().getApiKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__0__Impl"


    // $ANTLR start "rule__Api__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1546:1: rule__Api__Group__1 : rule__Api__Group__1__Impl rule__Api__Group__2 ;
    public final void rule__Api__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1550:1: ( rule__Api__Group__1__Impl rule__Api__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1551:2: rule__Api__Group__1__Impl rule__Api__Group__2
            {
            pushFollow(FOLLOW_rule__Api__Group__1__Impl_in_rule__Api__Group__13306);
            rule__Api__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Api__Group__2_in_rule__Api__Group__13309);
            rule__Api__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__1"


    // $ANTLR start "rule__Api__Group__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1558:1: rule__Api__Group__1__Impl : ( ( rule__Api__NameAssignment_1 ) ) ;
    public final void rule__Api__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1562:1: ( ( ( rule__Api__NameAssignment_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1563:1: ( ( rule__Api__NameAssignment_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1563:1: ( ( rule__Api__NameAssignment_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1564:1: ( rule__Api__NameAssignment_1 )
            {
             before(grammarAccess.getApiAccess().getNameAssignment_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1565:1: ( rule__Api__NameAssignment_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1565:2: rule__Api__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Api__NameAssignment_1_in_rule__Api__Group__1__Impl3336);
            rule__Api__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApiAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__1__Impl"


    // $ANTLR start "rule__Api__Group__2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1575:1: rule__Api__Group__2 : rule__Api__Group__2__Impl rule__Api__Group__3 ;
    public final void rule__Api__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1579:1: ( rule__Api__Group__2__Impl rule__Api__Group__3 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1580:2: rule__Api__Group__2__Impl rule__Api__Group__3
            {
            pushFollow(FOLLOW_rule__Api__Group__2__Impl_in_rule__Api__Group__23366);
            rule__Api__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Api__Group__3_in_rule__Api__Group__23369);
            rule__Api__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__2"


    // $ANTLR start "rule__Api__Group__2__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1587:1: rule__Api__Group__2__Impl : ( ( rule__Api__BaseUrlAssignment_2 )? ) ;
    public final void rule__Api__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1591:1: ( ( ( rule__Api__BaseUrlAssignment_2 )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1592:1: ( ( rule__Api__BaseUrlAssignment_2 )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1592:1: ( ( rule__Api__BaseUrlAssignment_2 )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1593:1: ( rule__Api__BaseUrlAssignment_2 )?
            {
             before(grammarAccess.getApiAccess().getBaseUrlAssignment_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1594:1: ( rule__Api__BaseUrlAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_URL) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1594:2: rule__Api__BaseUrlAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Api__BaseUrlAssignment_2_in_rule__Api__Group__2__Impl3396);
                    rule__Api__BaseUrlAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApiAccess().getBaseUrlAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__2__Impl"


    // $ANTLR start "rule__Api__Group__3"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1604:1: rule__Api__Group__3 : rule__Api__Group__3__Impl rule__Api__Group__4 ;
    public final void rule__Api__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1608:1: ( rule__Api__Group__3__Impl rule__Api__Group__4 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1609:2: rule__Api__Group__3__Impl rule__Api__Group__4
            {
            pushFollow(FOLLOW_rule__Api__Group__3__Impl_in_rule__Api__Group__33427);
            rule__Api__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Api__Group__4_in_rule__Api__Group__33430);
            rule__Api__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__3"


    // $ANTLR start "rule__Api__Group__3__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1616:1: rule__Api__Group__3__Impl : ( '{' ) ;
    public final void rule__Api__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1620:1: ( ( '{' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1621:1: ( '{' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1621:1: ( '{' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1622:1: '{'
            {
             before(grammarAccess.getApiAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Api__Group__3__Impl3458); 
             after(grammarAccess.getApiAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__3__Impl"


    // $ANTLR start "rule__Api__Group__4"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1635:1: rule__Api__Group__4 : rule__Api__Group__4__Impl rule__Api__Group__5 ;
    public final void rule__Api__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1639:1: ( rule__Api__Group__4__Impl rule__Api__Group__5 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1640:2: rule__Api__Group__4__Impl rule__Api__Group__5
            {
            pushFollow(FOLLOW_rule__Api__Group__4__Impl_in_rule__Api__Group__43489);
            rule__Api__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Api__Group__5_in_rule__Api__Group__43492);
            rule__Api__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__4"


    // $ANTLR start "rule__Api__Group__4__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1647:1: rule__Api__Group__4__Impl : ( ( rule__Api__BlocksAssignment_4 )* ) ;
    public final void rule__Api__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1651:1: ( ( ( rule__Api__BlocksAssignment_4 )* ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1652:1: ( ( rule__Api__BlocksAssignment_4 )* )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1652:1: ( ( rule__Api__BlocksAssignment_4 )* )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1653:1: ( rule__Api__BlocksAssignment_4 )*
            {
             before(grammarAccess.getApiAccess().getBlocksAssignment_4()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1654:1: ( rule__Api__BlocksAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=13 && LA18_0<=17)||LA18_0==24||LA18_0==28) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1654:2: rule__Api__BlocksAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Api__BlocksAssignment_4_in_rule__Api__Group__4__Impl3519);
            	    rule__Api__BlocksAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getApiAccess().getBlocksAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__4__Impl"


    // $ANTLR start "rule__Api__Group__5"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1664:1: rule__Api__Group__5 : rule__Api__Group__5__Impl ;
    public final void rule__Api__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1668:1: ( rule__Api__Group__5__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1669:2: rule__Api__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Api__Group__5__Impl_in_rule__Api__Group__53550);
            rule__Api__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__5"


    // $ANTLR start "rule__Api__Group__5__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1675:1: rule__Api__Group__5__Impl : ( '}' ) ;
    public final void rule__Api__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1679:1: ( ( '}' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1680:1: ( '}' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1680:1: ( '}' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1681:1: '}'
            {
             before(grammarAccess.getApiAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__Api__Group__5__Impl3578); 
             after(grammarAccess.getApiAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__5__Impl"


    // $ANTLR start "rule__HeaderBlock__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1706:1: rule__HeaderBlock__Group__0 : rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 ;
    public final void rule__HeaderBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1710:1: ( rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1711:2: rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group__0__Impl_in_rule__HeaderBlock__Group__03621);
            rule__HeaderBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HeaderBlock__Group__1_in_rule__HeaderBlock__Group__03624);
            rule__HeaderBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderBlock__Group__0"


    // $ANTLR start "rule__HeaderBlock__Group__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1718:1: rule__HeaderBlock__Group__0__Impl : ( () ) ;
    public final void rule__HeaderBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1722:1: ( ( () ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1723:1: ( () )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1723:1: ( () )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1724:1: ()
            {
             before(grammarAccess.getHeaderBlockAccess().getHeaderBlockAction_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1725:1: ()
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1727:1: 
            {
            }

             after(grammarAccess.getHeaderBlockAccess().getHeaderBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderBlock__Group__0__Impl"


    // $ANTLR start "rule__HeaderBlock__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1737:1: rule__HeaderBlock__Group__1 : rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 ;
    public final void rule__HeaderBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1741:1: ( rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1742:2: rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group__1__Impl_in_rule__HeaderBlock__Group__13682);
            rule__HeaderBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HeaderBlock__Group__2_in_rule__HeaderBlock__Group__13685);
            rule__HeaderBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderBlock__Group__1"


    // $ANTLR start "rule__HeaderBlock__Group__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1749:1: rule__HeaderBlock__Group__1__Impl : ( 'headers' ) ;
    public final void rule__HeaderBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1753:1: ( ( 'headers' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1754:1: ( 'headers' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1754:1: ( 'headers' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1755:1: 'headers'
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__HeaderBlock__Group__1__Impl3713); 
             after(grammarAccess.getHeaderBlockAccess().getHeadersKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderBlock__Group__1__Impl"


    // $ANTLR start "rule__HeaderBlock__Group__2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1768:1: rule__HeaderBlock__Group__2 : rule__HeaderBlock__Group__2__Impl rule__HeaderBlock__Group__3 ;
    public final void rule__HeaderBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1772:1: ( rule__HeaderBlock__Group__2__Impl rule__HeaderBlock__Group__3 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1773:2: rule__HeaderBlock__Group__2__Impl rule__HeaderBlock__Group__3
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group__2__Impl_in_rule__HeaderBlock__Group__23744);
            rule__HeaderBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HeaderBlock__Group__3_in_rule__HeaderBlock__Group__23747);
            rule__HeaderBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderBlock__Group__2"


    // $ANTLR start "rule__HeaderBlock__Group__2__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1780:1: rule__HeaderBlock__Group__2__Impl : ( ( rule__HeaderBlock__HeadersAssignment_2 ) ) ;
    public final void rule__HeaderBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1784:1: ( ( ( rule__HeaderBlock__HeadersAssignment_2 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1785:1: ( ( rule__HeaderBlock__HeadersAssignment_2 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1785:1: ( ( rule__HeaderBlock__HeadersAssignment_2 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1786:1: ( rule__HeaderBlock__HeadersAssignment_2 )
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersAssignment_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1787:1: ( rule__HeaderBlock__HeadersAssignment_2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1787:2: rule__HeaderBlock__HeadersAssignment_2
            {
            pushFollow(FOLLOW_rule__HeaderBlock__HeadersAssignment_2_in_rule__HeaderBlock__Group__2__Impl3774);
            rule__HeaderBlock__HeadersAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHeaderBlockAccess().getHeadersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderBlock__Group__2__Impl"


    // $ANTLR start "rule__HeaderBlock__Group__3"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1797:1: rule__HeaderBlock__Group__3 : rule__HeaderBlock__Group__3__Impl ;
    public final void rule__HeaderBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1801:1: ( rule__HeaderBlock__Group__3__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1802:2: rule__HeaderBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group__3__Impl_in_rule__HeaderBlock__Group__33804);
            rule__HeaderBlock__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderBlock__Group__3"


    // $ANTLR start "rule__HeaderBlock__Group__3__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1808:1: rule__HeaderBlock__Group__3__Impl : ( ( rule__HeaderBlock__Group_3__0 )* ) ;
    public final void rule__HeaderBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1812:1: ( ( ( rule__HeaderBlock__Group_3__0 )* ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1813:1: ( ( rule__HeaderBlock__Group_3__0 )* )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1813:1: ( ( rule__HeaderBlock__Group_3__0 )* )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1814:1: ( rule__HeaderBlock__Group_3__0 )*
            {
             before(grammarAccess.getHeaderBlockAccess().getGroup_3()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1815:1: ( rule__HeaderBlock__Group_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1815:2: rule__HeaderBlock__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__HeaderBlock__Group_3__0_in_rule__HeaderBlock__Group__3__Impl3831);
            	    rule__HeaderBlock__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getHeaderBlockAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderBlock__Group__3__Impl"


    // $ANTLR start "rule__HeaderBlock__Group_3__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1833:1: rule__HeaderBlock__Group_3__0 : rule__HeaderBlock__Group_3__0__Impl rule__HeaderBlock__Group_3__1 ;
    public final void rule__HeaderBlock__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1837:1: ( rule__HeaderBlock__Group_3__0__Impl rule__HeaderBlock__Group_3__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1838:2: rule__HeaderBlock__Group_3__0__Impl rule__HeaderBlock__Group_3__1
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group_3__0__Impl_in_rule__HeaderBlock__Group_3__03870);
            rule__HeaderBlock__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HeaderBlock__Group_3__1_in_rule__HeaderBlock__Group_3__03873);
            rule__HeaderBlock__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderBlock__Group_3__0"


    // $ANTLR start "rule__HeaderBlock__Group_3__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1845:1: rule__HeaderBlock__Group_3__0__Impl : ( ',' ) ;
    public final void rule__HeaderBlock__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1849:1: ( ( ',' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1850:1: ( ',' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1850:1: ( ',' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1851:1: ','
            {
             before(grammarAccess.getHeaderBlockAccess().getCommaKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__HeaderBlock__Group_3__0__Impl3901); 
             after(grammarAccess.getHeaderBlockAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderBlock__Group_3__0__Impl"


    // $ANTLR start "rule__HeaderBlock__Group_3__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1864:1: rule__HeaderBlock__Group_3__1 : rule__HeaderBlock__Group_3__1__Impl ;
    public final void rule__HeaderBlock__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1868:1: ( rule__HeaderBlock__Group_3__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1869:2: rule__HeaderBlock__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group_3__1__Impl_in_rule__HeaderBlock__Group_3__13932);
            rule__HeaderBlock__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderBlock__Group_3__1"


    // $ANTLR start "rule__HeaderBlock__Group_3__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1875:1: rule__HeaderBlock__Group_3__1__Impl : ( ( rule__HeaderBlock__HeadersAssignment_3_1 ) ) ;
    public final void rule__HeaderBlock__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1879:1: ( ( ( rule__HeaderBlock__HeadersAssignment_3_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1880:1: ( ( rule__HeaderBlock__HeadersAssignment_3_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1880:1: ( ( rule__HeaderBlock__HeadersAssignment_3_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1881:1: ( rule__HeaderBlock__HeadersAssignment_3_1 )
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersAssignment_3_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1882:1: ( rule__HeaderBlock__HeadersAssignment_3_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1882:2: rule__HeaderBlock__HeadersAssignment_3_1
            {
            pushFollow(FOLLOW_rule__HeaderBlock__HeadersAssignment_3_1_in_rule__HeaderBlock__Group_3__1__Impl3959);
            rule__HeaderBlock__HeadersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHeaderBlockAccess().getHeadersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderBlock__Group_3__1__Impl"


    // $ANTLR start "rule__HttpMethod__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1896:1: rule__HttpMethod__Group__0 : rule__HttpMethod__Group__0__Impl rule__HttpMethod__Group__1 ;
    public final void rule__HttpMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1900:1: ( rule__HttpMethod__Group__0__Impl rule__HttpMethod__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1901:2: rule__HttpMethod__Group__0__Impl rule__HttpMethod__Group__1
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__0__Impl_in_rule__HttpMethod__Group__03993);
            rule__HttpMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__1_in_rule__HttpMethod__Group__03996);
            rule__HttpMethod__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__Group__0"


    // $ANTLR start "rule__HttpMethod__Group__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1908:1: rule__HttpMethod__Group__0__Impl : ( ( rule__HttpMethod__TypeAssignment_0 ) ) ;
    public final void rule__HttpMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1912:1: ( ( ( rule__HttpMethod__TypeAssignment_0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1913:1: ( ( rule__HttpMethod__TypeAssignment_0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1913:1: ( ( rule__HttpMethod__TypeAssignment_0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1914:1: ( rule__HttpMethod__TypeAssignment_0 )
            {
             before(grammarAccess.getHttpMethodAccess().getTypeAssignment_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1915:1: ( rule__HttpMethod__TypeAssignment_0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1915:2: rule__HttpMethod__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__HttpMethod__TypeAssignment_0_in_rule__HttpMethod__Group__0__Impl4023);
            rule__HttpMethod__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHttpMethodAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__Group__0__Impl"


    // $ANTLR start "rule__HttpMethod__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1925:1: rule__HttpMethod__Group__1 : rule__HttpMethod__Group__1__Impl rule__HttpMethod__Group__2 ;
    public final void rule__HttpMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1929:1: ( rule__HttpMethod__Group__1__Impl rule__HttpMethod__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1930:2: rule__HttpMethod__Group__1__Impl rule__HttpMethod__Group__2
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__1__Impl_in_rule__HttpMethod__Group__14053);
            rule__HttpMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__2_in_rule__HttpMethod__Group__14056);
            rule__HttpMethod__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__Group__1"


    // $ANTLR start "rule__HttpMethod__Group__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1937:1: rule__HttpMethod__Group__1__Impl : ( ( rule__HttpMethod__NameAssignment_1 ) ) ;
    public final void rule__HttpMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1941:1: ( ( ( rule__HttpMethod__NameAssignment_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1942:1: ( ( rule__HttpMethod__NameAssignment_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1942:1: ( ( rule__HttpMethod__NameAssignment_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1943:1: ( rule__HttpMethod__NameAssignment_1 )
            {
             before(grammarAccess.getHttpMethodAccess().getNameAssignment_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1944:1: ( rule__HttpMethod__NameAssignment_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1944:2: rule__HttpMethod__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__HttpMethod__NameAssignment_1_in_rule__HttpMethod__Group__1__Impl4083);
            rule__HttpMethod__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHttpMethodAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__Group__1__Impl"


    // $ANTLR start "rule__HttpMethod__Group__2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1954:1: rule__HttpMethod__Group__2 : rule__HttpMethod__Group__2__Impl rule__HttpMethod__Group__3 ;
    public final void rule__HttpMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1958:1: ( rule__HttpMethod__Group__2__Impl rule__HttpMethod__Group__3 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1959:2: rule__HttpMethod__Group__2__Impl rule__HttpMethod__Group__3
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__2__Impl_in_rule__HttpMethod__Group__24113);
            rule__HttpMethod__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__3_in_rule__HttpMethod__Group__24116);
            rule__HttpMethod__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__Group__2"


    // $ANTLR start "rule__HttpMethod__Group__2__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1966:1: rule__HttpMethod__Group__2__Impl : ( ( rule__HttpMethod__PathAssignment_2 )? ) ;
    public final void rule__HttpMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1970:1: ( ( ( rule__HttpMethod__PathAssignment_2 )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1971:1: ( ( rule__HttpMethod__PathAssignment_2 )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1971:1: ( ( rule__HttpMethod__PathAssignment_2 )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1972:1: ( rule__HttpMethod__PathAssignment_2 )?
            {
             before(grammarAccess.getHttpMethodAccess().getPathAssignment_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1973:1: ( rule__HttpMethod__PathAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1973:2: rule__HttpMethod__PathAssignment_2
                    {
                    pushFollow(FOLLOW_rule__HttpMethod__PathAssignment_2_in_rule__HttpMethod__Group__2__Impl4143);
                    rule__HttpMethod__PathAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHttpMethodAccess().getPathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__Group__2__Impl"


    // $ANTLR start "rule__HttpMethod__Group__3"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1983:1: rule__HttpMethod__Group__3 : rule__HttpMethod__Group__3__Impl rule__HttpMethod__Group__4 ;
    public final void rule__HttpMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1987:1: ( rule__HttpMethod__Group__3__Impl rule__HttpMethod__Group__4 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1988:2: rule__HttpMethod__Group__3__Impl rule__HttpMethod__Group__4
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__3__Impl_in_rule__HttpMethod__Group__34174);
            rule__HttpMethod__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__4_in_rule__HttpMethod__Group__34177);
            rule__HttpMethod__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__Group__3"


    // $ANTLR start "rule__HttpMethod__Group__3__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1995:1: rule__HttpMethod__Group__3__Impl : ( '{' ) ;
    public final void rule__HttpMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1999:1: ( ( '{' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2000:1: ( '{' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2000:1: ( '{' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2001:1: '{'
            {
             before(grammarAccess.getHttpMethodAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__HttpMethod__Group__3__Impl4205); 
             after(grammarAccess.getHttpMethodAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__Group__3__Impl"


    // $ANTLR start "rule__HttpMethod__Group__4"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2014:1: rule__HttpMethod__Group__4 : rule__HttpMethod__Group__4__Impl rule__HttpMethod__Group__5 ;
    public final void rule__HttpMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2018:1: ( rule__HttpMethod__Group__4__Impl rule__HttpMethod__Group__5 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2019:2: rule__HttpMethod__Group__4__Impl rule__HttpMethod__Group__5
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__4__Impl_in_rule__HttpMethod__Group__44236);
            rule__HttpMethod__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__5_in_rule__HttpMethod__Group__44239);
            rule__HttpMethod__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__Group__4"


    // $ANTLR start "rule__HttpMethod__Group__4__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2026:1: rule__HttpMethod__Group__4__Impl : ( ( rule__HttpMethod__BlocksAssignment_4 )* ) ;
    public final void rule__HttpMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2030:1: ( ( ( rule__HttpMethod__BlocksAssignment_4 )* ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2031:1: ( ( rule__HttpMethod__BlocksAssignment_4 )* )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2031:1: ( ( rule__HttpMethod__BlocksAssignment_4 )* )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2032:1: ( rule__HttpMethod__BlocksAssignment_4 )*
            {
             before(grammarAccess.getHttpMethodAccess().getBlocksAssignment_4()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2033:1: ( rule__HttpMethod__BlocksAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==24||(LA21_0>=28 && LA21_0<=30)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2033:2: rule__HttpMethod__BlocksAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__HttpMethod__BlocksAssignment_4_in_rule__HttpMethod__Group__4__Impl4266);
            	    rule__HttpMethod__BlocksAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getHttpMethodAccess().getBlocksAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__Group__4__Impl"


    // $ANTLR start "rule__HttpMethod__Group__5"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2043:1: rule__HttpMethod__Group__5 : rule__HttpMethod__Group__5__Impl ;
    public final void rule__HttpMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2047:1: ( rule__HttpMethod__Group__5__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2048:2: rule__HttpMethod__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__5__Impl_in_rule__HttpMethod__Group__54297);
            rule__HttpMethod__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__Group__5"


    // $ANTLR start "rule__HttpMethod__Group__5__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2054:1: rule__HttpMethod__Group__5__Impl : ( '}' ) ;
    public final void rule__HttpMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2058:1: ( ( '}' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2059:1: ( '}' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2059:1: ( '}' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2060:1: '}'
            {
             before(grammarAccess.getHttpMethodAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__HttpMethod__Group__5__Impl4325); 
             after(grammarAccess.getHttpMethodAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__Group__5__Impl"


    // $ANTLR start "rule__Path__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2085:1: rule__Path__Group__0 : rule__Path__Group__0__Impl rule__Path__Group__1 ;
    public final void rule__Path__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2089:1: ( rule__Path__Group__0__Impl rule__Path__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2090:2: rule__Path__Group__0__Impl rule__Path__Group__1
            {
            pushFollow(FOLLOW_rule__Path__Group__0__Impl_in_rule__Path__Group__04368);
            rule__Path__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Path__Group__1_in_rule__Path__Group__04371);
            rule__Path__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__0"


    // $ANTLR start "rule__Path__Group__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2097:1: rule__Path__Group__0__Impl : ( () ) ;
    public final void rule__Path__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2101:1: ( ( () ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2102:1: ( () )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2102:1: ( () )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2103:1: ()
            {
             before(grammarAccess.getPathAccess().getPathAction_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2104:1: ()
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2106:1: 
            {
            }

             after(grammarAccess.getPathAccess().getPathAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__0__Impl"


    // $ANTLR start "rule__Path__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2116:1: rule__Path__Group__1 : rule__Path__Group__1__Impl rule__Path__Group__2 ;
    public final void rule__Path__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2120:1: ( rule__Path__Group__1__Impl rule__Path__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2121:2: rule__Path__Group__1__Impl rule__Path__Group__2
            {
            pushFollow(FOLLOW_rule__Path__Group__1__Impl_in_rule__Path__Group__14429);
            rule__Path__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Path__Group__2_in_rule__Path__Group__14432);
            rule__Path__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__1"


    // $ANTLR start "rule__Path__Group__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2128:1: rule__Path__Group__1__Impl : ( '/' ) ;
    public final void rule__Path__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2132:1: ( ( '/' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2133:1: ( '/' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2133:1: ( '/' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2134:1: '/'
            {
             before(grammarAccess.getPathAccess().getSolidusKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Path__Group__1__Impl4460); 
             after(grammarAccess.getPathAccess().getSolidusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__1__Impl"


    // $ANTLR start "rule__Path__Group__2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2147:1: rule__Path__Group__2 : rule__Path__Group__2__Impl rule__Path__Group__3 ;
    public final void rule__Path__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2151:1: ( rule__Path__Group__2__Impl rule__Path__Group__3 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2152:2: rule__Path__Group__2__Impl rule__Path__Group__3
            {
            pushFollow(FOLLOW_rule__Path__Group__2__Impl_in_rule__Path__Group__24491);
            rule__Path__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Path__Group__3_in_rule__Path__Group__24494);
            rule__Path__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__2"


    // $ANTLR start "rule__Path__Group__2__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2159:1: rule__Path__Group__2__Impl : ( ( rule__Path__Alternatives_2 ) ) ;
    public final void rule__Path__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2163:1: ( ( ( rule__Path__Alternatives_2 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2164:1: ( ( rule__Path__Alternatives_2 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2164:1: ( ( rule__Path__Alternatives_2 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2165:1: ( rule__Path__Alternatives_2 )
            {
             before(grammarAccess.getPathAccess().getAlternatives_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2166:1: ( rule__Path__Alternatives_2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2166:2: rule__Path__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Path__Alternatives_2_in_rule__Path__Group__2__Impl4521);
            rule__Path__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__2__Impl"


    // $ANTLR start "rule__Path__Group__3"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2176:1: rule__Path__Group__3 : rule__Path__Group__3__Impl ;
    public final void rule__Path__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2180:1: ( rule__Path__Group__3__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2181:2: rule__Path__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Path__Group__3__Impl_in_rule__Path__Group__34551);
            rule__Path__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__3"


    // $ANTLR start "rule__Path__Group__3__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2187:1: rule__Path__Group__3__Impl : ( ( rule__Path__Group_3__0 )* ) ;
    public final void rule__Path__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2191:1: ( ( ( rule__Path__Group_3__0 )* ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2192:1: ( ( rule__Path__Group_3__0 )* )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2192:1: ( ( rule__Path__Group_3__0 )* )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2193:1: ( rule__Path__Group_3__0 )*
            {
             before(grammarAccess.getPathAccess().getGroup_3()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2194:1: ( rule__Path__Group_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==26) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2194:2: rule__Path__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Path__Group_3__0_in_rule__Path__Group__3__Impl4578);
            	    rule__Path__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getPathAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__3__Impl"


    // $ANTLR start "rule__Path__Group_3__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2212:1: rule__Path__Group_3__0 : rule__Path__Group_3__0__Impl rule__Path__Group_3__1 ;
    public final void rule__Path__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2216:1: ( rule__Path__Group_3__0__Impl rule__Path__Group_3__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2217:2: rule__Path__Group_3__0__Impl rule__Path__Group_3__1
            {
            pushFollow(FOLLOW_rule__Path__Group_3__0__Impl_in_rule__Path__Group_3__04617);
            rule__Path__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Path__Group_3__1_in_rule__Path__Group_3__04620);
            rule__Path__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_3__0"


    // $ANTLR start "rule__Path__Group_3__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2224:1: rule__Path__Group_3__0__Impl : ( '/' ) ;
    public final void rule__Path__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2228:1: ( ( '/' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2229:1: ( '/' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2229:1: ( '/' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2230:1: '/'
            {
             before(grammarAccess.getPathAccess().getSolidusKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__Path__Group_3__0__Impl4648); 
             after(grammarAccess.getPathAccess().getSolidusKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_3__0__Impl"


    // $ANTLR start "rule__Path__Group_3__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2243:1: rule__Path__Group_3__1 : rule__Path__Group_3__1__Impl ;
    public final void rule__Path__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2247:1: ( rule__Path__Group_3__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2248:2: rule__Path__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Path__Group_3__1__Impl_in_rule__Path__Group_3__14679);
            rule__Path__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_3__1"


    // $ANTLR start "rule__Path__Group_3__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2254:1: rule__Path__Group_3__1__Impl : ( ( rule__Path__Alternatives_3_1 ) ) ;
    public final void rule__Path__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2258:1: ( ( ( rule__Path__Alternatives_3_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2259:1: ( ( rule__Path__Alternatives_3_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2259:1: ( ( rule__Path__Alternatives_3_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2260:1: ( rule__Path__Alternatives_3_1 )
            {
             before(grammarAccess.getPathAccess().getAlternatives_3_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2261:1: ( rule__Path__Alternatives_3_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2261:2: rule__Path__Alternatives_3_1
            {
            pushFollow(FOLLOW_rule__Path__Alternatives_3_1_in_rule__Path__Group_3__1__Impl4706);
            rule__Path__Alternatives_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getAlternatives_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_3__1__Impl"


    // $ANTLR start "rule__ArbitraryPathSegment__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2275:1: rule__ArbitraryPathSegment__Group__0 : rule__ArbitraryPathSegment__Group__0__Impl rule__ArbitraryPathSegment__Group__1 ;
    public final void rule__ArbitraryPathSegment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2279:1: ( rule__ArbitraryPathSegment__Group__0__Impl rule__ArbitraryPathSegment__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2280:2: rule__ArbitraryPathSegment__Group__0__Impl rule__ArbitraryPathSegment__Group__1
            {
            pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group__0__Impl_in_rule__ArbitraryPathSegment__Group__04740);
            rule__ArbitraryPathSegment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group__1_in_rule__ArbitraryPathSegment__Group__04743);
            rule__ArbitraryPathSegment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryPathSegment__Group__0"


    // $ANTLR start "rule__ArbitraryPathSegment__Group__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2287:1: rule__ArbitraryPathSegment__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__ArbitraryPathSegment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2291:1: ( ( ruleQualifiedName ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2292:1: ( ruleQualifiedName )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2292:1: ( ruleQualifiedName )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2293:1: ruleQualifiedName
            {
             before(grammarAccess.getArbitraryPathSegmentAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ArbitraryPathSegment__Group__0__Impl4770);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getArbitraryPathSegmentAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryPathSegment__Group__0__Impl"


    // $ANTLR start "rule__ArbitraryPathSegment__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2304:1: rule__ArbitraryPathSegment__Group__1 : rule__ArbitraryPathSegment__Group__1__Impl ;
    public final void rule__ArbitraryPathSegment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2308:1: ( rule__ArbitraryPathSegment__Group__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2309:2: rule__ArbitraryPathSegment__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group__1__Impl_in_rule__ArbitraryPathSegment__Group__14799);
            rule__ArbitraryPathSegment__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryPathSegment__Group__1"


    // $ANTLR start "rule__ArbitraryPathSegment__Group__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2315:1: rule__ArbitraryPathSegment__Group__1__Impl : ( ( rule__ArbitraryPathSegment__Group_1__0 )* ) ;
    public final void rule__ArbitraryPathSegment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2319:1: ( ( ( rule__ArbitraryPathSegment__Group_1__0 )* ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2320:1: ( ( rule__ArbitraryPathSegment__Group_1__0 )* )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2320:1: ( ( rule__ArbitraryPathSegment__Group_1__0 )* )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2321:1: ( rule__ArbitraryPathSegment__Group_1__0 )*
            {
             before(grammarAccess.getArbitraryPathSegmentAccess().getGroup_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2322:1: ( rule__ArbitraryPathSegment__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==27) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2322:2: rule__ArbitraryPathSegment__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group_1__0_in_rule__ArbitraryPathSegment__Group__1__Impl4826);
            	    rule__ArbitraryPathSegment__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getArbitraryPathSegmentAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryPathSegment__Group__1__Impl"


    // $ANTLR start "rule__ArbitraryPathSegment__Group_1__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2336:1: rule__ArbitraryPathSegment__Group_1__0 : rule__ArbitraryPathSegment__Group_1__0__Impl rule__ArbitraryPathSegment__Group_1__1 ;
    public final void rule__ArbitraryPathSegment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2340:1: ( rule__ArbitraryPathSegment__Group_1__0__Impl rule__ArbitraryPathSegment__Group_1__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2341:2: rule__ArbitraryPathSegment__Group_1__0__Impl rule__ArbitraryPathSegment__Group_1__1
            {
            pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group_1__0__Impl_in_rule__ArbitraryPathSegment__Group_1__04861);
            rule__ArbitraryPathSegment__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group_1__1_in_rule__ArbitraryPathSegment__Group_1__04864);
            rule__ArbitraryPathSegment__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryPathSegment__Group_1__0"


    // $ANTLR start "rule__ArbitraryPathSegment__Group_1__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2348:1: rule__ArbitraryPathSegment__Group_1__0__Impl : ( '-' ) ;
    public final void rule__ArbitraryPathSegment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2352:1: ( ( '-' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2353:1: ( '-' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2353:1: ( '-' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2354:1: '-'
            {
             before(grammarAccess.getArbitraryPathSegmentAccess().getHyphenMinusKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__ArbitraryPathSegment__Group_1__0__Impl4892); 
             after(grammarAccess.getArbitraryPathSegmentAccess().getHyphenMinusKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryPathSegment__Group_1__0__Impl"


    // $ANTLR start "rule__ArbitraryPathSegment__Group_1__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2367:1: rule__ArbitraryPathSegment__Group_1__1 : rule__ArbitraryPathSegment__Group_1__1__Impl ;
    public final void rule__ArbitraryPathSegment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2371:1: ( rule__ArbitraryPathSegment__Group_1__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2372:2: rule__ArbitraryPathSegment__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group_1__1__Impl_in_rule__ArbitraryPathSegment__Group_1__14923);
            rule__ArbitraryPathSegment__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryPathSegment__Group_1__1"


    // $ANTLR start "rule__ArbitraryPathSegment__Group_1__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2378:1: rule__ArbitraryPathSegment__Group_1__1__Impl : ( ruleQualifiedName ) ;
    public final void rule__ArbitraryPathSegment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2382:1: ( ( ruleQualifiedName ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2383:1: ( ruleQualifiedName )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2383:1: ( ruleQualifiedName )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2384:1: ruleQualifiedName
            {
             before(grammarAccess.getArbitraryPathSegmentAccess().getQualifiedNameParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ArbitraryPathSegment__Group_1__1__Impl4950);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getArbitraryPathSegmentAccess().getQualifiedNameParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryPathSegment__Group_1__1__Impl"


    // $ANTLR start "rule__ParamsBlock__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2399:1: rule__ParamsBlock__Group__0 : rule__ParamsBlock__Group__0__Impl rule__ParamsBlock__Group__1 ;
    public final void rule__ParamsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2403:1: ( rule__ParamsBlock__Group__0__Impl rule__ParamsBlock__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2404:2: rule__ParamsBlock__Group__0__Impl rule__ParamsBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__0__Impl_in_rule__ParamsBlock__Group__04983);
            rule__ParamsBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group__1_in_rule__ParamsBlock__Group__04986);
            rule__ParamsBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamsBlock__Group__0"


    // $ANTLR start "rule__ParamsBlock__Group__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2411:1: rule__ParamsBlock__Group__0__Impl : ( () ) ;
    public final void rule__ParamsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2415:1: ( ( () ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2416:1: ( () )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2416:1: ( () )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2417:1: ()
            {
             before(grammarAccess.getParamsBlockAccess().getParamsBlockAction_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2418:1: ()
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2420:1: 
            {
            }

             after(grammarAccess.getParamsBlockAccess().getParamsBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamsBlock__Group__0__Impl"


    // $ANTLR start "rule__ParamsBlock__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2430:1: rule__ParamsBlock__Group__1 : rule__ParamsBlock__Group__1__Impl rule__ParamsBlock__Group__2 ;
    public final void rule__ParamsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2434:1: ( rule__ParamsBlock__Group__1__Impl rule__ParamsBlock__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2435:2: rule__ParamsBlock__Group__1__Impl rule__ParamsBlock__Group__2
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__1__Impl_in_rule__ParamsBlock__Group__15044);
            rule__ParamsBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group__2_in_rule__ParamsBlock__Group__15047);
            rule__ParamsBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamsBlock__Group__1"


    // $ANTLR start "rule__ParamsBlock__Group__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2442:1: rule__ParamsBlock__Group__1__Impl : ( 'params' ) ;
    public final void rule__ParamsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2446:1: ( ( 'params' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2447:1: ( 'params' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2447:1: ( 'params' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2448:1: 'params'
            {
             before(grammarAccess.getParamsBlockAccess().getParamsKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__ParamsBlock__Group__1__Impl5075); 
             after(grammarAccess.getParamsBlockAccess().getParamsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamsBlock__Group__1__Impl"


    // $ANTLR start "rule__ParamsBlock__Group__2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2461:1: rule__ParamsBlock__Group__2 : rule__ParamsBlock__Group__2__Impl rule__ParamsBlock__Group__3 ;
    public final void rule__ParamsBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2465:1: ( rule__ParamsBlock__Group__2__Impl rule__ParamsBlock__Group__3 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2466:2: rule__ParamsBlock__Group__2__Impl rule__ParamsBlock__Group__3
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__2__Impl_in_rule__ParamsBlock__Group__25106);
            rule__ParamsBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group__3_in_rule__ParamsBlock__Group__25109);
            rule__ParamsBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamsBlock__Group__2"


    // $ANTLR start "rule__ParamsBlock__Group__2__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2473:1: rule__ParamsBlock__Group__2__Impl : ( ( rule__ParamsBlock__ParamsAssignment_2 ) ) ;
    public final void rule__ParamsBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2477:1: ( ( ( rule__ParamsBlock__ParamsAssignment_2 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2478:1: ( ( rule__ParamsBlock__ParamsAssignment_2 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2478:1: ( ( rule__ParamsBlock__ParamsAssignment_2 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2479:1: ( rule__ParamsBlock__ParamsAssignment_2 )
            {
             before(grammarAccess.getParamsBlockAccess().getParamsAssignment_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2480:1: ( rule__ParamsBlock__ParamsAssignment_2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2480:2: rule__ParamsBlock__ParamsAssignment_2
            {
            pushFollow(FOLLOW_rule__ParamsBlock__ParamsAssignment_2_in_rule__ParamsBlock__Group__2__Impl5136);
            rule__ParamsBlock__ParamsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParamsBlockAccess().getParamsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamsBlock__Group__2__Impl"


    // $ANTLR start "rule__ParamsBlock__Group__3"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2490:1: rule__ParamsBlock__Group__3 : rule__ParamsBlock__Group__3__Impl ;
    public final void rule__ParamsBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2494:1: ( rule__ParamsBlock__Group__3__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2495:2: rule__ParamsBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__3__Impl_in_rule__ParamsBlock__Group__35166);
            rule__ParamsBlock__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamsBlock__Group__3"


    // $ANTLR start "rule__ParamsBlock__Group__3__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2501:1: rule__ParamsBlock__Group__3__Impl : ( ( rule__ParamsBlock__Group_3__0 )* ) ;
    public final void rule__ParamsBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2505:1: ( ( ( rule__ParamsBlock__Group_3__0 )* ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2506:1: ( ( rule__ParamsBlock__Group_3__0 )* )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2506:1: ( ( rule__ParamsBlock__Group_3__0 )* )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2507:1: ( rule__ParamsBlock__Group_3__0 )*
            {
             before(grammarAccess.getParamsBlockAccess().getGroup_3()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2508:1: ( rule__ParamsBlock__Group_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==25) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2508:2: rule__ParamsBlock__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ParamsBlock__Group_3__0_in_rule__ParamsBlock__Group__3__Impl5193);
            	    rule__ParamsBlock__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getParamsBlockAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamsBlock__Group__3__Impl"


    // $ANTLR start "rule__ParamsBlock__Group_3__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2526:1: rule__ParamsBlock__Group_3__0 : rule__ParamsBlock__Group_3__0__Impl rule__ParamsBlock__Group_3__1 ;
    public final void rule__ParamsBlock__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2530:1: ( rule__ParamsBlock__Group_3__0__Impl rule__ParamsBlock__Group_3__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2531:2: rule__ParamsBlock__Group_3__0__Impl rule__ParamsBlock__Group_3__1
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group_3__0__Impl_in_rule__ParamsBlock__Group_3__05232);
            rule__ParamsBlock__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group_3__1_in_rule__ParamsBlock__Group_3__05235);
            rule__ParamsBlock__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamsBlock__Group_3__0"


    // $ANTLR start "rule__ParamsBlock__Group_3__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2538:1: rule__ParamsBlock__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ParamsBlock__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2542:1: ( ( ',' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2543:1: ( ',' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2543:1: ( ',' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2544:1: ','
            {
             before(grammarAccess.getParamsBlockAccess().getCommaKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__ParamsBlock__Group_3__0__Impl5263); 
             after(grammarAccess.getParamsBlockAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamsBlock__Group_3__0__Impl"


    // $ANTLR start "rule__ParamsBlock__Group_3__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2557:1: rule__ParamsBlock__Group_3__1 : rule__ParamsBlock__Group_3__1__Impl ;
    public final void rule__ParamsBlock__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2561:1: ( rule__ParamsBlock__Group_3__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2562:2: rule__ParamsBlock__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group_3__1__Impl_in_rule__ParamsBlock__Group_3__15294);
            rule__ParamsBlock__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamsBlock__Group_3__1"


    // $ANTLR start "rule__ParamsBlock__Group_3__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2568:1: rule__ParamsBlock__Group_3__1__Impl : ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) ) ;
    public final void rule__ParamsBlock__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2572:1: ( ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2573:1: ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2573:1: ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2574:1: ( rule__ParamsBlock__ParamsAssignment_3_1 )
            {
             before(grammarAccess.getParamsBlockAccess().getParamsAssignment_3_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2575:1: ( rule__ParamsBlock__ParamsAssignment_3_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2575:2: rule__ParamsBlock__ParamsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ParamsBlock__ParamsAssignment_3_1_in_rule__ParamsBlock__Group_3__1__Impl5321);
            rule__ParamsBlock__ParamsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParamsBlockAccess().getParamsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamsBlock__Group_3__1__Impl"


    // $ANTLR start "rule__Literal__Group_0__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2589:1: rule__Literal__Group_0__0 : rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 ;
    public final void rule__Literal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2593:1: ( rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2594:2: rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__05355);
            rule__Literal__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__05358);
            rule__Literal__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__0"


    // $ANTLR start "rule__Literal__Group_0__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2601:1: rule__Literal__Group_0__0__Impl : ( () ) ;
    public final void rule__Literal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2605:1: ( ( () ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2606:1: ( () )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2606:1: ( () )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2607:1: ()
            {
             before(grammarAccess.getLiteralAccess().getBooleanLiteralAction_0_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2608:1: ()
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2610:1: 
            {
            }

             after(grammarAccess.getLiteralAccess().getBooleanLiteralAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__0__Impl"


    // $ANTLR start "rule__Literal__Group_0__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2620:1: rule__Literal__Group_0__1 : rule__Literal__Group_0__1__Impl ;
    public final void rule__Literal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2624:1: ( rule__Literal__Group_0__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2625:2: rule__Literal__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__15416);
            rule__Literal__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__1"


    // $ANTLR start "rule__Literal__Group_0__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2631:1: rule__Literal__Group_0__1__Impl : ( ( rule__Literal__LiteralAssignment_0_1 ) ) ;
    public final void rule__Literal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2635:1: ( ( ( rule__Literal__LiteralAssignment_0_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2636:1: ( ( rule__Literal__LiteralAssignment_0_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2636:1: ( ( rule__Literal__LiteralAssignment_0_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2637:1: ( rule__Literal__LiteralAssignment_0_1 )
            {
             before(grammarAccess.getLiteralAccess().getLiteralAssignment_0_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2638:1: ( rule__Literal__LiteralAssignment_0_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2638:2: rule__Literal__LiteralAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Literal__LiteralAssignment_0_1_in_rule__Literal__Group_0__1__Impl5443);
            rule__Literal__LiteralAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getLiteralAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__1__Impl"


    // $ANTLR start "rule__Literal__Group_1__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2652:1: rule__Literal__Group_1__0 : rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 ;
    public final void rule__Literal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2656:1: ( rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2657:2: rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_1__0__Impl_in_rule__Literal__Group_1__05477);
            rule__Literal__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_1__1_in_rule__Literal__Group_1__05480);
            rule__Literal__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__0"


    // $ANTLR start "rule__Literal__Group_1__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2664:1: rule__Literal__Group_1__0__Impl : ( () ) ;
    public final void rule__Literal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2668:1: ( ( () ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2669:1: ( () )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2669:1: ( () )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2670:1: ()
            {
             before(grammarAccess.getLiteralAccess().getStringLiteralAction_1_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2671:1: ()
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2673:1: 
            {
            }

             after(grammarAccess.getLiteralAccess().getStringLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__0__Impl"


    // $ANTLR start "rule__Literal__Group_1__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2683:1: rule__Literal__Group_1__1 : rule__Literal__Group_1__1__Impl ;
    public final void rule__Literal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2687:1: ( rule__Literal__Group_1__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2688:2: rule__Literal__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_1__1__Impl_in_rule__Literal__Group_1__15538);
            rule__Literal__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__1"


    // $ANTLR start "rule__Literal__Group_1__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2694:1: rule__Literal__Group_1__1__Impl : ( ( rule__Literal__LiteralAssignment_1_1 ) ) ;
    public final void rule__Literal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2698:1: ( ( ( rule__Literal__LiteralAssignment_1_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2699:1: ( ( rule__Literal__LiteralAssignment_1_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2699:1: ( ( rule__Literal__LiteralAssignment_1_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2700:1: ( rule__Literal__LiteralAssignment_1_1 )
            {
             before(grammarAccess.getLiteralAccess().getLiteralAssignment_1_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2701:1: ( rule__Literal__LiteralAssignment_1_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2701:2: rule__Literal__LiteralAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Literal__LiteralAssignment_1_1_in_rule__Literal__Group_1__1__Impl5565);
            rule__Literal__LiteralAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getLiteralAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__1__Impl"


    // $ANTLR start "rule__Literal__Group_2__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2715:1: rule__Literal__Group_2__0 : rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 ;
    public final void rule__Literal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2719:1: ( rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2720:2: rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__05599);
            rule__Literal__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__05602);
            rule__Literal__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__0"


    // $ANTLR start "rule__Literal__Group_2__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2727:1: rule__Literal__Group_2__0__Impl : ( () ) ;
    public final void rule__Literal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2731:1: ( ( () ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2732:1: ( () )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2732:1: ( () )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2733:1: ()
            {
             before(grammarAccess.getLiteralAccess().getNumericLiteralAction_2_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2734:1: ()
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2736:1: 
            {
            }

             after(grammarAccess.getLiteralAccess().getNumericLiteralAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__0__Impl"


    // $ANTLR start "rule__Literal__Group_2__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2746:1: rule__Literal__Group_2__1 : rule__Literal__Group_2__1__Impl ;
    public final void rule__Literal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2750:1: ( rule__Literal__Group_2__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2751:2: rule__Literal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__15660);
            rule__Literal__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__1"


    // $ANTLR start "rule__Literal__Group_2__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2757:1: rule__Literal__Group_2__1__Impl : ( ( rule__Literal__LiteralAssignment_2_1 ) ) ;
    public final void rule__Literal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2761:1: ( ( ( rule__Literal__LiteralAssignment_2_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2762:1: ( ( rule__Literal__LiteralAssignment_2_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2762:1: ( ( rule__Literal__LiteralAssignment_2_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2763:1: ( rule__Literal__LiteralAssignment_2_1 )
            {
             before(grammarAccess.getLiteralAccess().getLiteralAssignment_2_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2764:1: ( rule__Literal__LiteralAssignment_2_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2764:2: rule__Literal__LiteralAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Literal__LiteralAssignment_2_1_in_rule__Literal__Group_2__1__Impl5687);
            rule__Literal__LiteralAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getLiteralAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__1__Impl"


    // $ANTLR start "rule__BodyBlock__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2778:1: rule__BodyBlock__Group__0 : rule__BodyBlock__Group__0__Impl rule__BodyBlock__Group__1 ;
    public final void rule__BodyBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2782:1: ( rule__BodyBlock__Group__0__Impl rule__BodyBlock__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2783:2: rule__BodyBlock__Group__0__Impl rule__BodyBlock__Group__1
            {
            pushFollow(FOLLOW_rule__BodyBlock__Group__0__Impl_in_rule__BodyBlock__Group__05721);
            rule__BodyBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyBlock__Group__1_in_rule__BodyBlock__Group__05724);
            rule__BodyBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyBlock__Group__0"


    // $ANTLR start "rule__BodyBlock__Group__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2790:1: rule__BodyBlock__Group__0__Impl : ( 'body' ) ;
    public final void rule__BodyBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2794:1: ( ( 'body' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2795:1: ( 'body' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2795:1: ( 'body' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2796:1: 'body'
            {
             before(grammarAccess.getBodyBlockAccess().getBodyKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__BodyBlock__Group__0__Impl5752); 
             after(grammarAccess.getBodyBlockAccess().getBodyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyBlock__Group__0__Impl"


    // $ANTLR start "rule__BodyBlock__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2809:1: rule__BodyBlock__Group__1 : rule__BodyBlock__Group__1__Impl ;
    public final void rule__BodyBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2813:1: ( rule__BodyBlock__Group__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2814:2: rule__BodyBlock__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BodyBlock__Group__1__Impl_in_rule__BodyBlock__Group__15783);
            rule__BodyBlock__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyBlock__Group__1"


    // $ANTLR start "rule__BodyBlock__Group__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2820:1: rule__BodyBlock__Group__1__Impl : ( ( rule__BodyBlock__TypeAssignment_1 ) ) ;
    public final void rule__BodyBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2824:1: ( ( ( rule__BodyBlock__TypeAssignment_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2825:1: ( ( rule__BodyBlock__TypeAssignment_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2825:1: ( ( rule__BodyBlock__TypeAssignment_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2826:1: ( rule__BodyBlock__TypeAssignment_1 )
            {
             before(grammarAccess.getBodyBlockAccess().getTypeAssignment_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2827:1: ( rule__BodyBlock__TypeAssignment_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2827:2: rule__BodyBlock__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__BodyBlock__TypeAssignment_1_in_rule__BodyBlock__Group__1__Impl5810);
            rule__BodyBlock__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBodyBlockAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyBlock__Group__1__Impl"


    // $ANTLR start "rule__ResponseBlock__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2841:1: rule__ResponseBlock__Group__0 : rule__ResponseBlock__Group__0__Impl rule__ResponseBlock__Group__1 ;
    public final void rule__ResponseBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2845:1: ( rule__ResponseBlock__Group__0__Impl rule__ResponseBlock__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2846:2: rule__ResponseBlock__Group__0__Impl rule__ResponseBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__0__Impl_in_rule__ResponseBlock__Group__05844);
            rule__ResponseBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__1_in_rule__ResponseBlock__Group__05847);
            rule__ResponseBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseBlock__Group__0"


    // $ANTLR start "rule__ResponseBlock__Group__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2853:1: rule__ResponseBlock__Group__0__Impl : ( () ) ;
    public final void rule__ResponseBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2857:1: ( ( () ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2858:1: ( () )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2858:1: ( () )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2859:1: ()
            {
             before(grammarAccess.getResponseBlockAccess().getResponseBlockAction_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2860:1: ()
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2862:1: 
            {
            }

             after(grammarAccess.getResponseBlockAccess().getResponseBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseBlock__Group__0__Impl"


    // $ANTLR start "rule__ResponseBlock__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2872:1: rule__ResponseBlock__Group__1 : rule__ResponseBlock__Group__1__Impl rule__ResponseBlock__Group__2 ;
    public final void rule__ResponseBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2876:1: ( rule__ResponseBlock__Group__1__Impl rule__ResponseBlock__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2877:2: rule__ResponseBlock__Group__1__Impl rule__ResponseBlock__Group__2
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__1__Impl_in_rule__ResponseBlock__Group__15905);
            rule__ResponseBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__2_in_rule__ResponseBlock__Group__15908);
            rule__ResponseBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseBlock__Group__1"


    // $ANTLR start "rule__ResponseBlock__Group__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2884:1: rule__ResponseBlock__Group__1__Impl : ( 'response' ) ;
    public final void rule__ResponseBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2888:1: ( ( 'response' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2889:1: ( 'response' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2889:1: ( 'response' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2890:1: 'response'
            {
             before(grammarAccess.getResponseBlockAccess().getResponseKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__ResponseBlock__Group__1__Impl5936); 
             after(grammarAccess.getResponseBlockAccess().getResponseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseBlock__Group__1__Impl"


    // $ANTLR start "rule__ResponseBlock__Group__2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2903:1: rule__ResponseBlock__Group__2 : rule__ResponseBlock__Group__2__Impl rule__ResponseBlock__Group__3 ;
    public final void rule__ResponseBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2907:1: ( rule__ResponseBlock__Group__2__Impl rule__ResponseBlock__Group__3 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2908:2: rule__ResponseBlock__Group__2__Impl rule__ResponseBlock__Group__3
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__2__Impl_in_rule__ResponseBlock__Group__25967);
            rule__ResponseBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__3_in_rule__ResponseBlock__Group__25970);
            rule__ResponseBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseBlock__Group__2"


    // $ANTLR start "rule__ResponseBlock__Group__2__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2915:1: rule__ResponseBlock__Group__2__Impl : ( ( rule__ResponseBlock__CodeAssignment_2 )? ) ;
    public final void rule__ResponseBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2919:1: ( ( ( rule__ResponseBlock__CodeAssignment_2 )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2920:1: ( ( rule__ResponseBlock__CodeAssignment_2 )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2920:1: ( ( rule__ResponseBlock__CodeAssignment_2 )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2921:1: ( rule__ResponseBlock__CodeAssignment_2 )?
            {
             before(grammarAccess.getResponseBlockAccess().getCodeAssignment_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2922:1: ( rule__ResponseBlock__CodeAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INTEGER) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2922:2: rule__ResponseBlock__CodeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ResponseBlock__CodeAssignment_2_in_rule__ResponseBlock__Group__2__Impl5997);
                    rule__ResponseBlock__CodeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResponseBlockAccess().getCodeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseBlock__Group__2__Impl"


    // $ANTLR start "rule__ResponseBlock__Group__3"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2932:1: rule__ResponseBlock__Group__3 : rule__ResponseBlock__Group__3__Impl rule__ResponseBlock__Group__4 ;
    public final void rule__ResponseBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2936:1: ( rule__ResponseBlock__Group__3__Impl rule__ResponseBlock__Group__4 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2937:2: rule__ResponseBlock__Group__3__Impl rule__ResponseBlock__Group__4
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__3__Impl_in_rule__ResponseBlock__Group__36028);
            rule__ResponseBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__4_in_rule__ResponseBlock__Group__36031);
            rule__ResponseBlock__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseBlock__Group__3"


    // $ANTLR start "rule__ResponseBlock__Group__3__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2944:1: rule__ResponseBlock__Group__3__Impl : ( ( rule__ResponseBlock__MessageAssignment_3 )? ) ;
    public final void rule__ResponseBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2948:1: ( ( ( rule__ResponseBlock__MessageAssignment_3 )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2949:1: ( ( rule__ResponseBlock__MessageAssignment_3 )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2949:1: ( ( rule__ResponseBlock__MessageAssignment_3 )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2950:1: ( rule__ResponseBlock__MessageAssignment_3 )?
            {
             before(grammarAccess.getResponseBlockAccess().getMessageAssignment_3()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2951:1: ( rule__ResponseBlock__MessageAssignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2951:2: rule__ResponseBlock__MessageAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ResponseBlock__MessageAssignment_3_in_rule__ResponseBlock__Group__3__Impl6058);
                    rule__ResponseBlock__MessageAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResponseBlockAccess().getMessageAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseBlock__Group__3__Impl"


    // $ANTLR start "rule__ResponseBlock__Group__4"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2961:1: rule__ResponseBlock__Group__4 : rule__ResponseBlock__Group__4__Impl rule__ResponseBlock__Group__5 ;
    public final void rule__ResponseBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2965:1: ( rule__ResponseBlock__Group__4__Impl rule__ResponseBlock__Group__5 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2966:2: rule__ResponseBlock__Group__4__Impl rule__ResponseBlock__Group__5
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__4__Impl_in_rule__ResponseBlock__Group__46089);
            rule__ResponseBlock__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__5_in_rule__ResponseBlock__Group__46092);
            rule__ResponseBlock__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseBlock__Group__4"


    // $ANTLR start "rule__ResponseBlock__Group__4__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2973:1: rule__ResponseBlock__Group__4__Impl : ( ( rule__ResponseBlock__Group_4__0 )? ) ;
    public final void rule__ResponseBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2977:1: ( ( ( rule__ResponseBlock__Group_4__0 )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2978:1: ( ( rule__ResponseBlock__Group_4__0 )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2978:1: ( ( rule__ResponseBlock__Group_4__0 )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2979:1: ( rule__ResponseBlock__Group_4__0 )?
            {
             before(grammarAccess.getResponseBlockAccess().getGroup_4()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2980:1: ( rule__ResponseBlock__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2980:2: rule__ResponseBlock__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ResponseBlock__Group_4__0_in_rule__ResponseBlock__Group__4__Impl6119);
                    rule__ResponseBlock__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResponseBlockAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseBlock__Group__4__Impl"


    // $ANTLR start "rule__ResponseBlock__Group__5"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2990:1: rule__ResponseBlock__Group__5 : rule__ResponseBlock__Group__5__Impl ;
    public final void rule__ResponseBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2994:1: ( rule__ResponseBlock__Group__5__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2995:2: rule__ResponseBlock__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__5__Impl_in_rule__ResponseBlock__Group__56150);
            rule__ResponseBlock__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseBlock__Group__5"


    // $ANTLR start "rule__ResponseBlock__Group__5__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3001:1: rule__ResponseBlock__Group__5__Impl : ( ( rule__ResponseBlock__TypeAssignment_5 )? ) ;
    public final void rule__ResponseBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3005:1: ( ( ( rule__ResponseBlock__TypeAssignment_5 )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3006:1: ( ( rule__ResponseBlock__TypeAssignment_5 )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3006:1: ( ( rule__ResponseBlock__TypeAssignment_5 )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3007:1: ( rule__ResponseBlock__TypeAssignment_5 )?
            {
             before(grammarAccess.getResponseBlockAccess().getTypeAssignment_5()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3008:1: ( rule__ResponseBlock__TypeAssignment_5 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID||LA28_0==22||(LA28_0>=39 && LA28_0<=43)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3008:2: rule__ResponseBlock__TypeAssignment_5
                    {
                    pushFollow(FOLLOW_rule__ResponseBlock__TypeAssignment_5_in_rule__ResponseBlock__Group__5__Impl6177);
                    rule__ResponseBlock__TypeAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResponseBlockAccess().getTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseBlock__Group__5__Impl"


    // $ANTLR start "rule__ResponseBlock__Group_4__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3030:1: rule__ResponseBlock__Group_4__0 : rule__ResponseBlock__Group_4__0__Impl rule__ResponseBlock__Group_4__1 ;
    public final void rule__ResponseBlock__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3034:1: ( rule__ResponseBlock__Group_4__0__Impl rule__ResponseBlock__Group_4__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3035:2: rule__ResponseBlock__Group_4__0__Impl rule__ResponseBlock__Group_4__1
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group_4__0__Impl_in_rule__ResponseBlock__Group_4__06220);
            rule__ResponseBlock__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group_4__1_in_rule__ResponseBlock__Group_4__06223);
            rule__ResponseBlock__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseBlock__Group_4__0"


    // $ANTLR start "rule__ResponseBlock__Group_4__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3042:1: rule__ResponseBlock__Group_4__0__Impl : ( 'mixin' ) ;
    public final void rule__ResponseBlock__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3046:1: ( ( 'mixin' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3047:1: ( 'mixin' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3047:1: ( 'mixin' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3048:1: 'mixin'
            {
             before(grammarAccess.getResponseBlockAccess().getMixinKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__ResponseBlock__Group_4__0__Impl6251); 
             after(grammarAccess.getResponseBlockAccess().getMixinKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseBlock__Group_4__0__Impl"


    // $ANTLR start "rule__ResponseBlock__Group_4__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3061:1: rule__ResponseBlock__Group_4__1 : rule__ResponseBlock__Group_4__1__Impl ;
    public final void rule__ResponseBlock__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3065:1: ( rule__ResponseBlock__Group_4__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3066:2: rule__ResponseBlock__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group_4__1__Impl_in_rule__ResponseBlock__Group_4__16282);
            rule__ResponseBlock__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseBlock__Group_4__1"


    // $ANTLR start "rule__ResponseBlock__Group_4__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3072:1: rule__ResponseBlock__Group_4__1__Impl : ( ( rule__ResponseBlock__SuperTypeAssignment_4_1 ) ) ;
    public final void rule__ResponseBlock__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3076:1: ( ( ( rule__ResponseBlock__SuperTypeAssignment_4_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3077:1: ( ( rule__ResponseBlock__SuperTypeAssignment_4_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3077:1: ( ( rule__ResponseBlock__SuperTypeAssignment_4_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3078:1: ( rule__ResponseBlock__SuperTypeAssignment_4_1 )
            {
             before(grammarAccess.getResponseBlockAccess().getSuperTypeAssignment_4_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3079:1: ( rule__ResponseBlock__SuperTypeAssignment_4_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3079:2: rule__ResponseBlock__SuperTypeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ResponseBlock__SuperTypeAssignment_4_1_in_rule__ResponseBlock__Group_4__1__Impl6309);
            rule__ResponseBlock__SuperTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getResponseBlockAccess().getSuperTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseBlock__Group_4__1__Impl"


    // $ANTLR start "rule__Member__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3093:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3097:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3098:2: rule__Member__Group__0__Impl rule__Member__Group__1
            {
            pushFollow(FOLLOW_rule__Member__Group__0__Impl_in_rule__Member__Group__06343);
            rule__Member__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Member__Group__1_in_rule__Member__Group__06346);
            rule__Member__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__0"


    // $ANTLR start "rule__Member__Group__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3105:1: rule__Member__Group__0__Impl : ( ( rule__Member__NameAssignment_0 ) ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3109:1: ( ( ( rule__Member__NameAssignment_0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3110:1: ( ( rule__Member__NameAssignment_0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3110:1: ( ( rule__Member__NameAssignment_0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3111:1: ( rule__Member__NameAssignment_0 )
            {
             before(grammarAccess.getMemberAccess().getNameAssignment_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3112:1: ( rule__Member__NameAssignment_0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3112:2: rule__Member__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Member__NameAssignment_0_in_rule__Member__Group__0__Impl6373);
            rule__Member__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__0__Impl"


    // $ANTLR start "rule__Member__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3122:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3126:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3127:2: rule__Member__Group__1__Impl rule__Member__Group__2
            {
            pushFollow(FOLLOW_rule__Member__Group__1__Impl_in_rule__Member__Group__16403);
            rule__Member__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Member__Group__2_in_rule__Member__Group__16406);
            rule__Member__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__1"


    // $ANTLR start "rule__Member__Group__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3134:1: rule__Member__Group__1__Impl : ( ':' ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3138:1: ( ( ':' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3139:1: ( ':' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3139:1: ( ':' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3140:1: ':'
            {
             before(grammarAccess.getMemberAccess().getColonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Member__Group__1__Impl6434); 
             after(grammarAccess.getMemberAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__1__Impl"


    // $ANTLR start "rule__Member__Group__2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3153:1: rule__Member__Group__2 : rule__Member__Group__2__Impl rule__Member__Group__3 ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3157:1: ( rule__Member__Group__2__Impl rule__Member__Group__3 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3158:2: rule__Member__Group__2__Impl rule__Member__Group__3
            {
            pushFollow(FOLLOW_rule__Member__Group__2__Impl_in_rule__Member__Group__26465);
            rule__Member__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Member__Group__3_in_rule__Member__Group__26468);
            rule__Member__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__2"


    // $ANTLR start "rule__Member__Group__2__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3165:1: rule__Member__Group__2__Impl : ( ( rule__Member__TypeAssignment_2 ) ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3169:1: ( ( ( rule__Member__TypeAssignment_2 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3170:1: ( ( rule__Member__TypeAssignment_2 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3170:1: ( ( rule__Member__TypeAssignment_2 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3171:1: ( rule__Member__TypeAssignment_2 )
            {
             before(grammarAccess.getMemberAccess().getTypeAssignment_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3172:1: ( rule__Member__TypeAssignment_2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3172:2: rule__Member__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Member__TypeAssignment_2_in_rule__Member__Group__2__Impl6495);
            rule__Member__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__2__Impl"


    // $ANTLR start "rule__Member__Group__3"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3182:1: rule__Member__Group__3 : rule__Member__Group__3__Impl ;
    public final void rule__Member__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3186:1: ( rule__Member__Group__3__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3187:2: rule__Member__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Member__Group__3__Impl_in_rule__Member__Group__36525);
            rule__Member__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__3"


    // $ANTLR start "rule__Member__Group__3__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3193:1: rule__Member__Group__3__Impl : ( ( rule__Member__Group_3__0 )? ) ;
    public final void rule__Member__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3197:1: ( ( ( rule__Member__Group_3__0 )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3198:1: ( ( rule__Member__Group_3__0 )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3198:1: ( ( rule__Member__Group_3__0 )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3199:1: ( rule__Member__Group_3__0 )?
            {
             before(grammarAccess.getMemberAccess().getGroup_3()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3200:1: ( rule__Member__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3200:2: rule__Member__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Member__Group_3__0_in_rule__Member__Group__3__Impl6552);
                    rule__Member__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMemberAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__3__Impl"


    // $ANTLR start "rule__Member__Group_3__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3218:1: rule__Member__Group_3__0 : rule__Member__Group_3__0__Impl rule__Member__Group_3__1 ;
    public final void rule__Member__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3222:1: ( rule__Member__Group_3__0__Impl rule__Member__Group_3__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3223:2: rule__Member__Group_3__0__Impl rule__Member__Group_3__1
            {
            pushFollow(FOLLOW_rule__Member__Group_3__0__Impl_in_rule__Member__Group_3__06591);
            rule__Member__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Member__Group_3__1_in_rule__Member__Group_3__06594);
            rule__Member__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group_3__0"


    // $ANTLR start "rule__Member__Group_3__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3230:1: rule__Member__Group_3__0__Impl : ( '=' ) ;
    public final void rule__Member__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3234:1: ( ( '=' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3235:1: ( '=' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3235:1: ( '=' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3236:1: '='
            {
             before(grammarAccess.getMemberAccess().getEqualsSignKeyword_3_0()); 
            match(input,33,FOLLOW_33_in_rule__Member__Group_3__0__Impl6622); 
             after(grammarAccess.getMemberAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group_3__0__Impl"


    // $ANTLR start "rule__Member__Group_3__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3249:1: rule__Member__Group_3__1 : rule__Member__Group_3__1__Impl ;
    public final void rule__Member__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3253:1: ( rule__Member__Group_3__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3254:2: rule__Member__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Member__Group_3__1__Impl_in_rule__Member__Group_3__16653);
            rule__Member__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group_3__1"


    // $ANTLR start "rule__Member__Group_3__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3260:1: rule__Member__Group_3__1__Impl : ( ( rule__Member__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__Member__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3264:1: ( ( ( rule__Member__DefaultValueAssignment_3_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3265:1: ( ( rule__Member__DefaultValueAssignment_3_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3265:1: ( ( rule__Member__DefaultValueAssignment_3_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3266:1: ( rule__Member__DefaultValueAssignment_3_1 )
            {
             before(grammarAccess.getMemberAccess().getDefaultValueAssignment_3_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3267:1: ( rule__Member__DefaultValueAssignment_3_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3267:2: rule__Member__DefaultValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Member__DefaultValueAssignment_3_1_in_rule__Member__Group_3__1__Impl6680);
            rule__Member__DefaultValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getDefaultValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group_3__1__Impl"


    // $ANTLR start "rule__ArrayType__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3281:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3285:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3286:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__06714);
            rule__ArrayType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__06717);
            rule__ArrayType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__0"


    // $ANTLR start "rule__ArrayType__Group__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3293:1: rule__ArrayType__Group__0__Impl : ( ( rule__ArrayType__ElementTypeAssignment_0 ) ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3297:1: ( ( ( rule__ArrayType__ElementTypeAssignment_0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3298:1: ( ( rule__ArrayType__ElementTypeAssignment_0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3298:1: ( ( rule__ArrayType__ElementTypeAssignment_0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3299:1: ( rule__ArrayType__ElementTypeAssignment_0 )
            {
             before(grammarAccess.getArrayTypeAccess().getElementTypeAssignment_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3300:1: ( rule__ArrayType__ElementTypeAssignment_0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3300:2: rule__ArrayType__ElementTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__ArrayType__ElementTypeAssignment_0_in_rule__ArrayType__Group__0__Impl6744);
            rule__ArrayType__ElementTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getElementTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__0__Impl"


    // $ANTLR start "rule__ArrayType__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3310:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3314:1: ( rule__ArrayType__Group__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3315:2: rule__ArrayType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__16774);
            rule__ArrayType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__1"


    // $ANTLR start "rule__ArrayType__Group__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3321:1: rule__ArrayType__Group__1__Impl : ( ( rule__ArrayType__IdAssignment_1 ) ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3325:1: ( ( ( rule__ArrayType__IdAssignment_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3326:1: ( ( rule__ArrayType__IdAssignment_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3326:1: ( ( rule__ArrayType__IdAssignment_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3327:1: ( rule__ArrayType__IdAssignment_1 )
            {
             before(grammarAccess.getArrayTypeAccess().getIdAssignment_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3328:1: ( rule__ArrayType__IdAssignment_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3328:2: rule__ArrayType__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__ArrayType__IdAssignment_1_in_rule__ArrayType__Group__1__Impl6801);
            rule__ArrayType__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__1__Impl"


    // $ANTLR start "rule__ComplexTypeDeclaration__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3342:1: rule__ComplexTypeDeclaration__Group__0 : rule__ComplexTypeDeclaration__Group__0__Impl rule__ComplexTypeDeclaration__Group__1 ;
    public final void rule__ComplexTypeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3346:1: ( rule__ComplexTypeDeclaration__Group__0__Impl rule__ComplexTypeDeclaration__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3347:2: rule__ComplexTypeDeclaration__Group__0__Impl rule__ComplexTypeDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__0__Impl_in_rule__ComplexTypeDeclaration__Group__06835);
            rule__ComplexTypeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__1_in_rule__ComplexTypeDeclaration__Group__06838);
            rule__ComplexTypeDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeDeclaration__Group__0"


    // $ANTLR start "rule__ComplexTypeDeclaration__Group__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3354:1: rule__ComplexTypeDeclaration__Group__0__Impl : ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) ) ;
    public final void rule__ComplexTypeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3358:1: ( ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3359:1: ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3359:1: ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3360:1: ( rule__ComplexTypeDeclaration__KeywordAssignment_0 )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getKeywordAssignment_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3361:1: ( rule__ComplexTypeDeclaration__KeywordAssignment_0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3361:2: rule__ComplexTypeDeclaration__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__KeywordAssignment_0_in_rule__ComplexTypeDeclaration__Group__0__Impl6865);
            rule__ComplexTypeDeclaration__KeywordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeDeclarationAccess().getKeywordAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ComplexTypeDeclaration__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3371:1: rule__ComplexTypeDeclaration__Group__1 : rule__ComplexTypeDeclaration__Group__1__Impl rule__ComplexTypeDeclaration__Group__2 ;
    public final void rule__ComplexTypeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3375:1: ( rule__ComplexTypeDeclaration__Group__1__Impl rule__ComplexTypeDeclaration__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3376:2: rule__ComplexTypeDeclaration__Group__1__Impl rule__ComplexTypeDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__1__Impl_in_rule__ComplexTypeDeclaration__Group__16895);
            rule__ComplexTypeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__2_in_rule__ComplexTypeDeclaration__Group__16898);
            rule__ComplexTypeDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeDeclaration__Group__1"


    // $ANTLR start "rule__ComplexTypeDeclaration__Group__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3383:1: rule__ComplexTypeDeclaration__Group__1__Impl : ( ( rule__ComplexTypeDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ComplexTypeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3387:1: ( ( ( rule__ComplexTypeDeclaration__NameAssignment_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3388:1: ( ( rule__ComplexTypeDeclaration__NameAssignment_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3388:1: ( ( rule__ComplexTypeDeclaration__NameAssignment_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3389:1: ( rule__ComplexTypeDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getNameAssignment_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3390:1: ( rule__ComplexTypeDeclaration__NameAssignment_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3390:2: rule__ComplexTypeDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__NameAssignment_1_in_rule__ComplexTypeDeclaration__Group__1__Impl6925);
            rule__ComplexTypeDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ComplexTypeDeclaration__Group__2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3400:1: rule__ComplexTypeDeclaration__Group__2 : rule__ComplexTypeDeclaration__Group__2__Impl ;
    public final void rule__ComplexTypeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3404:1: ( rule__ComplexTypeDeclaration__Group__2__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3405:2: rule__ComplexTypeDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__2__Impl_in_rule__ComplexTypeDeclaration__Group__26955);
            rule__ComplexTypeDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeDeclaration__Group__2"


    // $ANTLR start "rule__ComplexTypeDeclaration__Group__2__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3411:1: rule__ComplexTypeDeclaration__Group__2__Impl : ( ( rule__ComplexTypeDeclaration__LiteralAssignment_2 )? ) ;
    public final void rule__ComplexTypeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3415:1: ( ( ( rule__ComplexTypeDeclaration__LiteralAssignment_2 )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3416:1: ( ( rule__ComplexTypeDeclaration__LiteralAssignment_2 )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3416:1: ( ( rule__ComplexTypeDeclaration__LiteralAssignment_2 )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3417:1: ( rule__ComplexTypeDeclaration__LiteralAssignment_2 )?
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getLiteralAssignment_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3418:1: ( rule__ComplexTypeDeclaration__LiteralAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==22) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3418:2: rule__ComplexTypeDeclaration__LiteralAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ComplexTypeDeclaration__LiteralAssignment_2_in_rule__ComplexTypeDeclaration__Group__2__Impl6982);
                    rule__ComplexTypeDeclaration__LiteralAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexTypeDeclarationAccess().getLiteralAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeDeclaration__Group__2__Impl"


    // $ANTLR start "rule__EnumTypeDeclaration__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3434:1: rule__EnumTypeDeclaration__Group__0 : rule__EnumTypeDeclaration__Group__0__Impl rule__EnumTypeDeclaration__Group__1 ;
    public final void rule__EnumTypeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3438:1: ( rule__EnumTypeDeclaration__Group__0__Impl rule__EnumTypeDeclaration__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3439:2: rule__EnumTypeDeclaration__Group__0__Impl rule__EnumTypeDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__0__Impl_in_rule__EnumTypeDeclaration__Group__07019);
            rule__EnumTypeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__1_in_rule__EnumTypeDeclaration__Group__07022);
            rule__EnumTypeDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDeclaration__Group__0"


    // $ANTLR start "rule__EnumTypeDeclaration__Group__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3446:1: rule__EnumTypeDeclaration__Group__0__Impl : ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) ) ;
    public final void rule__EnumTypeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3450:1: ( ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3451:1: ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3451:1: ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3452:1: ( rule__EnumTypeDeclaration__KeywordAssignment_0 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getKeywordAssignment_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3453:1: ( rule__EnumTypeDeclaration__KeywordAssignment_0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3453:2: rule__EnumTypeDeclaration__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__KeywordAssignment_0_in_rule__EnumTypeDeclaration__Group__0__Impl7049);
            rule__EnumTypeDeclaration__KeywordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeDeclarationAccess().getKeywordAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDeclaration__Group__0__Impl"


    // $ANTLR start "rule__EnumTypeDeclaration__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3463:1: rule__EnumTypeDeclaration__Group__1 : rule__EnumTypeDeclaration__Group__1__Impl rule__EnumTypeDeclaration__Group__2 ;
    public final void rule__EnumTypeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3467:1: ( rule__EnumTypeDeclaration__Group__1__Impl rule__EnumTypeDeclaration__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3468:2: rule__EnumTypeDeclaration__Group__1__Impl rule__EnumTypeDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__1__Impl_in_rule__EnumTypeDeclaration__Group__17079);
            rule__EnumTypeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__2_in_rule__EnumTypeDeclaration__Group__17082);
            rule__EnumTypeDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDeclaration__Group__1"


    // $ANTLR start "rule__EnumTypeDeclaration__Group__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3475:1: rule__EnumTypeDeclaration__Group__1__Impl : ( ( rule__EnumTypeDeclaration__NameAssignment_1 ) ) ;
    public final void rule__EnumTypeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3479:1: ( ( ( rule__EnumTypeDeclaration__NameAssignment_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3480:1: ( ( rule__EnumTypeDeclaration__NameAssignment_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3480:1: ( ( rule__EnumTypeDeclaration__NameAssignment_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3481:1: ( rule__EnumTypeDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getNameAssignment_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3482:1: ( rule__EnumTypeDeclaration__NameAssignment_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3482:2: rule__EnumTypeDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__NameAssignment_1_in_rule__EnumTypeDeclaration__Group__1__Impl7109);
            rule__EnumTypeDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDeclaration__Group__1__Impl"


    // $ANTLR start "rule__EnumTypeDeclaration__Group__2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3492:1: rule__EnumTypeDeclaration__Group__2 : rule__EnumTypeDeclaration__Group__2__Impl rule__EnumTypeDeclaration__Group__3 ;
    public final void rule__EnumTypeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3496:1: ( rule__EnumTypeDeclaration__Group__2__Impl rule__EnumTypeDeclaration__Group__3 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3497:2: rule__EnumTypeDeclaration__Group__2__Impl rule__EnumTypeDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__2__Impl_in_rule__EnumTypeDeclaration__Group__27139);
            rule__EnumTypeDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__3_in_rule__EnumTypeDeclaration__Group__27142);
            rule__EnumTypeDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDeclaration__Group__2"


    // $ANTLR start "rule__EnumTypeDeclaration__Group__2__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3504:1: rule__EnumTypeDeclaration__Group__2__Impl : ( ( rule__EnumTypeDeclaration__Group_2__0 )? ) ;
    public final void rule__EnumTypeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3508:1: ( ( ( rule__EnumTypeDeclaration__Group_2__0 )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3509:1: ( ( rule__EnumTypeDeclaration__Group_2__0 )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3509:1: ( ( rule__EnumTypeDeclaration__Group_2__0 )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3510:1: ( rule__EnumTypeDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGroup_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3511:1: ( rule__EnumTypeDeclaration__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3511:2: rule__EnumTypeDeclaration__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_2__0_in_rule__EnumTypeDeclaration__Group__2__Impl7169);
                    rule__EnumTypeDeclaration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumTypeDeclarationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDeclaration__Group__2__Impl"


    // $ANTLR start "rule__EnumTypeDeclaration__Group__3"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3521:1: rule__EnumTypeDeclaration__Group__3 : rule__EnumTypeDeclaration__Group__3__Impl ;
    public final void rule__EnumTypeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3525:1: ( rule__EnumTypeDeclaration__Group__3__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3526:2: rule__EnumTypeDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__3__Impl_in_rule__EnumTypeDeclaration__Group__37200);
            rule__EnumTypeDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDeclaration__Group__3"


    // $ANTLR start "rule__EnumTypeDeclaration__Group__3__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3532:1: rule__EnumTypeDeclaration__Group__3__Impl : ( ( rule__EnumTypeDeclaration__LiteralAssignment_3 )? ) ;
    public final void rule__EnumTypeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3536:1: ( ( ( rule__EnumTypeDeclaration__LiteralAssignment_3 )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3537:1: ( ( rule__EnumTypeDeclaration__LiteralAssignment_3 )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3537:1: ( ( rule__EnumTypeDeclaration__LiteralAssignment_3 )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3538:1: ( rule__EnumTypeDeclaration__LiteralAssignment_3 )?
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getLiteralAssignment_3()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3539:1: ( rule__EnumTypeDeclaration__LiteralAssignment_3 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==22) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3539:2: rule__EnumTypeDeclaration__LiteralAssignment_3
                    {
                    pushFollow(FOLLOW_rule__EnumTypeDeclaration__LiteralAssignment_3_in_rule__EnumTypeDeclaration__Group__3__Impl7227);
                    rule__EnumTypeDeclaration__LiteralAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumTypeDeclarationAccess().getLiteralAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDeclaration__Group__3__Impl"


    // $ANTLR start "rule__EnumTypeDeclaration__Group_2__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3557:1: rule__EnumTypeDeclaration__Group_2__0 : rule__EnumTypeDeclaration__Group_2__0__Impl rule__EnumTypeDeclaration__Group_2__1 ;
    public final void rule__EnumTypeDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3561:1: ( rule__EnumTypeDeclaration__Group_2__0__Impl rule__EnumTypeDeclaration__Group_2__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3562:2: rule__EnumTypeDeclaration__Group_2__0__Impl rule__EnumTypeDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_2__0__Impl_in_rule__EnumTypeDeclaration__Group_2__07266);
            rule__EnumTypeDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_2__1_in_rule__EnumTypeDeclaration__Group_2__07269);
            rule__EnumTypeDeclaration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDeclaration__Group_2__0"


    // $ANTLR start "rule__EnumTypeDeclaration__Group_2__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3569:1: rule__EnumTypeDeclaration__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__EnumTypeDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3573:1: ( ( 'extends' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3574:1: ( 'extends' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3574:1: ( 'extends' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3575:1: 'extends'
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getExtendsKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__EnumTypeDeclaration__Group_2__0__Impl7297); 
             after(grammarAccess.getEnumTypeDeclarationAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__EnumTypeDeclaration__Group_2__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3588:1: rule__EnumTypeDeclaration__Group_2__1 : rule__EnumTypeDeclaration__Group_2__1__Impl ;
    public final void rule__EnumTypeDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3592:1: ( rule__EnumTypeDeclaration__Group_2__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3593:2: rule__EnumTypeDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_2__1__Impl_in_rule__EnumTypeDeclaration__Group_2__17328);
            rule__EnumTypeDeclaration__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDeclaration__Group_2__1"


    // $ANTLR start "rule__EnumTypeDeclaration__Group_2__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3599:1: rule__EnumTypeDeclaration__Group_2__1__Impl : ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__EnumTypeDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3603:1: ( ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_2_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3604:1: ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_2_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3604:1: ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_2_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3605:1: ( rule__EnumTypeDeclaration__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeAssignment_2_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3606:1: ( rule__EnumTypeDeclaration__SuperTypeAssignment_2_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3606:2: rule__EnumTypeDeclaration__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__SuperTypeAssignment_2_1_in_rule__EnumTypeDeclaration__Group_2__1__Impl7355);
            rule__EnumTypeDeclaration__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__EnumTypeLiteral__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3620:1: rule__EnumTypeLiteral__Group__0 : rule__EnumTypeLiteral__Group__0__Impl rule__EnumTypeLiteral__Group__1 ;
    public final void rule__EnumTypeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3624:1: ( rule__EnumTypeLiteral__Group__0__Impl rule__EnumTypeLiteral__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3625:2: rule__EnumTypeLiteral__Group__0__Impl rule__EnumTypeLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__0__Impl_in_rule__EnumTypeLiteral__Group__07389);
            rule__EnumTypeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__1_in_rule__EnumTypeLiteral__Group__07392);
            rule__EnumTypeLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeLiteral__Group__0"


    // $ANTLR start "rule__EnumTypeLiteral__Group__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3632:1: rule__EnumTypeLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__EnumTypeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3636:1: ( ( '{' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3637:1: ( '{' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3637:1: ( '{' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3638:1: '{'
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__EnumTypeLiteral__Group__0__Impl7420); 
             after(grammarAccess.getEnumTypeLiteralAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeLiteral__Group__0__Impl"


    // $ANTLR start "rule__EnumTypeLiteral__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3651:1: rule__EnumTypeLiteral__Group__1 : rule__EnumTypeLiteral__Group__1__Impl rule__EnumTypeLiteral__Group__2 ;
    public final void rule__EnumTypeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3655:1: ( rule__EnumTypeLiteral__Group__1__Impl rule__EnumTypeLiteral__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3656:2: rule__EnumTypeLiteral__Group__1__Impl rule__EnumTypeLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__1__Impl_in_rule__EnumTypeLiteral__Group__17451);
            rule__EnumTypeLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__2_in_rule__EnumTypeLiteral__Group__17454);
            rule__EnumTypeLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeLiteral__Group__1"


    // $ANTLR start "rule__EnumTypeLiteral__Group__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3663:1: rule__EnumTypeLiteral__Group__1__Impl : ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) ) ;
    public final void rule__EnumTypeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3667:1: ( ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3668:1: ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3668:1: ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3669:1: ( rule__EnumTypeLiteral__MembersAssignment_1 )
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersAssignment_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3670:1: ( rule__EnumTypeLiteral__MembersAssignment_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3670:2: rule__EnumTypeLiteral__MembersAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__MembersAssignment_1_in_rule__EnumTypeLiteral__Group__1__Impl7481);
            rule__EnumTypeLiteral__MembersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeLiteralAccess().getMembersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeLiteral__Group__1__Impl"


    // $ANTLR start "rule__EnumTypeLiteral__Group__2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3680:1: rule__EnumTypeLiteral__Group__2 : rule__EnumTypeLiteral__Group__2__Impl rule__EnumTypeLiteral__Group__3 ;
    public final void rule__EnumTypeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3684:1: ( rule__EnumTypeLiteral__Group__2__Impl rule__EnumTypeLiteral__Group__3 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3685:2: rule__EnumTypeLiteral__Group__2__Impl rule__EnumTypeLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__2__Impl_in_rule__EnumTypeLiteral__Group__27511);
            rule__EnumTypeLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__3_in_rule__EnumTypeLiteral__Group__27514);
            rule__EnumTypeLiteral__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeLiteral__Group__2"


    // $ANTLR start "rule__EnumTypeLiteral__Group__2__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3692:1: rule__EnumTypeLiteral__Group__2__Impl : ( ( rule__EnumTypeLiteral__Group_2__0 )* ) ;
    public final void rule__EnumTypeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3696:1: ( ( ( rule__EnumTypeLiteral__Group_2__0 )* ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3697:1: ( ( rule__EnumTypeLiteral__Group_2__0 )* )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3697:1: ( ( rule__EnumTypeLiteral__Group_2__0 )* )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3698:1: ( rule__EnumTypeLiteral__Group_2__0 )*
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getGroup_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3699:1: ( rule__EnumTypeLiteral__Group_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==25) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3699:2: rule__EnumTypeLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__0_in_rule__EnumTypeLiteral__Group__2__Impl7541);
            	    rule__EnumTypeLiteral__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getEnumTypeLiteralAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeLiteral__Group__2__Impl"


    // $ANTLR start "rule__EnumTypeLiteral__Group__3"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3709:1: rule__EnumTypeLiteral__Group__3 : rule__EnumTypeLiteral__Group__3__Impl ;
    public final void rule__EnumTypeLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3713:1: ( rule__EnumTypeLiteral__Group__3__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3714:2: rule__EnumTypeLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__3__Impl_in_rule__EnumTypeLiteral__Group__37572);
            rule__EnumTypeLiteral__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeLiteral__Group__3"


    // $ANTLR start "rule__EnumTypeLiteral__Group__3__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3720:1: rule__EnumTypeLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__EnumTypeLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3724:1: ( ( '}' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3725:1: ( '}' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3725:1: ( '}' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3726:1: '}'
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__EnumTypeLiteral__Group__3__Impl7600); 
             after(grammarAccess.getEnumTypeLiteralAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeLiteral__Group__3__Impl"


    // $ANTLR start "rule__EnumTypeLiteral__Group_2__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3747:1: rule__EnumTypeLiteral__Group_2__0 : rule__EnumTypeLiteral__Group_2__0__Impl rule__EnumTypeLiteral__Group_2__1 ;
    public final void rule__EnumTypeLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3751:1: ( rule__EnumTypeLiteral__Group_2__0__Impl rule__EnumTypeLiteral__Group_2__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3752:2: rule__EnumTypeLiteral__Group_2__0__Impl rule__EnumTypeLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__0__Impl_in_rule__EnumTypeLiteral__Group_2__07639);
            rule__EnumTypeLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__1_in_rule__EnumTypeLiteral__Group_2__07642);
            rule__EnumTypeLiteral__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeLiteral__Group_2__0"


    // $ANTLR start "rule__EnumTypeLiteral__Group_2__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3759:1: rule__EnumTypeLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__EnumTypeLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3763:1: ( ( ',' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3764:1: ( ',' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3764:1: ( ',' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3765:1: ','
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getCommaKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__EnumTypeLiteral__Group_2__0__Impl7670); 
             after(grammarAccess.getEnumTypeLiteralAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeLiteral__Group_2__0__Impl"


    // $ANTLR start "rule__EnumTypeLiteral__Group_2__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3778:1: rule__EnumTypeLiteral__Group_2__1 : rule__EnumTypeLiteral__Group_2__1__Impl ;
    public final void rule__EnumTypeLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3782:1: ( rule__EnumTypeLiteral__Group_2__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3783:2: rule__EnumTypeLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__1__Impl_in_rule__EnumTypeLiteral__Group_2__17701);
            rule__EnumTypeLiteral__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeLiteral__Group_2__1"


    // $ANTLR start "rule__EnumTypeLiteral__Group_2__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3789:1: rule__EnumTypeLiteral__Group_2__1__Impl : ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) ) ;
    public final void rule__EnumTypeLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3793:1: ( ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3794:1: ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3794:1: ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3795:1: ( rule__EnumTypeLiteral__MembersAssignment_2_1 )
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersAssignment_2_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3796:1: ( rule__EnumTypeLiteral__MembersAssignment_2_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3796:2: rule__EnumTypeLiteral__MembersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__MembersAssignment_2_1_in_rule__EnumTypeLiteral__Group_2__1__Impl7728);
            rule__EnumTypeLiteral__MembersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeLiteralAccess().getMembersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeLiteral__Group_2__1__Impl"


    // $ANTLR start "rule__EnumMember__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3810:1: rule__EnumMember__Group__0 : rule__EnumMember__Group__0__Impl rule__EnumMember__Group__1 ;
    public final void rule__EnumMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3814:1: ( rule__EnumMember__Group__0__Impl rule__EnumMember__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3815:2: rule__EnumMember__Group__0__Impl rule__EnumMember__Group__1
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__0__Impl_in_rule__EnumMember__Group__07762);
            rule__EnumMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__07765);
            rule__EnumMember__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumMember__Group__0"


    // $ANTLR start "rule__EnumMember__Group__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3822:1: rule__EnumMember__Group__0__Impl : ( ( rule__EnumMember__NameAssignment_0 ) ) ;
    public final void rule__EnumMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3826:1: ( ( ( rule__EnumMember__NameAssignment_0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3827:1: ( ( rule__EnumMember__NameAssignment_0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3827:1: ( ( rule__EnumMember__NameAssignment_0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3828:1: ( rule__EnumMember__NameAssignment_0 )
            {
             before(grammarAccess.getEnumMemberAccess().getNameAssignment_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3829:1: ( rule__EnumMember__NameAssignment_0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3829:2: rule__EnumMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumMember__NameAssignment_0_in_rule__EnumMember__Group__0__Impl7792);
            rule__EnumMember__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumMemberAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumMember__Group__0__Impl"


    // $ANTLR start "rule__EnumMember__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3839:1: rule__EnumMember__Group__1 : rule__EnumMember__Group__1__Impl ;
    public final void rule__EnumMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3843:1: ( rule__EnumMember__Group__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3844:2: rule__EnumMember__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__1__Impl_in_rule__EnumMember__Group__17822);
            rule__EnumMember__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumMember__Group__1"


    // $ANTLR start "rule__EnumMember__Group__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3850:1: rule__EnumMember__Group__1__Impl : ( ( rule__EnumMember__Group_1__0 )? ) ;
    public final void rule__EnumMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3854:1: ( ( ( rule__EnumMember__Group_1__0 )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3855:1: ( ( rule__EnumMember__Group_1__0 )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3855:1: ( ( rule__EnumMember__Group_1__0 )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3856:1: ( rule__EnumMember__Group_1__0 )?
            {
             before(grammarAccess.getEnumMemberAccess().getGroup_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3857:1: ( rule__EnumMember__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==33) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3857:2: rule__EnumMember__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EnumMember__Group_1__0_in_rule__EnumMember__Group__1__Impl7849);
                    rule__EnumMember__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumMemberAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumMember__Group__1__Impl"


    // $ANTLR start "rule__EnumMember__Group_1__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3871:1: rule__EnumMember__Group_1__0 : rule__EnumMember__Group_1__0__Impl rule__EnumMember__Group_1__1 ;
    public final void rule__EnumMember__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3875:1: ( rule__EnumMember__Group_1__0__Impl rule__EnumMember__Group_1__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3876:2: rule__EnumMember__Group_1__0__Impl rule__EnumMember__Group_1__1
            {
            pushFollow(FOLLOW_rule__EnumMember__Group_1__0__Impl_in_rule__EnumMember__Group_1__07884);
            rule__EnumMember__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumMember__Group_1__1_in_rule__EnumMember__Group_1__07887);
            rule__EnumMember__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumMember__Group_1__0"


    // $ANTLR start "rule__EnumMember__Group_1__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3883:1: rule__EnumMember__Group_1__0__Impl : ( ( rule__EnumMember__AssignmentAssignment_1_0 ) ) ;
    public final void rule__EnumMember__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3887:1: ( ( ( rule__EnumMember__AssignmentAssignment_1_0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3888:1: ( ( rule__EnumMember__AssignmentAssignment_1_0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3888:1: ( ( rule__EnumMember__AssignmentAssignment_1_0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3889:1: ( rule__EnumMember__AssignmentAssignment_1_0 )
            {
             before(grammarAccess.getEnumMemberAccess().getAssignmentAssignment_1_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3890:1: ( rule__EnumMember__AssignmentAssignment_1_0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3890:2: rule__EnumMember__AssignmentAssignment_1_0
            {
            pushFollow(FOLLOW_rule__EnumMember__AssignmentAssignment_1_0_in_rule__EnumMember__Group_1__0__Impl7914);
            rule__EnumMember__AssignmentAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumMemberAccess().getAssignmentAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumMember__Group_1__0__Impl"


    // $ANTLR start "rule__EnumMember__Group_1__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3900:1: rule__EnumMember__Group_1__1 : rule__EnumMember__Group_1__1__Impl ;
    public final void rule__EnumMember__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3904:1: ( rule__EnumMember__Group_1__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3905:2: rule__EnumMember__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumMember__Group_1__1__Impl_in_rule__EnumMember__Group_1__17944);
            rule__EnumMember__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumMember__Group_1__1"


    // $ANTLR start "rule__EnumMember__Group_1__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3911:1: rule__EnumMember__Group_1__1__Impl : ( ( rule__EnumMember__ValueAssignment_1_1 ) ) ;
    public final void rule__EnumMember__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3915:1: ( ( ( rule__EnumMember__ValueAssignment_1_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3916:1: ( ( rule__EnumMember__ValueAssignment_1_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3916:1: ( ( rule__EnumMember__ValueAssignment_1_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3917:1: ( rule__EnumMember__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumMemberAccess().getValueAssignment_1_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3918:1: ( rule__EnumMember__ValueAssignment_1_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3918:2: rule__EnumMember__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumMember__ValueAssignment_1_1_in_rule__EnumMember__Group_1__1__Impl7971);
            rule__EnumMember__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumMemberAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumMember__Group_1__1__Impl"


    // $ANTLR start "rule__ComplexTypeLiteral__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3932:1: rule__ComplexTypeLiteral__Group__0 : rule__ComplexTypeLiteral__Group__0__Impl rule__ComplexTypeLiteral__Group__1 ;
    public final void rule__ComplexTypeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3936:1: ( rule__ComplexTypeLiteral__Group__0__Impl rule__ComplexTypeLiteral__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3937:2: rule__ComplexTypeLiteral__Group__0__Impl rule__ComplexTypeLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__0__Impl_in_rule__ComplexTypeLiteral__Group__08005);
            rule__ComplexTypeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__1_in_rule__ComplexTypeLiteral__Group__08008);
            rule__ComplexTypeLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeLiteral__Group__0"


    // $ANTLR start "rule__ComplexTypeLiteral__Group__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3944:1: rule__ComplexTypeLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__ComplexTypeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3948:1: ( ( '{' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3949:1: ( '{' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3949:1: ( '{' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3950:1: '{'
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__ComplexTypeLiteral__Group__0__Impl8036); 
             after(grammarAccess.getComplexTypeLiteralAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeLiteral__Group__0__Impl"


    // $ANTLR start "rule__ComplexTypeLiteral__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3963:1: rule__ComplexTypeLiteral__Group__1 : rule__ComplexTypeLiteral__Group__1__Impl rule__ComplexTypeLiteral__Group__2 ;
    public final void rule__ComplexTypeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3967:1: ( rule__ComplexTypeLiteral__Group__1__Impl rule__ComplexTypeLiteral__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3968:2: rule__ComplexTypeLiteral__Group__1__Impl rule__ComplexTypeLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__1__Impl_in_rule__ComplexTypeLiteral__Group__18067);
            rule__ComplexTypeLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__2_in_rule__ComplexTypeLiteral__Group__18070);
            rule__ComplexTypeLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeLiteral__Group__1"


    // $ANTLR start "rule__ComplexTypeLiteral__Group__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3975:1: rule__ComplexTypeLiteral__Group__1__Impl : ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) ) ;
    public final void rule__ComplexTypeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3979:1: ( ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3980:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3980:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3981:1: ( rule__ComplexTypeLiteral__MembersAssignment_1 )
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersAssignment_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3982:1: ( rule__ComplexTypeLiteral__MembersAssignment_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3982:2: rule__ComplexTypeLiteral__MembersAssignment_1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_1_in_rule__ComplexTypeLiteral__Group__1__Impl8097);
            rule__ComplexTypeLiteral__MembersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeLiteralAccess().getMembersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeLiteral__Group__1__Impl"


    // $ANTLR start "rule__ComplexTypeLiteral__Group__2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3992:1: rule__ComplexTypeLiteral__Group__2 : rule__ComplexTypeLiteral__Group__2__Impl rule__ComplexTypeLiteral__Group__3 ;
    public final void rule__ComplexTypeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3996:1: ( rule__ComplexTypeLiteral__Group__2__Impl rule__ComplexTypeLiteral__Group__3 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3997:2: rule__ComplexTypeLiteral__Group__2__Impl rule__ComplexTypeLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__2__Impl_in_rule__ComplexTypeLiteral__Group__28127);
            rule__ComplexTypeLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__3_in_rule__ComplexTypeLiteral__Group__28130);
            rule__ComplexTypeLiteral__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeLiteral__Group__2"


    // $ANTLR start "rule__ComplexTypeLiteral__Group__2__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4004:1: rule__ComplexTypeLiteral__Group__2__Impl : ( ( rule__ComplexTypeLiteral__Group_2__0 )* ) ;
    public final void rule__ComplexTypeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4008:1: ( ( ( rule__ComplexTypeLiteral__Group_2__0 )* ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4009:1: ( ( rule__ComplexTypeLiteral__Group_2__0 )* )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4009:1: ( ( rule__ComplexTypeLiteral__Group_2__0 )* )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4010:1: ( rule__ComplexTypeLiteral__Group_2__0 )*
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getGroup_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4011:1: ( rule__ComplexTypeLiteral__Group_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==25) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4011:2: rule__ComplexTypeLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__0_in_rule__ComplexTypeLiteral__Group__2__Impl8157);
            	    rule__ComplexTypeLiteral__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getComplexTypeLiteralAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeLiteral__Group__2__Impl"


    // $ANTLR start "rule__ComplexTypeLiteral__Group__3"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4021:1: rule__ComplexTypeLiteral__Group__3 : rule__ComplexTypeLiteral__Group__3__Impl ;
    public final void rule__ComplexTypeLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4025:1: ( rule__ComplexTypeLiteral__Group__3__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4026:2: rule__ComplexTypeLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__3__Impl_in_rule__ComplexTypeLiteral__Group__38188);
            rule__ComplexTypeLiteral__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeLiteral__Group__3"


    // $ANTLR start "rule__ComplexTypeLiteral__Group__3__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4032:1: rule__ComplexTypeLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__ComplexTypeLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4036:1: ( ( '}' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4037:1: ( '}' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4037:1: ( '}' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4038:1: '}'
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__ComplexTypeLiteral__Group__3__Impl8216); 
             after(grammarAccess.getComplexTypeLiteralAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeLiteral__Group__3__Impl"


    // $ANTLR start "rule__ComplexTypeLiteral__Group_2__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4059:1: rule__ComplexTypeLiteral__Group_2__0 : rule__ComplexTypeLiteral__Group_2__0__Impl rule__ComplexTypeLiteral__Group_2__1 ;
    public final void rule__ComplexTypeLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4063:1: ( rule__ComplexTypeLiteral__Group_2__0__Impl rule__ComplexTypeLiteral__Group_2__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4064:2: rule__ComplexTypeLiteral__Group_2__0__Impl rule__ComplexTypeLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__0__Impl_in_rule__ComplexTypeLiteral__Group_2__08255);
            rule__ComplexTypeLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__1_in_rule__ComplexTypeLiteral__Group_2__08258);
            rule__ComplexTypeLiteral__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeLiteral__Group_2__0"


    // $ANTLR start "rule__ComplexTypeLiteral__Group_2__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4071:1: rule__ComplexTypeLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ComplexTypeLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4075:1: ( ( ',' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4076:1: ( ',' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4076:1: ( ',' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4077:1: ','
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getCommaKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__ComplexTypeLiteral__Group_2__0__Impl8286); 
             after(grammarAccess.getComplexTypeLiteralAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeLiteral__Group_2__0__Impl"


    // $ANTLR start "rule__ComplexTypeLiteral__Group_2__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4090:1: rule__ComplexTypeLiteral__Group_2__1 : rule__ComplexTypeLiteral__Group_2__1__Impl ;
    public final void rule__ComplexTypeLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4094:1: ( rule__ComplexTypeLiteral__Group_2__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4095:2: rule__ComplexTypeLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__1__Impl_in_rule__ComplexTypeLiteral__Group_2__18317);
            rule__ComplexTypeLiteral__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeLiteral__Group_2__1"


    // $ANTLR start "rule__ComplexTypeLiteral__Group_2__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4101:1: rule__ComplexTypeLiteral__Group_2__1__Impl : ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) ) ;
    public final void rule__ComplexTypeLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4105:1: ( ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4106:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4106:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4107:1: ( rule__ComplexTypeLiteral__MembersAssignment_2_1 )
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersAssignment_2_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4108:1: ( rule__ComplexTypeLiteral__MembersAssignment_2_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4108:2: rule__ComplexTypeLiteral__MembersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_2_1_in_rule__ComplexTypeLiteral__Group_2__1__Impl8344);
            rule__ComplexTypeLiteral__MembersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeLiteralAccess().getMembersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeLiteral__Group_2__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4122:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4126:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4127:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08378);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08381);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4134:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4138:1: ( ( RULE_ID ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4139:1: ( RULE_ID )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4139:1: ( RULE_ID )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4140:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8408); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4151:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4155:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4156:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18437);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4162:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4166:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4167:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4167:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4168:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4169:1: ( rule__QualifiedName__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==35) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4169:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8464);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4183:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4187:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4188:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08499);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08502);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4195:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4199:1: ( ( '.' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4200:1: ( '.' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4200:1: ( '.' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4201:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,35,FOLLOW_35_in_rule__QualifiedName__Group_1__0__Impl8530); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4214:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4218:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4219:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18561);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4225:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4229:1: ( ( RULE_ID ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4230:1: ( RULE_ID )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4230:1: ( RULE_ID )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4231:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl8588); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__SignedNumber__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4246:1: rule__SignedNumber__Group__0 : rule__SignedNumber__Group__0__Impl rule__SignedNumber__Group__1 ;
    public final void rule__SignedNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4250:1: ( rule__SignedNumber__Group__0__Impl rule__SignedNumber__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4251:2: rule__SignedNumber__Group__0__Impl rule__SignedNumber__Group__1
            {
            pushFollow(FOLLOW_rule__SignedNumber__Group__0__Impl_in_rule__SignedNumber__Group__08621);
            rule__SignedNumber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignedNumber__Group__1_in_rule__SignedNumber__Group__08624);
            rule__SignedNumber__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedNumber__Group__0"


    // $ANTLR start "rule__SignedNumber__Group__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4258:1: rule__SignedNumber__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SignedNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4262:1: ( ( ( '-' )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4263:1: ( ( '-' )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4263:1: ( ( '-' )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4264:1: ( '-' )?
            {
             before(grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4265:1: ( '-' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==27) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4266:2: '-'
                    {
                    match(input,27,FOLLOW_27_in_rule__SignedNumber__Group__0__Impl8653); 

                    }
                    break;

            }

             after(grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedNumber__Group__0__Impl"


    // $ANTLR start "rule__SignedNumber__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4277:1: rule__SignedNumber__Group__1 : rule__SignedNumber__Group__1__Impl ;
    public final void rule__SignedNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4281:1: ( rule__SignedNumber__Group__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4282:2: rule__SignedNumber__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SignedNumber__Group__1__Impl_in_rule__SignedNumber__Group__18686);
            rule__SignedNumber__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedNumber__Group__1"


    // $ANTLR start "rule__SignedNumber__Group__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4288:1: rule__SignedNumber__Group__1__Impl : ( RULE_NUMBER ) ;
    public final void rule__SignedNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4292:1: ( ( RULE_NUMBER ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4293:1: ( RULE_NUMBER )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4293:1: ( RULE_NUMBER )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4294:1: RULE_NUMBER
            {
             before(grammarAccess.getSignedNumberAccess().getNUMBERTerminalRuleCall_1()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__SignedNumber__Group__1__Impl8713); 
             after(grammarAccess.getSignedNumberAccess().getNUMBERTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedNumber__Group__1__Impl"


    // $ANTLR start "rule__SpecApiDocument__PackageNameAssignment_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4310:1: rule__SpecApiDocument__PackageNameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__SpecApiDocument__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4314:1: ( ( ruleQualifiedName ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4315:1: ( ruleQualifiedName )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4315:1: ( ruleQualifiedName )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4316:1: ruleQualifiedName
            {
             before(grammarAccess.getSpecApiDocumentAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__SpecApiDocument__PackageNameAssignment_18751);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSpecApiDocumentAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecApiDocument__PackageNameAssignment_1"


    // $ANTLR start "rule__SpecApiDocument__DeclarationsAssignment_2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4325:1: rule__SpecApiDocument__DeclarationsAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__SpecApiDocument__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4329:1: ( ( ruleDeclaration ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4330:1: ( ruleDeclaration )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4330:1: ( ruleDeclaration )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4331:1: ruleDeclaration
            {
             before(grammarAccess.getSpecApiDocumentAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__SpecApiDocument__DeclarationsAssignment_28782);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getSpecApiDocumentAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecApiDocument__DeclarationsAssignment_2"


    // $ANTLR start "rule__Api__NameAssignment_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4340:1: rule__Api__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Api__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4344:1: ( ( RULE_ID ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4345:1: ( RULE_ID )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4345:1: ( RULE_ID )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4346:1: RULE_ID
            {
             before(grammarAccess.getApiAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Api__NameAssignment_18813); 
             after(grammarAccess.getApiAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__NameAssignment_1"


    // $ANTLR start "rule__Api__BaseUrlAssignment_2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4355:1: rule__Api__BaseUrlAssignment_2 : ( RULE_URL ) ;
    public final void rule__Api__BaseUrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4359:1: ( ( RULE_URL ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4360:1: ( RULE_URL )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4360:1: ( RULE_URL )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4361:1: RULE_URL
            {
             before(grammarAccess.getApiAccess().getBaseUrlURLTerminalRuleCall_2_0()); 
            match(input,RULE_URL,FOLLOW_RULE_URL_in_rule__Api__BaseUrlAssignment_28844); 
             after(grammarAccess.getApiAccess().getBaseUrlURLTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__BaseUrlAssignment_2"


    // $ANTLR start "rule__Api__BlocksAssignment_4"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4370:1: rule__Api__BlocksAssignment_4 : ( ruleServiceBlock ) ;
    public final void rule__Api__BlocksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4374:1: ( ( ruleServiceBlock ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4375:1: ( ruleServiceBlock )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4375:1: ( ruleServiceBlock )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4376:1: ruleServiceBlock
            {
             before(grammarAccess.getApiAccess().getBlocksServiceBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleServiceBlock_in_rule__Api__BlocksAssignment_48875);
            ruleServiceBlock();

            state._fsp--;

             after(grammarAccess.getApiAccess().getBlocksServiceBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__BlocksAssignment_4"


    // $ANTLR start "rule__HeaderBlock__HeadersAssignment_2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4385:1: rule__HeaderBlock__HeadersAssignment_2 : ( ruleMember ) ;
    public final void rule__HeaderBlock__HeadersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4389:1: ( ( ruleMember ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4390:1: ( ruleMember )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4390:1: ( ruleMember )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4391:1: ruleMember
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersMemberParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__HeaderBlock__HeadersAssignment_28906);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getHeaderBlockAccess().getHeadersMemberParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderBlock__HeadersAssignment_2"


    // $ANTLR start "rule__HeaderBlock__HeadersAssignment_3_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4400:1: rule__HeaderBlock__HeadersAssignment_3_1 : ( ruleMember ) ;
    public final void rule__HeaderBlock__HeadersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4404:1: ( ( ruleMember ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4405:1: ( ruleMember )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4405:1: ( ruleMember )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4406:1: ruleMember
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersMemberParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__HeaderBlock__HeadersAssignment_3_18937);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getHeaderBlockAccess().getHeadersMemberParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderBlock__HeadersAssignment_3_1"


    // $ANTLR start "rule__HttpMethod__TypeAssignment_0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4415:1: rule__HttpMethod__TypeAssignment_0 : ( ruleHttpMethodType ) ;
    public final void rule__HttpMethod__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4419:1: ( ( ruleHttpMethodType ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4420:1: ( ruleHttpMethodType )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4420:1: ( ruleHttpMethodType )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4421:1: ruleHttpMethodType
            {
             before(grammarAccess.getHttpMethodAccess().getTypeHttpMethodTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleHttpMethodType_in_rule__HttpMethod__TypeAssignment_08968);
            ruleHttpMethodType();

            state._fsp--;

             after(grammarAccess.getHttpMethodAccess().getTypeHttpMethodTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__TypeAssignment_0"


    // $ANTLR start "rule__HttpMethod__NameAssignment_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4430:1: rule__HttpMethod__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__HttpMethod__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4434:1: ( ( RULE_ID ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4435:1: ( RULE_ID )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4435:1: ( RULE_ID )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4436:1: RULE_ID
            {
             before(grammarAccess.getHttpMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HttpMethod__NameAssignment_18999); 
             after(grammarAccess.getHttpMethodAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__NameAssignment_1"


    // $ANTLR start "rule__HttpMethod__PathAssignment_2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4445:1: rule__HttpMethod__PathAssignment_2 : ( rulePath ) ;
    public final void rule__HttpMethod__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4449:1: ( ( rulePath ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4450:1: ( rulePath )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4450:1: ( rulePath )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4451:1: rulePath
            {
             before(grammarAccess.getHttpMethodAccess().getPathPathParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePath_in_rule__HttpMethod__PathAssignment_29030);
            rulePath();

            state._fsp--;

             after(grammarAccess.getHttpMethodAccess().getPathPathParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__PathAssignment_2"


    // $ANTLR start "rule__HttpMethod__BlocksAssignment_4"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4460:1: rule__HttpMethod__BlocksAssignment_4 : ( ruleHttpMethodBlock ) ;
    public final void rule__HttpMethod__BlocksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4464:1: ( ( ruleHttpMethodBlock ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4465:1: ( ruleHttpMethodBlock )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4465:1: ( ruleHttpMethodBlock )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4466:1: ruleHttpMethodBlock
            {
             before(grammarAccess.getHttpMethodAccess().getBlocksHttpMethodBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleHttpMethodBlock_in_rule__HttpMethod__BlocksAssignment_49061);
            ruleHttpMethodBlock();

            state._fsp--;

             after(grammarAccess.getHttpMethodAccess().getBlocksHttpMethodBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__BlocksAssignment_4"


    // $ANTLR start "rule__Path__ParamsAssignment_2_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4475:1: rule__Path__ParamsAssignment_2_1 : ( ruleMember ) ;
    public final void rule__Path__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4479:1: ( ( ruleMember ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4480:1: ( ruleMember )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4480:1: ( ruleMember )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4481:1: ruleMember
            {
             before(grammarAccess.getPathAccess().getParamsMemberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__Path__ParamsAssignment_2_19092);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getPathAccess().getParamsMemberParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__ParamsAssignment_2_1"


    // $ANTLR start "rule__Path__ParamsAssignment_3_1_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4490:1: rule__Path__ParamsAssignment_3_1_1 : ( ruleMember ) ;
    public final void rule__Path__ParamsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4494:1: ( ( ruleMember ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4495:1: ( ruleMember )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4495:1: ( ruleMember )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4496:1: ruleMember
            {
             before(grammarAccess.getPathAccess().getParamsMemberParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__Path__ParamsAssignment_3_1_19123);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getPathAccess().getParamsMemberParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__ParamsAssignment_3_1_1"


    // $ANTLR start "rule__ParamsBlock__ParamsAssignment_2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4505:1: rule__ParamsBlock__ParamsAssignment_2 : ( ruleMember ) ;
    public final void rule__ParamsBlock__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4509:1: ( ( ruleMember ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4510:1: ( ruleMember )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4510:1: ( ruleMember )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4511:1: ruleMember
            {
             before(grammarAccess.getParamsBlockAccess().getParamsMemberParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__ParamsBlock__ParamsAssignment_29154);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getParamsBlockAccess().getParamsMemberParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamsBlock__ParamsAssignment_2"


    // $ANTLR start "rule__ParamsBlock__ParamsAssignment_3_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4520:1: rule__ParamsBlock__ParamsAssignment_3_1 : ( ruleMember ) ;
    public final void rule__ParamsBlock__ParamsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4524:1: ( ( ruleMember ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4525:1: ( ruleMember )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4525:1: ( ruleMember )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4526:1: ruleMember
            {
             before(grammarAccess.getParamsBlockAccess().getParamsMemberParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__ParamsBlock__ParamsAssignment_3_19185);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getParamsBlockAccess().getParamsMemberParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamsBlock__ParamsAssignment_3_1"


    // $ANTLR start "rule__Literal__LiteralAssignment_0_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4535:1: rule__Literal__LiteralAssignment_0_1 : ( ruleBooleanValue ) ;
    public final void rule__Literal__LiteralAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4539:1: ( ( ruleBooleanValue ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4540:1: ( ruleBooleanValue )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4540:1: ( ruleBooleanValue )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4541:1: ruleBooleanValue
            {
             before(grammarAccess.getLiteralAccess().getLiteralBooleanValueEnumRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_rule__Literal__LiteralAssignment_0_19216);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getLiteralBooleanValueEnumRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__LiteralAssignment_0_1"


    // $ANTLR start "rule__Literal__LiteralAssignment_1_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4550:1: rule__Literal__LiteralAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Literal__LiteralAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4554:1: ( ( RULE_STRING ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4555:1: ( RULE_STRING )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4555:1: ( RULE_STRING )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4556:1: RULE_STRING
            {
             before(grammarAccess.getLiteralAccess().getLiteralSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Literal__LiteralAssignment_1_19247); 
             after(grammarAccess.getLiteralAccess().getLiteralSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__LiteralAssignment_1_1"


    // $ANTLR start "rule__Literal__LiteralAssignment_2_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4565:1: rule__Literal__LiteralAssignment_2_1 : ( ruleSignedNumber ) ;
    public final void rule__Literal__LiteralAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4569:1: ( ( ruleSignedNumber ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4570:1: ( ruleSignedNumber )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4570:1: ( ruleSignedNumber )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4571:1: ruleSignedNumber
            {
             before(grammarAccess.getLiteralAccess().getLiteralSignedNumberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleSignedNumber_in_rule__Literal__LiteralAssignment_2_19278);
            ruleSignedNumber();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getLiteralSignedNumberParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__LiteralAssignment_2_1"


    // $ANTLR start "rule__BodyBlock__TypeAssignment_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4580:1: rule__BodyBlock__TypeAssignment_1 : ( ruleBlockType ) ;
    public final void rule__BodyBlock__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4584:1: ( ( ruleBlockType ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4585:1: ( ruleBlockType )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4585:1: ( ruleBlockType )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4586:1: ruleBlockType
            {
             before(grammarAccess.getBodyBlockAccess().getTypeBlockTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBlockType_in_rule__BodyBlock__TypeAssignment_19309);
            ruleBlockType();

            state._fsp--;

             after(grammarAccess.getBodyBlockAccess().getTypeBlockTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyBlock__TypeAssignment_1"


    // $ANTLR start "rule__ResponseBlock__CodeAssignment_2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4595:1: rule__ResponseBlock__CodeAssignment_2 : ( RULE_INTEGER ) ;
    public final void rule__ResponseBlock__CodeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4599:1: ( ( RULE_INTEGER ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4600:1: ( RULE_INTEGER )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4600:1: ( RULE_INTEGER )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4601:1: RULE_INTEGER
            {
             before(grammarAccess.getResponseBlockAccess().getCodeINTEGERTerminalRuleCall_2_0()); 
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__ResponseBlock__CodeAssignment_29340); 
             after(grammarAccess.getResponseBlockAccess().getCodeINTEGERTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseBlock__CodeAssignment_2"


    // $ANTLR start "rule__ResponseBlock__MessageAssignment_3"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4610:1: rule__ResponseBlock__MessageAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ResponseBlock__MessageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4614:1: ( ( RULE_STRING ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4615:1: ( RULE_STRING )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4615:1: ( RULE_STRING )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4616:1: RULE_STRING
            {
             before(grammarAccess.getResponseBlockAccess().getMessageSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ResponseBlock__MessageAssignment_39371); 
             after(grammarAccess.getResponseBlockAccess().getMessageSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseBlock__MessageAssignment_3"


    // $ANTLR start "rule__ResponseBlock__SuperTypeAssignment_4_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4625:1: rule__ResponseBlock__SuperTypeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ResponseBlock__SuperTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4629:1: ( ( ( RULE_ID ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4630:1: ( ( RULE_ID ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4630:1: ( ( RULE_ID ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4631:1: ( RULE_ID )
            {
             before(grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationCrossReference_4_1_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4632:1: ( RULE_ID )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4633:1: RULE_ID
            {
             before(grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResponseBlock__SuperTypeAssignment_4_19406); 
             after(grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseBlock__SuperTypeAssignment_4_1"


    // $ANTLR start "rule__ResponseBlock__TypeAssignment_5"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4644:1: rule__ResponseBlock__TypeAssignment_5 : ( ruleBlockType ) ;
    public final void rule__ResponseBlock__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4648:1: ( ( ruleBlockType ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4649:1: ( ruleBlockType )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4649:1: ( ruleBlockType )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4650:1: ruleBlockType
            {
             before(grammarAccess.getResponseBlockAccess().getTypeBlockTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBlockType_in_rule__ResponseBlock__TypeAssignment_59441);
            ruleBlockType();

            state._fsp--;

             after(grammarAccess.getResponseBlockAccess().getTypeBlockTypeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResponseBlock__TypeAssignment_5"


    // $ANTLR start "rule__Member__NameAssignment_0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4659:1: rule__Member__NameAssignment_0 : ( ( rule__Member__NameAlternatives_0_0 ) ) ;
    public final void rule__Member__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4663:1: ( ( ( rule__Member__NameAlternatives_0_0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4664:1: ( ( rule__Member__NameAlternatives_0_0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4664:1: ( ( rule__Member__NameAlternatives_0_0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4665:1: ( rule__Member__NameAlternatives_0_0 )
            {
             before(grammarAccess.getMemberAccess().getNameAlternatives_0_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4666:1: ( rule__Member__NameAlternatives_0_0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4666:2: rule__Member__NameAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Member__NameAlternatives_0_0_in_rule__Member__NameAssignment_09472);
            rule__Member__NameAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getNameAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__NameAssignment_0"


    // $ANTLR start "rule__Member__TypeAssignment_2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4675:1: rule__Member__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Member__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4679:1: ( ( ruleType ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4680:1: ( ruleType )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4680:1: ( ruleType )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4681:1: ruleType
            {
             before(grammarAccess.getMemberAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Member__TypeAssignment_29505);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMemberAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__TypeAssignment_2"


    // $ANTLR start "rule__Member__DefaultValueAssignment_3_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4690:1: rule__Member__DefaultValueAssignment_3_1 : ( ruleLiteral ) ;
    public final void rule__Member__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4694:1: ( ( ruleLiteral ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4695:1: ( ruleLiteral )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4695:1: ( ruleLiteral )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4696:1: ruleLiteral
            {
             before(grammarAccess.getMemberAccess().getDefaultValueLiteralParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__Member__DefaultValueAssignment_3_19536);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getMemberAccess().getDefaultValueLiteralParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__DefaultValueAssignment_3_1"


    // $ANTLR start "rule__ArrayType__ElementTypeAssignment_0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4705:1: rule__ArrayType__ElementTypeAssignment_0 : ( ( rule__ArrayType__ElementTypeAlternatives_0_0 ) ) ;
    public final void rule__ArrayType__ElementTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4709:1: ( ( ( rule__ArrayType__ElementTypeAlternatives_0_0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4710:1: ( ( rule__ArrayType__ElementTypeAlternatives_0_0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4710:1: ( ( rule__ArrayType__ElementTypeAlternatives_0_0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4711:1: ( rule__ArrayType__ElementTypeAlternatives_0_0 )
            {
             before(grammarAccess.getArrayTypeAccess().getElementTypeAlternatives_0_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4712:1: ( rule__ArrayType__ElementTypeAlternatives_0_0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4712:2: rule__ArrayType__ElementTypeAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__ArrayType__ElementTypeAlternatives_0_0_in_rule__ArrayType__ElementTypeAssignment_09567);
            rule__ArrayType__ElementTypeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getElementTypeAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__ElementTypeAssignment_0"


    // $ANTLR start "rule__ArrayType__IdAssignment_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4721:1: rule__ArrayType__IdAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__ArrayType__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4725:1: ( ( ( '[]' ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4726:1: ( ( '[]' ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4726:1: ( ( '[]' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4727:1: ( '[]' )
            {
             before(grammarAccess.getArrayTypeAccess().getIdLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4728:1: ( '[]' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4729:1: '[]'
            {
             before(grammarAccess.getArrayTypeAccess().getIdLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__ArrayType__IdAssignment_19605); 
             after(grammarAccess.getArrayTypeAccess().getIdLeftSquareBracketRightSquareBracketKeyword_1_0()); 

            }

             after(grammarAccess.getArrayTypeAccess().getIdLeftSquareBracketRightSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__IdAssignment_1"


    // $ANTLR start "rule__UserType__DeclarationAssignment"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4744:1: rule__UserType__DeclarationAssignment : ( ( RULE_ID ) ) ;
    public final void rule__UserType__DeclarationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4748:1: ( ( ( RULE_ID ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4749:1: ( ( RULE_ID ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4749:1: ( ( RULE_ID ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4750:1: ( RULE_ID )
            {
             before(grammarAccess.getUserTypeAccess().getDeclarationUserTypeDeclarationCrossReference_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4751:1: ( RULE_ID )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4752:1: RULE_ID
            {
             before(grammarAccess.getUserTypeAccess().getDeclarationUserTypeDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserType__DeclarationAssignment9648); 
             after(grammarAccess.getUserTypeAccess().getDeclarationUserTypeDeclarationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getUserTypeAccess().getDeclarationUserTypeDeclarationCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserType__DeclarationAssignment"


    // $ANTLR start "rule__ComplexTypeDeclaration__KeywordAssignment_0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4763:1: rule__ComplexTypeDeclaration__KeywordAssignment_0 : ( ( 'entity' ) ) ;
    public final void rule__ComplexTypeDeclaration__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4767:1: ( ( ( 'entity' ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4768:1: ( ( 'entity' ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4768:1: ( ( 'entity' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4769:1: ( 'entity' )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getKeywordEntityKeyword_0_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4770:1: ( 'entity' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4771:1: 'entity'
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getKeywordEntityKeyword_0_0()); 
            match(input,37,FOLLOW_37_in_rule__ComplexTypeDeclaration__KeywordAssignment_09688); 
             after(grammarAccess.getComplexTypeDeclarationAccess().getKeywordEntityKeyword_0_0()); 

            }

             after(grammarAccess.getComplexTypeDeclarationAccess().getKeywordEntityKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeDeclaration__KeywordAssignment_0"


    // $ANTLR start "rule__ComplexTypeDeclaration__NameAssignment_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4786:1: rule__ComplexTypeDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ComplexTypeDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4790:1: ( ( RULE_ID ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4791:1: ( RULE_ID )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4791:1: ( RULE_ID )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4792:1: RULE_ID
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ComplexTypeDeclaration__NameAssignment_19727); 
             after(grammarAccess.getComplexTypeDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeDeclaration__NameAssignment_1"


    // $ANTLR start "rule__ComplexTypeDeclaration__LiteralAssignment_2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4801:1: rule__ComplexTypeDeclaration__LiteralAssignment_2 : ( ruleComplexTypeLiteral ) ;
    public final void rule__ComplexTypeDeclaration__LiteralAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4805:1: ( ( ruleComplexTypeLiteral ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4806:1: ( ruleComplexTypeLiteral )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4806:1: ( ruleComplexTypeLiteral )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4807:1: ruleComplexTypeLiteral
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getLiteralComplexTypeLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_rule__ComplexTypeDeclaration__LiteralAssignment_29758);
            ruleComplexTypeLiteral();

            state._fsp--;

             after(grammarAccess.getComplexTypeDeclarationAccess().getLiteralComplexTypeLiteralParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeDeclaration__LiteralAssignment_2"


    // $ANTLR start "rule__EnumTypeDeclaration__KeywordAssignment_0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4816:1: rule__EnumTypeDeclaration__KeywordAssignment_0 : ( ( 'enum' ) ) ;
    public final void rule__EnumTypeDeclaration__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4820:1: ( ( ( 'enum' ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4821:1: ( ( 'enum' ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4821:1: ( ( 'enum' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4822:1: ( 'enum' )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4823:1: ( 'enum' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4824:1: 'enum'
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0()); 
            match(input,38,FOLLOW_38_in_rule__EnumTypeDeclaration__KeywordAssignment_09794); 
             after(grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0()); 

            }

             after(grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDeclaration__KeywordAssignment_0"


    // $ANTLR start "rule__EnumTypeDeclaration__NameAssignment_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4839:1: rule__EnumTypeDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumTypeDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4843:1: ( ( RULE_ID ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4844:1: ( RULE_ID )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4844:1: ( RULE_ID )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4845:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumTypeDeclaration__NameAssignment_19833); 
             after(grammarAccess.getEnumTypeDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDeclaration__NameAssignment_1"


    // $ANTLR start "rule__EnumTypeDeclaration__SuperTypeAssignment_2_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4854:1: rule__EnumTypeDeclaration__SuperTypeAssignment_2_1 : ( ruleIntegerType ) ;
    public final void rule__EnumTypeDeclaration__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4858:1: ( ( ruleIntegerType ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4859:1: ( ruleIntegerType )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4859:1: ( ruleIntegerType )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4860:1: ruleIntegerType
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeIntegerTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIntegerType_in_rule__EnumTypeDeclaration__SuperTypeAssignment_2_19864);
            ruleIntegerType();

            state._fsp--;

             after(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeIntegerTypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDeclaration__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__EnumTypeDeclaration__LiteralAssignment_3"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4869:1: rule__EnumTypeDeclaration__LiteralAssignment_3 : ( ruleEnumTypeLiteral ) ;
    public final void rule__EnumTypeDeclaration__LiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4873:1: ( ( ruleEnumTypeLiteral ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4874:1: ( ruleEnumTypeLiteral )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4874:1: ( ruleEnumTypeLiteral )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4875:1: ruleEnumTypeLiteral
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getLiteralEnumTypeLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumTypeLiteral_in_rule__EnumTypeDeclaration__LiteralAssignment_39895);
            ruleEnumTypeLiteral();

            state._fsp--;

             after(grammarAccess.getEnumTypeDeclarationAccess().getLiteralEnumTypeLiteralParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeDeclaration__LiteralAssignment_3"


    // $ANTLR start "rule__EnumTypeLiteral__MembersAssignment_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4884:1: rule__EnumTypeLiteral__MembersAssignment_1 : ( ruleEnumMember ) ;
    public final void rule__EnumTypeLiteral__MembersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4888:1: ( ( ruleEnumMember ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4889:1: ( ruleEnumMember )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4889:1: ( ruleEnumMember )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4890:1: ruleEnumMember
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_19926);
            ruleEnumMember();

            state._fsp--;

             after(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeLiteral__MembersAssignment_1"


    // $ANTLR start "rule__EnumTypeLiteral__MembersAssignment_2_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4899:1: rule__EnumTypeLiteral__MembersAssignment_2_1 : ( ruleEnumMember ) ;
    public final void rule__EnumTypeLiteral__MembersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4903:1: ( ( ruleEnumMember ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4904:1: ( ruleEnumMember )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4904:1: ( ruleEnumMember )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4905:1: ruleEnumMember
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_2_19957);
            ruleEnumMember();

            state._fsp--;

             after(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumTypeLiteral__MembersAssignment_2_1"


    // $ANTLR start "rule__EnumMember__NameAssignment_0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4914:1: rule__EnumMember__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4918:1: ( ( RULE_ID ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4919:1: ( RULE_ID )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4919:1: ( RULE_ID )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4920:1: RULE_ID
            {
             before(grammarAccess.getEnumMemberAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumMember__NameAssignment_09988); 
             after(grammarAccess.getEnumMemberAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumMember__NameAssignment_0"


    // $ANTLR start "rule__EnumMember__AssignmentAssignment_1_0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4929:1: rule__EnumMember__AssignmentAssignment_1_0 : ( ( '=' ) ) ;
    public final void rule__EnumMember__AssignmentAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4933:1: ( ( ( '=' ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4934:1: ( ( '=' ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4934:1: ( ( '=' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4935:1: ( '=' )
            {
             before(grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4936:1: ( '=' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4937:1: '='
            {
             before(grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0()); 
            match(input,33,FOLLOW_33_in_rule__EnumMember__AssignmentAssignment_1_010024); 
             after(grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0()); 

            }

             after(grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumMember__AssignmentAssignment_1_0"


    // $ANTLR start "rule__EnumMember__ValueAssignment_1_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4952:1: rule__EnumMember__ValueAssignment_1_1 : ( RULE_NUMBER ) ;
    public final void rule__EnumMember__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4956:1: ( ( RULE_NUMBER ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4957:1: ( RULE_NUMBER )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4957:1: ( RULE_NUMBER )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4958:1: RULE_NUMBER
            {
             before(grammarAccess.getEnumMemberAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__EnumMember__ValueAssignment_1_110063); 
             after(grammarAccess.getEnumMemberAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumMember__ValueAssignment_1_1"


    // $ANTLR start "rule__ComplexTypeLiteral__MembersAssignment_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4967:1: rule__ComplexTypeLiteral__MembersAssignment_1 : ( ruleMember ) ;
    public final void rule__ComplexTypeLiteral__MembersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4971:1: ( ( ruleMember ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4972:1: ( ruleMember )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4972:1: ( ruleMember )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4973:1: ruleMember
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_110094);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeLiteral__MembersAssignment_1"


    // $ANTLR start "rule__ComplexTypeLiteral__MembersAssignment_2_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4982:1: rule__ComplexTypeLiteral__MembersAssignment_2_1 : ( ruleMember ) ;
    public final void rule__ComplexTypeLiteral__MembersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4986:1: ( ( ruleMember ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4987:1: ( ruleMember )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4987:1: ( ruleMember )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4988:1: ruleMember
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_2_110125);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeLiteral__MembersAssignment_2_1"


    // $ANTLR start "rule__StringType__IdAssignment"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4997:1: rule__StringType__IdAssignment : ( ( 'string' ) ) ;
    public final void rule__StringType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5001:1: ( ( ( 'string' ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5002:1: ( ( 'string' ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5002:1: ( ( 'string' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5003:1: ( 'string' )
            {
             before(grammarAccess.getStringTypeAccess().getIdStringKeyword_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5004:1: ( 'string' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5005:1: 'string'
            {
             before(grammarAccess.getStringTypeAccess().getIdStringKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__StringType__IdAssignment10161); 
             after(grammarAccess.getStringTypeAccess().getIdStringKeyword_0()); 

            }

             after(grammarAccess.getStringTypeAccess().getIdStringKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__IdAssignment"


    // $ANTLR start "rule__BooleanType__IdAssignment"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5020:1: rule__BooleanType__IdAssignment : ( ( 'boolean' ) ) ;
    public final void rule__BooleanType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5024:1: ( ( ( 'boolean' ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5025:1: ( ( 'boolean' ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5025:1: ( ( 'boolean' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5026:1: ( 'boolean' )
            {
             before(grammarAccess.getBooleanTypeAccess().getIdBooleanKeyword_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5027:1: ( 'boolean' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5028:1: 'boolean'
            {
             before(grammarAccess.getBooleanTypeAccess().getIdBooleanKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__BooleanType__IdAssignment10205); 
             after(grammarAccess.getBooleanTypeAccess().getIdBooleanKeyword_0()); 

            }

             after(grammarAccess.getBooleanTypeAccess().getIdBooleanKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__IdAssignment"


    // $ANTLR start "rule__IntegerType__IdAssignment"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5043:1: rule__IntegerType__IdAssignment : ( ( 'int' ) ) ;
    public final void rule__IntegerType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5047:1: ( ( ( 'int' ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5048:1: ( ( 'int' ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5048:1: ( ( 'int' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5049:1: ( 'int' )
            {
             before(grammarAccess.getIntegerTypeAccess().getIdIntKeyword_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5050:1: ( 'int' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5051:1: 'int'
            {
             before(grammarAccess.getIntegerTypeAccess().getIdIntKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__IntegerType__IdAssignment10249); 
             after(grammarAccess.getIntegerTypeAccess().getIdIntKeyword_0()); 

            }

             after(grammarAccess.getIntegerTypeAccess().getIdIntKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerType__IdAssignment"


    // $ANTLR start "rule__LongType__IdAssignment"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5066:1: rule__LongType__IdAssignment : ( ( 'long' ) ) ;
    public final void rule__LongType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5070:1: ( ( ( 'long' ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5071:1: ( ( 'long' ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5071:1: ( ( 'long' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5072:1: ( 'long' )
            {
             before(grammarAccess.getLongTypeAccess().getIdLongKeyword_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5073:1: ( 'long' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5074:1: 'long'
            {
             before(grammarAccess.getLongTypeAccess().getIdLongKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__LongType__IdAssignment10293); 
             after(grammarAccess.getLongTypeAccess().getIdLongKeyword_0()); 

            }

             after(grammarAccess.getLongTypeAccess().getIdLongKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongType__IdAssignment"


    // $ANTLR start "rule__DoubleType__IdAssignment"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5089:1: rule__DoubleType__IdAssignment : ( ( 'double' ) ) ;
    public final void rule__DoubleType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5093:1: ( ( ( 'double' ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5094:1: ( ( 'double' ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5094:1: ( ( 'double' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5095:1: ( 'double' )
            {
             before(grammarAccess.getDoubleTypeAccess().getIdDoubleKeyword_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5096:1: ( 'double' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5097:1: 'double'
            {
             before(grammarAccess.getDoubleTypeAccess().getIdDoubleKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__DoubleType__IdAssignment10337); 
             after(grammarAccess.getDoubleTypeAccess().getIdDoubleKeyword_0()); 

            }

             after(grammarAccess.getDoubleTypeAccess().getIdDoubleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleType__IdAssignment"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\12\uffff";
    static final String DFA9_eofS =
        "\1\uffff\1\7\5\11\3\uffff";
    static final String DFA9_minS =
        "\1\4\6\15\3\uffff";
    static final String DFA9_maxS =
        "\1\53\6\44\3\uffff";
    static final String DFA9_acceptS =
        "\7\uffff\1\1\1\3\1\2";
    static final String DFA9_specialS =
        "\12\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\42\uffff\1\2\1\3\1\4\1\5\1\6",
            "\5\7\4\uffff\5\7\1\uffff\3\7\2\uffff\1\7\2\uffff\1\10",
            "\5\11\4\uffff\5\11\1\uffff\3\11\2\uffff\1\11\2\uffff\1\10",
            "\5\11\4\uffff\5\11\1\uffff\3\11\2\uffff\1\11\2\uffff\1\10",
            "\5\11\4\uffff\5\11\1\uffff\3\11\2\uffff\1\11\2\uffff\1\10",
            "\5\11\4\uffff\5\11\1\uffff\3\11\2\uffff\1\11\2\uffff\1\10",
            "\5\11\4\uffff\5\11\1\uffff\3\11\2\uffff\1\11\2\uffff\1\10",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1222:1: rule__Type__Alternatives : ( ( ruleUserType ) | ( ruleIntrinsicType ) | ( ruleArrayType ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleSpecApiDocument_in_entryRuleSpecApiDocument61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecApiDocument68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecApiDocument__Group__0_in_ruleSpecApiDocument94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApi_in_entryRuleApi181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApi188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Api__Group__0_in_ruleApi214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceBlock_in_entryRuleServiceBlock241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceBlock248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Alternatives_in_ruleServiceBlock274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderBlock_in_entryRuleHeaderBlock301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderBlock308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__0_in_ruleHeaderBlock334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_entryRuleHttpMethod361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpMethod368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__0_in_ruleHttpMethod394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethodBlock_in_entryRuleHttpMethodBlock421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpMethodBlock428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethodBlock__Alternatives_in_ruleHttpMethodBlock454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__0_in_rulePath514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitraryPathSegment_in_entryRuleArbitraryPathSegment541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArbitraryPathSegment548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group__0_in_ruleArbitraryPathSegment574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_entryRuleParamsBlock601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamsBlock608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__0_in_ruleParamsBlock634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_entryRuleBodyBlock721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyBlock728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__0_in_ruleBodyBlock754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_entryRuleResponseBlock781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResponseBlock788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__0_in_ruleResponseBlock814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_entryRuleBlockType841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockType848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockType__Alternatives_in_ruleBlockType874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Group__0_in_ruleMember934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_entryRuleUserType1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserType1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserType__DeclarationAssignment_in_ruleUserType1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeDeclaration_in_entryRuleUserTypeDeclaration1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserTypeDeclaration1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserTypeDeclaration__Alternatives_in_ruleUserTypeDeclaration1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeDeclaration_in_entryRuleComplexTypeDeclaration1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeDeclaration1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__0_in_ruleComplexTypeDeclaration1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeDeclaration_in_entryRuleEnumTypeDeclaration1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeDeclaration1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__0_in_ruleEnumTypeDeclaration1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeLiteral_in_entryRuleEnumTypeLiteral1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeLiteral1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__0_in_ruleEnumTypeLiteral1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__0_in_ruleEnumMember1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_entryRuleComplexTypeLiteral1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeLiteral1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__0_in_ruleComplexTypeLiteral1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_entryRuleIntrinsicType1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntrinsicType1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntrinsicType__Alternatives_in_ruleIntrinsicType1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__IdAssignment_in_ruleStringType1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanType__IdAssignment_in_ruleBooleanType1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_entryRuleNumericType1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericType1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericType__Alternatives_in_ruleNumericType1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_entryRuleIntegerType1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerType1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerType__IdAssignment_in_ruleIntegerType1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_entryRuleLongType1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongType1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongType__IdAssignment_in_ruleLongType1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_entryRuleDoubleType1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleType1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleType__IdAssignment_in_ruleDoubleType1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber1981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedNumber__Group__0_in_ruleSignedNumber2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethodType__Alternatives_in_ruleHttpMethodType2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__Alternatives_in_ruleBooleanValue2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeDeclaration_in_rule__Declaration__Alternatives2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApi_in_rule__Declaration__Alternatives2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderBlock_in_rule__ServiceBlock__Alternatives2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_rule__ServiceBlock__Alternatives2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_rule__ServiceBlock__Alternatives2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderBlock_in_rule__HttpMethodBlock__Alternatives2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_rule__HttpMethodBlock__Alternatives2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_rule__HttpMethodBlock__Alternatives2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_rule__HttpMethodBlock__Alternatives2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitraryPathSegment_in_rule__Path__Alternatives_22320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__ParamsAssignment_2_1_in_rule__Path__Alternatives_22337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitraryPathSegment_in_rule__Path__Alternatives_3_12370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__ParamsAssignment_3_1_1_in_rule__Path__Alternatives_3_12387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__0_in_rule__Literal__Alternatives2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__BlockType__Alternatives2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_rule__BlockType__Alternatives2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Member__NameAlternatives_0_02538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Member__NameAlternatives_0_02555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_rule__Type__Alternatives2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_rule__Type__Alternatives2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_rule__Type__Alternatives2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_rule__ArrayType__ElementTypeAlternatives_0_02653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_rule__ArrayType__ElementTypeAlternatives_0_02670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rule__IntrinsicType__Alternatives2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rule__IntrinsicType__Alternatives2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_rule__IntrinsicType__Alternatives2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_rule__NumericType__Alternatives2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_rule__NumericType__Alternatives2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_rule__NumericType__Alternatives2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__HttpMethodType__Alternatives2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__HttpMethodType__Alternatives2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__HttpMethodType__Alternatives2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__HttpMethodType__Alternatives2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__HttpMethodType__Alternatives2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BooleanValue__Alternatives3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BooleanValue__Alternatives3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecApiDocument__Group__0__Impl_in_rule__SpecApiDocument__Group__03058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SpecApiDocument__Group__1_in_rule__SpecApiDocument__Group__03061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SpecApiDocument__Group__0__Impl3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecApiDocument__Group__1__Impl_in_rule__SpecApiDocument__Group__13120 = new BitSet(new long[]{0x0000006000200000L});
    public static final BitSet FOLLOW_rule__SpecApiDocument__Group__2_in_rule__SpecApiDocument__Group__13123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecApiDocument__PackageNameAssignment_1_in_rule__SpecApiDocument__Group__1__Impl3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecApiDocument__Group__2__Impl_in_rule__SpecApiDocument__Group__23180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecApiDocument__DeclarationsAssignment_2_in_rule__SpecApiDocument__Group__2__Impl3207 = new BitSet(new long[]{0x0000006000200002L});
    public static final BitSet FOLLOW_rule__Api__Group__0__Impl_in_rule__Api__Group__03244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Api__Group__1_in_rule__Api__Group__03247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Api__Group__0__Impl3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Api__Group__1__Impl_in_rule__Api__Group__13306 = new BitSet(new long[]{0x0000000000400080L});
    public static final BitSet FOLLOW_rule__Api__Group__2_in_rule__Api__Group__13309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Api__NameAssignment_1_in_rule__Api__Group__1__Impl3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Api__Group__2__Impl_in_rule__Api__Group__23366 = new BitSet(new long[]{0x0000000000400080L});
    public static final BitSet FOLLOW_rule__Api__Group__3_in_rule__Api__Group__23369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Api__BaseUrlAssignment_2_in_rule__Api__Group__2__Impl3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Api__Group__3__Impl_in_rule__Api__Group__33427 = new BitSet(new long[]{0x000000001183E000L});
    public static final BitSet FOLLOW_rule__Api__Group__4_in_rule__Api__Group__33430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Api__Group__3__Impl3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Api__Group__4__Impl_in_rule__Api__Group__43489 = new BitSet(new long[]{0x000000001183E000L});
    public static final BitSet FOLLOW_rule__Api__Group__5_in_rule__Api__Group__43492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Api__BlocksAssignment_4_in_rule__Api__Group__4__Impl3519 = new BitSet(new long[]{0x000000001103E002L});
    public static final BitSet FOLLOW_rule__Api__Group__5__Impl_in_rule__Api__Group__53550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Api__Group__5__Impl3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__0__Impl_in_rule__HeaderBlock__Group__03621 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__1_in_rule__HeaderBlock__Group__03624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__1__Impl_in_rule__HeaderBlock__Group__13682 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__2_in_rule__HeaderBlock__Group__13685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__HeaderBlock__Group__1__Impl3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__2__Impl_in_rule__HeaderBlock__Group__23744 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__3_in_rule__HeaderBlock__Group__23747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__HeadersAssignment_2_in_rule__HeaderBlock__Group__2__Impl3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__3__Impl_in_rule__HeaderBlock__Group__33804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group_3__0_in_rule__HeaderBlock__Group__3__Impl3831 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group_3__0__Impl_in_rule__HeaderBlock__Group_3__03870 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group_3__1_in_rule__HeaderBlock__Group_3__03873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__HeaderBlock__Group_3__0__Impl3901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group_3__1__Impl_in_rule__HeaderBlock__Group_3__13932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__HeadersAssignment_3_1_in_rule__HeaderBlock__Group_3__1__Impl3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__0__Impl_in_rule__HttpMethod__Group__03993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__1_in_rule__HttpMethod__Group__03996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__TypeAssignment_0_in_rule__HttpMethod__Group__0__Impl4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__1__Impl_in_rule__HttpMethod__Group__14053 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__2_in_rule__HttpMethod__Group__14056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__NameAssignment_1_in_rule__HttpMethod__Group__1__Impl4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__2__Impl_in_rule__HttpMethod__Group__24113 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__3_in_rule__HttpMethod__Group__24116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__PathAssignment_2_in_rule__HttpMethod__Group__2__Impl4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__3__Impl_in_rule__HttpMethod__Group__34174 = new BitSet(new long[]{0x0000000071800000L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__4_in_rule__HttpMethod__Group__34177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__HttpMethod__Group__3__Impl4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__4__Impl_in_rule__HttpMethod__Group__44236 = new BitSet(new long[]{0x0000000071800000L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__5_in_rule__HttpMethod__Group__44239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__BlocksAssignment_4_in_rule__HttpMethod__Group__4__Impl4266 = new BitSet(new long[]{0x0000000071000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__5__Impl_in_rule__HttpMethod__Group__54297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__HttpMethod__Group__5__Impl4325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__0__Impl_in_rule__Path__Group__04368 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Path__Group__1_in_rule__Path__Group__04371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__1__Impl_in_rule__Path__Group__14429 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Path__Group__2_in_rule__Path__Group__14432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Path__Group__1__Impl4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__2__Impl_in_rule__Path__Group__24491 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Path__Group__3_in_rule__Path__Group__24494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Alternatives_2_in_rule__Path__Group__2__Impl4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__3__Impl_in_rule__Path__Group__34551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group_3__0_in_rule__Path__Group__3__Impl4578 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Path__Group_3__0__Impl_in_rule__Path__Group_3__04617 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Path__Group_3__1_in_rule__Path__Group_3__04620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Path__Group_3__0__Impl4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group_3__1__Impl_in_rule__Path__Group_3__14679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Alternatives_3_1_in_rule__Path__Group_3__1__Impl4706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group__0__Impl_in_rule__ArbitraryPathSegment__Group__04740 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group__1_in_rule__ArbitraryPathSegment__Group__04743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ArbitraryPathSegment__Group__0__Impl4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group__1__Impl_in_rule__ArbitraryPathSegment__Group__14799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group_1__0_in_rule__ArbitraryPathSegment__Group__1__Impl4826 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group_1__0__Impl_in_rule__ArbitraryPathSegment__Group_1__04861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group_1__1_in_rule__ArbitraryPathSegment__Group_1__04864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ArbitraryPathSegment__Group_1__0__Impl4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group_1__1__Impl_in_rule__ArbitraryPathSegment__Group_1__14923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ArbitraryPathSegment__Group_1__1__Impl4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__0__Impl_in_rule__ParamsBlock__Group__04983 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__1_in_rule__ParamsBlock__Group__04986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__1__Impl_in_rule__ParamsBlock__Group__15044 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__2_in_rule__ParamsBlock__Group__15047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ParamsBlock__Group__1__Impl5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__2__Impl_in_rule__ParamsBlock__Group__25106 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__3_in_rule__ParamsBlock__Group__25109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__ParamsAssignment_2_in_rule__ParamsBlock__Group__2__Impl5136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__3__Impl_in_rule__ParamsBlock__Group__35166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__0_in_rule__ParamsBlock__Group__3__Impl5193 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__0__Impl_in_rule__ParamsBlock__Group_3__05232 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__1_in_rule__ParamsBlock__Group_3__05235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ParamsBlock__Group_3__0__Impl5263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__1__Impl_in_rule__ParamsBlock__Group_3__15294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__ParamsAssignment_3_1_in_rule__ParamsBlock__Group_3__1__Impl5321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__05355 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__05358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__15416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__LiteralAssignment_0_1_in_rule__Literal__Group_0__1__Impl5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__0__Impl_in_rule__Literal__Group_1__05477 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__1_in_rule__Literal__Group_1__05480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__1__Impl_in_rule__Literal__Group_1__15538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__LiteralAssignment_1_1_in_rule__Literal__Group_1__1__Impl5565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__05599 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__05602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__15660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__LiteralAssignment_2_1_in_rule__Literal__Group_2__1__Impl5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__0__Impl_in_rule__BodyBlock__Group__05721 = new BitSet(new long[]{0x00000F8000400010L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__1_in_rule__BodyBlock__Group__05724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__BodyBlock__Group__0__Impl5752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__1__Impl_in_rule__BodyBlock__Group__15783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__TypeAssignment_1_in_rule__BodyBlock__Group__1__Impl5810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__0__Impl_in_rule__ResponseBlock__Group__05844 = new BitSet(new long[]{0x0000000071000000L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__1_in_rule__ResponseBlock__Group__05847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__1__Impl_in_rule__ResponseBlock__Group__15905 = new BitSet(new long[]{0x00000F8080400130L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__2_in_rule__ResponseBlock__Group__15908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ResponseBlock__Group__1__Impl5936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__2__Impl_in_rule__ResponseBlock__Group__25967 = new BitSet(new long[]{0x00000F8080400130L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__3_in_rule__ResponseBlock__Group__25970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__CodeAssignment_2_in_rule__ResponseBlock__Group__2__Impl5997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__3__Impl_in_rule__ResponseBlock__Group__36028 = new BitSet(new long[]{0x00000F8080400130L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__4_in_rule__ResponseBlock__Group__36031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__MessageAssignment_3_in_rule__ResponseBlock__Group__3__Impl6058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__4__Impl_in_rule__ResponseBlock__Group__46089 = new BitSet(new long[]{0x00000F8080400130L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__5_in_rule__ResponseBlock__Group__46092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_4__0_in_rule__ResponseBlock__Group__4__Impl6119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__5__Impl_in_rule__ResponseBlock__Group__56150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__TypeAssignment_5_in_rule__ResponseBlock__Group__5__Impl6177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_4__0__Impl_in_rule__ResponseBlock__Group_4__06220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_4__1_in_rule__ResponseBlock__Group_4__06223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ResponseBlock__Group_4__0__Impl6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_4__1__Impl_in_rule__ResponseBlock__Group_4__16282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__SuperTypeAssignment_4_1_in_rule__ResponseBlock__Group_4__1__Impl6309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Group__0__Impl_in_rule__Member__Group__06343 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Member__Group__1_in_rule__Member__Group__06346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__NameAssignment_0_in_rule__Member__Group__0__Impl6373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Group__1__Impl_in_rule__Member__Group__16403 = new BitSet(new long[]{0x00000F8000000010L});
    public static final BitSet FOLLOW_rule__Member__Group__2_in_rule__Member__Group__16406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Member__Group__1__Impl6434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Group__2__Impl_in_rule__Member__Group__26465 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Member__Group__3_in_rule__Member__Group__26468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__TypeAssignment_2_in_rule__Member__Group__2__Impl6495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Group__3__Impl_in_rule__Member__Group__36525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Group_3__0_in_rule__Member__Group__3__Impl6552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Group_3__0__Impl_in_rule__Member__Group_3__06591 = new BitSet(new long[]{0x00000000080C0060L});
    public static final BitSet FOLLOW_rule__Member__Group_3__1_in_rule__Member__Group_3__06594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Member__Group_3__0__Impl6622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Group_3__1__Impl_in_rule__Member__Group_3__16653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__DefaultValueAssignment_3_1_in_rule__Member__Group_3__1__Impl6680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__06714 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__06717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__ElementTypeAssignment_0_in_rule__ArrayType__Group__0__Impl6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__16774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__IdAssignment_1_in_rule__ArrayType__Group__1__Impl6801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__0__Impl_in_rule__ComplexTypeDeclaration__Group__06835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__1_in_rule__ComplexTypeDeclaration__Group__06838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__KeywordAssignment_0_in_rule__ComplexTypeDeclaration__Group__0__Impl6865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__1__Impl_in_rule__ComplexTypeDeclaration__Group__16895 = new BitSet(new long[]{0x00000F8000400010L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__2_in_rule__ComplexTypeDeclaration__Group__16898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__NameAssignment_1_in_rule__ComplexTypeDeclaration__Group__1__Impl6925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__2__Impl_in_rule__ComplexTypeDeclaration__Group__26955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__LiteralAssignment_2_in_rule__ComplexTypeDeclaration__Group__2__Impl6982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__0__Impl_in_rule__EnumTypeDeclaration__Group__07019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__1_in_rule__EnumTypeDeclaration__Group__07022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__KeywordAssignment_0_in_rule__EnumTypeDeclaration__Group__0__Impl7049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__1__Impl_in_rule__EnumTypeDeclaration__Group__17079 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__2_in_rule__EnumTypeDeclaration__Group__17082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__NameAssignment_1_in_rule__EnumTypeDeclaration__Group__1__Impl7109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__2__Impl_in_rule__EnumTypeDeclaration__Group__27139 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__3_in_rule__EnumTypeDeclaration__Group__27142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_2__0_in_rule__EnumTypeDeclaration__Group__2__Impl7169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__3__Impl_in_rule__EnumTypeDeclaration__Group__37200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__LiteralAssignment_3_in_rule__EnumTypeDeclaration__Group__3__Impl7227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_2__0__Impl_in_rule__EnumTypeDeclaration__Group_2__07266 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_2__1_in_rule__EnumTypeDeclaration__Group_2__07269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EnumTypeDeclaration__Group_2__0__Impl7297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_2__1__Impl_in_rule__EnumTypeDeclaration__Group_2__17328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__SuperTypeAssignment_2_1_in_rule__EnumTypeDeclaration__Group_2__1__Impl7355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__0__Impl_in_rule__EnumTypeLiteral__Group__07389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__1_in_rule__EnumTypeLiteral__Group__07392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumTypeLiteral__Group__0__Impl7420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__1__Impl_in_rule__EnumTypeLiteral__Group__17451 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__2_in_rule__EnumTypeLiteral__Group__17454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__MembersAssignment_1_in_rule__EnumTypeLiteral__Group__1__Impl7481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__2__Impl_in_rule__EnumTypeLiteral__Group__27511 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__3_in_rule__EnumTypeLiteral__Group__27514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__0_in_rule__EnumTypeLiteral__Group__2__Impl7541 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__3__Impl_in_rule__EnumTypeLiteral__Group__37572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumTypeLiteral__Group__3__Impl7600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__0__Impl_in_rule__EnumTypeLiteral__Group_2__07639 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__1_in_rule__EnumTypeLiteral__Group_2__07642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EnumTypeLiteral__Group_2__0__Impl7670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__1__Impl_in_rule__EnumTypeLiteral__Group_2__17701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__MembersAssignment_2_1_in_rule__EnumTypeLiteral__Group_2__1__Impl7728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__0__Impl_in_rule__EnumMember__Group__07762 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__07765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__NameAssignment_0_in_rule__EnumMember__Group__0__Impl7792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__1__Impl_in_rule__EnumMember__Group__17822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__0_in_rule__EnumMember__Group__1__Impl7849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__0__Impl_in_rule__EnumMember__Group_1__07884 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__1_in_rule__EnumMember__Group_1__07887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__AssignmentAssignment_1_0_in_rule__EnumMember__Group_1__0__Impl7914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__1__Impl_in_rule__EnumMember__Group_1__17944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__ValueAssignment_1_1_in_rule__EnumMember__Group_1__1__Impl7971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__0__Impl_in_rule__ComplexTypeLiteral__Group__08005 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__1_in_rule__ComplexTypeLiteral__Group__08008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ComplexTypeLiteral__Group__0__Impl8036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__1__Impl_in_rule__ComplexTypeLiteral__Group__18067 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__2_in_rule__ComplexTypeLiteral__Group__18070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_1_in_rule__ComplexTypeLiteral__Group__1__Impl8097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__2__Impl_in_rule__ComplexTypeLiteral__Group__28127 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__3_in_rule__ComplexTypeLiteral__Group__28130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__0_in_rule__ComplexTypeLiteral__Group__2__Impl8157 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__3__Impl_in_rule__ComplexTypeLiteral__Group__38188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ComplexTypeLiteral__Group__3__Impl8216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__0__Impl_in_rule__ComplexTypeLiteral__Group_2__08255 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__1_in_rule__ComplexTypeLiteral__Group_2__08258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ComplexTypeLiteral__Group_2__0__Impl8286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__1__Impl_in_rule__ComplexTypeLiteral__Group_2__18317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_2_1_in_rule__ComplexTypeLiteral__Group_2__1__Impl8344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08378 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8464 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__QualifiedName__Group_1__0__Impl8530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl8588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedNumber__Group__0__Impl_in_rule__SignedNumber__Group__08621 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_rule__SignedNumber__Group__1_in_rule__SignedNumber__Group__08624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SignedNumber__Group__0__Impl8653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedNumber__Group__1__Impl_in_rule__SignedNumber__Group__18686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__SignedNumber__Group__1__Impl8713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__SpecApiDocument__PackageNameAssignment_18751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__SpecApiDocument__DeclarationsAssignment_28782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Api__NameAssignment_18813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_in_rule__Api__BaseUrlAssignment_28844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceBlock_in_rule__Api__BlocksAssignment_48875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__HeaderBlock__HeadersAssignment_28906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__HeaderBlock__HeadersAssignment_3_18937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethodType_in_rule__HttpMethod__TypeAssignment_08968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HttpMethod__NameAssignment_18999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_rule__HttpMethod__PathAssignment_29030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethodBlock_in_rule__HttpMethod__BlocksAssignment_49061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__Path__ParamsAssignment_2_19092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__Path__ParamsAssignment_3_1_19123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__ParamsBlock__ParamsAssignment_29154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__ParamsBlock__ParamsAssignment_3_19185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__Literal__LiteralAssignment_0_19216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Literal__LiteralAssignment_1_19247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_rule__Literal__LiteralAssignment_2_19278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_rule__BodyBlock__TypeAssignment_19309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__ResponseBlock__CodeAssignment_29340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ResponseBlock__MessageAssignment_39371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResponseBlock__SuperTypeAssignment_4_19406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_rule__ResponseBlock__TypeAssignment_59441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__NameAlternatives_0_0_in_rule__Member__NameAssignment_09472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Member__TypeAssignment_29505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Member__DefaultValueAssignment_3_19536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__ElementTypeAlternatives_0_0_in_rule__ArrayType__ElementTypeAssignment_09567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ArrayType__IdAssignment_19605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserType__DeclarationAssignment9648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ComplexTypeDeclaration__KeywordAssignment_09688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ComplexTypeDeclaration__NameAssignment_19727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_rule__ComplexTypeDeclaration__LiteralAssignment_29758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EnumTypeDeclaration__KeywordAssignment_09794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumTypeDeclaration__NameAssignment_19833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_rule__EnumTypeDeclaration__SuperTypeAssignment_2_19864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeLiteral_in_rule__EnumTypeDeclaration__LiteralAssignment_39895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_19926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_2_19957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumMember__NameAssignment_09988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EnumMember__AssignmentAssignment_1_010024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__EnumMember__ValueAssignment_1_110063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_110094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_2_110125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__StringType__IdAssignment10161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__BooleanType__IdAssignment10205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__IntegerType__IdAssignment10249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__LongType__IdAssignment10293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__DoubleType__IdAssignment10337 = new BitSet(new long[]{0x0000000000000002L});

}