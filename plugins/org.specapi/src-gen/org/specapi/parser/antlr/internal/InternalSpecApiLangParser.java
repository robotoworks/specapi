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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'api'", "'{'", "'}'", "'headers'", "','", "':'", "'/'", "'-'", "'params'", "'='", "'body'", "'response'", "'extends'", "'[]'", "'entity'", "'nogen'", "'enum'", "'string'", "'boolean'", "'int'", "'long'", "'double'", "'.'", "'get'", "'put'", "'post'", "'delete'", "'true'", "'false'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int RULE_NUMBER=6;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_WS=9;

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
        	return "Model";	
       	}
       	
       	@Override
       	protected SpecApiLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:77:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
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
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:85:1: ( (lv_packageName_1_0= ruleQualifiedName ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:86:1: (lv_packageName_1_0= ruleQualifiedName )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:86:1: (lv_packageName_1_0= ruleQualifiedName )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:87:3: lv_packageName_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleModel143);
            lv_packageName_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
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

                if ( (LA1_0==12||LA1_0==26||LA1_0==28) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:104:1: (lv_declarations_2_0= ruleDeclaration )
            	    {
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:104:1: (lv_declarations_2_0= ruleDeclaration )
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:105:3: lv_declarations_2_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleModel164);
            	    lv_declarations_2_0=ruleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
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
    // $ANTLR end "ruleModel"


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

            if ( (LA2_0==26||LA2_0==28) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:178:1: ruleApi returns [EObject current=null] : (otherlv_0= 'api' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleServiceBlock ) )* otherlv_5= '}' ) ;
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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:181:28: ( (otherlv_0= 'api' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleServiceBlock ) )* otherlv_5= '}' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:182:1: (otherlv_0= 'api' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleServiceBlock ) )* otherlv_5= '}' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:182:1: (otherlv_0= 'api' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleServiceBlock ) )* otherlv_5= '}' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:182:3: otherlv_0= 'api' ( (lv_name_1_0= RULE_ID ) ) ( (lv_baseUrl_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleServiceBlock ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleApi367); 

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

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:204:2: ( (lv_baseUrl_2_0= RULE_STRING ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:205:1: (lv_baseUrl_2_0= RULE_STRING )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:205:1: (lv_baseUrl_2_0= RULE_STRING )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:206:3: lv_baseUrl_2_0= RULE_STRING
                    {
                    lv_baseUrl_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleApi406); 

                    			newLeafNode(lv_baseUrl_2_0, grammarAccess.getApiAccess().getBaseUrlSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getApiRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"baseUrl",
                            		lv_baseUrl_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleApi424); 

                	newLeafNode(otherlv_3, grammarAccess.getApiAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:226:1: ( (lv_blocks_4_0= ruleServiceBlock ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15||LA4_0==20||(LA4_0>=35 && LA4_0<=38)) ) {
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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleApi458); 

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
            case 15:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 35:
            case 36:
            case 37:
            case 38:
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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:315:1: ruleHeaderBlock returns [EObject current=null] : (otherlv_0= 'headers' ( (lv_headers_1_0= ruleHeader ) ) (otherlv_2= ',' ( (lv_headers_3_0= ruleHeader ) ) )* ) ;
    public final EObject ruleHeaderBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_headers_1_0 = null;

        EObject lv_headers_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:318:28: ( (otherlv_0= 'headers' ( (lv_headers_1_0= ruleHeader ) ) (otherlv_2= ',' ( (lv_headers_3_0= ruleHeader ) ) )* ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:319:1: (otherlv_0= 'headers' ( (lv_headers_1_0= ruleHeader ) ) (otherlv_2= ',' ( (lv_headers_3_0= ruleHeader ) ) )* )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:319:1: (otherlv_0= 'headers' ( (lv_headers_1_0= ruleHeader ) ) (otherlv_2= ',' ( (lv_headers_3_0= ruleHeader ) ) )* )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:319:3: otherlv_0= 'headers' ( (lv_headers_1_0= ruleHeader ) ) (otherlv_2= ',' ( (lv_headers_3_0= ruleHeader ) ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleHeaderBlock687); 

                	newLeafNode(otherlv_0, grammarAccess.getHeaderBlockAccess().getHeadersKeyword_0());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:323:1: ( (lv_headers_1_0= ruleHeader ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:324:1: (lv_headers_1_0= ruleHeader )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:324:1: (lv_headers_1_0= ruleHeader )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:325:3: lv_headers_1_0= ruleHeader
            {
             
            	        newCompositeNode(grammarAccess.getHeaderBlockAccess().getHeadersHeaderParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleHeader_in_ruleHeaderBlock708);
            lv_headers_1_0=ruleHeader();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHeaderBlockRule());
            	        }
                   		add(
                   			current, 
                   			"headers",
                    		lv_headers_1_0, 
                    		"Header");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:341:2: (otherlv_2= ',' ( (lv_headers_3_0= ruleHeader ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:341:4: otherlv_2= ',' ( (lv_headers_3_0= ruleHeader ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleHeaderBlock721); 

            	        	newLeafNode(otherlv_2, grammarAccess.getHeaderBlockAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:345:1: ( (lv_headers_3_0= ruleHeader ) )
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:346:1: (lv_headers_3_0= ruleHeader )
            	    {
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:346:1: (lv_headers_3_0= ruleHeader )
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:347:3: lv_headers_3_0= ruleHeader
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHeaderBlockAccess().getHeadersHeaderParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeader_in_ruleHeaderBlock742);
            	    lv_headers_3_0=ruleHeader();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHeaderBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"headers",
            	            		lv_headers_3_0, 
            	            		"Header");
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


    // $ANTLR start "entryRuleHeader"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:371:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:372:2: (iv_ruleHeader= ruleHeader EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:373:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_ruleHeader_in_entryRuleHeader780);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeader790); 

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
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:380:1: ruleHeader returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:383:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:384:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:384:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:384:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:384:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:385:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:385:1: (lv_name_0_0= RULE_STRING )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:386:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHeader832); 

            			newLeafNode(lv_name_0_0, grammarAccess.getHeaderAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeaderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleHeader849); 

                	newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getColonKeyword_1());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:406:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:407:1: (lv_value_2_0= RULE_STRING )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:407:1: (lv_value_2_0= RULE_STRING )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:408:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHeader866); 

            			newLeafNode(lv_value_2_0, grammarAccess.getHeaderAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeaderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleHttpMethod"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:432:1: entryRuleHttpMethod returns [EObject current=null] : iv_ruleHttpMethod= ruleHttpMethod EOF ;
    public final EObject entryRuleHttpMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpMethod = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:433:2: (iv_ruleHttpMethod= ruleHttpMethod EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:434:2: iv_ruleHttpMethod= ruleHttpMethod EOF
            {
             newCompositeNode(grammarAccess.getHttpMethodRule()); 
            pushFollow(FOLLOW_ruleHttpMethod_in_entryRuleHttpMethod907);
            iv_ruleHttpMethod=ruleHttpMethod();

            state._fsp--;

             current =iv_ruleHttpMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpMethod917); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:441:1: ruleHttpMethod returns [EObject current=null] : ( ( (lv_type_0_0= ruleHttpMethodType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= rulePath ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleHttpMethodBlock ) )* otherlv_5= '}' ) ;
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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:444:28: ( ( ( (lv_type_0_0= ruleHttpMethodType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= rulePath ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleHttpMethodBlock ) )* otherlv_5= '}' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:445:1: ( ( (lv_type_0_0= ruleHttpMethodType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= rulePath ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleHttpMethodBlock ) )* otherlv_5= '}' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:445:1: ( ( (lv_type_0_0= ruleHttpMethodType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= rulePath ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleHttpMethodBlock ) )* otherlv_5= '}' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:445:2: ( (lv_type_0_0= ruleHttpMethodType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_path_2_0= rulePath ) )? otherlv_3= '{' ( (lv_blocks_4_0= ruleHttpMethodBlock ) )* otherlv_5= '}'
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:445:2: ( (lv_type_0_0= ruleHttpMethodType ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:446:1: (lv_type_0_0= ruleHttpMethodType )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:446:1: (lv_type_0_0= ruleHttpMethodType )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:447:3: lv_type_0_0= ruleHttpMethodType
            {
             
            	        newCompositeNode(grammarAccess.getHttpMethodAccess().getTypeHttpMethodTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleHttpMethodType_in_ruleHttpMethod963);
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

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:463:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:464:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:464:1: (lv_name_1_0= RULE_ID )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:465:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHttpMethod980); 

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

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:481:2: ( (lv_path_2_0= rulePath ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:482:1: (lv_path_2_0= rulePath )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:482:1: (lv_path_2_0= rulePath )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:483:3: lv_path_2_0= rulePath
                    {
                     
                    	        newCompositeNode(grammarAccess.getHttpMethodAccess().getPathPathParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePath_in_ruleHttpMethod1006);
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleHttpMethod1019); 

                	newLeafNode(otherlv_3, grammarAccess.getHttpMethodAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:503:1: ( (lv_blocks_4_0= ruleHttpMethodBlock ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15||LA8_0==20||(LA8_0>=22 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:504:1: (lv_blocks_4_0= ruleHttpMethodBlock )
            	    {
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:504:1: (lv_blocks_4_0= ruleHttpMethodBlock )
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:505:3: lv_blocks_4_0= ruleHttpMethodBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHttpMethodAccess().getBlocksHttpMethodBlockParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHttpMethodBlock_in_ruleHttpMethod1040);
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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleHttpMethod1053); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:533:1: entryRuleHttpMethodBlock returns [EObject current=null] : iv_ruleHttpMethodBlock= ruleHttpMethodBlock EOF ;
    public final EObject entryRuleHttpMethodBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpMethodBlock = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:534:2: (iv_ruleHttpMethodBlock= ruleHttpMethodBlock EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:535:2: iv_ruleHttpMethodBlock= ruleHttpMethodBlock EOF
            {
             newCompositeNode(grammarAccess.getHttpMethodBlockRule()); 
            pushFollow(FOLLOW_ruleHttpMethodBlock_in_entryRuleHttpMethodBlock1089);
            iv_ruleHttpMethodBlock=ruleHttpMethodBlock();

            state._fsp--;

             current =iv_ruleHttpMethodBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpMethodBlock1099); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:542:1: ruleHttpMethodBlock returns [EObject current=null] : (this_HeaderBlock_0= ruleHeaderBlock | this_ParamsBlock_1= ruleParamsBlock | this_BodyBlock_2= ruleBodyBlock | this_ResponseBlock_3= ruleResponseBlock ) ;
    public final EObject ruleHttpMethodBlock() throws RecognitionException {
        EObject current = null;

        EObject this_HeaderBlock_0 = null;

        EObject this_ParamsBlock_1 = null;

        EObject this_BodyBlock_2 = null;

        EObject this_ResponseBlock_3 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:545:28: ( (this_HeaderBlock_0= ruleHeaderBlock | this_ParamsBlock_1= ruleParamsBlock | this_BodyBlock_2= ruleBodyBlock | this_ResponseBlock_3= ruleResponseBlock ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:546:1: (this_HeaderBlock_0= ruleHeaderBlock | this_ParamsBlock_1= ruleParamsBlock | this_BodyBlock_2= ruleBodyBlock | this_ResponseBlock_3= ruleResponseBlock )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:546:1: (this_HeaderBlock_0= ruleHeaderBlock | this_ParamsBlock_1= ruleParamsBlock | this_BodyBlock_2= ruleBodyBlock | this_ResponseBlock_3= ruleResponseBlock )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt9=1;
                }
                break;
            case 20:
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
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:547:5: this_HeaderBlock_0= ruleHeaderBlock
                    {
                     
                            newCompositeNode(grammarAccess.getHttpMethodBlockAccess().getHeaderBlockParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleHeaderBlock_in_ruleHttpMethodBlock1146);
                    this_HeaderBlock_0=ruleHeaderBlock();

                    state._fsp--;

                     
                            current = this_HeaderBlock_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:557:5: this_ParamsBlock_1= ruleParamsBlock
                    {
                     
                            newCompositeNode(grammarAccess.getHttpMethodBlockAccess().getParamsBlockParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParamsBlock_in_ruleHttpMethodBlock1173);
                    this_ParamsBlock_1=ruleParamsBlock();

                    state._fsp--;

                     
                            current = this_ParamsBlock_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:567:5: this_BodyBlock_2= ruleBodyBlock
                    {
                     
                            newCompositeNode(grammarAccess.getHttpMethodBlockAccess().getBodyBlockParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBodyBlock_in_ruleHttpMethodBlock1200);
                    this_BodyBlock_2=ruleBodyBlock();

                    state._fsp--;

                     
                            current = this_BodyBlock_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:577:5: this_ResponseBlock_3= ruleResponseBlock
                    {
                     
                            newCompositeNode(grammarAccess.getHttpMethodBlockAccess().getResponseBlockParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleResponseBlock_in_ruleHttpMethodBlock1227);
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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:593:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:594:2: (iv_rulePath= rulePath EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:595:2: iv_rulePath= rulePath EOF
            {
             newCompositeNode(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_rulePath_in_entryRulePath1262);
            iv_rulePath=rulePath();

            state._fsp--;

             current =iv_rulePath; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePath1272); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:602:1: rulePath returns [EObject current=null] : ( () otherlv_1= '/' ( ruleArbitraryPathSegment | ( (lv_params_3_0= ruleSimpleMemberAssignment ) ) ) (otherlv_4= '/' ( ruleArbitraryPathSegment | ( (lv_params_6_0= ruleSimpleMemberAssignment ) ) ) )* ) ;
    public final EObject rulePath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:605:28: ( ( () otherlv_1= '/' ( ruleArbitraryPathSegment | ( (lv_params_3_0= ruleSimpleMemberAssignment ) ) ) (otherlv_4= '/' ( ruleArbitraryPathSegment | ( (lv_params_6_0= ruleSimpleMemberAssignment ) ) ) )* ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:606:1: ( () otherlv_1= '/' ( ruleArbitraryPathSegment | ( (lv_params_3_0= ruleSimpleMemberAssignment ) ) ) (otherlv_4= '/' ( ruleArbitraryPathSegment | ( (lv_params_6_0= ruleSimpleMemberAssignment ) ) ) )* )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:606:1: ( () otherlv_1= '/' ( ruleArbitraryPathSegment | ( (lv_params_3_0= ruleSimpleMemberAssignment ) ) ) (otherlv_4= '/' ( ruleArbitraryPathSegment | ( (lv_params_6_0= ruleSimpleMemberAssignment ) ) ) )* )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:606:2: () otherlv_1= '/' ( ruleArbitraryPathSegment | ( (lv_params_3_0= ruleSimpleMemberAssignment ) ) ) (otherlv_4= '/' ( ruleArbitraryPathSegment | ( (lv_params_6_0= ruleSimpleMemberAssignment ) ) ) )*
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:606:2: ()
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:607:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPathAccess().getPathAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulePath1318); 

                	newLeafNode(otherlv_1, grammarAccess.getPathAccess().getSolidusKeyword_1());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:616:1: ( ruleArbitraryPathSegment | ( (lv_params_3_0= ruleSimpleMemberAssignment ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==EOF||LA10_1==13||(LA10_1>=18 && LA10_1<=19)||LA10_1==34) ) {
                    alt10=1;
                }
                else if ( (LA10_1==17) ) {
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
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:617:5: ruleArbitraryPathSegment
                    {
                     
                            newCompositeNode(grammarAccess.getPathAccess().getArbitraryPathSegmentParserRuleCall_2_0()); 
                        
                    pushFollow(FOLLOW_ruleArbitraryPathSegment_in_rulePath1335);
                    ruleArbitraryPathSegment();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:625:6: ( (lv_params_3_0= ruleSimpleMemberAssignment ) )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:625:6: ( (lv_params_3_0= ruleSimpleMemberAssignment ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:626:1: (lv_params_3_0= ruleSimpleMemberAssignment )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:626:1: (lv_params_3_0= ruleSimpleMemberAssignment )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:627:3: lv_params_3_0= ruleSimpleMemberAssignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getPathAccess().getParamsSimpleMemberAssignmentParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_rulePath1361);
                    lv_params_3_0=ruleSimpleMemberAssignment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPathRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"SimpleMemberAssignment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:643:3: (otherlv_4= '/' ( ruleArbitraryPathSegment | ( (lv_params_6_0= ruleSimpleMemberAssignment ) ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:643:5: otherlv_4= '/' ( ruleArbitraryPathSegment | ( (lv_params_6_0= ruleSimpleMemberAssignment ) ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_rulePath1375); 

            	        	newLeafNode(otherlv_4, grammarAccess.getPathAccess().getSolidusKeyword_3_0());
            	        
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:647:1: ( ruleArbitraryPathSegment | ( (lv_params_6_0= ruleSimpleMemberAssignment ) ) )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==RULE_ID) ) {
            	        int LA11_1 = input.LA(2);

            	        if ( (LA11_1==17) ) {
            	            alt11=2;
            	        }
            	        else if ( (LA11_1==EOF||LA11_1==13||(LA11_1>=18 && LA11_1<=19)||LA11_1==34) ) {
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
            	            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:648:5: ruleArbitraryPathSegment
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getPathAccess().getArbitraryPathSegmentParserRuleCall_3_1_0()); 
            	                
            	            pushFollow(FOLLOW_ruleArbitraryPathSegment_in_rulePath1392);
            	            ruleArbitraryPathSegment();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:656:6: ( (lv_params_6_0= ruleSimpleMemberAssignment ) )
            	            {
            	            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:656:6: ( (lv_params_6_0= ruleSimpleMemberAssignment ) )
            	            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:657:1: (lv_params_6_0= ruleSimpleMemberAssignment )
            	            {
            	            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:657:1: (lv_params_6_0= ruleSimpleMemberAssignment )
            	            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:658:3: lv_params_6_0= ruleSimpleMemberAssignment
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getPathAccess().getParamsSimpleMemberAssignmentParserRuleCall_3_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_rulePath1418);
            	            lv_params_6_0=ruleSimpleMemberAssignment();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getPathRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"params",
            	                    		lv_params_6_0, 
            	                    		"SimpleMemberAssignment");
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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:682:1: entryRuleArbitraryPathSegment returns [String current=null] : iv_ruleArbitraryPathSegment= ruleArbitraryPathSegment EOF ;
    public final String entryRuleArbitraryPathSegment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArbitraryPathSegment = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:683:2: (iv_ruleArbitraryPathSegment= ruleArbitraryPathSegment EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:684:2: iv_ruleArbitraryPathSegment= ruleArbitraryPathSegment EOF
            {
             newCompositeNode(grammarAccess.getArbitraryPathSegmentRule()); 
            pushFollow(FOLLOW_ruleArbitraryPathSegment_in_entryRuleArbitraryPathSegment1458);
            iv_ruleArbitraryPathSegment=ruleArbitraryPathSegment();

            state._fsp--;

             current =iv_ruleArbitraryPathSegment.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArbitraryPathSegment1469); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:691:1: ruleArbitraryPathSegment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '-' this_QualifiedName_2= ruleQualifiedName )* ) ;
    public final AntlrDatatypeRuleToken ruleArbitraryPathSegment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_QualifiedName_2 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:694:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '-' this_QualifiedName_2= ruleQualifiedName )* ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:695:1: (this_QualifiedName_0= ruleQualifiedName (kw= '-' this_QualifiedName_2= ruleQualifiedName )* )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:695:1: (this_QualifiedName_0= ruleQualifiedName (kw= '-' this_QualifiedName_2= ruleQualifiedName )* )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:696:5: this_QualifiedName_0= ruleQualifiedName (kw= '-' this_QualifiedName_2= ruleQualifiedName )*
            {
             
                    newCompositeNode(grammarAccess.getArbitraryPathSegmentAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleArbitraryPathSegment1516);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:706:1: (kw= '-' this_QualifiedName_2= ruleQualifiedName )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:707:2: kw= '-' this_QualifiedName_2= ruleQualifiedName
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleArbitraryPathSegment1535); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getArbitraryPathSegmentAccess().getHyphenMinusKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getArbitraryPathSegmentAccess().getQualifiedNameParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleArbitraryPathSegment1557);
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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:731:1: entryRuleParamsBlock returns [EObject current=null] : iv_ruleParamsBlock= ruleParamsBlock EOF ;
    public final EObject entryRuleParamsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamsBlock = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:732:2: (iv_ruleParamsBlock= ruleParamsBlock EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:733:2: iv_ruleParamsBlock= ruleParamsBlock EOF
            {
             newCompositeNode(grammarAccess.getParamsBlockRule()); 
            pushFollow(FOLLOW_ruleParamsBlock_in_entryRuleParamsBlock1604);
            iv_ruleParamsBlock=ruleParamsBlock();

            state._fsp--;

             current =iv_ruleParamsBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamsBlock1614); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:740:1: ruleParamsBlock returns [EObject current=null] : ( () otherlv_1= 'params' ( (lv_params_2_0= ruleSimpleMemberAssignment ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSimpleMemberAssignment ) ) )* ) ;
    public final EObject ruleParamsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:743:28: ( ( () otherlv_1= 'params' ( (lv_params_2_0= ruleSimpleMemberAssignment ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSimpleMemberAssignment ) ) )* ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:744:1: ( () otherlv_1= 'params' ( (lv_params_2_0= ruleSimpleMemberAssignment ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSimpleMemberAssignment ) ) )* )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:744:1: ( () otherlv_1= 'params' ( (lv_params_2_0= ruleSimpleMemberAssignment ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSimpleMemberAssignment ) ) )* )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:744:2: () otherlv_1= 'params' ( (lv_params_2_0= ruleSimpleMemberAssignment ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSimpleMemberAssignment ) ) )*
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:744:2: ()
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:745:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParamsBlockAccess().getParamsBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleParamsBlock1660); 

                	newLeafNode(otherlv_1, grammarAccess.getParamsBlockAccess().getParamsKeyword_1());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:754:1: ( (lv_params_2_0= ruleSimpleMemberAssignment ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:755:1: (lv_params_2_0= ruleSimpleMemberAssignment )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:755:1: (lv_params_2_0= ruleSimpleMemberAssignment )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:756:3: lv_params_2_0= ruleSimpleMemberAssignment
            {
             
            	        newCompositeNode(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberAssignmentParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_ruleParamsBlock1681);
            lv_params_2_0=ruleSimpleMemberAssignment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParamsBlockRule());
            	        }
                   		add(
                   			current, 
                   			"params",
                    		lv_params_2_0, 
                    		"SimpleMemberAssignment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:772:2: (otherlv_3= ',' ( (lv_params_4_0= ruleSimpleMemberAssignment ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:772:4: otherlv_3= ',' ( (lv_params_4_0= ruleSimpleMemberAssignment ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleParamsBlock1694); 

            	        	newLeafNode(otherlv_3, grammarAccess.getParamsBlockAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:776:1: ( (lv_params_4_0= ruleSimpleMemberAssignment ) )
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:777:1: (lv_params_4_0= ruleSimpleMemberAssignment )
            	    {
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:777:1: (lv_params_4_0= ruleSimpleMemberAssignment )
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:778:3: lv_params_4_0= ruleSimpleMemberAssignment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberAssignmentParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_ruleParamsBlock1715);
            	    lv_params_4_0=ruleSimpleMemberAssignment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParamsBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"params",
            	            		lv_params_4_0, 
            	            		"SimpleMemberAssignment");
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


    // $ANTLR start "entryRuleSimpleMemberAssignment"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:802:1: entryRuleSimpleMemberAssignment returns [EObject current=null] : iv_ruleSimpleMemberAssignment= ruleSimpleMemberAssignment EOF ;
    public final EObject entryRuleSimpleMemberAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleMemberAssignment = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:803:2: (iv_ruleSimpleMemberAssignment= ruleSimpleMemberAssignment EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:804:2: iv_ruleSimpleMemberAssignment= ruleSimpleMemberAssignment EOF
            {
             newCompositeNode(grammarAccess.getSimpleMemberAssignmentRule()); 
            pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_entryRuleSimpleMemberAssignment1753);
            iv_ruleSimpleMemberAssignment=ruleSimpleMemberAssignment();

            state._fsp--;

             current =iv_ruleSimpleMemberAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleMemberAssignment1763); 

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
    // $ANTLR end "entryRuleSimpleMemberAssignment"


    // $ANTLR start "ruleSimpleMemberAssignment"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:811:1: ruleSimpleMemberAssignment returns [EObject current=null] : ( ( (lv_member_0_0= ruleSimpleMember ) ) (otherlv_1= '=' ( (lv_defaultValue_2_0= ruleLiteral ) ) )? ) ;
    public final EObject ruleSimpleMemberAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_member_0_0 = null;

        EObject lv_defaultValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:814:28: ( ( ( (lv_member_0_0= ruleSimpleMember ) ) (otherlv_1= '=' ( (lv_defaultValue_2_0= ruleLiteral ) ) )? ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:815:1: ( ( (lv_member_0_0= ruleSimpleMember ) ) (otherlv_1= '=' ( (lv_defaultValue_2_0= ruleLiteral ) ) )? )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:815:1: ( ( (lv_member_0_0= ruleSimpleMember ) ) (otherlv_1= '=' ( (lv_defaultValue_2_0= ruleLiteral ) ) )? )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:815:2: ( (lv_member_0_0= ruleSimpleMember ) ) (otherlv_1= '=' ( (lv_defaultValue_2_0= ruleLiteral ) ) )?
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:815:2: ( (lv_member_0_0= ruleSimpleMember ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:816:1: (lv_member_0_0= ruleSimpleMember )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:816:1: (lv_member_0_0= ruleSimpleMember )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:817:3: lv_member_0_0= ruleSimpleMember
            {
             
            	        newCompositeNode(grammarAccess.getSimpleMemberAssignmentAccess().getMemberSimpleMemberParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSimpleMember_in_ruleSimpleMemberAssignment1809);
            lv_member_0_0=ruleSimpleMember();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleMemberAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"member",
                    		lv_member_0_0, 
                    		"SimpleMember");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:833:2: (otherlv_1= '=' ( (lv_defaultValue_2_0= ruleLiteral ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:833:4: otherlv_1= '=' ( (lv_defaultValue_2_0= ruleLiteral ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSimpleMemberAssignment1822); 

                        	newLeafNode(otherlv_1, grammarAccess.getSimpleMemberAssignmentAccess().getEqualsSignKeyword_1_0());
                        
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:837:1: ( (lv_defaultValue_2_0= ruleLiteral ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:838:1: (lv_defaultValue_2_0= ruleLiteral )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:838:1: (lv_defaultValue_2_0= ruleLiteral )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:839:3: lv_defaultValue_2_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleMemberAssignmentAccess().getDefaultValueLiteralParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleSimpleMemberAssignment1843);
                    lv_defaultValue_2_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleMemberAssignmentRule());
                    	        }
                           		set(
                           			current, 
                           			"defaultValue",
                            		lv_defaultValue_2_0, 
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
    // $ANTLR end "ruleSimpleMemberAssignment"


    // $ANTLR start "entryRuleLiteral"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:863:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:864:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:865:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1881);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1891); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:872:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_literal_1_0= ruleBooleanValue ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= ruleSignedNumber ) ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_literal_3_0=null;
        Enumerator lv_literal_1_0 = null;

        AntlrDatatypeRuleToken lv_literal_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:875:28: ( ( ( () ( (lv_literal_1_0= ruleBooleanValue ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= ruleSignedNumber ) ) ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:876:1: ( ( () ( (lv_literal_1_0= ruleBooleanValue ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= ruleSignedNumber ) ) ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:876:1: ( ( () ( (lv_literal_1_0= ruleBooleanValue ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= ruleSignedNumber ) ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 39:
            case 40:
                {
                alt16=1;
                }
                break;
            case RULE_STRING:
                {
                alt16=2;
                }
                break;
            case RULE_NUMBER:
            case 19:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:876:2: ( () ( (lv_literal_1_0= ruleBooleanValue ) ) )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:876:2: ( () ( (lv_literal_1_0= ruleBooleanValue ) ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:876:3: () ( (lv_literal_1_0= ruleBooleanValue ) )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:876:3: ()
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:877:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getBooleanLiteralAction_0_0(),
                                current);
                        

                    }

                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:882:2: ( (lv_literal_1_0= ruleBooleanValue ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:883:1: (lv_literal_1_0= ruleBooleanValue )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:883:1: (lv_literal_1_0= ruleBooleanValue )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:884:3: lv_literal_1_0= ruleBooleanValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getLiteralBooleanValueEnumRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleLiteral1947);
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
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:901:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:901:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:901:7: () ( (lv_literal_3_0= RULE_STRING ) )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:901:7: ()
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:902:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getStringLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:907:2: ( (lv_literal_3_0= RULE_STRING ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:908:1: (lv_literal_3_0= RULE_STRING )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:908:1: (lv_literal_3_0= RULE_STRING )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:909:3: lv_literal_3_0= RULE_STRING
                    {
                    lv_literal_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteral1981); 

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
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:926:6: ( () ( (lv_literal_5_0= ruleSignedNumber ) ) )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:926:6: ( () ( (lv_literal_5_0= ruleSignedNumber ) ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:926:7: () ( (lv_literal_5_0= ruleSignedNumber ) )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:926:7: ()
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:927:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getNumericLiteralAction_2_0(),
                                current);
                        

                    }

                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:932:2: ( (lv_literal_5_0= ruleSignedNumber ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:933:1: (lv_literal_5_0= ruleSignedNumber )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:933:1: (lv_literal_5_0= ruleSignedNumber )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:934:3: lv_literal_5_0= ruleSignedNumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getLiteralSignedNumberParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSignedNumber_in_ruleLiteral2024);
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


    // $ANTLR start "entryRuleBodyBlock"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:958:1: entryRuleBodyBlock returns [EObject current=null] : iv_ruleBodyBlock= ruleBodyBlock EOF ;
    public final EObject entryRuleBodyBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyBlock = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:959:2: (iv_ruleBodyBlock= ruleBodyBlock EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:960:2: iv_ruleBodyBlock= ruleBodyBlock EOF
            {
             newCompositeNode(grammarAccess.getBodyBlockRule()); 
            pushFollow(FOLLOW_ruleBodyBlock_in_entryRuleBodyBlock2061);
            iv_ruleBodyBlock=ruleBodyBlock();

            state._fsp--;

             current =iv_ruleBodyBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyBlock2071); 

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
    // $ANTLR end "entryRuleBodyBlock"


    // $ANTLR start "ruleBodyBlock"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:967:1: ruleBodyBlock returns [EObject current=null] : (otherlv_0= 'body' ( (lv_type_1_0= ruleBlockType ) ) ) ;
    public final EObject ruleBodyBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:970:28: ( (otherlv_0= 'body' ( (lv_type_1_0= ruleBlockType ) ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:971:1: (otherlv_0= 'body' ( (lv_type_1_0= ruleBlockType ) ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:971:1: (otherlv_0= 'body' ( (lv_type_1_0= ruleBlockType ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:971:3: otherlv_0= 'body' ( (lv_type_1_0= ruleBlockType ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleBodyBlock2108); 

                	newLeafNode(otherlv_0, grammarAccess.getBodyBlockAccess().getBodyKeyword_0());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:975:1: ( (lv_type_1_0= ruleBlockType ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:976:1: (lv_type_1_0= ruleBlockType )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:976:1: (lv_type_1_0= ruleBlockType )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:977:3: lv_type_1_0= ruleBlockType
            {
             
            	        newCompositeNode(grammarAccess.getBodyBlockAccess().getTypeBlockTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBlockType_in_ruleBodyBlock2129);
            lv_type_1_0=ruleBlockType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyBlockRule());
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
    // $ANTLR end "ruleBodyBlock"


    // $ANTLR start "entryRuleResponseBlock"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1001:1: entryRuleResponseBlock returns [EObject current=null] : iv_ruleResponseBlock= ruleResponseBlock EOF ;
    public final EObject entryRuleResponseBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponseBlock = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1002:2: (iv_ruleResponseBlock= ruleResponseBlock EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1003:2: iv_ruleResponseBlock= ruleResponseBlock EOF
            {
             newCompositeNode(grammarAccess.getResponseBlockRule()); 
            pushFollow(FOLLOW_ruleResponseBlock_in_entryRuleResponseBlock2165);
            iv_ruleResponseBlock=ruleResponseBlock();

            state._fsp--;

             current =iv_ruleResponseBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResponseBlock2175); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1010:1: ruleResponseBlock returns [EObject current=null] : ( () otherlv_1= 'response' (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_type_4_0= ruleBlockType ) )? ) ;
    public final EObject ruleResponseBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1013:28: ( ( () otherlv_1= 'response' (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_type_4_0= ruleBlockType ) )? ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1014:1: ( () otherlv_1= 'response' (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_type_4_0= ruleBlockType ) )? )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1014:1: ( () otherlv_1= 'response' (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_type_4_0= ruleBlockType ) )? )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1014:2: () otherlv_1= 'response' (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_type_4_0= ruleBlockType ) )?
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1014:2: ()
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1015:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getResponseBlockAccess().getResponseBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleResponseBlock2221); 

                	newLeafNode(otherlv_1, grammarAccess.getResponseBlockAccess().getResponseKeyword_1());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1024:1: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1024:3: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleResponseBlock2234); 

                        	newLeafNode(otherlv_2, grammarAccess.getResponseBlockAccess().getExtendsKeyword_2_0());
                        
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1028:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1029:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1029:1: (otherlv_3= RULE_ID )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1030:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getResponseBlockRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResponseBlock2254); 

                    		newLeafNode(otherlv_3, grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1041:4: ( (lv_type_4_0= ruleBlockType ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||LA18_0==13||(LA18_0>=29 && LA18_0<=33)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1042:1: (lv_type_4_0= ruleBlockType )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1042:1: (lv_type_4_0= ruleBlockType )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1043:3: lv_type_4_0= ruleBlockType
                    {
                     
                    	        newCompositeNode(grammarAccess.getResponseBlockAccess().getTypeBlockTypeParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBlockType_in_ruleResponseBlock2277);
                    lv_type_4_0=ruleBlockType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getResponseBlockRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_4_0, 
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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1067:1: entryRuleBlockType returns [EObject current=null] : iv_ruleBlockType= ruleBlockType EOF ;
    public final EObject entryRuleBlockType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockType = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1068:2: (iv_ruleBlockType= ruleBlockType EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1069:2: iv_ruleBlockType= ruleBlockType EOF
            {
             newCompositeNode(grammarAccess.getBlockTypeRule()); 
            pushFollow(FOLLOW_ruleBlockType_in_entryRuleBlockType2314);
            iv_ruleBlockType=ruleBlockType();

            state._fsp--;

             current =iv_ruleBlockType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockType2324); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1076:1: ruleBlockType returns [EObject current=null] : (this_Type_0= ruleType | this_ComplexTypeLiteral_1= ruleComplexTypeLiteral ) ;
    public final EObject ruleBlockType() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_ComplexTypeLiteral_1 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1079:28: ( (this_Type_0= ruleType | this_ComplexTypeLiteral_1= ruleComplexTypeLiteral ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1080:1: (this_Type_0= ruleType | this_ComplexTypeLiteral_1= ruleComplexTypeLiteral )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1080:1: (this_Type_0= ruleType | this_ComplexTypeLiteral_1= ruleComplexTypeLiteral )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||(LA19_0>=29 && LA19_0<=33)) ) {
                alt19=1;
            }
            else if ( (LA19_0==13) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1081:5: this_Type_0= ruleType
                    {
                     
                            newCompositeNode(grammarAccess.getBlockTypeAccess().getTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleBlockType2371);
                    this_Type_0=ruleType();

                    state._fsp--;

                     
                            current = this_Type_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1091:5: this_ComplexTypeLiteral_1= ruleComplexTypeLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getBlockTypeAccess().getComplexTypeLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComplexTypeLiteral_in_ruleBlockType2398);
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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1107:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1108:2: (iv_ruleMember= ruleMember EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1109:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember2433);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember2443); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1116:1: ruleMember returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1119:28: ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1120:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1120:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1120:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1120:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1121:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1121:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1122:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1122:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_STRING) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1123:3: lv_name_0_1= RULE_ID
                    {
                    lv_name_0_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMember2487); 

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
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1138:8: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMember2507); 

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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleMember2527); 

                	newLeafNode(otherlv_1, grammarAccess.getMemberAccess().getColonKeyword_1());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1160:1: ( (lv_type_2_0= ruleType ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1161:1: (lv_type_2_0= ruleType )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1161:1: (lv_type_2_0= ruleType )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1162:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getMemberAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleMember2548);
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


    // $ANTLR start "entryRuleSimpleMember"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1186:1: entryRuleSimpleMember returns [EObject current=null] : iv_ruleSimpleMember= ruleSimpleMember EOF ;
    public final EObject entryRuleSimpleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleMember = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1187:2: (iv_ruleSimpleMember= ruleSimpleMember EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1188:2: iv_ruleSimpleMember= ruleSimpleMember EOF
            {
             newCompositeNode(grammarAccess.getSimpleMemberRule()); 
            pushFollow(FOLLOW_ruleSimpleMember_in_entryRuleSimpleMember2584);
            iv_ruleSimpleMember=ruleSimpleMember();

            state._fsp--;

             current =iv_ruleSimpleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleMember2594); 

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
    // $ANTLR end "entryRuleSimpleMember"


    // $ANTLR start "ruleSimpleMember"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1195:1: ruleSimpleMember returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) ) ) ;
    public final EObject ruleSimpleMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1198:28: ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1199:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1199:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1199:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) otherlv_1= ':' ( (lv_type_2_0= ruleIntrinsicType ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1199:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1200:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1200:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1201:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1201:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
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
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1202:3: lv_name_0_1= RULE_ID
                    {
                    lv_name_0_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleMember2638); 

                    			newLeafNode(lv_name_0_1, grammarAccess.getSimpleMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleMemberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1217:8: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleMember2658); 

                    			newLeafNode(lv_name_0_2, grammarAccess.getSimpleMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleMemberRule());
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleSimpleMember2678); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleMemberAccess().getColonKeyword_1());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1239:1: ( (lv_type_2_0= ruleIntrinsicType ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1240:1: (lv_type_2_0= ruleIntrinsicType )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1240:1: (lv_type_2_0= ruleIntrinsicType )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1241:3: lv_type_2_0= ruleIntrinsicType
            {
             
            	        newCompositeNode(grammarAccess.getSimpleMemberAccess().getTypeIntrinsicTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIntrinsicType_in_ruleSimpleMember2699);
            lv_type_2_0=ruleIntrinsicType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleMemberRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"IntrinsicType");
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
    // $ANTLR end "ruleSimpleMember"


    // $ANTLR start "entryRuleType"
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1265:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1266:2: (iv_ruleType= ruleType EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1267:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2735);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2745); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1274:1: ruleType returns [EObject current=null] : (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_ArrayType_2= ruleArrayType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_UserType_0 = null;

        EObject this_IntrinsicType_1 = null;

        EObject this_ArrayType_2 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1277:28: ( (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_ArrayType_2= ruleArrayType ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1278:1: (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_ArrayType_2= ruleArrayType )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1278:1: (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_ArrayType_2= ruleArrayType )
            int alt22=3;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1279:5: this_UserType_0= ruleUserType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUserTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUserType_in_ruleType2792);
                    this_UserType_0=ruleUserType();

                    state._fsp--;

                     
                            current = this_UserType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1289:5: this_IntrinsicType_1= ruleIntrinsicType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getIntrinsicTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntrinsicType_in_ruleType2819);
                    this_IntrinsicType_1=ruleIntrinsicType();

                    state._fsp--;

                     
                            current = this_IntrinsicType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1299:5: this_ArrayType_2= ruleArrayType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getArrayTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleArrayType_in_ruleType2846);
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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1315:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1316:2: (iv_ruleArrayType= ruleArrayType EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1317:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType2881);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType2891); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1324:1: ruleArrayType returns [EObject current=null] : ( ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) ) ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        EObject lv_elementType_0_1 = null;

        EObject lv_elementType_0_2 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1327:28: ( ( ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1328:1: ( ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1328:1: ( ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1328:2: ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) ) ( (lv_id_1_0= '[]' ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1328:2: ( ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1329:1: ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1329:1: ( (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1330:1: (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1330:1: (lv_elementType_0_1= ruleUserType | lv_elementType_0_2= ruleIntrinsicType )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=29 && LA23_0<=33)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1331:3: lv_elementType_0_1= ruleUserType
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayTypeAccess().getElementTypeUserTypeParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUserType_in_ruleArrayType2939);
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
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1346:8: lv_elementType_0_2= ruleIntrinsicType
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayTypeAccess().getElementTypeIntrinsicTypeParserRuleCall_0_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleIntrinsicType_in_ruleArrayType2958);
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

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1364:2: ( (lv_id_1_0= '[]' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1365:1: (lv_id_1_0= '[]' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1365:1: (lv_id_1_0= '[]' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1366:3: lv_id_1_0= '[]'
            {
            lv_id_1_0=(Token)match(input,25,FOLLOW_25_in_ruleArrayType2979); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1387:1: entryRuleUserType returns [EObject current=null] : iv_ruleUserType= ruleUserType EOF ;
    public final EObject entryRuleUserType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserType = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1388:2: (iv_ruleUserType= ruleUserType EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1389:2: iv_ruleUserType= ruleUserType EOF
            {
             newCompositeNode(grammarAccess.getUserTypeRule()); 
            pushFollow(FOLLOW_ruleUserType_in_entryRuleUserType3028);
            iv_ruleUserType=ruleUserType();

            state._fsp--;

             current =iv_ruleUserType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserType3038); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1396:1: ruleUserType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleUserType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1399:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1400:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1400:1: ( (otherlv_0= RULE_ID ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1401:1: (otherlv_0= RULE_ID )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1401:1: (otherlv_0= RULE_ID )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1402:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUserTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUserType3082); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1421:1: entryRuleUserTypeDeclaration returns [EObject current=null] : iv_ruleUserTypeDeclaration= ruleUserTypeDeclaration EOF ;
    public final EObject entryRuleUserTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserTypeDeclaration = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1422:2: (iv_ruleUserTypeDeclaration= ruleUserTypeDeclaration EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1423:2: iv_ruleUserTypeDeclaration= ruleUserTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getUserTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleUserTypeDeclaration_in_entryRuleUserTypeDeclaration3117);
            iv_ruleUserTypeDeclaration=ruleUserTypeDeclaration();

            state._fsp--;

             current =iv_ruleUserTypeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserTypeDeclaration3127); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1430:1: ruleUserTypeDeclaration returns [EObject current=null] : (this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration | this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration ) ;
    public final EObject ruleUserTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ComplexTypeDeclaration_0 = null;

        EObject this_EnumTypeDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1433:28: ( (this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration | this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1434:1: (this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration | this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1434:1: (this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration | this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            else if ( (LA24_0==28) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1435:5: this_ComplexTypeDeclaration_0= ruleComplexTypeDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getUserTypeDeclarationAccess().getComplexTypeDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleComplexTypeDeclaration_in_ruleUserTypeDeclaration3174);
                    this_ComplexTypeDeclaration_0=ruleComplexTypeDeclaration();

                    state._fsp--;

                     
                            current = this_ComplexTypeDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1445:5: this_EnumTypeDeclaration_1= ruleEnumTypeDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getUserTypeDeclarationAccess().getEnumTypeDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnumTypeDeclaration_in_ruleUserTypeDeclaration3201);
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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1461:1: entryRuleComplexTypeDeclaration returns [EObject current=null] : iv_ruleComplexTypeDeclaration= ruleComplexTypeDeclaration EOF ;
    public final EObject entryRuleComplexTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexTypeDeclaration = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1462:2: (iv_ruleComplexTypeDeclaration= ruleComplexTypeDeclaration EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1463:2: iv_ruleComplexTypeDeclaration= ruleComplexTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getComplexTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleComplexTypeDeclaration_in_entryRuleComplexTypeDeclaration3236);
            iv_ruleComplexTypeDeclaration=ruleComplexTypeDeclaration();

            state._fsp--;

             current =iv_ruleComplexTypeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeDeclaration3246); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1470:1: ruleComplexTypeDeclaration returns [EObject current=null] : ( ( (lv_keyword_0_0= 'entity' ) ) ( (lv_nogen_1_0= 'nogen' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_literal_3_0= ruleComplexTypeLiteral ) )? ) ;
    public final EObject ruleComplexTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token lv_nogen_1_0=null;
        Token lv_name_2_0=null;
        EObject lv_literal_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1473:28: ( ( ( (lv_keyword_0_0= 'entity' ) ) ( (lv_nogen_1_0= 'nogen' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_literal_3_0= ruleComplexTypeLiteral ) )? ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1474:1: ( ( (lv_keyword_0_0= 'entity' ) ) ( (lv_nogen_1_0= 'nogen' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_literal_3_0= ruleComplexTypeLiteral ) )? )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1474:1: ( ( (lv_keyword_0_0= 'entity' ) ) ( (lv_nogen_1_0= 'nogen' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_literal_3_0= ruleComplexTypeLiteral ) )? )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1474:2: ( (lv_keyword_0_0= 'entity' ) ) ( (lv_nogen_1_0= 'nogen' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_literal_3_0= ruleComplexTypeLiteral ) )?
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1474:2: ( (lv_keyword_0_0= 'entity' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1475:1: (lv_keyword_0_0= 'entity' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1475:1: (lv_keyword_0_0= 'entity' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1476:3: lv_keyword_0_0= 'entity'
            {
            lv_keyword_0_0=(Token)match(input,26,FOLLOW_26_in_ruleComplexTypeDeclaration3289); 

                    newLeafNode(lv_keyword_0_0, grammarAccess.getComplexTypeDeclarationAccess().getKeywordEntityKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComplexTypeDeclarationRule());
            	        }
                   		setWithLastConsumed(current, "keyword", lv_keyword_0_0, "entity");
            	    

            }


            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1489:2: ( (lv_nogen_1_0= 'nogen' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==27) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1490:1: (lv_nogen_1_0= 'nogen' )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1490:1: (lv_nogen_1_0= 'nogen' )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1491:3: lv_nogen_1_0= 'nogen'
                    {
                    lv_nogen_1_0=(Token)match(input,27,FOLLOW_27_in_ruleComplexTypeDeclaration3320); 

                            newLeafNode(lv_nogen_1_0, grammarAccess.getComplexTypeDeclarationAccess().getNogenNogenKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComplexTypeDeclarationRule());
                    	        }
                           		setWithLastConsumed(current, "nogen", true, "nogen");
                    	    

                    }


                    }
                    break;

            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1504:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1505:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1505:1: (lv_name_2_0= RULE_ID )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1506:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexTypeDeclaration3351); 

            			newLeafNode(lv_name_2_0, grammarAccess.getComplexTypeDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComplexTypeDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1522:2: ( (lv_literal_3_0= ruleComplexTypeLiteral ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==13) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1523:1: (lv_literal_3_0= ruleComplexTypeLiteral )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1523:1: (lv_literal_3_0= ruleComplexTypeLiteral )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1524:3: lv_literal_3_0= ruleComplexTypeLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getComplexTypeDeclarationAccess().getLiteralComplexTypeLiteralParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleComplexTypeLiteral_in_ruleComplexTypeDeclaration3377);
                    lv_literal_3_0=ruleComplexTypeLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComplexTypeDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"literal",
                            		lv_literal_3_0, 
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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1548:1: entryRuleEnumTypeDeclaration returns [EObject current=null] : iv_ruleEnumTypeDeclaration= ruleEnumTypeDeclaration EOF ;
    public final EObject entryRuleEnumTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeDeclaration = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1549:2: (iv_ruleEnumTypeDeclaration= ruleEnumTypeDeclaration EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1550:2: iv_ruleEnumTypeDeclaration= ruleEnumTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleEnumTypeDeclaration_in_entryRuleEnumTypeDeclaration3414);
            iv_ruleEnumTypeDeclaration=ruleEnumTypeDeclaration();

            state._fsp--;

             current =iv_ruleEnumTypeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumTypeDeclaration3424); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1557:1: ruleEnumTypeDeclaration returns [EObject current=null] : ( ( (lv_keyword_0_0= 'enum' ) ) ( (lv_nogen_1_0= 'nogen' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )? ( (lv_literal_5_0= ruleEnumTypeLiteral ) )? ) ;
    public final EObject ruleEnumTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token lv_nogen_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_superType_4_0 = null;

        EObject lv_literal_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1560:28: ( ( ( (lv_keyword_0_0= 'enum' ) ) ( (lv_nogen_1_0= 'nogen' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )? ( (lv_literal_5_0= ruleEnumTypeLiteral ) )? ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1561:1: ( ( (lv_keyword_0_0= 'enum' ) ) ( (lv_nogen_1_0= 'nogen' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )? ( (lv_literal_5_0= ruleEnumTypeLiteral ) )? )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1561:1: ( ( (lv_keyword_0_0= 'enum' ) ) ( (lv_nogen_1_0= 'nogen' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )? ( (lv_literal_5_0= ruleEnumTypeLiteral ) )? )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1561:2: ( (lv_keyword_0_0= 'enum' ) ) ( (lv_nogen_1_0= 'nogen' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )? ( (lv_literal_5_0= ruleEnumTypeLiteral ) )?
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1561:2: ( (lv_keyword_0_0= 'enum' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1562:1: (lv_keyword_0_0= 'enum' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1562:1: (lv_keyword_0_0= 'enum' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1563:3: lv_keyword_0_0= 'enum'
            {
            lv_keyword_0_0=(Token)match(input,28,FOLLOW_28_in_ruleEnumTypeDeclaration3467); 

                    newLeafNode(lv_keyword_0_0, grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumTypeDeclarationRule());
            	        }
                   		setWithLastConsumed(current, "keyword", lv_keyword_0_0, "enum");
            	    

            }


            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1576:2: ( (lv_nogen_1_0= 'nogen' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1577:1: (lv_nogen_1_0= 'nogen' )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1577:1: (lv_nogen_1_0= 'nogen' )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1578:3: lv_nogen_1_0= 'nogen'
                    {
                    lv_nogen_1_0=(Token)match(input,27,FOLLOW_27_in_ruleEnumTypeDeclaration3498); 

                            newLeafNode(lv_nogen_1_0, grammarAccess.getEnumTypeDeclarationAccess().getNogenNogenKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumTypeDeclarationRule());
                    	        }
                           		setWithLastConsumed(current, "nogen", true, "nogen");
                    	    

                    }


                    }
                    break;

            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1591:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1592:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1592:1: (lv_name_2_0= RULE_ID )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1593:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumTypeDeclaration3529); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEnumTypeDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumTypeDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1609:2: (otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==24) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1609:4: otherlv_3= 'extends' ( (lv_superType_4_0= ruleIntegerType ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleEnumTypeDeclaration3547); 

                        	newLeafNode(otherlv_3, grammarAccess.getEnumTypeDeclarationAccess().getExtendsKeyword_3_0());
                        
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1613:1: ( (lv_superType_4_0= ruleIntegerType ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1614:1: (lv_superType_4_0= ruleIntegerType )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1614:1: (lv_superType_4_0= ruleIntegerType )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1615:3: lv_superType_4_0= ruleIntegerType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeIntegerTypeParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIntegerType_in_ruleEnumTypeDeclaration3568);
                    lv_superType_4_0=ruleIntegerType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumTypeDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"superType",
                            		lv_superType_4_0, 
                            		"IntegerType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1631:4: ( (lv_literal_5_0= ruleEnumTypeLiteral ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==13) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1632:1: (lv_literal_5_0= ruleEnumTypeLiteral )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1632:1: (lv_literal_5_0= ruleEnumTypeLiteral )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1633:3: lv_literal_5_0= ruleEnumTypeLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getEnumTypeDeclarationAccess().getLiteralEnumTypeLiteralParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEnumTypeLiteral_in_ruleEnumTypeDeclaration3591);
                    lv_literal_5_0=ruleEnumTypeLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEnumTypeDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"literal",
                            		lv_literal_5_0, 
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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1657:1: entryRuleEnumTypeLiteral returns [EObject current=null] : iv_ruleEnumTypeLiteral= ruleEnumTypeLiteral EOF ;
    public final EObject entryRuleEnumTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeLiteral = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1658:2: (iv_ruleEnumTypeLiteral= ruleEnumTypeLiteral EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1659:2: iv_ruleEnumTypeLiteral= ruleEnumTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumTypeLiteral_in_entryRuleEnumTypeLiteral3628);
            iv_ruleEnumTypeLiteral=ruleEnumTypeLiteral();

            state._fsp--;

             current =iv_ruleEnumTypeLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumTypeLiteral3638); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1666:1: ruleEnumTypeLiteral returns [EObject current=null] : (otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleEnumTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1669:28: ( (otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1670:1: (otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1670:1: (otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1670:3: otherlv_0= '{' ( (lv_members_1_0= ruleEnumMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleEnumTypeLiteral3675); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumTypeLiteralAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1674:1: ( (lv_members_1_0= ruleEnumMember ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1675:1: (lv_members_1_0= ruleEnumMember )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1675:1: (lv_members_1_0= ruleEnumMember )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1676:3: lv_members_1_0= ruleEnumMember
            {
             
            	        newCompositeNode(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEnumMember_in_ruleEnumTypeLiteral3696);
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

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1692:2: (otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==16) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1692:4: otherlv_2= ',' ( (lv_members_3_0= ruleEnumMember ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleEnumTypeLiteral3709); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEnumTypeLiteralAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1696:1: ( (lv_members_3_0= ruleEnumMember ) )
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1697:1: (lv_members_3_0= ruleEnumMember )
            	    {
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1697:1: (lv_members_3_0= ruleEnumMember )
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1698:3: lv_members_3_0= ruleEnumMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumMember_in_ruleEnumTypeLiteral3730);
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
            	    break loop30;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleEnumTypeLiteral3744); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1726:1: entryRuleEnumMember returns [EObject current=null] : iv_ruleEnumMember= ruleEnumMember EOF ;
    public final EObject entryRuleEnumMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMember = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1727:2: (iv_ruleEnumMember= ruleEnumMember EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1728:2: iv_ruleEnumMember= ruleEnumMember EOF
            {
             newCompositeNode(grammarAccess.getEnumMemberRule()); 
            pushFollow(FOLLOW_ruleEnumMember_in_entryRuleEnumMember3780);
            iv_ruleEnumMember=ruleEnumMember();

            state._fsp--;

             current =iv_ruleEnumMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMember3790); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1735:1: ruleEnumMember returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_NUMBER ) ) )? ) ;
    public final EObject ruleEnumMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_assignment_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1738:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_NUMBER ) ) )? ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1739:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_NUMBER ) ) )? )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1739:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_NUMBER ) ) )? )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1739:2: ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_NUMBER ) ) )?
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1739:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1740:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1740:1: (lv_name_0_0= RULE_ID )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1741:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumMember3832); 

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

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1757:2: ( ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_NUMBER ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==21) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1757:3: ( (lv_assignment_1_0= '=' ) ) ( (lv_value_2_0= RULE_NUMBER ) )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1757:3: ( (lv_assignment_1_0= '=' ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1758:1: (lv_assignment_1_0= '=' )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1758:1: (lv_assignment_1_0= '=' )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1759:3: lv_assignment_1_0= '='
                    {
                    lv_assignment_1_0=(Token)match(input,21,FOLLOW_21_in_ruleEnumMember3856); 

                            newLeafNode(lv_assignment_1_0, grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumMemberRule());
                    	        }
                           		setWithLastConsumed(current, "assignment", true, "=");
                    	    

                    }


                    }

                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1772:2: ( (lv_value_2_0= RULE_NUMBER ) )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1773:1: (lv_value_2_0= RULE_NUMBER )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1773:1: (lv_value_2_0= RULE_NUMBER )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1774:3: lv_value_2_0= RULE_NUMBER
                    {
                    lv_value_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleEnumMember3886); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1798:1: entryRuleComplexTypeLiteral returns [EObject current=null] : iv_ruleComplexTypeLiteral= ruleComplexTypeLiteral EOF ;
    public final EObject entryRuleComplexTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexTypeLiteral = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1799:2: (iv_ruleComplexTypeLiteral= ruleComplexTypeLiteral EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1800:2: iv_ruleComplexTypeLiteral= ruleComplexTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getComplexTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_entryRuleComplexTypeLiteral3929);
            iv_ruleComplexTypeLiteral=ruleComplexTypeLiteral();

            state._fsp--;

             current =iv_ruleComplexTypeLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeLiteral3939); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1807:1: ruleComplexTypeLiteral returns [EObject current=null] : (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleComplexTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1810:28: ( (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1811:1: (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1811:1: (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1811:3: otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleComplexTypeLiteral3976); 

                	newLeafNode(otherlv_0, grammarAccess.getComplexTypeLiteralAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1815:1: ( (lv_members_1_0= ruleMember ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1816:1: (lv_members_1_0= ruleMember )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1816:1: (lv_members_1_0= ruleMember )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1817:3: lv_members_1_0= ruleMember
            {
             
            	        newCompositeNode(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMember_in_ruleComplexTypeLiteral3997);
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

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1833:2: (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==16) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1833:4: otherlv_2= ',' ( (lv_members_3_0= ruleMember ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleComplexTypeLiteral4010); 

            	        	newLeafNode(otherlv_2, grammarAccess.getComplexTypeLiteralAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1837:1: ( (lv_members_3_0= ruleMember ) )
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1838:1: (lv_members_3_0= ruleMember )
            	    {
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1838:1: (lv_members_3_0= ruleMember )
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1839:3: lv_members_3_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleComplexTypeLiteral4031);
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
            	    break loop32;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleComplexTypeLiteral4045); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1867:1: entryRuleIntrinsicType returns [EObject current=null] : iv_ruleIntrinsicType= ruleIntrinsicType EOF ;
    public final EObject entryRuleIntrinsicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntrinsicType = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1868:2: (iv_ruleIntrinsicType= ruleIntrinsicType EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1869:2: iv_ruleIntrinsicType= ruleIntrinsicType EOF
            {
             newCompositeNode(grammarAccess.getIntrinsicTypeRule()); 
            pushFollow(FOLLOW_ruleIntrinsicType_in_entryRuleIntrinsicType4081);
            iv_ruleIntrinsicType=ruleIntrinsicType();

            state._fsp--;

             current =iv_ruleIntrinsicType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntrinsicType4091); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1876:1: ruleIntrinsicType returns [EObject current=null] : (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType ) ;
    public final EObject ruleIntrinsicType() throws RecognitionException {
        EObject current = null;

        EObject this_StringType_0 = null;

        EObject this_BooleanType_1 = null;

        EObject this_NumericType_2 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1879:28: ( (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1880:1: (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1880:1: (this_StringType_0= ruleStringType | this_BooleanType_1= ruleBooleanType | this_NumericType_2= ruleNumericType )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt33=1;
                }
                break;
            case 30:
                {
                alt33=2;
                }
                break;
            case 31:
            case 32:
            case 33:
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
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1881:5: this_StringType_0= ruleStringType
                    {
                     
                            newCompositeNode(grammarAccess.getIntrinsicTypeAccess().getStringTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_ruleIntrinsicType4138);
                    this_StringType_0=ruleStringType();

                    state._fsp--;

                     
                            current = this_StringType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1891:5: this_BooleanType_1= ruleBooleanType
                    {
                     
                            newCompositeNode(grammarAccess.getIntrinsicTypeAccess().getBooleanTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanType_in_ruleIntrinsicType4165);
                    this_BooleanType_1=ruleBooleanType();

                    state._fsp--;

                     
                            current = this_BooleanType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1901:5: this_NumericType_2= ruleNumericType
                    {
                     
                            newCompositeNode(grammarAccess.getIntrinsicTypeAccess().getNumericTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumericType_in_ruleIntrinsicType4192);
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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1917:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1918:2: (iv_ruleStringType= ruleStringType EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1919:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType4227);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType4237); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1926:1: ruleStringType returns [EObject current=null] : ( (lv_id_0_0= 'string' ) ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1929:28: ( ( (lv_id_0_0= 'string' ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1930:1: ( (lv_id_0_0= 'string' ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1930:1: ( (lv_id_0_0= 'string' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1931:1: (lv_id_0_0= 'string' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1931:1: (lv_id_0_0= 'string' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1932:3: lv_id_0_0= 'string'
            {
            lv_id_0_0=(Token)match(input,29,FOLLOW_29_in_ruleStringType4279); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1953:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1954:2: (iv_ruleBooleanType= ruleBooleanType EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1955:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType4327);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType4337); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1962:1: ruleBooleanType returns [EObject current=null] : ( (lv_id_0_0= 'boolean' ) ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1965:28: ( ( (lv_id_0_0= 'boolean' ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1966:1: ( (lv_id_0_0= 'boolean' ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1966:1: ( (lv_id_0_0= 'boolean' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1967:1: (lv_id_0_0= 'boolean' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1967:1: (lv_id_0_0= 'boolean' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1968:3: lv_id_0_0= 'boolean'
            {
            lv_id_0_0=(Token)match(input,30,FOLLOW_30_in_ruleBooleanType4379); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1989:1: entryRuleNumericType returns [EObject current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final EObject entryRuleNumericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericType = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1990:2: (iv_ruleNumericType= ruleNumericType EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1991:2: iv_ruleNumericType= ruleNumericType EOF
            {
             newCompositeNode(grammarAccess.getNumericTypeRule()); 
            pushFollow(FOLLOW_ruleNumericType_in_entryRuleNumericType4427);
            iv_ruleNumericType=ruleNumericType();

            state._fsp--;

             current =iv_ruleNumericType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericType4437); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1998:1: ruleNumericType returns [EObject current=null] : (this_IntegerType_0= ruleIntegerType | this_LongType_1= ruleLongType | this_DoubleType_2= ruleDoubleType ) ;
    public final EObject ruleNumericType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerType_0 = null;

        EObject this_LongType_1 = null;

        EObject this_DoubleType_2 = null;


         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2001:28: ( (this_IntegerType_0= ruleIntegerType | this_LongType_1= ruleLongType | this_DoubleType_2= ruleDoubleType ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2002:1: (this_IntegerType_0= ruleIntegerType | this_LongType_1= ruleLongType | this_DoubleType_2= ruleDoubleType )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2002:1: (this_IntegerType_0= ruleIntegerType | this_LongType_1= ruleLongType | this_DoubleType_2= ruleDoubleType )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt34=1;
                }
                break;
            case 32:
                {
                alt34=2;
                }
                break;
            case 33:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2003:5: this_IntegerType_0= ruleIntegerType
                    {
                     
                            newCompositeNode(grammarAccess.getNumericTypeAccess().getIntegerTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntegerType_in_ruleNumericType4484);
                    this_IntegerType_0=ruleIntegerType();

                    state._fsp--;

                     
                            current = this_IntegerType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2013:5: this_LongType_1= ruleLongType
                    {
                     
                            newCompositeNode(grammarAccess.getNumericTypeAccess().getLongTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLongType_in_ruleNumericType4511);
                    this_LongType_1=ruleLongType();

                    state._fsp--;

                     
                            current = this_LongType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2023:5: this_DoubleType_2= ruleDoubleType
                    {
                     
                            newCompositeNode(grammarAccess.getNumericTypeAccess().getDoubleTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDoubleType_in_ruleNumericType4538);
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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2039:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2040:2: (iv_ruleIntegerType= ruleIntegerType EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2041:2: iv_ruleIntegerType= ruleIntegerType EOF
            {
             newCompositeNode(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_ruleIntegerType_in_entryRuleIntegerType4573);
            iv_ruleIntegerType=ruleIntegerType();

            state._fsp--;

             current =iv_ruleIntegerType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerType4583); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2048:1: ruleIntegerType returns [EObject current=null] : ( (lv_id_0_0= 'int' ) ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2051:28: ( ( (lv_id_0_0= 'int' ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2052:1: ( (lv_id_0_0= 'int' ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2052:1: ( (lv_id_0_0= 'int' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2053:1: (lv_id_0_0= 'int' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2053:1: (lv_id_0_0= 'int' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2054:3: lv_id_0_0= 'int'
            {
            lv_id_0_0=(Token)match(input,31,FOLLOW_31_in_ruleIntegerType4625); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2075:1: entryRuleLongType returns [EObject current=null] : iv_ruleLongType= ruleLongType EOF ;
    public final EObject entryRuleLongType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongType = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2076:2: (iv_ruleLongType= ruleLongType EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2077:2: iv_ruleLongType= ruleLongType EOF
            {
             newCompositeNode(grammarAccess.getLongTypeRule()); 
            pushFollow(FOLLOW_ruleLongType_in_entryRuleLongType4673);
            iv_ruleLongType=ruleLongType();

            state._fsp--;

             current =iv_ruleLongType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongType4683); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2084:1: ruleLongType returns [EObject current=null] : ( (lv_id_0_0= 'long' ) ) ;
    public final EObject ruleLongType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2087:28: ( ( (lv_id_0_0= 'long' ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2088:1: ( (lv_id_0_0= 'long' ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2088:1: ( (lv_id_0_0= 'long' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2089:1: (lv_id_0_0= 'long' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2089:1: (lv_id_0_0= 'long' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2090:3: lv_id_0_0= 'long'
            {
            lv_id_0_0=(Token)match(input,32,FOLLOW_32_in_ruleLongType4725); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2111:1: entryRuleDoubleType returns [EObject current=null] : iv_ruleDoubleType= ruleDoubleType EOF ;
    public final EObject entryRuleDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleType = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2112:2: (iv_ruleDoubleType= ruleDoubleType EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2113:2: iv_ruleDoubleType= ruleDoubleType EOF
            {
             newCompositeNode(grammarAccess.getDoubleTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleType_in_entryRuleDoubleType4773);
            iv_ruleDoubleType=ruleDoubleType();

            state._fsp--;

             current =iv_ruleDoubleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleType4783); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2120:1: ruleDoubleType returns [EObject current=null] : ( (lv_id_0_0= 'double' ) ) ;
    public final EObject ruleDoubleType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2123:28: ( ( (lv_id_0_0= 'double' ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2124:1: ( (lv_id_0_0= 'double' ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2124:1: ( (lv_id_0_0= 'double' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2125:1: (lv_id_0_0= 'double' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2125:1: (lv_id_0_0= 'double' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2126:3: lv_id_0_0= 'double'
            {
            lv_id_0_0=(Token)match(input,33,FOLLOW_33_in_ruleDoubleType4825); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2147:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2148:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2149:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4874);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName4885); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2156:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2159:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2160:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2160:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2160:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4925); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2167:1: (kw= '.' this_ID_2= RULE_ID )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==34) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2168:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,34,FOLLOW_34_in_ruleQualifiedName4944); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4959); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2188:1: entryRuleSignedNumber returns [String current=null] : iv_ruleSignedNumber= ruleSignedNumber EOF ;
    public final String entryRuleSignedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedNumber = null;


        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2189:2: (iv_ruleSignedNumber= ruleSignedNumber EOF )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2190:2: iv_ruleSignedNumber= ruleSignedNumber EOF
            {
             newCompositeNode(grammarAccess.getSignedNumberRule()); 
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber5007);
            iv_ruleSignedNumber=ruleSignedNumber();

            state._fsp--;

             current =iv_ruleSignedNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber5018); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2197:1: ruleSignedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleSignedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2200:28: ( ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2201:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2201:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2201:2: (kw= '-' )? this_NUMBER_1= RULE_NUMBER
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2201:2: (kw= '-' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==19) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2202:2: kw= '-'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleSignedNumber5057); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSignedNumber5074); 

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2222:1: ruleHttpMethodType returns [Enumerator current=null] : ( (enumLiteral_0= 'get' ) | (enumLiteral_1= 'put' ) | (enumLiteral_2= 'post' ) | (enumLiteral_3= 'delete' ) ) ;
    public final Enumerator ruleHttpMethodType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2224:28: ( ( (enumLiteral_0= 'get' ) | (enumLiteral_1= 'put' ) | (enumLiteral_2= 'post' ) | (enumLiteral_3= 'delete' ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2225:1: ( (enumLiteral_0= 'get' ) | (enumLiteral_1= 'put' ) | (enumLiteral_2= 'post' ) | (enumLiteral_3= 'delete' ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2225:1: ( (enumLiteral_0= 'get' ) | (enumLiteral_1= 'put' ) | (enumLiteral_2= 'post' ) | (enumLiteral_3= 'delete' ) )
            int alt37=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt37=1;
                }
                break;
            case 36:
                {
                alt37=2;
                }
                break;
            case 37:
                {
                alt37=3;
                }
                break;
            case 38:
                {
                alt37=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2225:2: (enumLiteral_0= 'get' )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2225:2: (enumLiteral_0= 'get' )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2225:4: enumLiteral_0= 'get'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_35_in_ruleHttpMethodType5133); 

                            current = grammarAccess.getHttpMethodTypeAccess().getGetEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getHttpMethodTypeAccess().getGetEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2231:6: (enumLiteral_1= 'put' )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2231:6: (enumLiteral_1= 'put' )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2231:8: enumLiteral_1= 'put'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_36_in_ruleHttpMethodType5150); 

                            current = grammarAccess.getHttpMethodTypeAccess().getPutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getHttpMethodTypeAccess().getPutEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2237:6: (enumLiteral_2= 'post' )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2237:6: (enumLiteral_2= 'post' )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2237:8: enumLiteral_2= 'post'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_37_in_ruleHttpMethodType5167); 

                            current = grammarAccess.getHttpMethodTypeAccess().getPostEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getHttpMethodTypeAccess().getPostEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2243:6: (enumLiteral_3= 'delete' )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2243:6: (enumLiteral_3= 'delete' )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2243:8: enumLiteral_3= 'delete'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_38_in_ruleHttpMethodType5184); 

                            current = grammarAccess.getHttpMethodTypeAccess().getDeleteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getHttpMethodTypeAccess().getDeleteEnumLiteralDeclaration_3()); 
                        

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
    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2253:1: ruleBooleanValue returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2255:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2256:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2256:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            else if ( (LA38_0==40) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2256:2: (enumLiteral_0= 'true' )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2256:2: (enumLiteral_0= 'true' )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2256:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_39_in_ruleBooleanValue5229); 

                            current = grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2262:6: (enumLiteral_1= 'false' )
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2262:6: (enumLiteral_1= 'false' )
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2262:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleBooleanValue5246); 

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


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\12\uffff";
    static final String DFA22_eofS =
        "\1\uffff\1\7\5\11\3\uffff";
    static final String DFA22_minS =
        "\1\4\6\16\3\uffff";
    static final String DFA22_maxS =
        "\1\41\6\31\3\uffff";
    static final String DFA22_acceptS =
        "\7\uffff\1\1\1\3\1\2";
    static final String DFA22_specialS =
        "\12\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\30\uffff\1\2\1\3\1\4\1\5\1\6",
            "\3\7\3\uffff\1\7\1\uffff\2\7\1\uffff\1\10",
            "\3\11\3\uffff\1\11\1\uffff\2\11\1\uffff\1\10",
            "\3\11\3\uffff\1\11\1\uffff\2\11\1\uffff\1\10",
            "\3\11\3\uffff\1\11\1\uffff\2\11\1\uffff\1\10",
            "\3\11\3\uffff\1\11\1\uffff\2\11\1\uffff\1\10",
            "\3\11\3\uffff\1\11\1\uffff\2\11\1\uffff\1\10",
            "",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1278:1: (this_UserType_0= ruleUserType | this_IntrinsicType_1= ruleIntrinsicType | this_ArrayType_2= ruleArrayType )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModel143 = new BitSet(new long[]{0x0000000014001002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleModel164 = new BitSet(new long[]{0x0000000014001002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeDeclaration_in_ruleDeclaration258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApi_in_ruleDeclaration285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApi_in_entryRuleApi320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApi330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleApi367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApi384 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleApi406 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleApi424 = new BitSet(new long[]{0x000000780010C000L});
    public static final BitSet FOLLOW_ruleServiceBlock_in_ruleApi445 = new BitSet(new long[]{0x000000780010C000L});
    public static final BitSet FOLLOW_14_in_ruleApi458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceBlock_in_entryRuleServiceBlock494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceBlock504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderBlock_in_ruleServiceBlock551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_ruleServiceBlock578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_ruleServiceBlock605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderBlock_in_entryRuleHeaderBlock640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderBlock650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleHeaderBlock687 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleHeader_in_ruleHeaderBlock708 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleHeaderBlock721 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleHeader_in_ruleHeaderBlock742 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleHeader_in_entryRuleHeader780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHeader832 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleHeader849 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHeader866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_entryRuleHttpMethod907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpMethod917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethodType_in_ruleHttpMethod963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHttpMethod980 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rulePath_in_ruleHttpMethod1006 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleHttpMethod1019 = new BitSet(new long[]{0x0000000000D0C000L});
    public static final BitSet FOLLOW_ruleHttpMethodBlock_in_ruleHttpMethod1040 = new BitSet(new long[]{0x0000000000D0C000L});
    public static final BitSet FOLLOW_14_in_ruleHttpMethod1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethodBlock_in_entryRuleHttpMethodBlock1089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpMethodBlock1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderBlock_in_ruleHttpMethodBlock1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_ruleHttpMethodBlock1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_ruleHttpMethodBlock1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_ruleHttpMethodBlock1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePath1318 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleArbitraryPathSegment_in_rulePath1335 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_rulePath1361 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_rulePath1375 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleArbitraryPathSegment_in_rulePath1392 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_rulePath1418 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleArbitraryPathSegment_in_entryRuleArbitraryPathSegment1458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArbitraryPathSegment1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleArbitraryPathSegment1516 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleArbitraryPathSegment1535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleArbitraryPathSegment1557 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_entryRuleParamsBlock1604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamsBlock1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleParamsBlock1660 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_ruleParamsBlock1681 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleParamsBlock1694 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_ruleParamsBlock1715 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_entryRuleSimpleMemberAssignment1753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleMemberAssignment1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_ruleSimpleMemberAssignment1809 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleSimpleMemberAssignment1822 = new BitSet(new long[]{0x0000018000080060L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleSimpleMemberAssignment1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleLiteral1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_ruleLiteral2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_entryRuleBodyBlock2061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyBlock2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBodyBlock2108 = new BitSet(new long[]{0x00000003E0002010L});
    public static final BitSet FOLLOW_ruleBlockType_in_ruleBodyBlock2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_entryRuleResponseBlock2165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResponseBlock2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleResponseBlock2221 = new BitSet(new long[]{0x00000003E1002012L});
    public static final BitSet FOLLOW_24_in_ruleResponseBlock2234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResponseBlock2254 = new BitSet(new long[]{0x00000003E0002012L});
    public static final BitSet FOLLOW_ruleBlockType_in_ruleResponseBlock2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_entryRuleBlockType2314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockType2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleBlockType2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_ruleBlockType2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember2433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMember2487 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMember2507 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMember2527 = new BitSet(new long[]{0x00000003E0000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleMember2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_entryRuleSimpleMember2584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleMember2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleMember2638 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleMember2658 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSimpleMember2678 = new BitSet(new long[]{0x00000003E0000000L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_ruleSimpleMember2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_ruleType2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_ruleType2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_ruleType2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType2881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_ruleArrayType2939 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_ruleArrayType2958 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleArrayType2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_entryRuleUserType3028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserType3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUserType3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeDeclaration_in_entryRuleUserTypeDeclaration3117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserTypeDeclaration3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeDeclaration_in_ruleUserTypeDeclaration3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeDeclaration_in_ruleUserTypeDeclaration3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeDeclaration_in_entryRuleComplexTypeDeclaration3236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeDeclaration3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleComplexTypeDeclaration3289 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_27_in_ruleComplexTypeDeclaration3320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexTypeDeclaration3351 = new BitSet(new long[]{0x00000003E0002012L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_ruleComplexTypeDeclaration3377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeDeclaration_in_entryRuleEnumTypeDeclaration3414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeDeclaration3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEnumTypeDeclaration3467 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_27_in_ruleEnumTypeDeclaration3498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumTypeDeclaration3529 = new BitSet(new long[]{0x0000000001002002L});
    public static final BitSet FOLLOW_24_in_ruleEnumTypeDeclaration3547 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleIntegerType_in_ruleEnumTypeDeclaration3568 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleEnumTypeLiteral_in_ruleEnumTypeDeclaration3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeLiteral_in_entryRuleEnumTypeLiteral3628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeLiteral3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleEnumTypeLiteral3675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumTypeLiteral3696 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_ruleEnumTypeLiteral3709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumTypeLiteral3730 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_ruleEnumTypeLiteral3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember3780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumMember3832 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleEnumMember3856 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleEnumMember3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_entryRuleComplexTypeLiteral3929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeLiteral3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleComplexTypeLiteral3976 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleMember_in_ruleComplexTypeLiteral3997 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_16_in_ruleComplexTypeLiteral4010 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleMember_in_ruleComplexTypeLiteral4031 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_ruleComplexTypeLiteral4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_entryRuleIntrinsicType4081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntrinsicType4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleIntrinsicType4138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleIntrinsicType4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_ruleIntrinsicType4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType4227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleStringType4279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType4327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleBooleanType4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_entryRuleNumericType4427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericType4437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_ruleNumericType4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_ruleNumericType4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_ruleNumericType4538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_entryRuleIntegerType4573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerType4583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleIntegerType4625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_entryRuleLongType4673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongType4683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleLongType4725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_entryRuleDoubleType4773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleType4783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDoubleType4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4925 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleQualifiedName4944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4959 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber5007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSignedNumber5057 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSignedNumber5074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleHttpMethodType5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleHttpMethodType5150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleHttpMethodType5167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleHttpMethodType5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBooleanValue5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBooleanValue5246 = new BitSet(new long[]{0x0000000000000002L});

}