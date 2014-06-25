package org.specapi.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.specapi.services.SpecApiLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecApiLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_URL", "RULE_STRING", "RULE_INTEGER", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'api'", "'{'", "'}'", "'headers'", "','", "'/'", "'-'", "'params'", "'request'", "'response'", "'mixin'", "':'", "'='", "'[]'", "'entity'", "'enum'", "'extends'", "'string'", "'boolean'", "'int'", "'long'", "'double'", "'.'", "'get'", "'put'", "'post'", "'delete'", "'patch'", "'true'", "'false'"
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
    public static final int RULE_NUMBER=8;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_URL=5;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;
    public static final int RULE_INTEGER=7;

    // delegates
    // delegators


        public InternalSpecApiLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpecApiLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpecApiLangParser.tokenNames; }
    public String getGrammarFileName() { return "../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g"; }



     	private SpecApiLangGrammarAccess grammarAccess;
     	
        public InternalSpecApiLangParser(TokenStream input, SpecApiLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SpecApiDocument";	
       	}
       	
       	@Override
       	protected SpecApiLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSpecApiDocument"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:68:1: entryRuleSpecApiDocument returns [EObject current=null] : iv_ruleSpecApiDocument= ruleSpecApiDocument EOF ;
    public final EObject entryRuleSpecApiDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecApiDocument = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:69:2: (iv_ruleSpecApiDocument= ruleSpecApiDocument EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:70:2: iv_ruleSpecApiDocument= ruleSpecApiDocument EOF
            {
             newCompositeNode(grammarAccess.getSpecApiDocumentRule()); 
            pushFollow(FOLLOW_ruleSpecApiDocument_in_entryRuleSpecApiDocument75);
            iv_ruleSpecApiDocument=ruleSpecApiDocument();

            state._fsp--;

             current =iv_ruleSpecApiDocument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecApiDocument85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecApiDocument"


    // $ANTLR start "ruleSpecApiDocument"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:77:1: ruleSpecApiDocument returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) ;
    public final EObject ruleSpecApiDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_declarations_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:80:28: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:81:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:81:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:81:3: otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_declarations_2_0= ruleDeclaration ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleSpecApiDocument122); 

                	newLeafNode(otherlv_0, grammarAccess.getSpecApiDocumentAccess().getPackageKeyword_0());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:85:1: ( (lv_packageName_1_0= ruleQualifiedName ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:86:1: (lv_packageName_1_0= ruleQualifiedName )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:86:1: (lv_packageName_1_0= ruleQualifiedName )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:87:3: lv_packageName_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getSpecApiDocumentAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSpecApiDocument143);
            lv_packageName_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSpecApiDocumentRule());
            	        }
                   		set(
                   			current, 
                   			"packageName",
                    		lv_packageName_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:103:2: ( (lv_declarations_2_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||(LA1_0>=28 && LA1_0<=29)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:104:1: (lv_declarations_2_0= ruleDeclaration )
            	    {
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:104:1: (lv_declarations_2_0= ruleDeclaration )
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:105:3: lv_declarations_2_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSpecApiDocumentAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleSpecApiDocument164);
            	    lv_declarations_2_0=ruleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSpecApiDocumentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_2_0, 
            	            		"Declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecApiDocument"


    // $ANTLR start "entryRuleDeclaration"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:129:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:130:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:131:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration201);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration211); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:138:1: ruleDeclaration returns [EObject current=null] : (this_UserTypeDeclaration_0= ruleUserTypeDeclaration | this_Api_1= ruleApi ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_UserTypeDeclaration_0 = null;

        EObject this_Api_1 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:141:28: ( (this_UserTypeDeclaration_0= ruleUserTypeDeclaration | this_Api_1= ruleApi ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:142:1: (this_UserTypeDeclaration_0= ruleUserTypeDeclaration | this_Api_1= ruleApi )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:142:1: (this_UserTypeDeclaration_0= ruleUserTypeDeclaration | this_Api_1= ruleApi )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=28 && LA2_0<=29)) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:143:5: this_UserTypeDeclaration_0= ruleUserTypeDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getUserTypeDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUserTypeDeclaration_in_ruleDeclaration258);
                    this_UserTypeDeclaration_0=ruleUserTypeDeclaration();

                    state._fsp--;

                     
                            current = this_UserTypeDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:153:5: this_Api_1= ruleApi
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getApiParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleApi_in_ruleDeclaration285);
                    this_Api_1=ruleApi();

                    state._fsp--;

                     
                            current = this_Api_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleApi"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:169:1: entryRuleApi returns [EObject current=null] : iv_ruleApi= ruleApi EOF ;
    public final EObject entryRuleApi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApi = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:170:2: (iv_ruleApi= ruleApi EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:171:2: iv_ruleApi= ruleApi EOF
            {
             newCompositeNode(grammarAccess.getApiRule()); 
            pushFollow(FOLLOW_ruleApi_in_entryRuleApi320);
            iv_ruleApi=ruleApi();

            state._fsp--;

             current =iv_ruleApi; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApi330); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApi"


    // $ANTLR start "ruleApi"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:178:1: ruleApi returns [EObject current=null] : (otherlv_0= 'api' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_URL ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleServiceBlock ) )* otherlv_5= '}' ) ;
    public final EObject ruleApi() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_baseUrl_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_blocks_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:181:28: ( (otherlv_0= 'api' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_URL ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleServiceBlock ) )* otherlv_5= '}' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:182:1: (otherlv_0= 'api' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_URL ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleServiceBlock ) )* otherlv_5= '}' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:182:1: (otherlv_0= 'api' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_URL ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleServiceBlock ) )* otherlv_5= '}' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:182:3: otherlv_0= 'api' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_URL ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleServiceBlock ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleApi367); 

                	newLeafNode(otherlv_0, grammarAccess.getApiAccess().getApiKeyword_0());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:186:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:187:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:187:1: (lv_name_1_0= RULE_ID )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:188:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApi384); 

            			newLeafNode(lv_name_1_0, grammarAccess.getApiAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getApiRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:204:2: ( (lv_baseUrl_2_0= RULE_URL ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_URL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:205:1: (lv_baseUrl_2_0= RULE_URL )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:205:1: (lv_baseUrl_2_0= RULE_URL )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:206:3: lv_baseUrl_2_0= RULE_URL
                    {
                    lv_baseUrl_2_0=(Token)match(input,RULE_URL,FOLLOW_RULE_URL_in_ruleApi406); 

                    			newLeafNode(lv_baseUrl_2_0, grammarAccess.getApiAccess().getBaseUrlURLTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getApiRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"baseUrl",
                            		lv_baseUrl_2_0, 
                            		"URL");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleApi424); 

                	newLeafNode(otherlv_3, grammarAccess.getApiAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:226:1: ( (lv_blocks_4_0= ruleServiceBlock ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17||LA4_0==21||(LA4_0>=37 && LA4_0<=41)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:227:1: (lv_blocks_4_0= ruleServiceBlock )
            	    {
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:227:1: (lv_blocks_4_0= ruleServiceBlock )
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:228:3: lv_blocks_4_0= ruleServiceBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getApiAccess().getBlocksServiceBlockParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceBlock_in_ruleApi445);
            	    lv_blocks_4_0=ruleServiceBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getApiRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"blocks",
            	            		lv_blocks_4_0, 
            	            		"ServiceBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleApi458); 

                	newLeafNode(otherlv_5, grammarAccess.getApiAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApi"


    // $ANTLR start "entryRuleServiceBlock"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:256:1: entryRuleServiceBlock returns [EObject current=null] : iv_ruleServiceBlock= ruleServiceBlock EOF ;
    public final EObject entryRuleServiceBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceBlock = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:257:2: (iv_ruleServiceBlock= ruleServiceBlock EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:258:2: iv_ruleServiceBlock= ruleServiceBlock EOF
            {
             newCompositeNode(grammarAccess.getServiceBlockRule()); 
            pushFollow(FOLLOW_ruleServiceBlock_in_entryRuleServiceBlock494);
            iv_ruleServiceBlock=ruleServiceBlock();

            state._fsp--;

             current =iv_ruleServiceBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceBlock504); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceBlock"


    // $ANTLR start "ruleServiceBlock"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:265:1: ruleServiceBlock returns [EObject current=null] : (this_HeaderBlock_0= ruleHeaderBlock | this_ParamsBlock_1= ruleParamsBlock | this_HttpMethod_2= ruleHttpMethod ) ;
    public final EObject ruleServiceBlock() throws RecognitionException {
        EObject current = null;

        EObject this_HeaderBlock_0 = null;

        EObject this_ParamsBlock_1 = null;

        EObject this_HttpMethod_2 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:268:28: ( (this_HeaderBlock_0= ruleHeaderBlock | this_ParamsBlock_1= ruleParamsBlock | this_HttpMethod_2= ruleHttpMethod ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:269:1: (this_HeaderBlock_0= ruleHeaderBlock | this_ParamsBlock_1= ruleParamsBlock | this_HttpMethod_2= ruleHttpMethod )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:269:1: (this_HeaderBlock_0= ruleHeaderBlock | this_ParamsBlock_1= ruleParamsBlock | this_HttpMethod_2= ruleHttpMethod )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:270:5: this_HeaderBlock_0= ruleHeaderBlock
                    {
                     
                            newCompositeNode(grammarAccess.getServiceBlockAccess().getHeaderBlockParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleHeaderBlock_in_ruleServiceBlock551);
                    this_HeaderBlock_0=ruleHeaderBlock();

                    state._fsp--;

                     
                            current = this_HeaderBlock_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:280:5: this_ParamsBlock_1= ruleParamsBlock
                    {
                     
                            newCompositeNode(grammarAccess.getServiceBlockAccess().getParamsBlockParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParamsBlock_in_ruleServiceBlock578);
                    this_ParamsBlock_1=ruleParamsBlock();

                    state._fsp--;

                     
                            current = this_ParamsBlock_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:290:5: this_HttpMethod_2= ruleHttpMethod
                    {
                     
                            newCompositeNode(grammarAccess.getServiceBlockAccess().getHttpMethodParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleHttpMethod_in_ruleServiceBlock605);
                    this_HttpMethod_2=ruleHttpMethod();

                    state._fsp--;

                     
                            current = this_HttpMethod_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServiceBlock"


    // $ANTLR start "entryRuleHeaderBlock"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:306:1: entryRuleHeaderBlock returns [EObject current=null] : iv_ruleHeaderBlock= ruleHeaderBlock EOF ;
    public final EObject entryRuleHeaderBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderBlock = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:307:2: (iv_ruleHeaderBlock= ruleHeaderBlock EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:308:2: iv_ruleHeaderBlock= ruleHeaderBlock EOF
            {
             newCompositeNode(grammarAccess.getHeaderBlockRule()); 
            pushFollow(FOLLOW_ruleHeaderBlock_in_entryRuleHeaderBlock640);
            iv_ruleHeaderBlock=ruleHeaderBlock();

            state._fsp--;

             current =iv_ruleHeaderBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderBlock650); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderBlock"


    // $ANTLR start "ruleHeaderBlock"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:315:1: ruleHeaderBlock returns [EObject current=null] : ( () otherlv_1= 'headers' ( (lv_headers_2_0= ruleMember ) ) (otherlv_3= ',' ( (lv_headers_4_0= ruleMember ) ) )* ) ;
    public final EObject ruleHeaderBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_headers_2_0 = null;

        EObject lv_headers_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:318:28: ( ( () otherlv_1= 'headers' ( (lv_headers_2_0= ruleMember ) ) (otherlv_3= ',' ( (lv_headers_4_0= ruleMember ) ) )* ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:319:1: ( () otherlv_1= 'headers' ( (lv_headers_2_0= ruleMember ) ) (otherlv_3= ',' ( (lv_headers_4_0= ruleMember ) ) )* )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:319:1: ( () otherlv_1= 'headers' ( (lv_headers_2_0= ruleMember ) ) (otherlv_3= ',' ( (lv_headers_4_0= ruleMember ) ) )* )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:319:2: () otherlv_1= 'headers' ( (lv_headers_2_0= ruleMember ) ) (otherlv_3= ',' ( (lv_headers_4_0= ruleMember ) ) )*
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:319:2: ()
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:320:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHeaderBlockAccess().getHeaderBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleHeaderBlock696); 

                	newLeafNode(otherlv_1, grammarAccess.getHeaderBlockAccess().getHeadersKeyword_1());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:329:1: ( (lv_headers_2_0= ruleMember ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:330:1: (lv_headers_2_0= ruleMember )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:330:1: (lv_headers_2_0= ruleMember )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:331:3: lv_headers_2_0= ruleMember
            {
             
            	        newCompositeNode(grammarAccess.getHeaderBlockAccess().getHeadersMemberParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMember_in_ruleHeaderBlock717);
            lv_headers_2_0=ruleMember();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHeaderBlockRule());
            	        }
                   		add(
                   			current, 
                   			"headers",
                    		lv_headers_2_0, 
                    		"Member");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:347:2: (otherlv_3= ',' ( (lv_headers_4_0= ruleMember ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:347:4: otherlv_3= ',' ( (lv_headers_4_0= ruleMember ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleHeaderBlock730); 

            	        	newLeafNode(otherlv_3, grammarAccess.getHeaderBlockAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:351:1: ( (lv_headers_4_0= ruleMember ) )
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:352:1: (lv_headers_4_0= ruleMember )
            	    {
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:352:1: (lv_headers_4_0= ruleMember )
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:353:3: lv_headers_4_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHeaderBlockAccess().getHeadersMemberParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleHeaderBlock751);
            	    lv_headers_4_0=ruleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHeaderBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"headers",
            	            		lv_headers_4_0, 
            	            		"Member");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderBlock"


    // $ANTLR start "entryRuleHttpMethod"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:377:1: entryRuleHttpMethod returns [EObject current=null] : iv_ruleHttpMethod= ruleHttpMethod EOF ;
    public final EObject entryRuleHttpMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpMethod = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:378:2: (iv_ruleHttpMethod= ruleHttpMethod EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:379:2: iv_ruleHttpMethod= ruleHttpMethod EOF
            {
             newCompositeNode(grammarAccess.getHttpMethodRule()); 
            pushFollow(FOLLOW_ruleHttpMethod_in_entryRuleHttpMethod789);
            iv_ruleHttpMethod=ruleHttpMethod();

            state._fsp--;

             current =iv_ruleHttpMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpMethod799); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHttpMethod"


    // $ANTLR start "ruleHttpMethod"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:386:1: ruleHttpMethod returns [EObject current=null] : ( ( (lv_type_0_0= ruleHttpMethodType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= rulePath ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleHttpMethodBlock ) )* otherlv_5= '}' ) ;
    public final EObject ruleHttpMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_path_2_0 = null;

        EObject lv_blocks_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:389:28: ( ( ( (lv_type_0_0= ruleHttpMethodType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= rulePath ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleHttpMethodBlock ) )* otherlv_5= '}' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:390:1: ( ( (lv_type_0_0= ruleHttpMethodType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= rulePath ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleHttpMethodBlock ) )* otherlv_5= '}' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:390:1: ( ( (lv_type_0_0= ruleHttpMethodType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= rulePath ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleHttpMethodBlock ) )* otherlv_5= '}' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:390:2: ( (lv_type_0_0= ruleHttpMethodType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= rulePath ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleHttpMethodBlock ) )* otherlv_5= '}'
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:390:2: ( (lv_type_0_0= ruleHttpMethodType ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:391:1: (lv_type_0_0= ruleHttpMethodType )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:391:1: (lv_type_0_0= ruleHttpMethodType )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:392:3: lv_type_0_0= ruleHttpMethodType
            {
             
            	        newCompositeNode(grammarAccess.getHttpMethodAccess().getTypeHttpMethodTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleHttpMethodType_in_ruleHttpMethod845);
            lv_type_0_0=ruleHttpMethodType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHttpMethodRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"HttpMethodType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:408:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:409:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:409:1: (lv_name_1_0= RULE_ID )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:410:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHttpMethod862); 

            			newLeafNode(lv_name_1_0, grammarAccess.getHttpMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHttpMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:426:2: ( (lv_path_2_0= rulePath ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:427:1: (lv_path_2_0= rulePath )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:427:1: (lv_path_2_0= rulePath )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:428:3: lv_path_2_0= rulePath
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpMethodAccess().getPathPathParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePath_in_ruleHttpMethod888);
                    lv_path_2_0=rulePath();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHttpMethodRule());
                    	        }
                           		set(
                           			current, 
                           			"path",
                            		lv_path_2_0, 
                            		"Path");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleHttpMethod901); 

                	newLeafNode(otherlv_3, grammarAccess.getHttpMethodAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:448:1: ( (lv_blocks_4_0= ruleHttpMethodBlock ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17||(LA8_0>=21 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:449:1: (lv_blocks_4_0= ruleHttpMethodBlock )
            	    {
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:449:1: (lv_blocks_4_0= ruleHttpMethodBlock )
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:450:3: lv_blocks_4_0= ruleHttpMethodBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHttpMethodAccess().getBlocksHttpMethodBlockParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHttpMethodBlock_in_ruleHttpMethod922);
            	    lv_blocks_4_0=ruleHttpMethodBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHttpMethodRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"blocks",
            	            		lv_blocks_4_0, 
            	            		"HttpMethodBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleHttpMethod935); 

                	newLeafNode(otherlv_5, grammarAccess.getHttpMethodAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHttpMethod"


    // $ANTLR start "entryRuleHttpMethodBlock"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:478:1: entryRuleHttpMethodBlock returns [EObject current=null] : iv_ruleHttpMethodBlock= ruleHttpMethodBlock EOF ;
    public final EObject entryRuleHttpMethodBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpMethodBlock = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:479:2: (iv_ruleHttpMethodBlock= ruleHttpMethodBlock EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:480:2: iv_ruleHttpMethodBlock= ruleHttpMethodBlock EOF
            {
             newCompositeNode(grammarAccess.getHttpMethodBlockRule()); 
            pushFollow(FOLLOW_ruleHttpMethodBlock_in_entryRuleHttpMethodBlock971);
            iv_ruleHttpMethodBlock=ruleHttpMethodBlock();

            state._fsp--;

             current =iv_ruleHttpMethodBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpMethodBlock981); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHttpMethodBlock"


    // $ANTLR start "ruleHttpMethodBlock"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:487:1: ruleHttpMethodBlock returns [EObject current=null] : (this_HeaderBlock_0= ruleHeaderBlock | this_ParamsBlock_1= ruleParamsBlock | this_RequestBlock_2= ruleRequestBlock | this_ResponseBlock_3= ruleResponseBlock ) ;
    public final EObject ruleHttpMethodBlock() throws RecognitionException {
        EObject current = null;

        EObject this_HeaderBlock_0 = null;

        EObject this_ParamsBlock_1 = null;

        EObject this_RequestBlock_2 = null;

        EObject this_ResponseBlock_3 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:490:28: ( (this_HeaderBlock_0= ruleHeaderBlock | this_ParamsBlock_1= ruleParamsBlock | this_RequestBlock_2= ruleRequestBlock | this_ResponseBlock_3= ruleResponseBlock ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:491:1: (this_HeaderBlock_0= ruleHeaderBlock | this_ParamsBlock_1= ruleParamsBlock | this_RequestBlock_2= ruleRequestBlock | this_ResponseBlock_3= ruleResponseBlock )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:491:1: (this_HeaderBlock_0= ruleHeaderBlock | this_ParamsBlock_1= ruleParamsBlock | this_RequestBlock_2= ruleRequestBlock | this_ResponseBlock_3= ruleResponseBlock )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case 22:
                {
                alt9=3;
                }
                break;
            case 23:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:492:5: this_HeaderBlock_0= ruleHeaderBlock
                    {
                     
                            newCompositeNode(grammarAccess.getHttpMethodBlockAccess().getHeaderBlockParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleHeaderBlock_in_ruleHttpMethodBlock1028);
                    this_HeaderBlock_0=ruleHeaderBlock();

                    state._fsp--;

                     
                            current = this_HeaderBlock_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:502:5: this_ParamsBlock_1= ruleParamsBlock
                    {
                     
                            newCompositeNode(grammarAccess.getHttpMethodBlockAccess().getParamsBlockParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParamsBlock_in_ruleHttpMethodBlock1055);
                    this_ParamsBlock_1=ruleParamsBlock();

                    state._fsp--;

                     
                            current = this_ParamsBlock_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:512:5: this_RequestBlock_2= ruleRequestBlock
                    {
                     
                            newCompositeNode(grammarAccess.getHttpMethodBlockAccess().getRequestBlockParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRequestBlock_in_ruleHttpMethodBlock1082);
                    this_RequestBlock_2=ruleRequestBlock();

                    state._fsp--;

                     
                            current = this_RequestBlock_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:522:5: this_ResponseBlock_3= ruleResponseBlock
                    {
                     
                            newCompositeNode(grammarAccess.getHttpMethodBlockAccess().getResponseBlockParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleResponseBlock_in_ruleHttpMethodBlock1109);
                    this_ResponseBlock_3=ruleResponseBlock();

                    state._fsp--;

                     
                            current = this_ResponseBlock_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHttpMethodBlock"


    // $ANTLR start "entryRulePath"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:538:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:539:2: (iv_rulePath= rulePath EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:540:2: iv_rulePath= rulePath EOF
            {
             newCompositeNode(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_rulePath_in_entryRulePath1144);
            iv_rulePath=rulePath();

            state._fsp--;

             current =iv_rulePath; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePath1154); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:547:1: rulePath returns [EObject current=null] : ( () otherlv_1= '/' ( ruleArbitraryPathSegment | ( (lv_params_3_0= ruleMember ) ) ) (otherlv_4= '/' ( ruleArbitraryPathSegment | ( (lv_params_6_0= ruleMember ) ) ) )* ) ;
    public final EObject rulePath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:550:28: ( ( () otherlv_1= '/' ( ruleArbitraryPathSegment | ( (lv_params_3_0= ruleMember ) ) ) (otherlv_4= '/' ( ruleArbitraryPathSegment | ( (lv_params_6_0= ruleMember ) ) ) )* ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:551:1: ( () otherlv_1= '/' ( ruleArbitraryPathSegment | ( (lv_params_3_0= ruleMember ) ) ) (otherlv_4= '/' ( ruleArbitraryPathSegment | ( (lv_params_6_0= ruleMember ) ) ) )* )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:551:1: ( () otherlv_1= '/' ( ruleArbitraryPathSegment | ( (lv_params_3_0= ruleMember ) ) ) (otherlv_4= '/' ( ruleArbitraryPathSegment | ( (lv_params_6_0= ruleMember ) ) ) )* )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:551:2: () otherlv_1= '/' ( ruleArbitraryPathSegment | ( (lv_params_3_0= ruleMember ) ) ) (otherlv_4= '/' ( ruleArbitraryPathSegment | ( (lv_params_6_0= ruleMember ) ) ) )*
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:551:2: ()
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:552:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPathAccess().getPathAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_rulePath1200); 

                	newLeafNode(otherlv_1, grammarAccess.getPathAccess().getSolidusKeyword_1());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:561:1: ( ruleArbitraryPathSegment | ( (lv_params_3_0= ruleMember ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==EOF||LA10_1==15||(LA10_1>=19 && LA10_1<=20)||LA10_1==36) ) {
                    alt10=1;
                }
                else if ( (LA10_1==25) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:562:5: ruleArbitraryPathSegment
                    {
                     
                            newCompositeNode(grammarAccess.getPathAccess().getArbitraryPathSegmentParserRuleCall_2_0()); 
                        
                    pushFollow(FOLLOW_ruleArbitraryPathSegment_in_rulePath1217);
                    ruleArbitraryPathSegment();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:570:6: ( (lv_params_3_0= ruleMember ) )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:570:6: ( (lv_params_3_0= ruleMember ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:571:1: (lv_params_3_0= ruleMember )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:571:1: (lv_params_3_0= ruleMember )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:572:3: lv_params_3_0= ruleMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getPathAccess().getParamsMemberParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMember_in_rulePath1243);
                    lv_params_3_0=ruleMember();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPathRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"Member");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:588:3: (otherlv_4= '/' ( ruleArbitraryPathSegment | ( (lv_params_6_0= ruleMember ) ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:588:5: otherlv_4= '/' ( ruleArbitraryPathSegment | ( (lv_params_6_0= ruleMember ) ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_rulePath1257); 

            	        	newLeafNode(otherlv_4, grammarAccess.getPathAccess().getSolidusKeyword_3_0());
            	        
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:592:1: ( ruleArbitraryPathSegment | ( (lv_params_6_0= ruleMember ) ) )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==RULE_ID) ) {
            	        int LA11_1 = input.LA(2);

            	        if ( (LA11_1==25) ) {
            	            alt11=2;
            	        }
            	        else if ( (LA11_1==EOF||LA11_1==15||(LA11_1>=19 && LA11_1<=20)||LA11_1==36) ) {
            	            alt11=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 11, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA11_0==RULE_STRING) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:593:5: ruleArbitraryPathSegment
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getPathAccess().getArbitraryPathSegmentParserRuleCall_3_1_0()); 
            	                
            	            pushFollow(FOLLOW_ruleArbitraryPathSegment_in_rulePath1274);
            	            ruleArbitraryPathSegment();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:601:6: ( (lv_params_6_0= ruleMember ) )
            	            {
            	            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:601:6: ( (lv_params_6_0= ruleMember ) )
            	            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:602:1: (lv_params_6_0= ruleMember )
            	            {
            	            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:602:1: (lv_params_6_0= ruleMember )
            	            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:603:3: lv_params_6_0= ruleMember
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getPathAccess().getParamsMemberParserRuleCall_3_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleMember_in_rulePath1300);
            	            lv_params_6_0=ruleMember();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getPathRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"params",
            	                    		lv_params_6_0, 
            	                    		"Member");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleArbitraryPathSegment"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:627:1: entryRuleArbitraryPathSegment returns [String current=null] : iv_ruleArbitraryPathSegment= ruleArbitraryPathSegment EOF ;
    public final String entryRuleArbitraryPathSegment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArbitraryPathSegment = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:628:2: (iv_ruleArbitraryPathSegment= ruleArbitraryPathSegment EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:629:2: iv_ruleArbitraryPathSegment= ruleArbitraryPathSegment EOF
            {
             newCompositeNode(grammarAccess.getArbitraryPathSegmentRule()); 
            pushFollow(FOLLOW_ruleArbitraryPathSegment_in_entryRuleArbitraryPathSegment1340);
            iv_ruleArbitraryPathSegment=ruleArbitraryPathSegment();

            state._fsp--;

             current =iv_ruleArbitraryPathSegment.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArbitraryPathSegment1351); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArbitraryPathSegment"


    // $ANTLR start "ruleArbitraryPathSegment"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:636:1: ruleArbitraryPathSegment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '-' this_QualifiedName_2= ruleQualifiedName )* ) ;
    public final AntlrDatatypeRuleToken ruleArbitraryPathSegment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_QualifiedName_2 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:639:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '-' this_QualifiedName_2= ruleQualifiedName )* ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:640:1: (this_QualifiedName_0= ruleQualifiedName (kw= '-' this_QualifiedName_2= ruleQualifiedName )* )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:640:1: (this_QualifiedName_0= ruleQualifiedName (kw= '-' this_QualifiedName_2= ruleQualifiedName )* )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:641:5: this_QualifiedName_0= ruleQualifiedName (kw= '-' this_QualifiedName_2= ruleQualifiedName )*
            {
             
                    newCompositeNode(grammarAccess.getArbitraryPathSegmentAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleArbitraryPathSegment1398);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:651:1: (kw= '-' this_QualifiedName_2= ruleQualifiedName )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:652:2: kw= '-' this_QualifiedName_2= ruleQualifiedName
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_ruleArbitraryPathSegment1417); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getArbitraryPathSegmentAccess().getHyphenMinusKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getArbitraryPathSegmentAccess().getQualifiedNameParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleArbitraryPathSegment1439);
            	    this_QualifiedName_2=ruleQualifiedName();

            	    state._fsp--;


            	    		current.merge(this_QualifiedName_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArbitraryPathSegment"


    // $ANTLR start "entryRuleParamsBlock"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:676:1: entryRuleParamsBlock returns [EObject current=null] : iv_ruleParamsBlock= ruleParamsBlock EOF ;
    public final EObject entryRuleParamsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamsBlock = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:677:2: (iv_ruleParamsBlock= ruleParamsBlock EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:678:2: iv_ruleParamsBlock= ruleParamsBlock EOF
            {
             newCompositeNode(grammarAccess.getParamsBlockRule()); 
            pushFollow(FOLLOW_ruleParamsBlock_in_entryRuleParamsBlock1486);
            iv_ruleParamsBlock=ruleParamsBlock();

            state._fsp--;

             current =iv_ruleParamsBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamsBlock1496); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParamsBlock"


    // $ANTLR start "ruleParamsBlock"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:685:1: ruleParamsBlock returns [EObject current=null] : ( () otherlv_1= 'params' ( (lv_params_2_0= ruleMember ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleMember ) ) )* ) ;
    public final EObject ruleParamsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:688:28: ( ( () otherlv_1= 'params' ( (lv_params_2_0= ruleMember ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleMember ) ) )* ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:689:1: ( () otherlv_1= 'params' ( (lv_params_2_0= ruleMember ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleMember ) ) )* )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:689:1: ( () otherlv_1= 'params' ( (lv_params_2_0= ruleMember ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleMember ) ) )* )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:689:2: () otherlv_1= 'params' ( (lv_params_2_0= ruleMember ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleMember ) ) )*
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:689:2: ()
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:690:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParamsBlockAccess().getParamsBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleParamsBlock1542); 

                	newLeafNode(otherlv_1, grammarAccess.getParamsBlockAccess().getParamsKeyword_1());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:699:1: ( (lv_params_2_0= ruleMember ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:700:1: (lv_params_2_0= ruleMember )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:700:1: (lv_params_2_0= ruleMember )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:701:3: lv_params_2_0= ruleMember
            {
             
            	        newCompositeNode(grammarAccess.getParamsBlockAccess().getParamsMemberParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMember_in_ruleParamsBlock1563);
            lv_params_2_0=ruleMember();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParamsBlockRule());
            	        }
                   		add(
                   			current, 
                   			"params",
                    		lv_params_2_0, 
                    		"Member");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:717:2: (otherlv_3= ',' ( (lv_params_4_0= ruleMember ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:717:4: otherlv_3= ',' ( (lv_params_4_0= ruleMember ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleParamsBlock1576); 

            	        	newLeafNode(otherlv_3, grammarAccess.getParamsBlockAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:721:1: ( (lv_params_4_0= ruleMember ) )
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:722:1: (lv_params_4_0= ruleMember )
            	    {
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:722:1: (lv_params_4_0= ruleMember )
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:723:3: lv_params_4_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParamsBlockAccess().getParamsMemberParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleParamsBlock1597);
            	    lv_params_4_0=ruleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParamsBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"params",
            	            		lv_params_4_0, 
            	            		"Member");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParamsBlock"


    // $ANTLR start "entryRuleLiteral"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:747:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:748:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:749:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1635);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1645); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:756:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_literal_1_0= ruleBooleanValue ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= ruleSignedNumber ) ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_literal_3_0=null;
        Enumerator lv_literal_1_0 = null;

        AntlrDatatypeRuleToken lv_literal_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:759:28: ( ( ( () ( (lv_literal_1_0= ruleBooleanValue ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= ruleSignedNumber ) ) ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:760:1: ( ( () ( (lv_literal_1_0= ruleBooleanValue ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= ruleSignedNumber ) ) ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:760:1: ( ( () ( (lv_literal_1_0= ruleBooleanValue ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= ruleSignedNumber ) ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 42:
            case 43:
                {
                alt15=1;
                }
                break;
            case RULE_STRING:
                {
                alt15=2;
                }
                break;
            case RULE_NUMBER:
            case 20:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:760:2: ( () ( (lv_literal_1_0= ruleBooleanValue ) ) )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:760:2: ( () ( (lv_literal_1_0= ruleBooleanValue ) ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:760:3: () ( (lv_literal_1_0= ruleBooleanValue ) )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:760:3: ()
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:761:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getBooleanLiteralAction_0_0(),
                                current);
                        

                    }

                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:766:2: ( (lv_literal_1_0= ruleBooleanValue ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:767:1: (lv_literal_1_0= ruleBooleanValue )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:767:1: (lv_literal_1_0= ruleBooleanValue )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:768:3: lv_literal_1_0= ruleBooleanValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getLiteralBooleanValueEnumRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleLiteral1701);
                    lv_literal_1_0=ruleBooleanValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"literal",
                            		lv_literal_1_0, 
                            		"BooleanValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:785:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:785:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:785:7: () ( (lv_literal_3_0= RULE_STRING ) )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:785:7: ()
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:786:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getStringLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:791:2: ( (lv_literal_3_0= RULE_STRING ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:792:1: (lv_literal_3_0= RULE_STRING )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:792:1: (lv_literal_3_0= RULE_STRING )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:793:3: lv_literal_3_0= RULE_STRING
                    {
                    lv_literal_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteral1735); 

                    			newLeafNode(lv_literal_3_0, grammarAccess.getLiteralAccess().getLiteralSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"literal",
                            		lv_literal_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:810:6: ( () ( (lv_literal_5_0= ruleSignedNumber ) ) )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:810:6: ( () ( (lv_literal_5_0= ruleSignedNumber ) ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:810:7: () ( (lv_literal_5_0= ruleSignedNumber ) )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:810:7: ()
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:811:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getNumericLiteralAction_2_0(),
                                current);
                        

                    }

                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:816:2: ( (lv_literal_5_0= ruleSignedNumber ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:817:1: (lv_literal_5_0= ruleSignedNumber )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:817:1: (lv_literal_5_0= ruleSignedNumber )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:818:3: lv_literal_5_0= ruleSignedNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getLiteralSignedNumberParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSignedNumber_in_ruleLiteral1778);
                    lv_literal_5_0=ruleSignedNumber();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"literal",
                            		lv_literal_5_0, 
                            		"SignedNumber");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleRequestBlock"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:842:1: entryRuleRequestBlock returns [EObject current=null] : iv_ruleRequestBlock= ruleRequestBlock EOF ;
    public final EObject entryRuleRequestBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestBlock = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:843:2: (iv_ruleRequestBlock= ruleRequestBlock EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:844:2: iv_ruleRequestBlock= ruleRequestBlock EOF
            {
             newCompositeNode(grammarAccess.getRequestBlockRule()); 
            pushFollow(FOLLOW_ruleRequestBlock_in_entryRuleRequestBlock1815);
            iv_ruleRequestBlock=ruleRequestBlock();

            state._fsp--;

             current =iv_ruleRequestBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequestBlock1825); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequestBlock"


    // $ANTLR start "ruleRequestBlock"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:851:1: ruleRequestBlock returns [EObject current=null] : (otherlv_0= 'request' ( (lv_type_1_0= ruleBlockType ) ) ) ;
    public final EObject ruleRequestBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:854:28: ( (otherlv_0= 'request' ( (lv_type_1_0= ruleBlockType ) ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:855:1: (otherlv_0= 'request' ( (lv_type_1_0= ruleBlockType ) ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:855:1: (otherlv_0= 'request' ( (lv_type_1_0= ruleBlockType ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:855:3: otherlv_0= 'request' ( (lv_type_1_0= ruleBlockType ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleRequestBlock1862); 

                	newLeafNode(otherlv_0, grammarAccess.getRequestBlockAccess().getRequestKeyword_0());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:859:1: ( (lv_type_1_0= ruleBlockType ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:860:1: (lv_type_1_0= ruleBlockType )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:860:1: (lv_type_1_0= ruleBlockType )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:861:3: lv_type_1_0= ruleBlockType
            {
             
            	        newCompositeNode(grammarAccess.getRequestBlockAccess().getTypeBlockTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBlockType_in_ruleRequestBlock1883);
            lv_type_1_0=ruleBlockType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRequestBlockRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"BlockType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequestBlock"


    // $ANTLR start "entryRuleResponseBlock"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:885:1: entryRuleResponseBlock returns [EObject current=null] : iv_ruleResponseBlock= ruleResponseBlock EOF ;
    public final EObject entryRuleResponseBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponseBlock = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:886:2: (iv_ruleResponseBlock= ruleResponseBlock EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:887:2: iv_ruleResponseBlock= ruleResponseBlock EOF
            {
             newCompositeNode(grammarAccess.getResponseBlockRule()); 
            pushFollow(FOLLOW_ruleResponseBlock_in_entryRuleResponseBlock1919);
            iv_ruleResponseBlock=ruleResponseBlock();

            state._fsp--;

             current =iv_ruleResponseBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResponseBlock1929); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResponseBlock"


    // $ANTLR start "ruleResponseBlock"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:894:1: ruleResponseBlock returns [EObject current=null] : ( () otherlv_1= 'response' ( (lv_code_2_0= RULE_INTEGER ) )? ( (lv_message_3_0= RULE_STRING ) )? (otherlv_4= 'mixin' ( (otherlv_5= RULE_ID ) ) )? ( (lv_type_6_0= ruleBlockType ) )? ) ;
    public final EObject ruleResponseBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_code_2_0=null;
        Token lv_message_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_type_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:897:28: ( ( () otherlv_1= 'response' ( (lv_code_2_0= RULE_INTEGER ) )? ( (lv_message_3_0= RULE_STRING ) )? (otherlv_4= 'mixin' ( (otherlv_5= RULE_ID ) ) )? ( (lv_type_6_0= ruleBlockType ) )? ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:898:1: ( () otherlv_1= 'response' ( (lv_code_2_0= RULE_INTEGER ) )? ( (lv_message_3_0= RULE_STRING ) )? (otherlv_4= 'mixin' ( (otherlv_5= RULE_ID ) ) )? ( (lv_type_6_0= ruleBlockType ) )? )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:898:1: ( () otherlv_1= 'response' ( (lv_code_2_0= RULE_INTEGER ) )? ( (lv_message_3_0= RULE_STRING ) )? (otherlv_4= 'mixin' ( (otherlv_5= RULE_ID ) ) )? ( (lv_type_6_0= ruleBlockType ) )? )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:898:2: () otherlv_1= 'response' ( (lv_code_2_0= RULE_INTEGER ) )? ( (lv_message_3_0= RULE_STRING ) )? (otherlv_4= 'mixin' ( (otherlv_5= RULE_ID ) ) )? ( (lv_type_6_0= ruleBlockType ) )?
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:898:2: ()
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:899:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getResponseBlockAccess().getResponseBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleResponseBlock1975); 

                	newLeafNode(otherlv_1, grammarAccess.getResponseBlockAccess().getResponseKeyword_1());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:908:1: ( (lv_code_2_0= RULE_INTEGER ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INTEGER) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:909:1: (lv_code_2_0= RULE_INTEGER )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:909:1: (lv_code_2_0= RULE_INTEGER )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:910:3: lv_code_2_0= RULE_INTEGER
                    {
                    lv_code_2_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleResponseBlock1992); 

                    			newLeafNode(lv_code_2_0, grammarAccess.getResponseBlockAccess().getCodeINTEGERTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResponseBlockRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"code",
                            		lv_code_2_0, 
                            		"INTEGER");
                    	    

                    }


                    }
                    break;

            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:926:3: ( (lv_message_3_0= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:927:1: (lv_message_3_0= RULE_STRING )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:927:1: (lv_message_3_0= RULE_STRING )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:928:3: lv_message_3_0= RULE_STRING
                    {
                    lv_message_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResponseBlock2015); 

                    			newLeafNode(lv_message_3_0, grammarAccess.getResponseBlockAccess().getMessageSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResponseBlockRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"message",
                            		lv_message_3_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:944:3: (otherlv_4= 'mixin' ( (otherlv_5= RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:944:5: otherlv_4= 'mixin' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleResponseBlock2034); 

                        	newLeafNode(otherlv_4, grammarAccess.getResponseBlockAccess().getMixinKeyword_4_0());
                        
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:948:1: ( (otherlv_5= RULE_ID ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:949:1: (otherlv_5= RULE_ID )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:949:1: (otherlv_5= RULE_ID )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:950:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getResponseBlockRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResponseBlock2054); 

                    		newLeafNode(otherlv_5, grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:961:4: ( (lv_type_6_0= ruleBlockType ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||LA19_0==15||(LA19_0>=31 && LA19_0<=35)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:962:1: (lv_type_6_0= ruleBlockType )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:962:1: (lv_type_6_0= ruleBlockType )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:963:3: lv_type_6_0= ruleBlockType
                    {
                     
                    	        newCompositeNode(grammarAccess.getResponseBlockAccess().getTypeBlockTypeParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBlockType_in_ruleResponseBlock2077);
                    lv_type_6_0=ruleBlockType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getResponseBlockRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_6_0, 
                            		"BlockType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResponseBlock"


    // $ANTLR start "entryRuleBlockType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:987:1: entryRuleBlockType returns [EObject current=null] : iv_ruleBlockType= ruleBlockType EOF ;
    public final EObject entryRuleBlockType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockType = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:988:2: (iv_ruleBlockType= ruleBlockType EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:989:2: iv_ruleBlockType= ruleBlockType EOF
            {
             newCompositeNode(grammarAccess.getBlockTypeRule()); 
            pushFollow(FOLLOW_ruleBlockType_in_entryRuleBlockType2114);
            iv_ruleBlockType=ruleBlockType();

            state._fsp--;

             current =iv_ruleBlockType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockType2124); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlockType"


    // $ANTLR start "ruleBlockType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:996:1: ruleBlockType returns [EObject current=null] : (this_Type_0= ruleType | this_ComplexTypeLiteral_1= ruleComplexTypeLiteral ) ;
    public final EObject ruleBlockType() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_ComplexTypeLiteral_1 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:999:28: ( (this_Type_0= ruleType | this_ComplexTypeLiteral_1= ruleComplexTypeLiteral ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1000:1: (this_Type_0= ruleType | this_ComplexTypeLiteral_1= ruleComplexTypeLiteral )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1000:1: (this_Type_0= ruleType | this_ComplexTypeLiteral_1= ruleComplexTypeLiteral )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||(LA20_0>=31 && LA20_0<=35)) ) {
                alt20=1;
            }
            else if ( (LA20_0==15) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1001:5: this_Type_0= ruleType
                    {
                     
                            newCompositeNode(grammarAccess.getBlockTypeAccess().getTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleBlockType2171);
                    this_Type_0=ruleType();

                    state._fsp--;

                     
                            current = this_Type_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1011:5: this_ComplexTypeLiteral_1= ruleComplexTypeLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getBlockTypeAccess().getComplexTypeLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComplexTypeLiteral_in_ruleBlockType2198);
                    this_ComplexTypeLiteral_1=ruleComplexTypeLiteral();

                    state._fsp--;

                     
                            current = this_ComplexTypeLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlockType"


    // $ANTLR start "entryRuleMember"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1027:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1028:2: (iv_ruleMember= ruleMember EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1029:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember2233);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember2243); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1036:1: ruleMember returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleLiteral ) ) )? ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;

        EObject lv_defaultValue_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1039:28: ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleLiteral ) ) )? ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1040:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleLiteral ) ) )? )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1040:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleLiteral ) ) )? )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1040:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleLiteral ) ) )?
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1040:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1041:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1041:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1042:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1042:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_STRING) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1043:3: lv_name_0_1= RULE_ID
                    {
                    lv_name_0_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMember2287); 

                    			newLeafNode(lv_name_0_1, grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMemberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1058:8: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMember2307); 

                    			newLeafNode(lv_name_0_2, grammarAccess.getMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMemberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleMember2327); 

                	newLeafNode(otherlv_1, grammarAccess.getMemberAccess().getColonKeyword_1());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1080:1: ( (lv_type_2_0= ruleType ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1081:1: (lv_type_2_0= ruleType )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1081:1: (lv_type_2_0= ruleType )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1082:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getMemberAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleMember2348);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMemberRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1098:2: (otherlv_3= '=' ( (lv_defaultValue_4_0= ruleLiteral ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1098:4: otherlv_3= '=' ( (lv_defaultValue_4_0= ruleLiteral ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleMember2361); 

                        	newLeafNode(otherlv_3, grammarAccess.getMemberAccess().getEqualsSignKeyword_3_0());
                        
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1102:1: ( (lv_defaultValue_4_0= ruleLiteral ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1103:1: (lv_defaultValue_4_0= ruleLiteral )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1103:1: (lv_defaultValue_4_0= ruleLiteral )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1104:3: lv_defaultValue_4_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getMemberAccess().getDefaultValueLiteralParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleMember2382);
                    lv_defaultValue_4_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMemberRule());
                    	        }
                           		set(
                           			current, 
                           			"defaultValue",
                            		lv_defaultValue_4_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1128:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1129:2: (iv_ruleType= ruleType EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1130:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2420);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2430); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1137:1: ruleType returns [EObject current=null] : (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_ArrayType_2= ruleArrayType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_UserType_0 = null;

        EObject this_IntrinsicType_1 = null;

        EObject this_ArrayType_2 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1140:28: ( (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_ArrayType_2= ruleArrayType ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1141:1: (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_ArrayType_2= ruleArrayType )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1141:1: (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_ArrayType_2= ruleArrayType )
            int alt23=3;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1142:5: this_UserType_0= ruleUserType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUserTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUserType_in_ruleType2477);
                    this_UserType_0=ruleUserType();

                    state._fsp--;

                     
                            current = this_UserType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1152:5: this_IntrinsicType_1= ruleIntrinsicType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getIntrinsicTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntrinsicType_in_ruleType2504);
                    this_IntrinsicType_1=ruleIntrinsicType();

                    state._fsp--;

                     
                            current = this_IntrinsicType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1162:5: this_ArrayType_2= ruleArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getArrayTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleArrayType_in_ruleType2531);
                    this_ArrayType_2=ruleArrayType();

                    state._fsp--;

                     
                            current = this_ArrayType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleArrayType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1178:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1179:2: (iv_ruleArrayType= ruleArrayType EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1180:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType2566);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType2576); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1187:1: ruleArrayType returns [EObject current=null] : ( ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) ) ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_elementType_0_1 = null;

        EObject lv_elementType_0_2 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1190:28: ( ( ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1191:1: ( ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1191:1: ( ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1191:2: ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1191:2: ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1192:1: ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1192:1: ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1193:1: (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1193:1: (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=31 && LA24_0<=35)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1194:3: lv_elementType_0_1= ruleUserType
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayTypeAccess().getElementTypeUserTypeParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUserType_in_ruleArrayType2624);
                    lv_elementType_0_1=ruleUserType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"elementType",
                            		lv_elementType_0_1, 
                            		"UserType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1209:8: lv_elementType_0_2= ruleIntrinsicType
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayTypeAccess().getElementTypeIntrinsicTypeParserRuleCall_0_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleIntrinsicType_in_ruleArrayType2643);
                    lv_elementType_0_2=ruleIntrinsicType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"elementType",
                            		lv_elementType_0_2, 
                            		"IntrinsicType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1227:2: ( (lv_id_1_0= '[]' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1228:1: (lv_id_1_0= '[]' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1228:1: (lv_id_1_0= '[]' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1229:3: lv_id_1_0= '[]'
            {
            lv_id_1_0=(Token)match(input,27,FOLLOW_27_in_ruleArrayType2664); 

                    newLeafNode(lv_id_1_0, grammarAccess.getArrayTypeAccess().getIdLeftSquareBracketRightSquareBracketKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArrayTypeRule());
            	        }
                   		setWithLastConsumed(current, "id", lv_id_1_0, "[]");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleUserType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1250:1: entryRuleUserType returns [EObject current=null] : iv_ruleUserType= ruleUserType EOF ;
    public final EObject entryRuleUserType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserType = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1251:2: (iv_ruleUserType= ruleUserType EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1252:2: iv_ruleUserType= ruleUserType EOF
            {
             newCompositeNode(grammarAccess.getUserTypeRule()); 
            pushFollow(FOLLOW_ruleUserType_in_entryRuleUserType2713);
            iv_ruleUserType=ruleUserType();

            state._fsp--;

             current =iv_ruleUserType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserType2723); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUserType"


    // $ANTLR start "ruleUserType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1259:1: ruleUserType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleUserType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1262:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1263:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1263:1: ( (otherlv_0= RULE_ID ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1264:1: (otherlv_0= RULE_ID )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1264:1: (otherlv_0= RULE_ID )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1265:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUserTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUserType2767); 

            		newLeafNode(otherlv_0, grammarAccess.getUserTypeAccess().getDeclarationUserTypeDeclarationCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUserType"


    // $ANTLR start "entryRuleUserTypeDeclaration"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1284:1: entryRuleUserTypeDeclaration returns [EObject current=null] : iv_ruleUserTypeDeclaration= ruleUserTypeDeclaration EOF ;
    public final EObject entryRuleUserTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserTypeDeclaration = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1285:2: (iv_ruleUserTypeDeclaration= ruleUserTypeDeclaration EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1286:2: iv_ruleUserTypeDeclaration= ruleUserTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getUserTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleUserTypeDeclaration_in_entryRuleUserTypeDeclaration2802);
            iv_ruleUserTypeDeclaration=ruleUserTypeDeclaration();

            state._fsp--;

             current =iv_ruleUserTypeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserTypeDeclaration2812); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUserTypeDeclaration"


    // $ANTLR start "ruleUserTypeDeclaration"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1293:1: ruleUserTypeDeclaration returns [EObject current=null] : (this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration | this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration ) ;
    public final EObject ruleUserTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ComplexTypeDeclaration_0 = null;

        EObject this_EnumTypeDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1296:28: ( (this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration | this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1297:1: (this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration | this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1297:1: (this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration | this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            else if ( (LA25_0==29) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1298:5: this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getUserTypeDeclarationAccess().getComplexTypeDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleComplexTypeDeclaration_in_ruleUserTypeDeclaration2859);
                    this_ComplexTypeDeclaration_0=ruleComplexTypeDeclaration();

                    state._fsp--;

                     
                            current = this_ComplexTypeDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1308:5: this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getUserTypeDeclarationAccess().getEnumTypeDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnumTypeDeclaration_in_ruleUserTypeDeclaration2886);
                    this_EnumTypeDeclaration_1=ruleEnumTypeDeclaration();

                    state._fsp--;

                     
                            current = this_EnumTypeDeclaration_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUserTypeDeclaration"


    // $ANTLR start "entryRuleComplexTypeDeclaration"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1324:1: entryRuleComplexTypeDeclaration returns [EObject current=null] : iv_ruleComplexTypeDeclaration= ruleComplexTypeDeclaration EOF ;
    public final EObject entryRuleComplexTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexTypeDeclaration = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1325:2: (iv_ruleComplexTypeDeclaration= ruleComplexTypeDeclaration EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1326:2: iv_ruleComplexTypeDeclaration= ruleComplexTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getComplexTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleComplexTypeDeclaration_in_entryRuleComplexTypeDeclaration2921);
            iv_ruleComplexTypeDeclaration=ruleComplexTypeDeclaration();

            state._fsp--;

             current =iv_ruleComplexTypeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeDeclaration2931); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexTypeDeclaration"


    // $ANTLR start "ruleComplexTypeDeclaration"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1333:1: ruleComplexTypeDeclaration returns [EObject current=null] : ( ( (lv_keyword_0_0= 'entity' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_literal_2_0= ruleComplexTypeLiteral ) )? ) ;
    public final EObject ruleComplexTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token lv_name_1_0=null;
        EObject lv_literal_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1336:28: ( ( ( (lv_keyword_0_0= 'entity' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_literal_2_0= ruleComplexTypeLiteral ) )? ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1337:1: ( ( (lv_keyword_0_0= 'entity' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_literal_2_0= ruleComplexTypeLiteral ) )? )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1337:1: ( ( (lv_keyword_0_0= 'entity' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_literal_2_0= ruleComplexTypeLiteral ) )? )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1337:2: ( (lv_keyword_0_0= 'entity' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_literal_2_0= ruleComplexTypeLiteral ) )?
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1337:2: ( (lv_keyword_0_0= 'entity' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1338:1: (lv_keyword_0_0= 'entity' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1338:1: (lv_keyword_0_0= 'entity' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1339:3: lv_keyword_0_0= 'entity'
            {
            lv_keyword_0_0=(Token)match(input,28,FOLLOW_28_in_ruleComplexTypeDeclaration2974); 

                    newLeafNode(lv_keyword_0_0, grammarAccess.getComplexTypeDeclarationAccess().getKeywordEntityKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComplexTypeDeclarationRule());
            	        }
                   		setWithLastConsumed(current, "keyword", lv_keyword_0_0, "entity");
            	    

            }


            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1352:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1353:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1353:1: (lv_name_1_0= RULE_ID )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1354:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexTypeDeclaration3004); 

            			newLeafNode(lv_name_1_0, grammarAccess.getComplexTypeDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComplexTypeDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1370:2: ( (lv_literal_2_0= ruleComplexTypeLiteral ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==15) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1371:1: (lv_literal_2_0= ruleComplexTypeLiteral )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1371:1: (lv_literal_2_0= ruleComplexTypeLiteral )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1372:3: lv_literal_2_0= ruleComplexTypeLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getComplexTypeDeclarationAccess().getLiteralComplexTypeLiteralParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleComplexTypeLiteral_in_ruleComplexTypeDeclaration3030);
                    lv_literal_2_0=ruleComplexTypeLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComplexTypeDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"literal",
                            		lv_literal_2_0, 
                            		"ComplexTypeLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexTypeDeclaration"


    // $ANTLR start "entryRuleEnumTypeDeclaration"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1396:1: entryRuleEnumTypeDeclaration returns [EObject current=null] : iv_ruleEnumTypeDeclaration= ruleEnumTypeDeclaration EOF ;
    public final EObject entryRuleEnumTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeDeclaration = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1397:2: (iv_ruleEnumTypeDeclaration= ruleEnumTypeDeclaration EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1398:2: iv_ruleEnumTypeDeclaration= ruleEnumTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleEnumTypeDeclaration_in_entryRuleEnumTypeDeclaration3067);
            iv_ruleEnumTypeDeclaration=ruleEnumTypeDeclaration();

            state._fsp--;

             current =iv_ruleEnumTypeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumTypeDeclaration3077); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumTypeDeclaration"


    // $ANTLR start "ruleEnumTypeDeclaration"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1405:1: ruleEnumTypeDeclaration returns [EObject current=null] : ( ( (lv_keyword_0_0= 'enum' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleIntegerType ) ) )? ( (lv_literal_4_0= ruleEnumTypeLiteral ) )? ) ;
    public final EObject ruleEnumTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_superType_3_0 = null;

        EObject lv_literal_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1408:28: ( ( ( (lv_keyword_0_0= 'enum' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleIntegerType ) ) )? ( (lv_literal_4_0= ruleEnumTypeLiteral ) )? ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1409:1: ( ( (lv_keyword_0_0= 'enum' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleIntegerType ) ) )? ( (lv_literal_4_0= ruleEnumTypeLiteral ) )? )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1409:1: ( ( (lv_keyword_0_0= 'enum' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleIntegerType ) ) )? ( (lv_literal_4_0= ruleEnumTypeLiteral ) )? )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1409:2: ( (lv_keyword_0_0= 'enum' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleIntegerType ) ) )? ( (lv_literal_4_0= ruleEnumTypeLiteral ) )?
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1409:2: ( (lv_keyword_0_0= 'enum' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1410:1: (lv_keyword_0_0= 'enum' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1410:1: (lv_keyword_0_0= 'enum' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1411:3: lv_keyword_0_0= 'enum'
            {
            lv_keyword_0_0=(Token)match(input,29,FOLLOW_29_in_ruleEnumTypeDeclaration3120); 

                    newLeafNode(lv_keyword_0_0, grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumTypeDeclarationRule());
            	        }
                   		setWithLastConsumed(current, "keyword", lv_keyword_0_0, "enum");
            	    

            }


            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1424:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1425:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1425:1: (lv_name_1_0= RULE_ID )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1426:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumTypeDeclaration3150); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumTypeDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumTypeDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1442:2: (otherlv_2= 'extends' ( (lv_superType_3_0= ruleIntegerType ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1442:4: otherlv_2= 'extends' ( (lv_superType_3_0= ruleIntegerType ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleEnumTypeDeclaration3168); 

                        	newLeafNode(otherlv_2, grammarAccess.getEnumTypeDeclarationAccess().getExtendsKeyword_2_0());
                        
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1446:1: ( (lv_superType_3_0= ruleIntegerType ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1447:1: (lv_superType_3_0= ruleIntegerType )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1447:1: (lv_superType_3_0= ruleIntegerType )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1448:3: lv_superType_3_0= ruleIntegerType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeIntegerTypeParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIntegerType_in_ruleEnumTypeDeclaration3189);
                    lv_superType_3_0=ruleIntegerType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumTypeDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"superType",
                            		lv_superType_3_0, 
                            		"IntegerType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1464:4: ( (lv_literal_4_0= ruleEnumTypeLiteral ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==15) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1465:1: (lv_literal_4_0= ruleEnumTypeLiteral )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1465:1: (lv_literal_4_0= ruleEnumTypeLiteral )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1466:3: lv_literal_4_0= ruleEnumTypeLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumTypeDeclarationAccess().getLiteralEnumTypeLiteralParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEnumTypeLiteral_in_ruleEnumTypeDeclaration3212);
                    lv_literal_4_0=ruleEnumTypeLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumTypeDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"literal",
                            		lv_literal_4_0, 
                            		"EnumTypeLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumTypeDeclaration"


    // $ANTLR start "entryRuleEnumTypeLiteral"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1490:1: entryRuleEnumTypeLiteral returns [EObject current=null] : iv_ruleEnumTypeLiteral= ruleEnumTypeLiteral EOF ;
    public final EObject entryRuleEnumTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeLiteral = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1491:2: (iv_ruleEnumTypeLiteral= ruleEnumTypeLiteral EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1492:2: iv_ruleEnumTypeLiteral= ruleEnumTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumTypeLiteral_in_entryRuleEnumTypeLiteral3249);
            iv_ruleEnumTypeLiteral=ruleEnumTypeLiteral();

            state._fsp--;

             current =iv_ruleEnumTypeLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumTypeLiteral3259); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumTypeLiteral"


    // $ANTLR start "ruleEnumTypeLiteral"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1499:1: ruleEnumTypeLiteral returns [EObject current=null] : (otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleEnumTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1502:28: ( (otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1503:1: (otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1503:1: (otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1503:3: otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleEnumTypeLiteral3296); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumTypeLiteralAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1507:1: ( (lv_members_1_0= ruleEnumMember ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1508:1: (lv_members_1_0= ruleEnumMember )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1508:1: (lv_members_1_0= ruleEnumMember )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1509:3: lv_members_1_0= ruleEnumMember
            {
             
            	        newCompositeNode(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEnumMember_in_ruleEnumTypeLiteral3317);
            lv_members_1_0=ruleEnumMember();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumTypeLiteralRule());
            	        }
                   		add(
                   			current, 
                   			"members",
                    		lv_members_1_0, 
                    		"EnumMember");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1525:2: (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==18) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1525:4: otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleEnumTypeLiteral3330); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEnumTypeLiteralAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1529:1: ( (lv_members_3_0= ruleEnumMember ) )
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1530:1: (lv_members_3_0= ruleEnumMember )
            	    {
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1530:1: (lv_members_3_0= ruleEnumMember )
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1531:3: lv_members_3_0= ruleEnumMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumMember_in_ruleEnumTypeLiteral3351);
            	    lv_members_3_0=ruleEnumMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumTypeLiteralRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_3_0, 
            	            		"EnumMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleEnumTypeLiteral3365); 

                	newLeafNode(otherlv_4, grammarAccess.getEnumTypeLiteralAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumTypeLiteral"


    // $ANTLR start "entryRuleEnumMember"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1559:1: entryRuleEnumMember returns [EObject current=null] : iv_ruleEnumMember= ruleEnumMember EOF ;
    public final EObject entryRuleEnumMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMember = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1560:2: (iv_ruleEnumMember= ruleEnumMember EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1561:2: iv_ruleEnumMember= ruleEnumMember EOF
            {
             newCompositeNode(grammarAccess.getEnumMemberRule()); 
            pushFollow(FOLLOW_ruleEnumMember_in_entryRuleEnumMember3401);
            iv_ruleEnumMember=ruleEnumMember();

            state._fsp--;

             current =iv_ruleEnumMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMember3411); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumMember"


    // $ANTLR start "ruleEnumMember"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1568:1: ruleEnumMember returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_NUMBER ) ) )? ) ;
    public final EObject ruleEnumMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_assignment_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1571:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_NUMBER ) ) )? ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1572:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_NUMBER ) ) )? )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1572:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_NUMBER ) ) )? )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1572:2: ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_NUMBER ) ) )?
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1572:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1573:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1573:1: (lv_name_0_0= RULE_ID )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1574:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumMember3453); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEnumMemberAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumMemberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1590:2: ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_NUMBER ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1590:3: ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_NUMBER ) )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1590:3: ( (lv_assignment_1_0= '=' ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1591:1: (lv_assignment_1_0= '=' )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1591:1: (lv_assignment_1_0= '=' )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1592:3: lv_assignment_1_0= '='
                    {
                    lv_assignment_1_0=(Token)match(input,26,FOLLOW_26_in_ruleEnumMember3477); 

                            newLeafNode(lv_assignment_1_0, grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumMemberRule());
                    	        }
                           		setWithLastConsumed(current, "assignment", true, "=");
                    	    

                    }


                    }

                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1605:2: ( (lv_value_2_0= RULE_NUMBER ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1606:1: (lv_value_2_0= RULE_NUMBER )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1606:1: (lv_value_2_0= RULE_NUMBER )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1607:3: lv_value_2_0= RULE_NUMBER
                    {
                    lv_value_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleEnumMember3507); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getEnumMemberAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumMemberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"NUMBER");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumMember"


    // $ANTLR start "entryRuleComplexTypeLiteral"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1631:1: entryRuleComplexTypeLiteral returns [EObject current=null] : iv_ruleComplexTypeLiteral= ruleComplexTypeLiteral EOF ;
    public final EObject entryRuleComplexTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexTypeLiteral = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1632:2: (iv_ruleComplexTypeLiteral= ruleComplexTypeLiteral EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1633:2: iv_ruleComplexTypeLiteral= ruleComplexTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getComplexTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_entryRuleComplexTypeLiteral3550);
            iv_ruleComplexTypeLiteral=ruleComplexTypeLiteral();

            state._fsp--;

             current =iv_ruleComplexTypeLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeLiteral3560); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexTypeLiteral"


    // $ANTLR start "ruleComplexTypeLiteral"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1640:1: ruleComplexTypeLiteral returns [EObject current=null] : (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleComplexTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1643:28: ( (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1644:1: (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1644:1: (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1644:3: otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleComplexTypeLiteral3597); 

                	newLeafNode(otherlv_0, grammarAccess.getComplexTypeLiteralAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1648:1: ( (lv_members_1_0= ruleMember ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1649:1: (lv_members_1_0= ruleMember )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1649:1: (lv_members_1_0= ruleMember )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1650:3: lv_members_1_0= ruleMember
            {
             
            	        newCompositeNode(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMember_in_ruleComplexTypeLiteral3618);
            lv_members_1_0=ruleMember();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComplexTypeLiteralRule());
            	        }
                   		add(
                   			current, 
                   			"members",
                    		lv_members_1_0, 
                    		"Member");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1666:2: (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==18) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1666:4: otherlv_2= ',' ( (lv_members_3_0= ruleMember ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleComplexTypeLiteral3631); 

            	        	newLeafNode(otherlv_2, grammarAccess.getComplexTypeLiteralAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1670:1: ( (lv_members_3_0= ruleMember ) )
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1671:1: (lv_members_3_0= ruleMember )
            	    {
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1671:1: (lv_members_3_0= ruleMember )
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1672:3: lv_members_3_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleComplexTypeLiteral3652);
            	    lv_members_3_0=ruleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComplexTypeLiteralRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_3_0, 
            	            		"Member");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleComplexTypeLiteral3666); 

                	newLeafNode(otherlv_4, grammarAccess.getComplexTypeLiteralAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexTypeLiteral"


    // $ANTLR start "entryRuleIntrinsicType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1700:1: entryRuleIntrinsicType returns [EObject current=null] : iv_ruleIntrinsicType= ruleIntrinsicType EOF ;
    public final EObject entryRuleIntrinsicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntrinsicType = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1701:2: (iv_ruleIntrinsicType= ruleIntrinsicType EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1702:2: iv_ruleIntrinsicType= ruleIntrinsicType EOF
            {
             newCompositeNode(grammarAccess.getIntrinsicTypeRule()); 
            pushFollow(FOLLOW_ruleIntrinsicType_in_entryRuleIntrinsicType3702);
            iv_ruleIntrinsicType=ruleIntrinsicType();

            state._fsp--;

             current =iv_ruleIntrinsicType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntrinsicType3712); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntrinsicType"


    // $ANTLR start "ruleIntrinsicType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1709:1: ruleIntrinsicType returns [EObject current=null] : (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType ) ;
    public final EObject ruleIntrinsicType() throws RecognitionException {
        EObject current = null;

        EObject this_StringType_0 = null;

        EObject this_BooleanType_1 = null;

        EObject this_NumericType_2 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1712:28: ( (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1713:1: (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1713:1: (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt32=1;
                }
                break;
            case 32:
                {
                alt32=2;
                }
                break;
            case 33:
            case 34:
            case 35:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1714:5: this_StringType_0= ruleStringType
                    {
                     
                            newCompositeNode(grammarAccess.getIntrinsicTypeAccess().getStringTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_ruleIntrinsicType3759);
                    this_StringType_0=ruleStringType();

                    state._fsp--;

                     
                            current = this_StringType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1724:5: this_BooleanType_1= ruleBooleanType
                    {
                     
                            newCompositeNode(grammarAccess.getIntrinsicTypeAccess().getBooleanTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanType_in_ruleIntrinsicType3786);
                    this_BooleanType_1=ruleBooleanType();

                    state._fsp--;

                     
                            current = this_BooleanType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1734:5: this_NumericType_2= ruleNumericType
                    {
                     
                            newCompositeNode(grammarAccess.getIntrinsicTypeAccess().getNumericTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumericType_in_ruleIntrinsicType3813);
                    this_NumericType_2=ruleNumericType();

                    state._fsp--;

                     
                            current = this_NumericType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntrinsicType"


    // $ANTLR start "entryRuleStringType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1750:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1751:2: (iv_ruleStringType= ruleStringType EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1752:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType3848);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType3858); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1759:1: ruleStringType returns [EObject current=null] : ( (lv_id_0_0= 'string' ) ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1762:28: ( ( (lv_id_0_0= 'string' ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1763:1: ( (lv_id_0_0= 'string' ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1763:1: ( (lv_id_0_0= 'string' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1764:1: (lv_id_0_0= 'string' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1764:1: (lv_id_0_0= 'string' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1765:3: lv_id_0_0= 'string'
            {
            lv_id_0_0=(Token)match(input,31,FOLLOW_31_in_ruleStringType3900); 

                    newLeafNode(lv_id_0_0, grammarAccess.getStringTypeAccess().getIdStringKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringTypeRule());
            	        }
                   		setWithLastConsumed(current, "id", lv_id_0_0, "string");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleBooleanType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1786:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1787:2: (iv_ruleBooleanType= ruleBooleanType EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1788:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType3948);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType3958); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1795:1: ruleBooleanType returns [EObject current=null] : ( (lv_id_0_0= 'boolean' ) ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1798:28: ( ( (lv_id_0_0= 'boolean' ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1799:1: ( (lv_id_0_0= 'boolean' ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1799:1: ( (lv_id_0_0= 'boolean' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1800:1: (lv_id_0_0= 'boolean' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1800:1: (lv_id_0_0= 'boolean' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1801:3: lv_id_0_0= 'boolean'
            {
            lv_id_0_0=(Token)match(input,32,FOLLOW_32_in_ruleBooleanType4000); 

                    newLeafNode(lv_id_0_0, grammarAccess.getBooleanTypeAccess().getIdBooleanKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanTypeRule());
            	        }
                   		setWithLastConsumed(current, "id", lv_id_0_0, "boolean");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleNumericType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1822:1: entryRuleNumericType returns [EObject current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final EObject entryRuleNumericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericType = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1823:2: (iv_ruleNumericType= ruleNumericType EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1824:2: iv_ruleNumericType= ruleNumericType EOF
            {
             newCompositeNode(grammarAccess.getNumericTypeRule()); 
            pushFollow(FOLLOW_ruleNumericType_in_entryRuleNumericType4048);
            iv_ruleNumericType=ruleNumericType();

            state._fsp--;

             current =iv_ruleNumericType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericType4058); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericType"


    // $ANTLR start "ruleNumericType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1831:1: ruleNumericType returns [EObject current=null] : (this_IntegerType_0= ruleIntegerType | this_LongType_1= ruleLongType | this_DoubleType_2= ruleDoubleType ) ;
    public final EObject ruleNumericType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerType_0 = null;

        EObject this_LongType_1 = null;

        EObject this_DoubleType_2 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1834:28: ( (this_IntegerType_0= ruleIntegerType | this_LongType_1= ruleLongType | this_DoubleType_2= ruleDoubleType ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1835:1: (this_IntegerType_0= ruleIntegerType | this_LongType_1= ruleLongType | this_DoubleType_2= ruleDoubleType )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1835:1: (this_IntegerType_0= ruleIntegerType | this_LongType_1= ruleLongType | this_DoubleType_2= ruleDoubleType )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt33=1;
                }
                break;
            case 34:
                {
                alt33=2;
                }
                break;
            case 35:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1836:5: this_IntegerType_0= ruleIntegerType
                    {
                     
                            newCompositeNode(grammarAccess.getNumericTypeAccess().getIntegerTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntegerType_in_ruleNumericType4105);
                    this_IntegerType_0=ruleIntegerType();

                    state._fsp--;

                     
                            current = this_IntegerType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1846:5: this_LongType_1= ruleLongType
                    {
                     
                            newCompositeNode(grammarAccess.getNumericTypeAccess().getLongTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLongType_in_ruleNumericType4132);
                    this_LongType_1=ruleLongType();

                    state._fsp--;

                     
                            current = this_LongType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1856:5: this_DoubleType_2= ruleDoubleType
                    {
                     
                            newCompositeNode(grammarAccess.getNumericTypeAccess().getDoubleTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDoubleType_in_ruleNumericType4159);
                    this_DoubleType_2=ruleDoubleType();

                    state._fsp--;

                     
                            current = this_DoubleType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericType"


    // $ANTLR start "entryRuleIntegerType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1872:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1873:2: (iv_ruleIntegerType= ruleIntegerType EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1874:2: iv_ruleIntegerType= ruleIntegerType EOF
            {
             newCompositeNode(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_ruleIntegerType_in_entryRuleIntegerType4194);
            iv_ruleIntegerType=ruleIntegerType();

            state._fsp--;

             current =iv_ruleIntegerType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerType4204); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1881:1: ruleIntegerType returns [EObject current=null] : ( (lv_id_0_0= 'int' ) ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1884:28: ( ( (lv_id_0_0= 'int' ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1885:1: ( (lv_id_0_0= 'int' ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1885:1: ( (lv_id_0_0= 'int' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1886:1: (lv_id_0_0= 'int' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1886:1: (lv_id_0_0= 'int' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1887:3: lv_id_0_0= 'int'
            {
            lv_id_0_0=(Token)match(input,33,FOLLOW_33_in_ruleIntegerType4246); 

                    newLeafNode(lv_id_0_0, grammarAccess.getIntegerTypeAccess().getIdIntKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerTypeRule());
            	        }
                   		setWithLastConsumed(current, "id", lv_id_0_0, "int");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleLongType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1908:1: entryRuleLongType returns [EObject current=null] : iv_ruleLongType= ruleLongType EOF ;
    public final EObject entryRuleLongType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongType = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1909:2: (iv_ruleLongType= ruleLongType EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1910:2: iv_ruleLongType= ruleLongType EOF
            {
             newCompositeNode(grammarAccess.getLongTypeRule()); 
            pushFollow(FOLLOW_ruleLongType_in_entryRuleLongType4294);
            iv_ruleLongType=ruleLongType();

            state._fsp--;

             current =iv_ruleLongType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongType4304); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLongType"


    // $ANTLR start "ruleLongType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1917:1: ruleLongType returns [EObject current=null] : ( (lv_id_0_0= 'long' ) ) ;
    public final EObject ruleLongType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1920:28: ( ( (lv_id_0_0= 'long' ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1921:1: ( (lv_id_0_0= 'long' ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1921:1: ( (lv_id_0_0= 'long' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1922:1: (lv_id_0_0= 'long' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1922:1: (lv_id_0_0= 'long' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1923:3: lv_id_0_0= 'long'
            {
            lv_id_0_0=(Token)match(input,34,FOLLOW_34_in_ruleLongType4346); 

                    newLeafNode(lv_id_0_0, grammarAccess.getLongTypeAccess().getIdLongKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLongTypeRule());
            	        }
                   		setWithLastConsumed(current, "id", lv_id_0_0, "long");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLongType"


    // $ANTLR start "entryRuleDoubleType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1944:1: entryRuleDoubleType returns [EObject current=null] : iv_ruleDoubleType= ruleDoubleType EOF ;
    public final EObject entryRuleDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleType = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1945:2: (iv_ruleDoubleType= ruleDoubleType EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1946:2: iv_ruleDoubleType= ruleDoubleType EOF
            {
             newCompositeNode(grammarAccess.getDoubleTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleType_in_entryRuleDoubleType4394);
            iv_ruleDoubleType=ruleDoubleType();

            state._fsp--;

             current =iv_ruleDoubleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleType4404); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoubleType"


    // $ANTLR start "ruleDoubleType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1953:1: ruleDoubleType returns [EObject current=null] : ( (lv_id_0_0= 'double' ) ) ;
    public final EObject ruleDoubleType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1956:28: ( ( (lv_id_0_0= 'double' ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1957:1: ( (lv_id_0_0= 'double' ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1957:1: ( (lv_id_0_0= 'double' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1958:1: (lv_id_0_0= 'double' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1958:1: (lv_id_0_0= 'double' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1959:3: lv_id_0_0= 'double'
            {
            lv_id_0_0=(Token)match(input,35,FOLLOW_35_in_ruleDoubleType4446); 

                    newLeafNode(lv_id_0_0, grammarAccess.getDoubleTypeAccess().getIdDoubleKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDoubleTypeRule());
            	        }
                   		setWithLastConsumed(current, "id", lv_id_0_0, "double");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoubleType"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1980:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1981:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1982:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4495);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName4506); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1989:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1992:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1993:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1993:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1993:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4546); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2000:1: (kw= '.' this_ID_2= RULE_ID )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==36) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2001:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,36,FOLLOW_36_in_ruleQualifiedName4565); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4580); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleSignedNumber"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2021:1: entryRuleSignedNumber returns [String current=null] : iv_ruleSignedNumber= ruleSignedNumber EOF ;
    public final String entryRuleSignedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedNumber = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2022:2: (iv_ruleSignedNumber= ruleSignedNumber EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2023:2: iv_ruleSignedNumber= ruleSignedNumber EOF
            {
             newCompositeNode(grammarAccess.getSignedNumberRule()); 
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber4628);
            iv_ruleSignedNumber=ruleSignedNumber();

            state._fsp--;

             current =iv_ruleSignedNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber4639); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedNumber"


    // $ANTLR start "ruleSignedNumber"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2030:1: ruleSignedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleSignedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2033:28: ( ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2034:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2034:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2034:2: (kw= '-' )? this_NUMBER_1= RULE_NUMBER
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2034:2: (kw= '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==20) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2035:2: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleSignedNumber4678); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSignedNumber4695); 

            		current.merge(this_NUMBER_1);
                
             
                newLeafNode(this_NUMBER_1, grammarAccess.getSignedNumberAccess().getNUMBERTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedNumber"


    // $ANTLR start "ruleHttpMethodType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2055:1: ruleHttpMethodType returns [Enumerator current=null] : ( (enumLiteral_0= 'get' ) | (enumLiteral_1= 'put' ) | (enumLiteral_2= 'post' ) | (enumLiteral_3= 'delete' ) | (enumLiteral_4= 'patch' ) ) ;
    public final Enumerator ruleHttpMethodType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2057:28: ( ( (enumLiteral_0= 'get' ) | (enumLiteral_1= 'put' ) | (enumLiteral_2= 'post' ) | (enumLiteral_3= 'delete' ) | (enumLiteral_4= 'patch' ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2058:1: ( (enumLiteral_0= 'get' ) | (enumLiteral_1= 'put' ) | (enumLiteral_2= 'post' ) | (enumLiteral_3= 'delete' ) | (enumLiteral_4= 'patch' ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2058:1: ( (enumLiteral_0= 'get' ) | (enumLiteral_1= 'put' ) | (enumLiteral_2= 'post' ) | (enumLiteral_3= 'delete' ) | (enumLiteral_4= 'patch' ) )
            int alt36=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt36=1;
                }
                break;
            case 38:
                {
                alt36=2;
                }
                break;
            case 39:
                {
                alt36=3;
                }
                break;
            case 40:
                {
                alt36=4;
                }
                break;
            case 41:
                {
                alt36=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2058:2: (enumLiteral_0= 'get' )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2058:2: (enumLiteral_0= 'get' )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2058:4: enumLiteral_0= 'get'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_37_in_ruleHttpMethodType4754); 

                            current = grammarAccess.getHttpMethodTypeAccess().getGetEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getHttpMethodTypeAccess().getGetEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2064:6: (enumLiteral_1= 'put' )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2064:6: (enumLiteral_1= 'put' )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2064:8: enumLiteral_1= 'put'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_38_in_ruleHttpMethodType4771); 

                            current = grammarAccess.getHttpMethodTypeAccess().getPutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getHttpMethodTypeAccess().getPutEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2070:6: (enumLiteral_2= 'post' )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2070:6: (enumLiteral_2= 'post' )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2070:8: enumLiteral_2= 'post'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_39_in_ruleHttpMethodType4788); 

                            current = grammarAccess.getHttpMethodTypeAccess().getPostEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getHttpMethodTypeAccess().getPostEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2076:6: (enumLiteral_3= 'delete' )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2076:6: (enumLiteral_3= 'delete' )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2076:8: enumLiteral_3= 'delete'
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_40_in_ruleHttpMethodType4805); 

                            current = grammarAccess.getHttpMethodTypeAccess().getDeleteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getHttpMethodTypeAccess().getDeleteEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2082:6: (enumLiteral_4= 'patch' )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2082:6: (enumLiteral_4= 'patch' )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2082:8: enumLiteral_4= 'patch'
                    {
                    enumLiteral_4=(Token)match(input,41,FOLLOW_41_in_ruleHttpMethodType4822); 

                            current = grammarAccess.getHttpMethodTypeAccess().getPatchEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getHttpMethodTypeAccess().getPatchEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHttpMethodType"


    // $ANTLR start "ruleBooleanValue"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2092:1: ruleBooleanValue returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2094:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2095:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2095:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==42) ) {
                alt37=1;
            }
            else if ( (LA37_0==43) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2095:2: (enumLiteral_0= 'true' )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2095:2: (enumLiteral_0= 'true' )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2095:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_42_in_ruleBooleanValue4867); 

                            current = grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2101:6: (enumLiteral_1= 'false' )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2101:6: (enumLiteral_1= 'false' )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2101:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_43_in_ruleBooleanValue4884); 

                            current = grammarAccess.getBooleanValueAccess().getFalseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBooleanValueAccess().getFalseEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanValue"

    // Delegated rules


    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA23_eotS =
        "\12\uffff";
    static final String DFA23_eofS =
        "\1\uffff\1\10\5\11\3\uffff";
    static final String DFA23_minS =
        "\1\4\6\17\3\uffff";
    static final String DFA23_maxS =
        "\1\43\6\51\3\uffff";
    static final String DFA23_acceptS =
        "\7\uffff\1\3\1\1\1\2";
    static final String DFA23_specialS =
        "\12\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1\32\uffff\1\2\1\3\1\4\1\5\1\6",
            "\5\10\1\uffff\3\10\2\uffff\1\10\1\7\11\uffff\5\10",
            "\5\11\1\uffff\3\11\2\uffff\1\11\1\7\11\uffff\5\11",
            "\5\11\1\uffff\3\11\2\uffff\1\11\1\7\11\uffff\5\11",
            "\5\11\1\uffff\3\11\2\uffff\1\11\1\7\11\uffff\5\11",
            "\5\11\1\uffff\3\11\2\uffff\1\11\1\7\11\uffff\5\11",
            "\5\11\1\uffff\3\11\2\uffff\1\11\1\7\11\uffff\5\11",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1141:1: (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_ArrayType_2= ruleArrayType )";
        }
    }
 

    public static final BitSet FOLLOW_ruleSpecApiDocument_in_entryRuleSpecApiDocument75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecApiDocument85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSpecApiDocument122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSpecApiDocument143 = new BitSet(new long[]{0x0000000030004002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleSpecApiDocument164 = new BitSet(new long[]{0x0000000030004002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeDeclaration_in_ruleDeclaration258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApi_in_ruleDeclaration285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApi_in_entryRuleApi320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApi330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleApi367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApi384 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_RULE_URL_in_ruleApi406 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleApi424 = new BitSet(new long[]{0x000003E000230000L});
    public static final BitSet FOLLOW_ruleServiceBlock_in_ruleApi445 = new BitSet(new long[]{0x000003E000230000L});
    public static final BitSet FOLLOW_16_in_ruleApi458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceBlock_in_entryRuleServiceBlock494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceBlock504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderBlock_in_ruleServiceBlock551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_ruleServiceBlock578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_ruleServiceBlock605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderBlock_in_entryRuleHeaderBlock640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderBlock650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleHeaderBlock696 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleMember_in_ruleHeaderBlock717 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleHeaderBlock730 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleMember_in_ruleHeaderBlock751 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_entryRuleHttpMethod789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpMethod799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethodType_in_ruleHttpMethod845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHttpMethod862 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_rulePath_in_ruleHttpMethod888 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleHttpMethod901 = new BitSet(new long[]{0x0000000000E30000L});
    public static final BitSet FOLLOW_ruleHttpMethodBlock_in_ruleHttpMethod922 = new BitSet(new long[]{0x0000000000E30000L});
    public static final BitSet FOLLOW_16_in_ruleHttpMethod935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethodBlock_in_entryRuleHttpMethodBlock971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpMethodBlock981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderBlock_in_ruleHttpMethodBlock1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_ruleHttpMethodBlock1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestBlock_in_ruleHttpMethodBlock1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_ruleHttpMethodBlock1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath1144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePath1200 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleArbitraryPathSegment_in_rulePath1217 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleMember_in_rulePath1243 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_rulePath1257 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleArbitraryPathSegment_in_rulePath1274 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleMember_in_rulePath1300 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleArbitraryPathSegment_in_entryRuleArbitraryPathSegment1340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArbitraryPathSegment1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleArbitraryPathSegment1398 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleArbitraryPathSegment1417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleArbitraryPathSegment1439 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_entryRuleParamsBlock1486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamsBlock1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleParamsBlock1542 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleMember_in_ruleParamsBlock1563 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleParamsBlock1576 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleMember_in_ruleParamsBlock1597 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleLiteral1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_ruleLiteral1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestBlock_in_entryRuleRequestBlock1815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequestBlock1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleRequestBlock1862 = new BitSet(new long[]{0x0000000F80008010L});
    public static final BitSet FOLLOW_ruleBlockType_in_ruleRequestBlock1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_entryRuleResponseBlock1919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResponseBlock1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleResponseBlock1975 = new BitSet(new long[]{0x0000000F810080D2L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleResponseBlock1992 = new BitSet(new long[]{0x0000000F81008052L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResponseBlock2015 = new BitSet(new long[]{0x0000000F81008012L});
    public static final BitSet FOLLOW_24_in_ruleResponseBlock2034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResponseBlock2054 = new BitSet(new long[]{0x0000000F80008012L});
    public static final BitSet FOLLOW_ruleBlockType_in_ruleResponseBlock2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_entryRuleBlockType2114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockType2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleBlockType2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_ruleBlockType2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember2233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMember2287 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMember2307 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMember2327 = new BitSet(new long[]{0x0000000F80000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleMember2348 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleMember2361 = new BitSet(new long[]{0x00000C0000100140L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleMember2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_ruleType2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_ruleType2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_ruleType2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType2566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_ruleArrayType2624 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_ruleArrayType2643 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleArrayType2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_entryRuleUserType2713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserType2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUserType2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeDeclaration_in_entryRuleUserTypeDeclaration2802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserTypeDeclaration2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeDeclaration_in_ruleUserTypeDeclaration2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeDeclaration_in_ruleUserTypeDeclaration2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeDeclaration_in_entryRuleComplexTypeDeclaration2921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeDeclaration2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleComplexTypeDeclaration2974 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexTypeDeclaration3004 = new BitSet(new long[]{0x0000000F80008012L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_ruleComplexTypeDeclaration3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeDeclaration_in_entryRuleEnumTypeDeclaration3067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeDeclaration3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleEnumTypeDeclaration3120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumTypeDeclaration3150 = new BitSet(new long[]{0x0000000040008002L});
    public static final BitSet FOLLOW_30_in_ruleEnumTypeDeclaration3168 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleIntegerType_in_ruleEnumTypeDeclaration3189 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleEnumTypeLiteral_in_ruleEnumTypeDeclaration3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeLiteral_in_entryRuleEnumTypeLiteral3249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeLiteral3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEnumTypeLiteral3296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumTypeLiteral3317 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_18_in_ruleEnumTypeLiteral3330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumTypeLiteral3351 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_16_in_ruleEnumTypeLiteral3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember3401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumMember3453 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleEnumMember3477 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleEnumMember3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_entryRuleComplexTypeLiteral3550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeLiteral3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleComplexTypeLiteral3597 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleMember_in_ruleComplexTypeLiteral3618 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_18_in_ruleComplexTypeLiteral3631 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleMember_in_ruleComplexTypeLiteral3652 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_16_in_ruleComplexTypeLiteral3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_entryRuleIntrinsicType3702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntrinsicType3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleIntrinsicType3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleIntrinsicType3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_ruleIntrinsicType3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType3848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleStringType3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType3948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBooleanType4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_entryRuleNumericType4048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericType4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_ruleNumericType4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_ruleNumericType4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_ruleNumericType4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_entryRuleIntegerType4194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerType4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleIntegerType4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_entryRuleLongType4294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongType4304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleLongType4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_entryRuleDoubleType4394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleType4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleDoubleType4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4546 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleQualifiedName4565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4580 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber4628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSignedNumber4678 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSignedNumber4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleHttpMethodType4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleHttpMethodType4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleHttpMethodType4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleHttpMethodType4805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleHttpMethodType4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleBooleanValue4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleBooleanValue4884 = new BitSet(new long[]{0x0000000000000002L});

}