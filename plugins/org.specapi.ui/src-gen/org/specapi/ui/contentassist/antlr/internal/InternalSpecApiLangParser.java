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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'get'", "'put'", "'post'", "'delete'", "'true'", "'false'", "'package'", "'api'", "'{'", "'}'", "'headers'", "','", "':'", "'/'", "'-'", "'params'", "'='", "'body'", "'response'", "'extends'", "'.'", "'[]'", "'entity'", "'nogen'", "'enum'", "'string'", "'boolean'", "'int'", "'long'", "'double'"
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




    // $ANTLR start "entryRuleModel"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:61:1: ( ruleModel EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:76:1: ( rule__Model__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


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


    // $ANTLR start "entryRuleHeader"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:200:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:201:1: ( ruleHeader EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:202:1: ruleHeader EOF
            {
             before(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_ruleHeader_in_entryRuleHeader361);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeader368); 

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
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:209:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:213:2: ( ( ( rule__Header__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:214:1: ( ( rule__Header__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:214:1: ( ( rule__Header__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:215:1: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:216:1: ( rule__Header__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:216:2: rule__Header__Group__0
            {
            pushFollow(FOLLOW_rule__Header__Group__0_in_ruleHeader394);
            rule__Header__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getGroup()); 

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
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleHttpMethod"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:228:1: entryRuleHttpMethod : ruleHttpMethod EOF ;
    public final void entryRuleHttpMethod() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:229:1: ( ruleHttpMethod EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:230:1: ruleHttpMethod EOF
            {
             before(grammarAccess.getHttpMethodRule()); 
            pushFollow(FOLLOW_ruleHttpMethod_in_entryRuleHttpMethod421);
            ruleHttpMethod();

            state._fsp--;

             after(grammarAccess.getHttpMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpMethod428); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:237:1: ruleHttpMethod : ( ( rule__HttpMethod__Group__0 ) ) ;
    public final void ruleHttpMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:241:2: ( ( ( rule__HttpMethod__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:242:1: ( ( rule__HttpMethod__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:242:1: ( ( rule__HttpMethod__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:243:1: ( rule__HttpMethod__Group__0 )
            {
             before(grammarAccess.getHttpMethodAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:244:1: ( rule__HttpMethod__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:244:2: rule__HttpMethod__Group__0
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__0_in_ruleHttpMethod454);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:256:1: entryRuleHttpMethodBlock : ruleHttpMethodBlock EOF ;
    public final void entryRuleHttpMethodBlock() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:257:1: ( ruleHttpMethodBlock EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:258:1: ruleHttpMethodBlock EOF
            {
             before(grammarAccess.getHttpMethodBlockRule()); 
            pushFollow(FOLLOW_ruleHttpMethodBlock_in_entryRuleHttpMethodBlock481);
            ruleHttpMethodBlock();

            state._fsp--;

             after(grammarAccess.getHttpMethodBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpMethodBlock488); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:265:1: ruleHttpMethodBlock : ( ( rule__HttpMethodBlock__Alternatives ) ) ;
    public final void ruleHttpMethodBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:269:2: ( ( ( rule__HttpMethodBlock__Alternatives ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:270:1: ( ( rule__HttpMethodBlock__Alternatives ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:270:1: ( ( rule__HttpMethodBlock__Alternatives ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:271:1: ( rule__HttpMethodBlock__Alternatives )
            {
             before(grammarAccess.getHttpMethodBlockAccess().getAlternatives()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:272:1: ( rule__HttpMethodBlock__Alternatives )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:272:2: rule__HttpMethodBlock__Alternatives
            {
            pushFollow(FOLLOW_rule__HttpMethodBlock__Alternatives_in_ruleHttpMethodBlock514);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:284:1: entryRulePath : rulePath EOF ;
    public final void entryRulePath() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:285:1: ( rulePath EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:286:1: rulePath EOF
            {
             before(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_rulePath_in_entryRulePath541);
            rulePath();

            state._fsp--;

             after(grammarAccess.getPathRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePath548); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:293:1: rulePath : ( ( rule__Path__Group__0 ) ) ;
    public final void rulePath() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:297:2: ( ( ( rule__Path__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:298:1: ( ( rule__Path__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:298:1: ( ( rule__Path__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:299:1: ( rule__Path__Group__0 )
            {
             before(grammarAccess.getPathAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:300:1: ( rule__Path__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:300:2: rule__Path__Group__0
            {
            pushFollow(FOLLOW_rule__Path__Group__0_in_rulePath574);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:312:1: entryRuleArbitraryPathSegment : ruleArbitraryPathSegment EOF ;
    public final void entryRuleArbitraryPathSegment() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:313:1: ( ruleArbitraryPathSegment EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:314:1: ruleArbitraryPathSegment EOF
            {
             before(grammarAccess.getArbitraryPathSegmentRule()); 
            pushFollow(FOLLOW_ruleArbitraryPathSegment_in_entryRuleArbitraryPathSegment601);
            ruleArbitraryPathSegment();

            state._fsp--;

             after(grammarAccess.getArbitraryPathSegmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArbitraryPathSegment608); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:321:1: ruleArbitraryPathSegment : ( ( rule__ArbitraryPathSegment__Group__0 ) ) ;
    public final void ruleArbitraryPathSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:325:2: ( ( ( rule__ArbitraryPathSegment__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:326:1: ( ( rule__ArbitraryPathSegment__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:326:1: ( ( rule__ArbitraryPathSegment__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:327:1: ( rule__ArbitraryPathSegment__Group__0 )
            {
             before(grammarAccess.getArbitraryPathSegmentAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:328:1: ( rule__ArbitraryPathSegment__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:328:2: rule__ArbitraryPathSegment__Group__0
            {
            pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group__0_in_ruleArbitraryPathSegment634);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:340:1: entryRuleParamsBlock : ruleParamsBlock EOF ;
    public final void entryRuleParamsBlock() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:341:1: ( ruleParamsBlock EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:342:1: ruleParamsBlock EOF
            {
             before(grammarAccess.getParamsBlockRule()); 
            pushFollow(FOLLOW_ruleParamsBlock_in_entryRuleParamsBlock661);
            ruleParamsBlock();

            state._fsp--;

             after(grammarAccess.getParamsBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamsBlock668); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:349:1: ruleParamsBlock : ( ( rule__ParamsBlock__Group__0 ) ) ;
    public final void ruleParamsBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:353:2: ( ( ( rule__ParamsBlock__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:354:1: ( ( rule__ParamsBlock__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:354:1: ( ( rule__ParamsBlock__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:355:1: ( rule__ParamsBlock__Group__0 )
            {
             before(grammarAccess.getParamsBlockAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:356:1: ( rule__ParamsBlock__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:356:2: rule__ParamsBlock__Group__0
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__0_in_ruleParamsBlock694);
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


    // $ANTLR start "entryRuleSimpleMemberAssignment"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:368:1: entryRuleSimpleMemberAssignment : ruleSimpleMemberAssignment EOF ;
    public final void entryRuleSimpleMemberAssignment() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:369:1: ( ruleSimpleMemberAssignment EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:370:1: ruleSimpleMemberAssignment EOF
            {
             before(grammarAccess.getSimpleMemberAssignmentRule()); 
            pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_entryRuleSimpleMemberAssignment721);
            ruleSimpleMemberAssignment();

            state._fsp--;

             after(grammarAccess.getSimpleMemberAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleMemberAssignment728); 

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
    // $ANTLR end "entryRuleSimpleMemberAssignment"


    // $ANTLR start "ruleSimpleMemberAssignment"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:377:1: ruleSimpleMemberAssignment : ( ( rule__SimpleMemberAssignment__Group__0 ) ) ;
    public final void ruleSimpleMemberAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:381:2: ( ( ( rule__SimpleMemberAssignment__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:382:1: ( ( rule__SimpleMemberAssignment__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:382:1: ( ( rule__SimpleMemberAssignment__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:383:1: ( rule__SimpleMemberAssignment__Group__0 )
            {
             before(grammarAccess.getSimpleMemberAssignmentAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:384:1: ( rule__SimpleMemberAssignment__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:384:2: rule__SimpleMemberAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group__0_in_ruleSimpleMemberAssignment754);
            rule__SimpleMemberAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleMemberAssignmentAccess().getGroup()); 

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
    // $ANTLR end "ruleSimpleMemberAssignment"


    // $ANTLR start "entryRuleLiteral"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:396:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:397:1: ( ruleLiteral EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:398:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral781);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral788); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:405:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:409:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:410:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:410:1: ( ( rule__Literal__Alternatives ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:411:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:412:1: ( rule__Literal__Alternatives )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:412:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral814);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:424:1: entryRuleBodyBlock : ruleBodyBlock EOF ;
    public final void entryRuleBodyBlock() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:425:1: ( ruleBodyBlock EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:426:1: ruleBodyBlock EOF
            {
             before(grammarAccess.getBodyBlockRule()); 
            pushFollow(FOLLOW_ruleBodyBlock_in_entryRuleBodyBlock841);
            ruleBodyBlock();

            state._fsp--;

             after(grammarAccess.getBodyBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyBlock848); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:433:1: ruleBodyBlock : ( ( rule__BodyBlock__Group__0 ) ) ;
    public final void ruleBodyBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:437:2: ( ( ( rule__BodyBlock__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:438:1: ( ( rule__BodyBlock__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:438:1: ( ( rule__BodyBlock__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:439:1: ( rule__BodyBlock__Group__0 )
            {
             before(grammarAccess.getBodyBlockAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:440:1: ( rule__BodyBlock__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:440:2: rule__BodyBlock__Group__0
            {
            pushFollow(FOLLOW_rule__BodyBlock__Group__0_in_ruleBodyBlock874);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:452:1: entryRuleResponseBlock : ruleResponseBlock EOF ;
    public final void entryRuleResponseBlock() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:453:1: ( ruleResponseBlock EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:454:1: ruleResponseBlock EOF
            {
             before(grammarAccess.getResponseBlockRule()); 
            pushFollow(FOLLOW_ruleResponseBlock_in_entryRuleResponseBlock901);
            ruleResponseBlock();

            state._fsp--;

             after(grammarAccess.getResponseBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResponseBlock908); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:461:1: ruleResponseBlock : ( ( rule__ResponseBlock__Group__0 ) ) ;
    public final void ruleResponseBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:465:2: ( ( ( rule__ResponseBlock__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:466:1: ( ( rule__ResponseBlock__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:466:1: ( ( rule__ResponseBlock__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:467:1: ( rule__ResponseBlock__Group__0 )
            {
             before(grammarAccess.getResponseBlockAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:468:1: ( rule__ResponseBlock__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:468:2: rule__ResponseBlock__Group__0
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__0_in_ruleResponseBlock934);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:480:1: entryRuleBlockType : ruleBlockType EOF ;
    public final void entryRuleBlockType() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:481:1: ( ruleBlockType EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:482:1: ruleBlockType EOF
            {
             before(grammarAccess.getBlockTypeRule()); 
            pushFollow(FOLLOW_ruleBlockType_in_entryRuleBlockType961);
            ruleBlockType();

            state._fsp--;

             after(grammarAccess.getBlockTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockType968); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:489:1: ruleBlockType : ( ( rule__BlockType__Alternatives ) ) ;
    public final void ruleBlockType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:493:2: ( ( ( rule__BlockType__Alternatives ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:494:1: ( ( rule__BlockType__Alternatives ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:494:1: ( ( rule__BlockType__Alternatives ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:495:1: ( rule__BlockType__Alternatives )
            {
             before(grammarAccess.getBlockTypeAccess().getAlternatives()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:496:1: ( rule__BlockType__Alternatives )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:496:2: rule__BlockType__Alternatives
            {
            pushFollow(FOLLOW_rule__BlockType__Alternatives_in_ruleBlockType994);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:508:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:509:1: ( ruleMember EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:510:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember1021);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember1028); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:517:1: ruleMember : ( ( rule__Member__Group__0 ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:521:2: ( ( ( rule__Member__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:522:1: ( ( rule__Member__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:522:1: ( ( rule__Member__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:523:1: ( rule__Member__Group__0 )
            {
             before(grammarAccess.getMemberAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:524:1: ( rule__Member__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:524:2: rule__Member__Group__0
            {
            pushFollow(FOLLOW_rule__Member__Group__0_in_ruleMember1054);
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


    // $ANTLR start "entryRuleSimpleMember"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:536:1: entryRuleSimpleMember : ruleSimpleMember EOF ;
    public final void entryRuleSimpleMember() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:537:1: ( ruleSimpleMember EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:538:1: ruleSimpleMember EOF
            {
             before(grammarAccess.getSimpleMemberRule()); 
            pushFollow(FOLLOW_ruleSimpleMember_in_entryRuleSimpleMember1081);
            ruleSimpleMember();

            state._fsp--;

             after(grammarAccess.getSimpleMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleMember1088); 

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
    // $ANTLR end "entryRuleSimpleMember"


    // $ANTLR start "ruleSimpleMember"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:545:1: ruleSimpleMember : ( ( rule__SimpleMember__Group__0 ) ) ;
    public final void ruleSimpleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:549:2: ( ( ( rule__SimpleMember__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:550:1: ( ( rule__SimpleMember__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:550:1: ( ( rule__SimpleMember__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:551:1: ( rule__SimpleMember__Group__0 )
            {
             before(grammarAccess.getSimpleMemberAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:552:1: ( rule__SimpleMember__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:552:2: rule__SimpleMember__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleMember__Group__0_in_ruleSimpleMember1114);
            rule__SimpleMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleMemberAccess().getGroup()); 

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
    // $ANTLR end "ruleSimpleMember"


    // $ANTLR start "entryRuleType"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:564:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:565:1: ( ruleType EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:566:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1141);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1148); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:573:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:577:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:578:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:578:1: ( ( rule__Type__Alternatives ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:579:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:580:1: ( rule__Type__Alternatives )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:580:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1174);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:592:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:593:1: ( ruleArrayType EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:594:1: ruleArrayType EOF
            {
             before(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType1201);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType1208); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:601:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:605:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:606:1: ( ( rule__ArrayType__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:606:1: ( ( rule__ArrayType__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:607:1: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:608:1: ( rule__ArrayType__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:608:2: rule__ArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType1234);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:620:1: entryRuleUserType : ruleUserType EOF ;
    public final void entryRuleUserType() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:621:1: ( ruleUserType EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:622:1: ruleUserType EOF
            {
             before(grammarAccess.getUserTypeRule()); 
            pushFollow(FOLLOW_ruleUserType_in_entryRuleUserType1261);
            ruleUserType();

            state._fsp--;

             after(grammarAccess.getUserTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserType1268); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:629:1: ruleUserType : ( ( rule__UserType__DeclarationAssignment ) ) ;
    public final void ruleUserType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:633:2: ( ( ( rule__UserType__DeclarationAssignment ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:634:1: ( ( rule__UserType__DeclarationAssignment ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:634:1: ( ( rule__UserType__DeclarationAssignment ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:635:1: ( rule__UserType__DeclarationAssignment )
            {
             before(grammarAccess.getUserTypeAccess().getDeclarationAssignment()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:636:1: ( rule__UserType__DeclarationAssignment )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:636:2: rule__UserType__DeclarationAssignment
            {
            pushFollow(FOLLOW_rule__UserType__DeclarationAssignment_in_ruleUserType1294);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:648:1: entryRuleUserTypeDeclaration : ruleUserTypeDeclaration EOF ;
    public final void entryRuleUserTypeDeclaration() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:649:1: ( ruleUserTypeDeclaration EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:650:1: ruleUserTypeDeclaration EOF
            {
             before(grammarAccess.getUserTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleUserTypeDeclaration_in_entryRuleUserTypeDeclaration1321);
            ruleUserTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getUserTypeDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserTypeDeclaration1328); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:657:1: ruleUserTypeDeclaration : ( ( rule__UserTypeDeclaration__Alternatives ) ) ;
    public final void ruleUserTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:661:2: ( ( ( rule__UserTypeDeclaration__Alternatives ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:662:1: ( ( rule__UserTypeDeclaration__Alternatives ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:662:1: ( ( rule__UserTypeDeclaration__Alternatives ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:663:1: ( rule__UserTypeDeclaration__Alternatives )
            {
             before(grammarAccess.getUserTypeDeclarationAccess().getAlternatives()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:664:1: ( rule__UserTypeDeclaration__Alternatives )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:664:2: rule__UserTypeDeclaration__Alternatives
            {
            pushFollow(FOLLOW_rule__UserTypeDeclaration__Alternatives_in_ruleUserTypeDeclaration1354);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:676:1: entryRuleComplexTypeDeclaration : ruleComplexTypeDeclaration EOF ;
    public final void entryRuleComplexTypeDeclaration() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:677:1: ( ruleComplexTypeDeclaration EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:678:1: ruleComplexTypeDeclaration EOF
            {
             before(grammarAccess.getComplexTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleComplexTypeDeclaration_in_entryRuleComplexTypeDeclaration1381);
            ruleComplexTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getComplexTypeDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeDeclaration1388); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:685:1: ruleComplexTypeDeclaration : ( ( rule__ComplexTypeDeclaration__Group__0 ) ) ;
    public final void ruleComplexTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:689:2: ( ( ( rule__ComplexTypeDeclaration__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:690:1: ( ( rule__ComplexTypeDeclaration__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:690:1: ( ( rule__ComplexTypeDeclaration__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:691:1: ( rule__ComplexTypeDeclaration__Group__0 )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:692:1: ( rule__ComplexTypeDeclaration__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:692:2: rule__ComplexTypeDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__0_in_ruleComplexTypeDeclaration1414);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:704:1: entryRuleEnumTypeDeclaration : ruleEnumTypeDeclaration EOF ;
    public final void entryRuleEnumTypeDeclaration() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:705:1: ( ruleEnumTypeDeclaration EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:706:1: ruleEnumTypeDeclaration EOF
            {
             before(grammarAccess.getEnumTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleEnumTypeDeclaration_in_entryRuleEnumTypeDeclaration1441);
            ruleEnumTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getEnumTypeDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumTypeDeclaration1448); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:713:1: ruleEnumTypeDeclaration : ( ( rule__EnumTypeDeclaration__Group__0 ) ) ;
    public final void ruleEnumTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:717:2: ( ( ( rule__EnumTypeDeclaration__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:718:1: ( ( rule__EnumTypeDeclaration__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:718:1: ( ( rule__EnumTypeDeclaration__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:719:1: ( rule__EnumTypeDeclaration__Group__0 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:720:1: ( rule__EnumTypeDeclaration__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:720:2: rule__EnumTypeDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__0_in_ruleEnumTypeDeclaration1474);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:732:1: entryRuleEnumTypeLiteral : ruleEnumTypeLiteral EOF ;
    public final void entryRuleEnumTypeLiteral() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:733:1: ( ruleEnumTypeLiteral EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:734:1: ruleEnumTypeLiteral EOF
            {
             before(grammarAccess.getEnumTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumTypeLiteral_in_entryRuleEnumTypeLiteral1501);
            ruleEnumTypeLiteral();

            state._fsp--;

             after(grammarAccess.getEnumTypeLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumTypeLiteral1508); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:741:1: ruleEnumTypeLiteral : ( ( rule__EnumTypeLiteral__Group__0 ) ) ;
    public final void ruleEnumTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:745:2: ( ( ( rule__EnumTypeLiteral__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:746:1: ( ( rule__EnumTypeLiteral__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:746:1: ( ( rule__EnumTypeLiteral__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:747:1: ( rule__EnumTypeLiteral__Group__0 )
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:748:1: ( rule__EnumTypeLiteral__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:748:2: rule__EnumTypeLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__0_in_ruleEnumTypeLiteral1534);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:760:1: entryRuleEnumMember : ruleEnumMember EOF ;
    public final void entryRuleEnumMember() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:761:1: ( ruleEnumMember EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:762:1: ruleEnumMember EOF
            {
             before(grammarAccess.getEnumMemberRule()); 
            pushFollow(FOLLOW_ruleEnumMember_in_entryRuleEnumMember1561);
            ruleEnumMember();

            state._fsp--;

             after(grammarAccess.getEnumMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMember1568); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:769:1: ruleEnumMember : ( ( rule__EnumMember__Group__0 ) ) ;
    public final void ruleEnumMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:773:2: ( ( ( rule__EnumMember__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:774:1: ( ( rule__EnumMember__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:774:1: ( ( rule__EnumMember__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:775:1: ( rule__EnumMember__Group__0 )
            {
             before(grammarAccess.getEnumMemberAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:776:1: ( rule__EnumMember__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:776:2: rule__EnumMember__Group__0
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__0_in_ruleEnumMember1594);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:788:1: entryRuleComplexTypeLiteral : ruleComplexTypeLiteral EOF ;
    public final void entryRuleComplexTypeLiteral() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:789:1: ( ruleComplexTypeLiteral EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:790:1: ruleComplexTypeLiteral EOF
            {
             before(grammarAccess.getComplexTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_entryRuleComplexTypeLiteral1621);
            ruleComplexTypeLiteral();

            state._fsp--;

             after(grammarAccess.getComplexTypeLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexTypeLiteral1628); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:797:1: ruleComplexTypeLiteral : ( ( rule__ComplexTypeLiteral__Group__0 ) ) ;
    public final void ruleComplexTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:801:2: ( ( ( rule__ComplexTypeLiteral__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:802:1: ( ( rule__ComplexTypeLiteral__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:802:1: ( ( rule__ComplexTypeLiteral__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:803:1: ( rule__ComplexTypeLiteral__Group__0 )
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:804:1: ( rule__ComplexTypeLiteral__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:804:2: rule__ComplexTypeLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__0_in_ruleComplexTypeLiteral1654);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:816:1: entryRuleIntrinsicType : ruleIntrinsicType EOF ;
    public final void entryRuleIntrinsicType() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:817:1: ( ruleIntrinsicType EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:818:1: ruleIntrinsicType EOF
            {
             before(grammarAccess.getIntrinsicTypeRule()); 
            pushFollow(FOLLOW_ruleIntrinsicType_in_entryRuleIntrinsicType1681);
            ruleIntrinsicType();

            state._fsp--;

             after(grammarAccess.getIntrinsicTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntrinsicType1688); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:825:1: ruleIntrinsicType : ( ( rule__IntrinsicType__Alternatives ) ) ;
    public final void ruleIntrinsicType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:829:2: ( ( ( rule__IntrinsicType__Alternatives ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:830:1: ( ( rule__IntrinsicType__Alternatives ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:830:1: ( ( rule__IntrinsicType__Alternatives ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:831:1: ( rule__IntrinsicType__Alternatives )
            {
             before(grammarAccess.getIntrinsicTypeAccess().getAlternatives()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:832:1: ( rule__IntrinsicType__Alternatives )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:832:2: rule__IntrinsicType__Alternatives
            {
            pushFollow(FOLLOW_rule__IntrinsicType__Alternatives_in_ruleIntrinsicType1714);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:844:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:845:1: ( ruleStringType EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:846:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType1741);
            ruleStringType();

            state._fsp--;

             after(grammarAccess.getStringTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType1748); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:853:1: ruleStringType : ( ( rule__StringType__IdAssignment ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:857:2: ( ( ( rule__StringType__IdAssignment ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:858:1: ( ( rule__StringType__IdAssignment ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:858:1: ( ( rule__StringType__IdAssignment ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:859:1: ( rule__StringType__IdAssignment )
            {
             before(grammarAccess.getStringTypeAccess().getIdAssignment()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:860:1: ( rule__StringType__IdAssignment )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:860:2: rule__StringType__IdAssignment
            {
            pushFollow(FOLLOW_rule__StringType__IdAssignment_in_ruleStringType1774);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:872:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:873:1: ( ruleBooleanType EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:874:1: ruleBooleanType EOF
            {
             before(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType1801);
            ruleBooleanType();

            state._fsp--;

             after(grammarAccess.getBooleanTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType1808); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:881:1: ruleBooleanType : ( ( rule__BooleanType__IdAssignment ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:885:2: ( ( ( rule__BooleanType__IdAssignment ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:886:1: ( ( rule__BooleanType__IdAssignment ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:886:1: ( ( rule__BooleanType__IdAssignment ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:887:1: ( rule__BooleanType__IdAssignment )
            {
             before(grammarAccess.getBooleanTypeAccess().getIdAssignment()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:888:1: ( rule__BooleanType__IdAssignment )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:888:2: rule__BooleanType__IdAssignment
            {
            pushFollow(FOLLOW_rule__BooleanType__IdAssignment_in_ruleBooleanType1834);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:900:1: entryRuleNumericType : ruleNumericType EOF ;
    public final void entryRuleNumericType() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:901:1: ( ruleNumericType EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:902:1: ruleNumericType EOF
            {
             before(grammarAccess.getNumericTypeRule()); 
            pushFollow(FOLLOW_ruleNumericType_in_entryRuleNumericType1861);
            ruleNumericType();

            state._fsp--;

             after(grammarAccess.getNumericTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericType1868); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:909:1: ruleNumericType : ( ( rule__NumericType__Alternatives ) ) ;
    public final void ruleNumericType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:913:2: ( ( ( rule__NumericType__Alternatives ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:914:1: ( ( rule__NumericType__Alternatives ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:914:1: ( ( rule__NumericType__Alternatives ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:915:1: ( rule__NumericType__Alternatives )
            {
             before(grammarAccess.getNumericTypeAccess().getAlternatives()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:916:1: ( rule__NumericType__Alternatives )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:916:2: rule__NumericType__Alternatives
            {
            pushFollow(FOLLOW_rule__NumericType__Alternatives_in_ruleNumericType1894);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:928:1: entryRuleIntegerType : ruleIntegerType EOF ;
    public final void entryRuleIntegerType() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:929:1: ( ruleIntegerType EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:930:1: ruleIntegerType EOF
            {
             before(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_ruleIntegerType_in_entryRuleIntegerType1921);
            ruleIntegerType();

            state._fsp--;

             after(grammarAccess.getIntegerTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerType1928); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:937:1: ruleIntegerType : ( ( rule__IntegerType__IdAssignment ) ) ;
    public final void ruleIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:941:2: ( ( ( rule__IntegerType__IdAssignment ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:942:1: ( ( rule__IntegerType__IdAssignment ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:942:1: ( ( rule__IntegerType__IdAssignment ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:943:1: ( rule__IntegerType__IdAssignment )
            {
             before(grammarAccess.getIntegerTypeAccess().getIdAssignment()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:944:1: ( rule__IntegerType__IdAssignment )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:944:2: rule__IntegerType__IdAssignment
            {
            pushFollow(FOLLOW_rule__IntegerType__IdAssignment_in_ruleIntegerType1954);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:956:1: entryRuleLongType : ruleLongType EOF ;
    public final void entryRuleLongType() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:957:1: ( ruleLongType EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:958:1: ruleLongType EOF
            {
             before(grammarAccess.getLongTypeRule()); 
            pushFollow(FOLLOW_ruleLongType_in_entryRuleLongType1981);
            ruleLongType();

            state._fsp--;

             after(grammarAccess.getLongTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongType1988); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:965:1: ruleLongType : ( ( rule__LongType__IdAssignment ) ) ;
    public final void ruleLongType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:969:2: ( ( ( rule__LongType__IdAssignment ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:970:1: ( ( rule__LongType__IdAssignment ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:970:1: ( ( rule__LongType__IdAssignment ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:971:1: ( rule__LongType__IdAssignment )
            {
             before(grammarAccess.getLongTypeAccess().getIdAssignment()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:972:1: ( rule__LongType__IdAssignment )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:972:2: rule__LongType__IdAssignment
            {
            pushFollow(FOLLOW_rule__LongType__IdAssignment_in_ruleLongType2014);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:984:1: entryRuleDoubleType : ruleDoubleType EOF ;
    public final void entryRuleDoubleType() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:985:1: ( ruleDoubleType EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:986:1: ruleDoubleType EOF
            {
             before(grammarAccess.getDoubleTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleType_in_entryRuleDoubleType2041);
            ruleDoubleType();

            state._fsp--;

             after(grammarAccess.getDoubleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleType2048); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:993:1: ruleDoubleType : ( ( rule__DoubleType__IdAssignment ) ) ;
    public final void ruleDoubleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:997:2: ( ( ( rule__DoubleType__IdAssignment ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:998:1: ( ( rule__DoubleType__IdAssignment ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:998:1: ( ( rule__DoubleType__IdAssignment ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:999:1: ( rule__DoubleType__IdAssignment )
            {
             before(grammarAccess.getDoubleTypeAccess().getIdAssignment()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1000:1: ( rule__DoubleType__IdAssignment )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1000:2: rule__DoubleType__IdAssignment
            {
            pushFollow(FOLLOW_rule__DoubleType__IdAssignment_in_ruleDoubleType2074);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1012:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1013:1: ( ruleQualifiedName EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1014:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2101);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2108); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1021:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1025:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1026:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1026:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1027:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1028:1: ( rule__QualifiedName__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1028:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName2134);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1040:1: entryRuleSignedNumber : ruleSignedNumber EOF ;
    public final void entryRuleSignedNumber() throws RecognitionException {
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1041:1: ( ruleSignedNumber EOF )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1042:1: ruleSignedNumber EOF
            {
             before(grammarAccess.getSignedNumberRule()); 
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber2161);
            ruleSignedNumber();

            state._fsp--;

             after(grammarAccess.getSignedNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber2168); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1049:1: ruleSignedNumber : ( ( rule__SignedNumber__Group__0 ) ) ;
    public final void ruleSignedNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1053:2: ( ( ( rule__SignedNumber__Group__0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1054:1: ( ( rule__SignedNumber__Group__0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1054:1: ( ( rule__SignedNumber__Group__0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1055:1: ( rule__SignedNumber__Group__0 )
            {
             before(grammarAccess.getSignedNumberAccess().getGroup()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1056:1: ( rule__SignedNumber__Group__0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1056:2: rule__SignedNumber__Group__0
            {
            pushFollow(FOLLOW_rule__SignedNumber__Group__0_in_ruleSignedNumber2194);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1069:1: ruleHttpMethodType : ( ( rule__HttpMethodType__Alternatives ) ) ;
    public final void ruleHttpMethodType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1073:1: ( ( ( rule__HttpMethodType__Alternatives ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1074:1: ( ( rule__HttpMethodType__Alternatives ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1074:1: ( ( rule__HttpMethodType__Alternatives ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1075:1: ( rule__HttpMethodType__Alternatives )
            {
             before(grammarAccess.getHttpMethodTypeAccess().getAlternatives()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1076:1: ( rule__HttpMethodType__Alternatives )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1076:2: rule__HttpMethodType__Alternatives
            {
            pushFollow(FOLLOW_rule__HttpMethodType__Alternatives_in_ruleHttpMethodType2231);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1088:1: ruleBooleanValue : ( ( rule__BooleanValue__Alternatives ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1092:1: ( ( ( rule__BooleanValue__Alternatives ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1093:1: ( ( rule__BooleanValue__Alternatives ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1093:1: ( ( rule__BooleanValue__Alternatives ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1094:1: ( rule__BooleanValue__Alternatives )
            {
             before(grammarAccess.getBooleanValueAccess().getAlternatives()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1095:1: ( rule__BooleanValue__Alternatives )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1095:2: rule__BooleanValue__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanValue__Alternatives_in_ruleBooleanValue2267);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1106:1: rule__Declaration__Alternatives : ( ( ruleUserTypeDeclaration ) | ( ruleApi ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1110:1: ( ( ruleUserTypeDeclaration ) | ( ruleApi ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==33||LA1_0==35) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1111:1: ( ruleUserTypeDeclaration )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1111:1: ( ruleUserTypeDeclaration )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1112:1: ruleUserTypeDeclaration
                    {
                     before(grammarAccess.getDeclarationAccess().getUserTypeDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUserTypeDeclaration_in_rule__Declaration__Alternatives2302);
                    ruleUserTypeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getUserTypeDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1117:6: ( ruleApi )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1117:6: ( ruleApi )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1118:1: ruleApi
                    {
                     before(grammarAccess.getDeclarationAccess().getApiParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleApi_in_rule__Declaration__Alternatives2319);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1128:1: rule__ServiceBlock__Alternatives : ( ( ruleHeaderBlock ) | ( ruleParamsBlock ) | ( ruleHttpMethod ) );
    public final void rule__ServiceBlock__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1132:1: ( ( ruleHeaderBlock ) | ( ruleParamsBlock ) | ( ruleHttpMethod ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 11:
            case 12:
            case 13:
            case 14:
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
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1133:1: ( ruleHeaderBlock )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1133:1: ( ruleHeaderBlock )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1134:1: ruleHeaderBlock
                    {
                     before(grammarAccess.getServiceBlockAccess().getHeaderBlockParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleHeaderBlock_in_rule__ServiceBlock__Alternatives2351);
                    ruleHeaderBlock();

                    state._fsp--;

                     after(grammarAccess.getServiceBlockAccess().getHeaderBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1139:6: ( ruleParamsBlock )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1139:6: ( ruleParamsBlock )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1140:1: ruleParamsBlock
                    {
                     before(grammarAccess.getServiceBlockAccess().getParamsBlockParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleParamsBlock_in_rule__ServiceBlock__Alternatives2368);
                    ruleParamsBlock();

                    state._fsp--;

                     after(grammarAccess.getServiceBlockAccess().getParamsBlockParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1145:6: ( ruleHttpMethod )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1145:6: ( ruleHttpMethod )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1146:1: ruleHttpMethod
                    {
                     before(grammarAccess.getServiceBlockAccess().getHttpMethodParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleHttpMethod_in_rule__ServiceBlock__Alternatives2385);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1156:1: rule__HttpMethodBlock__Alternatives : ( ( ruleHeaderBlock ) | ( ruleParamsBlock ) | ( ruleBodyBlock ) | ( ruleResponseBlock ) );
    public final void rule__HttpMethodBlock__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1160:1: ( ( ruleHeaderBlock ) | ( ruleParamsBlock ) | ( ruleBodyBlock ) | ( ruleResponseBlock ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            case 29:
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
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1161:1: ( ruleHeaderBlock )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1161:1: ( ruleHeaderBlock )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1162:1: ruleHeaderBlock
                    {
                     before(grammarAccess.getHttpMethodBlockAccess().getHeaderBlockParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleHeaderBlock_in_rule__HttpMethodBlock__Alternatives2417);
                    ruleHeaderBlock();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodBlockAccess().getHeaderBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1167:6: ( ruleParamsBlock )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1167:6: ( ruleParamsBlock )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1168:1: ruleParamsBlock
                    {
                     before(grammarAccess.getHttpMethodBlockAccess().getParamsBlockParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleParamsBlock_in_rule__HttpMethodBlock__Alternatives2434);
                    ruleParamsBlock();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodBlockAccess().getParamsBlockParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1173:6: ( ruleBodyBlock )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1173:6: ( ruleBodyBlock )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1174:1: ruleBodyBlock
                    {
                     before(grammarAccess.getHttpMethodBlockAccess().getBodyBlockParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBodyBlock_in_rule__HttpMethodBlock__Alternatives2451);
                    ruleBodyBlock();

                    state._fsp--;

                     after(grammarAccess.getHttpMethodBlockAccess().getBodyBlockParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1179:6: ( ruleResponseBlock )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1179:6: ( ruleResponseBlock )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1180:1: ruleResponseBlock
                    {
                     before(grammarAccess.getHttpMethodBlockAccess().getResponseBlockParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleResponseBlock_in_rule__HttpMethodBlock__Alternatives2468);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1190:1: rule__Path__Alternatives_2 : ( ( ruleArbitraryPathSegment ) | ( ( rule__Path__ParamsAssignment_2_1 ) ) );
    public final void rule__Path__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1194:1: ( ( ruleArbitraryPathSegment ) | ( ( rule__Path__ParamsAssignment_2_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==19||(LA4_1>=24 && LA4_1<=25)||LA4_1==31) ) {
                    alt4=1;
                }
                else if ( (LA4_1==23) ) {
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
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1195:1: ( ruleArbitraryPathSegment )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1195:1: ( ruleArbitraryPathSegment )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1196:1: ruleArbitraryPathSegment
                    {
                     before(grammarAccess.getPathAccess().getArbitraryPathSegmentParserRuleCall_2_0()); 
                    pushFollow(FOLLOW_ruleArbitraryPathSegment_in_rule__Path__Alternatives_22500);
                    ruleArbitraryPathSegment();

                    state._fsp--;

                     after(grammarAccess.getPathAccess().getArbitraryPathSegmentParserRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1201:6: ( ( rule__Path__ParamsAssignment_2_1 ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1201:6: ( ( rule__Path__ParamsAssignment_2_1 ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1202:1: ( rule__Path__ParamsAssignment_2_1 )
                    {
                     before(grammarAccess.getPathAccess().getParamsAssignment_2_1()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1203:1: ( rule__Path__ParamsAssignment_2_1 )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1203:2: rule__Path__ParamsAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Path__ParamsAssignment_2_1_in_rule__Path__Alternatives_22517);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1212:1: rule__Path__Alternatives_3_1 : ( ( ruleArbitraryPathSegment ) | ( ( rule__Path__ParamsAssignment_3_1_1 ) ) );
    public final void rule__Path__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1216:1: ( ( ruleArbitraryPathSegment ) | ( ( rule__Path__ParamsAssignment_3_1_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==23) ) {
                    alt5=2;
                }
                else if ( (LA5_1==EOF||LA5_1==19||(LA5_1>=24 && LA5_1<=25)||LA5_1==31) ) {
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
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1217:1: ( ruleArbitraryPathSegment )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1217:1: ( ruleArbitraryPathSegment )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1218:1: ruleArbitraryPathSegment
                    {
                     before(grammarAccess.getPathAccess().getArbitraryPathSegmentParserRuleCall_3_1_0()); 
                    pushFollow(FOLLOW_ruleArbitraryPathSegment_in_rule__Path__Alternatives_3_12550);
                    ruleArbitraryPathSegment();

                    state._fsp--;

                     after(grammarAccess.getPathAccess().getArbitraryPathSegmentParserRuleCall_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1223:6: ( ( rule__Path__ParamsAssignment_3_1_1 ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1223:6: ( ( rule__Path__ParamsAssignment_3_1_1 ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1224:1: ( rule__Path__ParamsAssignment_3_1_1 )
                    {
                     before(grammarAccess.getPathAccess().getParamsAssignment_3_1_1()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1225:1: ( rule__Path__ParamsAssignment_3_1_1 )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1225:2: rule__Path__ParamsAssignment_3_1_1
                    {
                    pushFollow(FOLLOW_rule__Path__ParamsAssignment_3_1_1_in_rule__Path__Alternatives_3_12567);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1234:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1238:1: ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
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
            case 25:
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
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1239:1: ( ( rule__Literal__Group_0__0 ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1239:1: ( ( rule__Literal__Group_0__0 ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1240:1: ( rule__Literal__Group_0__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_0()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1241:1: ( rule__Literal__Group_0__0 )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1241:2: rule__Literal__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives2600);
                    rule__Literal__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1245:6: ( ( rule__Literal__Group_1__0 ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1245:6: ( ( rule__Literal__Group_1__0 ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1246:1: ( rule__Literal__Group_1__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_1()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1247:1: ( rule__Literal__Group_1__0 )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1247:2: rule__Literal__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_1__0_in_rule__Literal__Alternatives2618);
                    rule__Literal__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1251:6: ( ( rule__Literal__Group_2__0 ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1251:6: ( ( rule__Literal__Group_2__0 ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1252:1: ( rule__Literal__Group_2__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_2()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1253:1: ( rule__Literal__Group_2__0 )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1253:2: rule__Literal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives2636);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1262:1: rule__BlockType__Alternatives : ( ( ruleType ) | ( ruleComplexTypeLiteral ) );
    public final void rule__BlockType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1266:1: ( ( ruleType ) | ( ruleComplexTypeLiteral ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||(LA7_0>=36 && LA7_0<=40)) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1267:1: ( ruleType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1267:1: ( ruleType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1268:1: ruleType
                    {
                     before(grammarAccess.getBlockTypeAccess().getTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleType_in_rule__BlockType__Alternatives2669);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getBlockTypeAccess().getTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1273:6: ( ruleComplexTypeLiteral )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1273:6: ( ruleComplexTypeLiteral )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1274:1: ruleComplexTypeLiteral
                    {
                     before(grammarAccess.getBlockTypeAccess().getComplexTypeLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleComplexTypeLiteral_in_rule__BlockType__Alternatives2686);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1284:1: rule__Member__NameAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Member__NameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1288:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1289:1: ( RULE_ID )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1289:1: ( RULE_ID )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1290:1: RULE_ID
                    {
                     before(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Member__NameAlternatives_0_02718); 
                     after(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1295:6: ( RULE_STRING )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1295:6: ( RULE_STRING )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1296:1: RULE_STRING
                    {
                     before(grammarAccess.getMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Member__NameAlternatives_0_02735); 
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


    // $ANTLR start "rule__SimpleMember__NameAlternatives_0_0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1306:1: rule__SimpleMember__NameAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__SimpleMember__NameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1310:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1311:1: ( RULE_ID )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1311:1: ( RULE_ID )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1312:1: RULE_ID
                    {
                     before(grammarAccess.getSimpleMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleMember__NameAlternatives_0_02767); 
                     after(grammarAccess.getSimpleMemberAccess().getNameIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1317:6: ( RULE_STRING )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1317:6: ( RULE_STRING )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1318:1: RULE_STRING
                    {
                     before(grammarAccess.getSimpleMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleMember__NameAlternatives_0_02784); 
                     after(grammarAccess.getSimpleMemberAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__SimpleMember__NameAlternatives_0_0"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1328:1: rule__Type__Alternatives : ( ( ruleUserType ) | ( ruleIntrinsicType ) | ( ruleArrayType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1332:1: ( ( ruleUserType ) | ( ruleIntrinsicType ) | ( ruleArrayType ) )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1333:1: ( ruleUserType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1333:1: ( ruleUserType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1334:1: ruleUserType
                    {
                     before(grammarAccess.getTypeAccess().getUserTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUserType_in_rule__Type__Alternatives2816);
                    ruleUserType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getUserTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1339:6: ( ruleIntrinsicType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1339:6: ( ruleIntrinsicType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1340:1: ruleIntrinsicType
                    {
                     before(grammarAccess.getTypeAccess().getIntrinsicTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntrinsicType_in_rule__Type__Alternatives2833);
                    ruleIntrinsicType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getIntrinsicTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1345:6: ( ruleArrayType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1345:6: ( ruleArrayType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1346:1: ruleArrayType
                    {
                     before(grammarAccess.getTypeAccess().getArrayTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleArrayType_in_rule__Type__Alternatives2850);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1356:1: rule__ArrayType__ElementTypeAlternatives_0_0 : ( ( ruleUserType ) | ( ruleIntrinsicType ) );
    public final void rule__ArrayType__ElementTypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1360:1: ( ( ruleUserType ) | ( ruleIntrinsicType ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=36 && LA11_0<=40)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1361:1: ( ruleUserType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1361:1: ( ruleUserType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1362:1: ruleUserType
                    {
                     before(grammarAccess.getArrayTypeAccess().getElementTypeUserTypeParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_ruleUserType_in_rule__ArrayType__ElementTypeAlternatives_0_02882);
                    ruleUserType();

                    state._fsp--;

                     after(grammarAccess.getArrayTypeAccess().getElementTypeUserTypeParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1367:6: ( ruleIntrinsicType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1367:6: ( ruleIntrinsicType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1368:1: ruleIntrinsicType
                    {
                     before(grammarAccess.getArrayTypeAccess().getElementTypeIntrinsicTypeParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_ruleIntrinsicType_in_rule__ArrayType__ElementTypeAlternatives_0_02899);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1378:1: rule__UserTypeDeclaration__Alternatives : ( ( ruleComplexTypeDeclaration ) | ( ruleEnumTypeDeclaration ) );
    public final void rule__UserTypeDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1382:1: ( ( ruleComplexTypeDeclaration ) | ( ruleEnumTypeDeclaration ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            else if ( (LA12_0==35) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1383:1: ( ruleComplexTypeDeclaration )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1383:1: ( ruleComplexTypeDeclaration )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1384:1: ruleComplexTypeDeclaration
                    {
                     before(grammarAccess.getUserTypeDeclarationAccess().getComplexTypeDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleComplexTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2931);
                    ruleComplexTypeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getUserTypeDeclarationAccess().getComplexTypeDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1389:6: ( ruleEnumTypeDeclaration )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1389:6: ( ruleEnumTypeDeclaration )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1390:1: ruleEnumTypeDeclaration
                    {
                     before(grammarAccess.getUserTypeDeclarationAccess().getEnumTypeDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2948);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1400:1: rule__IntrinsicType__Alternatives : ( ( ruleStringType ) | ( ruleBooleanType ) | ( ruleNumericType ) );
    public final void rule__IntrinsicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1404:1: ( ( ruleStringType ) | ( ruleBooleanType ) | ( ruleNumericType ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt13=1;
                }
                break;
            case 37:
                {
                alt13=2;
                }
                break;
            case 38:
            case 39:
            case 40:
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
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1405:1: ( ruleStringType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1405:1: ( ruleStringType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1406:1: ruleStringType
                    {
                     before(grammarAccess.getIntrinsicTypeAccess().getStringTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringType_in_rule__IntrinsicType__Alternatives2980);
                    ruleStringType();

                    state._fsp--;

                     after(grammarAccess.getIntrinsicTypeAccess().getStringTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1411:6: ( ruleBooleanType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1411:6: ( ruleBooleanType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1412:1: ruleBooleanType
                    {
                     before(grammarAccess.getIntrinsicTypeAccess().getBooleanTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanType_in_rule__IntrinsicType__Alternatives2997);
                    ruleBooleanType();

                    state._fsp--;

                     after(grammarAccess.getIntrinsicTypeAccess().getBooleanTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1417:6: ( ruleNumericType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1417:6: ( ruleNumericType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1418:1: ruleNumericType
                    {
                     before(grammarAccess.getIntrinsicTypeAccess().getNumericTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNumericType_in_rule__IntrinsicType__Alternatives3014);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1428:1: rule__NumericType__Alternatives : ( ( ruleIntegerType ) | ( ruleLongType ) | ( ruleDoubleType ) );
    public final void rule__NumericType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1432:1: ( ( ruleIntegerType ) | ( ruleLongType ) | ( ruleDoubleType ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt14=1;
                }
                break;
            case 39:
                {
                alt14=2;
                }
                break;
            case 40:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1433:1: ( ruleIntegerType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1433:1: ( ruleIntegerType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1434:1: ruleIntegerType
                    {
                     before(grammarAccess.getNumericTypeAccess().getIntegerTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntegerType_in_rule__NumericType__Alternatives3046);
                    ruleIntegerType();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeAccess().getIntegerTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1439:6: ( ruleLongType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1439:6: ( ruleLongType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1440:1: ruleLongType
                    {
                     before(grammarAccess.getNumericTypeAccess().getLongTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLongType_in_rule__NumericType__Alternatives3063);
                    ruleLongType();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeAccess().getLongTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1445:6: ( ruleDoubleType )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1445:6: ( ruleDoubleType )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1446:1: ruleDoubleType
                    {
                     before(grammarAccess.getNumericTypeAccess().getDoubleTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDoubleType_in_rule__NumericType__Alternatives3080);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1456:1: rule__HttpMethodType__Alternatives : ( ( ( 'get' ) ) | ( ( 'put' ) ) | ( ( 'post' ) ) | ( ( 'delete' ) ) );
    public final void rule__HttpMethodType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1460:1: ( ( ( 'get' ) ) | ( ( 'put' ) ) | ( ( 'post' ) ) | ( ( 'delete' ) ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt15=1;
                }
                break;
            case 12:
                {
                alt15=2;
                }
                break;
            case 13:
                {
                alt15=3;
                }
                break;
            case 14:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1461:1: ( ( 'get' ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1461:1: ( ( 'get' ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1462:1: ( 'get' )
                    {
                     before(grammarAccess.getHttpMethodTypeAccess().getGetEnumLiteralDeclaration_0()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1463:1: ( 'get' )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1463:3: 'get'
                    {
                    match(input,11,FOLLOW_11_in_rule__HttpMethodType__Alternatives3113); 

                    }

                     after(grammarAccess.getHttpMethodTypeAccess().getGetEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1468:6: ( ( 'put' ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1468:6: ( ( 'put' ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1469:1: ( 'put' )
                    {
                     before(grammarAccess.getHttpMethodTypeAccess().getPutEnumLiteralDeclaration_1()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1470:1: ( 'put' )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1470:3: 'put'
                    {
                    match(input,12,FOLLOW_12_in_rule__HttpMethodType__Alternatives3134); 

                    }

                     after(grammarAccess.getHttpMethodTypeAccess().getPutEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1475:6: ( ( 'post' ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1475:6: ( ( 'post' ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1476:1: ( 'post' )
                    {
                     before(grammarAccess.getHttpMethodTypeAccess().getPostEnumLiteralDeclaration_2()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1477:1: ( 'post' )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1477:3: 'post'
                    {
                    match(input,13,FOLLOW_13_in_rule__HttpMethodType__Alternatives3155); 

                    }

                     after(grammarAccess.getHttpMethodTypeAccess().getPostEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1482:6: ( ( 'delete' ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1482:6: ( ( 'delete' ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1483:1: ( 'delete' )
                    {
                     before(grammarAccess.getHttpMethodTypeAccess().getDeleteEnumLiteralDeclaration_3()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1484:1: ( 'delete' )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1484:3: 'delete'
                    {
                    match(input,14,FOLLOW_14_in_rule__HttpMethodType__Alternatives3176); 

                    }

                     after(grammarAccess.getHttpMethodTypeAccess().getDeleteEnumLiteralDeclaration_3()); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1494:1: rule__BooleanValue__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BooleanValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1498:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==15) ) {
                alt16=1;
            }
            else if ( (LA16_0==16) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1499:1: ( ( 'true' ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1499:1: ( ( 'true' ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1500:1: ( 'true' )
                    {
                     before(grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1501:1: ( 'true' )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1501:3: 'true'
                    {
                    match(input,15,FOLLOW_15_in_rule__BooleanValue__Alternatives3212); 

                    }

                     after(grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1506:6: ( ( 'false' ) )
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1506:6: ( ( 'false' ) )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1507:1: ( 'false' )
                    {
                     before(grammarAccess.getBooleanValueAccess().getFalseEnumLiteralDeclaration_1()); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1508:1: ( 'false' )
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1508:3: 'false'
                    {
                    match(input,16,FOLLOW_16_in_rule__BooleanValue__Alternatives3233); 

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


    // $ANTLR start "rule__Model__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1520:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1524:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1525:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03266);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03269);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1532:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1536:1: ( ( 'package' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1537:1: ( 'package' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1537:1: ( 'package' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1538:1: 'package'
            {
             before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Model__Group__0__Impl3297); 
             after(grammarAccess.getModelAccess().getPackageKeyword_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1551:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1555:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1556:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13328);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13331);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1563:1: rule__Model__Group__1__Impl : ( ( rule__Model__PackageNameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1567:1: ( ( ( rule__Model__PackageNameAssignment_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1568:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1568:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1569:1: ( rule__Model__PackageNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getPackageNameAssignment_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1570:1: ( rule__Model__PackageNameAssignment_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1570:2: rule__Model__PackageNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl3358);
            rule__Model__PackageNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPackageNameAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1580:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1584:1: ( rule__Model__Group__2__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1585:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23388);
            rule__Model__Group__2__Impl();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1591:1: rule__Model__Group__2__Impl : ( ( rule__Model__DeclarationsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1595:1: ( ( ( rule__Model__DeclarationsAssignment_2 )* ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1596:1: ( ( rule__Model__DeclarationsAssignment_2 )* )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1596:1: ( ( rule__Model__DeclarationsAssignment_2 )* )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1597:1: ( rule__Model__DeclarationsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getDeclarationsAssignment_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1598:1: ( rule__Model__DeclarationsAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18||LA17_0==33||LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1598:2: rule__Model__DeclarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__DeclarationsAssignment_2_in_rule__Model__Group__2__Impl3415);
            	    rule__Model__DeclarationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDeclarationsAssignment_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Api__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1614:1: rule__Api__Group__0 : rule__Api__Group__0__Impl rule__Api__Group__1 ;
    public final void rule__Api__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1618:1: ( rule__Api__Group__0__Impl rule__Api__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1619:2: rule__Api__Group__0__Impl rule__Api__Group__1
            {
            pushFollow(FOLLOW_rule__Api__Group__0__Impl_in_rule__Api__Group__03452);
            rule__Api__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Api__Group__1_in_rule__Api__Group__03455);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1626:1: rule__Api__Group__0__Impl : ( 'api' ) ;
    public final void rule__Api__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1630:1: ( ( 'api' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1631:1: ( 'api' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1631:1: ( 'api' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1632:1: 'api'
            {
             before(grammarAccess.getApiAccess().getApiKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Api__Group__0__Impl3483); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1645:1: rule__Api__Group__1 : rule__Api__Group__1__Impl rule__Api__Group__2 ;
    public final void rule__Api__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1649:1: ( rule__Api__Group__1__Impl rule__Api__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1650:2: rule__Api__Group__1__Impl rule__Api__Group__2
            {
            pushFollow(FOLLOW_rule__Api__Group__1__Impl_in_rule__Api__Group__13514);
            rule__Api__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Api__Group__2_in_rule__Api__Group__13517);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1657:1: rule__Api__Group__1__Impl : ( ( rule__Api__NameAssignment_1 ) ) ;
    public final void rule__Api__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1661:1: ( ( ( rule__Api__NameAssignment_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1662:1: ( ( rule__Api__NameAssignment_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1662:1: ( ( rule__Api__NameAssignment_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1663:1: ( rule__Api__NameAssignment_1 )
            {
             before(grammarAccess.getApiAccess().getNameAssignment_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1664:1: ( rule__Api__NameAssignment_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1664:2: rule__Api__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Api__NameAssignment_1_in_rule__Api__Group__1__Impl3544);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1674:1: rule__Api__Group__2 : rule__Api__Group__2__Impl rule__Api__Group__3 ;
    public final void rule__Api__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1678:1: ( rule__Api__Group__2__Impl rule__Api__Group__3 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1679:2: rule__Api__Group__2__Impl rule__Api__Group__3
            {
            pushFollow(FOLLOW_rule__Api__Group__2__Impl_in_rule__Api__Group__23574);
            rule__Api__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Api__Group__3_in_rule__Api__Group__23577);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1686:1: rule__Api__Group__2__Impl : ( ( rule__Api__BaseUrlAssignment_2 )? ) ;
    public final void rule__Api__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1690:1: ( ( ( rule__Api__BaseUrlAssignment_2 )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1691:1: ( ( rule__Api__BaseUrlAssignment_2 )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1691:1: ( ( rule__Api__BaseUrlAssignment_2 )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1692:1: ( rule__Api__BaseUrlAssignment_2 )?
            {
             before(grammarAccess.getApiAccess().getBaseUrlAssignment_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1693:1: ( rule__Api__BaseUrlAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1693:2: rule__Api__BaseUrlAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Api__BaseUrlAssignment_2_in_rule__Api__Group__2__Impl3604);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1703:1: rule__Api__Group__3 : rule__Api__Group__3__Impl rule__Api__Group__4 ;
    public final void rule__Api__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1707:1: ( rule__Api__Group__3__Impl rule__Api__Group__4 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1708:2: rule__Api__Group__3__Impl rule__Api__Group__4
            {
            pushFollow(FOLLOW_rule__Api__Group__3__Impl_in_rule__Api__Group__33635);
            rule__Api__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Api__Group__4_in_rule__Api__Group__33638);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1715:1: rule__Api__Group__3__Impl : ( '{' ) ;
    public final void rule__Api__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1719:1: ( ( '{' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1720:1: ( '{' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1720:1: ( '{' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1721:1: '{'
            {
             before(grammarAccess.getApiAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__Api__Group__3__Impl3666); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1734:1: rule__Api__Group__4 : rule__Api__Group__4__Impl rule__Api__Group__5 ;
    public final void rule__Api__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1738:1: ( rule__Api__Group__4__Impl rule__Api__Group__5 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1739:2: rule__Api__Group__4__Impl rule__Api__Group__5
            {
            pushFollow(FOLLOW_rule__Api__Group__4__Impl_in_rule__Api__Group__43697);
            rule__Api__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Api__Group__5_in_rule__Api__Group__43700);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1746:1: rule__Api__Group__4__Impl : ( ( rule__Api__BlocksAssignment_4 )* ) ;
    public final void rule__Api__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1750:1: ( ( ( rule__Api__BlocksAssignment_4 )* ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1751:1: ( ( rule__Api__BlocksAssignment_4 )* )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1751:1: ( ( rule__Api__BlocksAssignment_4 )* )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1752:1: ( rule__Api__BlocksAssignment_4 )*
            {
             before(grammarAccess.getApiAccess().getBlocksAssignment_4()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1753:1: ( rule__Api__BlocksAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=11 && LA19_0<=14)||LA19_0==21||LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1753:2: rule__Api__BlocksAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Api__BlocksAssignment_4_in_rule__Api__Group__4__Impl3727);
            	    rule__Api__BlocksAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1763:1: rule__Api__Group__5 : rule__Api__Group__5__Impl ;
    public final void rule__Api__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1767:1: ( rule__Api__Group__5__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1768:2: rule__Api__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Api__Group__5__Impl_in_rule__Api__Group__53758);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1774:1: rule__Api__Group__5__Impl : ( '}' ) ;
    public final void rule__Api__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1778:1: ( ( '}' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1779:1: ( '}' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1779:1: ( '}' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1780:1: '}'
            {
             before(grammarAccess.getApiAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__Api__Group__5__Impl3786); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1805:1: rule__HeaderBlock__Group__0 : rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 ;
    public final void rule__HeaderBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1809:1: ( rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1810:2: rule__HeaderBlock__Group__0__Impl rule__HeaderBlock__Group__1
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group__0__Impl_in_rule__HeaderBlock__Group__03829);
            rule__HeaderBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HeaderBlock__Group__1_in_rule__HeaderBlock__Group__03832);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1817:1: rule__HeaderBlock__Group__0__Impl : ( 'headers' ) ;
    public final void rule__HeaderBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1821:1: ( ( 'headers' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1822:1: ( 'headers' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1822:1: ( 'headers' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1823:1: 'headers'
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__HeaderBlock__Group__0__Impl3860); 
             after(grammarAccess.getHeaderBlockAccess().getHeadersKeyword_0()); 

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
    // $ANTLR end "rule__HeaderBlock__Group__0__Impl"


    // $ANTLR start "rule__HeaderBlock__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1836:1: rule__HeaderBlock__Group__1 : rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 ;
    public final void rule__HeaderBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1840:1: ( rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1841:2: rule__HeaderBlock__Group__1__Impl rule__HeaderBlock__Group__2
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group__1__Impl_in_rule__HeaderBlock__Group__13891);
            rule__HeaderBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HeaderBlock__Group__2_in_rule__HeaderBlock__Group__13894);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1848:1: rule__HeaderBlock__Group__1__Impl : ( ( rule__HeaderBlock__HeadersAssignment_1 ) ) ;
    public final void rule__HeaderBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1852:1: ( ( ( rule__HeaderBlock__HeadersAssignment_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1853:1: ( ( rule__HeaderBlock__HeadersAssignment_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1853:1: ( ( rule__HeaderBlock__HeadersAssignment_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1854:1: ( rule__HeaderBlock__HeadersAssignment_1 )
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersAssignment_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1855:1: ( rule__HeaderBlock__HeadersAssignment_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1855:2: rule__HeaderBlock__HeadersAssignment_1
            {
            pushFollow(FOLLOW_rule__HeaderBlock__HeadersAssignment_1_in_rule__HeaderBlock__Group__1__Impl3921);
            rule__HeaderBlock__HeadersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeaderBlockAccess().getHeadersAssignment_1()); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1865:1: rule__HeaderBlock__Group__2 : rule__HeaderBlock__Group__2__Impl ;
    public final void rule__HeaderBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1869:1: ( rule__HeaderBlock__Group__2__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1870:2: rule__HeaderBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group__2__Impl_in_rule__HeaderBlock__Group__23951);
            rule__HeaderBlock__Group__2__Impl();

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1876:1: rule__HeaderBlock__Group__2__Impl : ( ( rule__HeaderBlock__Group_2__0 )* ) ;
    public final void rule__HeaderBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1880:1: ( ( ( rule__HeaderBlock__Group_2__0 )* ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1881:1: ( ( rule__HeaderBlock__Group_2__0 )* )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1881:1: ( ( rule__HeaderBlock__Group_2__0 )* )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1882:1: ( rule__HeaderBlock__Group_2__0 )*
            {
             before(grammarAccess.getHeaderBlockAccess().getGroup_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1883:1: ( rule__HeaderBlock__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1883:2: rule__HeaderBlock__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__HeaderBlock__Group_2__0_in_rule__HeaderBlock__Group__2__Impl3978);
            	    rule__HeaderBlock__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getHeaderBlockAccess().getGroup_2()); 

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


    // $ANTLR start "rule__HeaderBlock__Group_2__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1899:1: rule__HeaderBlock__Group_2__0 : rule__HeaderBlock__Group_2__0__Impl rule__HeaderBlock__Group_2__1 ;
    public final void rule__HeaderBlock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1903:1: ( rule__HeaderBlock__Group_2__0__Impl rule__HeaderBlock__Group_2__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1904:2: rule__HeaderBlock__Group_2__0__Impl rule__HeaderBlock__Group_2__1
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group_2__0__Impl_in_rule__HeaderBlock__Group_2__04015);
            rule__HeaderBlock__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HeaderBlock__Group_2__1_in_rule__HeaderBlock__Group_2__04018);
            rule__HeaderBlock__Group_2__1();

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
    // $ANTLR end "rule__HeaderBlock__Group_2__0"


    // $ANTLR start "rule__HeaderBlock__Group_2__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1911:1: rule__HeaderBlock__Group_2__0__Impl : ( ',' ) ;
    public final void rule__HeaderBlock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1915:1: ( ( ',' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1916:1: ( ',' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1916:1: ( ',' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1917:1: ','
            {
             before(grammarAccess.getHeaderBlockAccess().getCommaKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__HeaderBlock__Group_2__0__Impl4046); 
             after(grammarAccess.getHeaderBlockAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__HeaderBlock__Group_2__0__Impl"


    // $ANTLR start "rule__HeaderBlock__Group_2__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1930:1: rule__HeaderBlock__Group_2__1 : rule__HeaderBlock__Group_2__1__Impl ;
    public final void rule__HeaderBlock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1934:1: ( rule__HeaderBlock__Group_2__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1935:2: rule__HeaderBlock__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__HeaderBlock__Group_2__1__Impl_in_rule__HeaderBlock__Group_2__14077);
            rule__HeaderBlock__Group_2__1__Impl();

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
    // $ANTLR end "rule__HeaderBlock__Group_2__1"


    // $ANTLR start "rule__HeaderBlock__Group_2__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1941:1: rule__HeaderBlock__Group_2__1__Impl : ( ( rule__HeaderBlock__HeadersAssignment_2_1 ) ) ;
    public final void rule__HeaderBlock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1945:1: ( ( ( rule__HeaderBlock__HeadersAssignment_2_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1946:1: ( ( rule__HeaderBlock__HeadersAssignment_2_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1946:1: ( ( rule__HeaderBlock__HeadersAssignment_2_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1947:1: ( rule__HeaderBlock__HeadersAssignment_2_1 )
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersAssignment_2_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1948:1: ( rule__HeaderBlock__HeadersAssignment_2_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1948:2: rule__HeaderBlock__HeadersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__HeaderBlock__HeadersAssignment_2_1_in_rule__HeaderBlock__Group_2__1__Impl4104);
            rule__HeaderBlock__HeadersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHeaderBlockAccess().getHeadersAssignment_2_1()); 

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
    // $ANTLR end "rule__HeaderBlock__Group_2__1__Impl"


    // $ANTLR start "rule__Header__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1962:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1966:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1967:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_rule__Header__Group__0__Impl_in_rule__Header__Group__04138);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__1_in_rule__Header__Group__04141);
            rule__Header__Group__1();

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
    // $ANTLR end "rule__Header__Group__0"


    // $ANTLR start "rule__Header__Group__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1974:1: rule__Header__Group__0__Impl : ( ( rule__Header__NameAssignment_0 ) ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1978:1: ( ( ( rule__Header__NameAssignment_0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1979:1: ( ( rule__Header__NameAssignment_0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1979:1: ( ( rule__Header__NameAssignment_0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1980:1: ( rule__Header__NameAssignment_0 )
            {
             before(grammarAccess.getHeaderAccess().getNameAssignment_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1981:1: ( rule__Header__NameAssignment_0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1981:2: rule__Header__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Header__NameAssignment_0_in_rule__Header__Group__0__Impl4168);
            rule__Header__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Header__Group__0__Impl"


    // $ANTLR start "rule__Header__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1991:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1995:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1996:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_rule__Header__Group__1__Impl_in_rule__Header__Group__14198);
            rule__Header__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__2_in_rule__Header__Group__14201);
            rule__Header__Group__2();

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
    // $ANTLR end "rule__Header__Group__1"


    // $ANTLR start "rule__Header__Group__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2003:1: rule__Header__Group__1__Impl : ( ':' ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2007:1: ( ( ':' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2008:1: ( ':' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2008:1: ( ':' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2009:1: ':'
            {
             before(grammarAccess.getHeaderAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Header__Group__1__Impl4229); 
             after(grammarAccess.getHeaderAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Header__Group__1__Impl"


    // $ANTLR start "rule__Header__Group__2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2022:1: rule__Header__Group__2 : rule__Header__Group__2__Impl ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2026:1: ( rule__Header__Group__2__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2027:2: rule__Header__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group__2__Impl_in_rule__Header__Group__24260);
            rule__Header__Group__2__Impl();

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
    // $ANTLR end "rule__Header__Group__2"


    // $ANTLR start "rule__Header__Group__2__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2033:1: rule__Header__Group__2__Impl : ( ( rule__Header__ValueAssignment_2 ) ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2037:1: ( ( ( rule__Header__ValueAssignment_2 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2038:1: ( ( rule__Header__ValueAssignment_2 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2038:1: ( ( rule__Header__ValueAssignment_2 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2039:1: ( rule__Header__ValueAssignment_2 )
            {
             before(grammarAccess.getHeaderAccess().getValueAssignment_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2040:1: ( rule__Header__ValueAssignment_2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2040:2: rule__Header__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Header__ValueAssignment_2_in_rule__Header__Group__2__Impl4287);
            rule__Header__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__Header__Group__2__Impl"


    // $ANTLR start "rule__HttpMethod__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2056:1: rule__HttpMethod__Group__0 : rule__HttpMethod__Group__0__Impl rule__HttpMethod__Group__1 ;
    public final void rule__HttpMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2060:1: ( rule__HttpMethod__Group__0__Impl rule__HttpMethod__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2061:2: rule__HttpMethod__Group__0__Impl rule__HttpMethod__Group__1
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__0__Impl_in_rule__HttpMethod__Group__04323);
            rule__HttpMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__1_in_rule__HttpMethod__Group__04326);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2068:1: rule__HttpMethod__Group__0__Impl : ( ( rule__HttpMethod__TypeAssignment_0 ) ) ;
    public final void rule__HttpMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2072:1: ( ( ( rule__HttpMethod__TypeAssignment_0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2073:1: ( ( rule__HttpMethod__TypeAssignment_0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2073:1: ( ( rule__HttpMethod__TypeAssignment_0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2074:1: ( rule__HttpMethod__TypeAssignment_0 )
            {
             before(grammarAccess.getHttpMethodAccess().getTypeAssignment_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2075:1: ( rule__HttpMethod__TypeAssignment_0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2075:2: rule__HttpMethod__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__HttpMethod__TypeAssignment_0_in_rule__HttpMethod__Group__0__Impl4353);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2085:1: rule__HttpMethod__Group__1 : rule__HttpMethod__Group__1__Impl rule__HttpMethod__Group__2 ;
    public final void rule__HttpMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2089:1: ( rule__HttpMethod__Group__1__Impl rule__HttpMethod__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2090:2: rule__HttpMethod__Group__1__Impl rule__HttpMethod__Group__2
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__1__Impl_in_rule__HttpMethod__Group__14383);
            rule__HttpMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__2_in_rule__HttpMethod__Group__14386);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2097:1: rule__HttpMethod__Group__1__Impl : ( ( rule__HttpMethod__NameAssignment_1 ) ) ;
    public final void rule__HttpMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2101:1: ( ( ( rule__HttpMethod__NameAssignment_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2102:1: ( ( rule__HttpMethod__NameAssignment_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2102:1: ( ( rule__HttpMethod__NameAssignment_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2103:1: ( rule__HttpMethod__NameAssignment_1 )
            {
             before(grammarAccess.getHttpMethodAccess().getNameAssignment_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2104:1: ( rule__HttpMethod__NameAssignment_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2104:2: rule__HttpMethod__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__HttpMethod__NameAssignment_1_in_rule__HttpMethod__Group__1__Impl4413);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2114:1: rule__HttpMethod__Group__2 : rule__HttpMethod__Group__2__Impl rule__HttpMethod__Group__3 ;
    public final void rule__HttpMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2118:1: ( rule__HttpMethod__Group__2__Impl rule__HttpMethod__Group__3 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2119:2: rule__HttpMethod__Group__2__Impl rule__HttpMethod__Group__3
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__2__Impl_in_rule__HttpMethod__Group__24443);
            rule__HttpMethod__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__3_in_rule__HttpMethod__Group__24446);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2126:1: rule__HttpMethod__Group__2__Impl : ( ( rule__HttpMethod__PathAssignment_2 )? ) ;
    public final void rule__HttpMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2130:1: ( ( ( rule__HttpMethod__PathAssignment_2 )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2131:1: ( ( rule__HttpMethod__PathAssignment_2 )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2131:1: ( ( rule__HttpMethod__PathAssignment_2 )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2132:1: ( rule__HttpMethod__PathAssignment_2 )?
            {
             before(grammarAccess.getHttpMethodAccess().getPathAssignment_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2133:1: ( rule__HttpMethod__PathAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2133:2: rule__HttpMethod__PathAssignment_2
                    {
                    pushFollow(FOLLOW_rule__HttpMethod__PathAssignment_2_in_rule__HttpMethod__Group__2__Impl4473);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2143:1: rule__HttpMethod__Group__3 : rule__HttpMethod__Group__3__Impl rule__HttpMethod__Group__4 ;
    public final void rule__HttpMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2147:1: ( rule__HttpMethod__Group__3__Impl rule__HttpMethod__Group__4 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2148:2: rule__HttpMethod__Group__3__Impl rule__HttpMethod__Group__4
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__3__Impl_in_rule__HttpMethod__Group__34504);
            rule__HttpMethod__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__4_in_rule__HttpMethod__Group__34507);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2155:1: rule__HttpMethod__Group__3__Impl : ( '{' ) ;
    public final void rule__HttpMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2159:1: ( ( '{' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2160:1: ( '{' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2160:1: ( '{' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2161:1: '{'
            {
             before(grammarAccess.getHttpMethodAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__HttpMethod__Group__3__Impl4535); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2174:1: rule__HttpMethod__Group__4 : rule__HttpMethod__Group__4__Impl rule__HttpMethod__Group__5 ;
    public final void rule__HttpMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2178:1: ( rule__HttpMethod__Group__4__Impl rule__HttpMethod__Group__5 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2179:2: rule__HttpMethod__Group__4__Impl rule__HttpMethod__Group__5
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__4__Impl_in_rule__HttpMethod__Group__44566);
            rule__HttpMethod__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__5_in_rule__HttpMethod__Group__44569);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2186:1: rule__HttpMethod__Group__4__Impl : ( ( rule__HttpMethod__BlocksAssignment_4 )* ) ;
    public final void rule__HttpMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2190:1: ( ( ( rule__HttpMethod__BlocksAssignment_4 )* ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2191:1: ( ( rule__HttpMethod__BlocksAssignment_4 )* )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2191:1: ( ( rule__HttpMethod__BlocksAssignment_4 )* )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2192:1: ( rule__HttpMethod__BlocksAssignment_4 )*
            {
             before(grammarAccess.getHttpMethodAccess().getBlocksAssignment_4()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2193:1: ( rule__HttpMethod__BlocksAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==21||LA22_0==26||(LA22_0>=28 && LA22_0<=29)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2193:2: rule__HttpMethod__BlocksAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__HttpMethod__BlocksAssignment_4_in_rule__HttpMethod__Group__4__Impl4596);
            	    rule__HttpMethod__BlocksAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2203:1: rule__HttpMethod__Group__5 : rule__HttpMethod__Group__5__Impl ;
    public final void rule__HttpMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2207:1: ( rule__HttpMethod__Group__5__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2208:2: rule__HttpMethod__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__5__Impl_in_rule__HttpMethod__Group__54627);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2214:1: rule__HttpMethod__Group__5__Impl : ( '}' ) ;
    public final void rule__HttpMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2218:1: ( ( '}' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2219:1: ( '}' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2219:1: ( '}' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2220:1: '}'
            {
             before(grammarAccess.getHttpMethodAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__HttpMethod__Group__5__Impl4655); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2245:1: rule__Path__Group__0 : rule__Path__Group__0__Impl rule__Path__Group__1 ;
    public final void rule__Path__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2249:1: ( rule__Path__Group__0__Impl rule__Path__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2250:2: rule__Path__Group__0__Impl rule__Path__Group__1
            {
            pushFollow(FOLLOW_rule__Path__Group__0__Impl_in_rule__Path__Group__04698);
            rule__Path__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Path__Group__1_in_rule__Path__Group__04701);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2257:1: rule__Path__Group__0__Impl : ( () ) ;
    public final void rule__Path__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2261:1: ( ( () ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2262:1: ( () )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2262:1: ( () )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2263:1: ()
            {
             before(grammarAccess.getPathAccess().getPathAction_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2264:1: ()
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2266:1: 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2276:1: rule__Path__Group__1 : rule__Path__Group__1__Impl rule__Path__Group__2 ;
    public final void rule__Path__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2280:1: ( rule__Path__Group__1__Impl rule__Path__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2281:2: rule__Path__Group__1__Impl rule__Path__Group__2
            {
            pushFollow(FOLLOW_rule__Path__Group__1__Impl_in_rule__Path__Group__14759);
            rule__Path__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Path__Group__2_in_rule__Path__Group__14762);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2288:1: rule__Path__Group__1__Impl : ( '/' ) ;
    public final void rule__Path__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2292:1: ( ( '/' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2293:1: ( '/' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2293:1: ( '/' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2294:1: '/'
            {
             before(grammarAccess.getPathAccess().getSolidusKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Path__Group__1__Impl4790); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2307:1: rule__Path__Group__2 : rule__Path__Group__2__Impl rule__Path__Group__3 ;
    public final void rule__Path__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2311:1: ( rule__Path__Group__2__Impl rule__Path__Group__3 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2312:2: rule__Path__Group__2__Impl rule__Path__Group__3
            {
            pushFollow(FOLLOW_rule__Path__Group__2__Impl_in_rule__Path__Group__24821);
            rule__Path__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Path__Group__3_in_rule__Path__Group__24824);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2319:1: rule__Path__Group__2__Impl : ( ( rule__Path__Alternatives_2 ) ) ;
    public final void rule__Path__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2323:1: ( ( ( rule__Path__Alternatives_2 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2324:1: ( ( rule__Path__Alternatives_2 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2324:1: ( ( rule__Path__Alternatives_2 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2325:1: ( rule__Path__Alternatives_2 )
            {
             before(grammarAccess.getPathAccess().getAlternatives_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2326:1: ( rule__Path__Alternatives_2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2326:2: rule__Path__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Path__Alternatives_2_in_rule__Path__Group__2__Impl4851);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2336:1: rule__Path__Group__3 : rule__Path__Group__3__Impl ;
    public final void rule__Path__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2340:1: ( rule__Path__Group__3__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2341:2: rule__Path__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Path__Group__3__Impl_in_rule__Path__Group__34881);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2347:1: rule__Path__Group__3__Impl : ( ( rule__Path__Group_3__0 )* ) ;
    public final void rule__Path__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2351:1: ( ( ( rule__Path__Group_3__0 )* ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2352:1: ( ( rule__Path__Group_3__0 )* )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2352:1: ( ( rule__Path__Group_3__0 )* )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2353:1: ( rule__Path__Group_3__0 )*
            {
             before(grammarAccess.getPathAccess().getGroup_3()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2354:1: ( rule__Path__Group_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==24) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2354:2: rule__Path__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Path__Group_3__0_in_rule__Path__Group__3__Impl4908);
            	    rule__Path__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2372:1: rule__Path__Group_3__0 : rule__Path__Group_3__0__Impl rule__Path__Group_3__1 ;
    public final void rule__Path__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2376:1: ( rule__Path__Group_3__0__Impl rule__Path__Group_3__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2377:2: rule__Path__Group_3__0__Impl rule__Path__Group_3__1
            {
            pushFollow(FOLLOW_rule__Path__Group_3__0__Impl_in_rule__Path__Group_3__04947);
            rule__Path__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Path__Group_3__1_in_rule__Path__Group_3__04950);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2384:1: rule__Path__Group_3__0__Impl : ( '/' ) ;
    public final void rule__Path__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2388:1: ( ( '/' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2389:1: ( '/' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2389:1: ( '/' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2390:1: '/'
            {
             before(grammarAccess.getPathAccess().getSolidusKeyword_3_0()); 
            match(input,24,FOLLOW_24_in_rule__Path__Group_3__0__Impl4978); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2403:1: rule__Path__Group_3__1 : rule__Path__Group_3__1__Impl ;
    public final void rule__Path__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2407:1: ( rule__Path__Group_3__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2408:2: rule__Path__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Path__Group_3__1__Impl_in_rule__Path__Group_3__15009);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2414:1: rule__Path__Group_3__1__Impl : ( ( rule__Path__Alternatives_3_1 ) ) ;
    public final void rule__Path__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2418:1: ( ( ( rule__Path__Alternatives_3_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2419:1: ( ( rule__Path__Alternatives_3_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2419:1: ( ( rule__Path__Alternatives_3_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2420:1: ( rule__Path__Alternatives_3_1 )
            {
             before(grammarAccess.getPathAccess().getAlternatives_3_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2421:1: ( rule__Path__Alternatives_3_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2421:2: rule__Path__Alternatives_3_1
            {
            pushFollow(FOLLOW_rule__Path__Alternatives_3_1_in_rule__Path__Group_3__1__Impl5036);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2435:1: rule__ArbitraryPathSegment__Group__0 : rule__ArbitraryPathSegment__Group__0__Impl rule__ArbitraryPathSegment__Group__1 ;
    public final void rule__ArbitraryPathSegment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2439:1: ( rule__ArbitraryPathSegment__Group__0__Impl rule__ArbitraryPathSegment__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2440:2: rule__ArbitraryPathSegment__Group__0__Impl rule__ArbitraryPathSegment__Group__1
            {
            pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group__0__Impl_in_rule__ArbitraryPathSegment__Group__05070);
            rule__ArbitraryPathSegment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group__1_in_rule__ArbitraryPathSegment__Group__05073);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2447:1: rule__ArbitraryPathSegment__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__ArbitraryPathSegment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2451:1: ( ( ruleQualifiedName ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2452:1: ( ruleQualifiedName )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2452:1: ( ruleQualifiedName )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2453:1: ruleQualifiedName
            {
             before(grammarAccess.getArbitraryPathSegmentAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ArbitraryPathSegment__Group__0__Impl5100);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2464:1: rule__ArbitraryPathSegment__Group__1 : rule__ArbitraryPathSegment__Group__1__Impl ;
    public final void rule__ArbitraryPathSegment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2468:1: ( rule__ArbitraryPathSegment__Group__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2469:2: rule__ArbitraryPathSegment__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group__1__Impl_in_rule__ArbitraryPathSegment__Group__15129);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2475:1: rule__ArbitraryPathSegment__Group__1__Impl : ( ( rule__ArbitraryPathSegment__Group_1__0 )* ) ;
    public final void rule__ArbitraryPathSegment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2479:1: ( ( ( rule__ArbitraryPathSegment__Group_1__0 )* ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2480:1: ( ( rule__ArbitraryPathSegment__Group_1__0 )* )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2480:1: ( ( rule__ArbitraryPathSegment__Group_1__0 )* )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2481:1: ( rule__ArbitraryPathSegment__Group_1__0 )*
            {
             before(grammarAccess.getArbitraryPathSegmentAccess().getGroup_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2482:1: ( rule__ArbitraryPathSegment__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==25) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2482:2: rule__ArbitraryPathSegment__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group_1__0_in_rule__ArbitraryPathSegment__Group__1__Impl5156);
            	    rule__ArbitraryPathSegment__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2496:1: rule__ArbitraryPathSegment__Group_1__0 : rule__ArbitraryPathSegment__Group_1__0__Impl rule__ArbitraryPathSegment__Group_1__1 ;
    public final void rule__ArbitraryPathSegment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2500:1: ( rule__ArbitraryPathSegment__Group_1__0__Impl rule__ArbitraryPathSegment__Group_1__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2501:2: rule__ArbitraryPathSegment__Group_1__0__Impl rule__ArbitraryPathSegment__Group_1__1
            {
            pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group_1__0__Impl_in_rule__ArbitraryPathSegment__Group_1__05191);
            rule__ArbitraryPathSegment__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group_1__1_in_rule__ArbitraryPathSegment__Group_1__05194);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2508:1: rule__ArbitraryPathSegment__Group_1__0__Impl : ( '-' ) ;
    public final void rule__ArbitraryPathSegment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2512:1: ( ( '-' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2513:1: ( '-' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2513:1: ( '-' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2514:1: '-'
            {
             before(grammarAccess.getArbitraryPathSegmentAccess().getHyphenMinusKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__ArbitraryPathSegment__Group_1__0__Impl5222); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2527:1: rule__ArbitraryPathSegment__Group_1__1 : rule__ArbitraryPathSegment__Group_1__1__Impl ;
    public final void rule__ArbitraryPathSegment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2531:1: ( rule__ArbitraryPathSegment__Group_1__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2532:2: rule__ArbitraryPathSegment__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ArbitraryPathSegment__Group_1__1__Impl_in_rule__ArbitraryPathSegment__Group_1__15253);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2538:1: rule__ArbitraryPathSegment__Group_1__1__Impl : ( ruleQualifiedName ) ;
    public final void rule__ArbitraryPathSegment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2542:1: ( ( ruleQualifiedName ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2543:1: ( ruleQualifiedName )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2543:1: ( ruleQualifiedName )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2544:1: ruleQualifiedName
            {
             before(grammarAccess.getArbitraryPathSegmentAccess().getQualifiedNameParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ArbitraryPathSegment__Group_1__1__Impl5280);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2559:1: rule__ParamsBlock__Group__0 : rule__ParamsBlock__Group__0__Impl rule__ParamsBlock__Group__1 ;
    public final void rule__ParamsBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2563:1: ( rule__ParamsBlock__Group__0__Impl rule__ParamsBlock__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2564:2: rule__ParamsBlock__Group__0__Impl rule__ParamsBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__0__Impl_in_rule__ParamsBlock__Group__05313);
            rule__ParamsBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group__1_in_rule__ParamsBlock__Group__05316);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2571:1: rule__ParamsBlock__Group__0__Impl : ( () ) ;
    public final void rule__ParamsBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2575:1: ( ( () ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2576:1: ( () )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2576:1: ( () )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2577:1: ()
            {
             before(grammarAccess.getParamsBlockAccess().getParamsBlockAction_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2578:1: ()
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2580:1: 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2590:1: rule__ParamsBlock__Group__1 : rule__ParamsBlock__Group__1__Impl rule__ParamsBlock__Group__2 ;
    public final void rule__ParamsBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2594:1: ( rule__ParamsBlock__Group__1__Impl rule__ParamsBlock__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2595:2: rule__ParamsBlock__Group__1__Impl rule__ParamsBlock__Group__2
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__1__Impl_in_rule__ParamsBlock__Group__15374);
            rule__ParamsBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group__2_in_rule__ParamsBlock__Group__15377);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2602:1: rule__ParamsBlock__Group__1__Impl : ( 'params' ) ;
    public final void rule__ParamsBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2606:1: ( ( 'params' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2607:1: ( 'params' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2607:1: ( 'params' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2608:1: 'params'
            {
             before(grammarAccess.getParamsBlockAccess().getParamsKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__ParamsBlock__Group__1__Impl5405); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2621:1: rule__ParamsBlock__Group__2 : rule__ParamsBlock__Group__2__Impl rule__ParamsBlock__Group__3 ;
    public final void rule__ParamsBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2625:1: ( rule__ParamsBlock__Group__2__Impl rule__ParamsBlock__Group__3 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2626:2: rule__ParamsBlock__Group__2__Impl rule__ParamsBlock__Group__3
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__2__Impl_in_rule__ParamsBlock__Group__25436);
            rule__ParamsBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group__3_in_rule__ParamsBlock__Group__25439);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2633:1: rule__ParamsBlock__Group__2__Impl : ( ( rule__ParamsBlock__ParamsAssignment_2 ) ) ;
    public final void rule__ParamsBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2637:1: ( ( ( rule__ParamsBlock__ParamsAssignment_2 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2638:1: ( ( rule__ParamsBlock__ParamsAssignment_2 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2638:1: ( ( rule__ParamsBlock__ParamsAssignment_2 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2639:1: ( rule__ParamsBlock__ParamsAssignment_2 )
            {
             before(grammarAccess.getParamsBlockAccess().getParamsAssignment_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2640:1: ( rule__ParamsBlock__ParamsAssignment_2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2640:2: rule__ParamsBlock__ParamsAssignment_2
            {
            pushFollow(FOLLOW_rule__ParamsBlock__ParamsAssignment_2_in_rule__ParamsBlock__Group__2__Impl5466);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2650:1: rule__ParamsBlock__Group__3 : rule__ParamsBlock__Group__3__Impl ;
    public final void rule__ParamsBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2654:1: ( rule__ParamsBlock__Group__3__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2655:2: rule__ParamsBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group__3__Impl_in_rule__ParamsBlock__Group__35496);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2661:1: rule__ParamsBlock__Group__3__Impl : ( ( rule__ParamsBlock__Group_3__0 )* ) ;
    public final void rule__ParamsBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2665:1: ( ( ( rule__ParamsBlock__Group_3__0 )* ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2666:1: ( ( rule__ParamsBlock__Group_3__0 )* )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2666:1: ( ( rule__ParamsBlock__Group_3__0 )* )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2667:1: ( rule__ParamsBlock__Group_3__0 )*
            {
             before(grammarAccess.getParamsBlockAccess().getGroup_3()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2668:1: ( rule__ParamsBlock__Group_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==22) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2668:2: rule__ParamsBlock__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ParamsBlock__Group_3__0_in_rule__ParamsBlock__Group__3__Impl5523);
            	    rule__ParamsBlock__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2686:1: rule__ParamsBlock__Group_3__0 : rule__ParamsBlock__Group_3__0__Impl rule__ParamsBlock__Group_3__1 ;
    public final void rule__ParamsBlock__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2690:1: ( rule__ParamsBlock__Group_3__0__Impl rule__ParamsBlock__Group_3__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2691:2: rule__ParamsBlock__Group_3__0__Impl rule__ParamsBlock__Group_3__1
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group_3__0__Impl_in_rule__ParamsBlock__Group_3__05562);
            rule__ParamsBlock__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParamsBlock__Group_3__1_in_rule__ParamsBlock__Group_3__05565);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2698:1: rule__ParamsBlock__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ParamsBlock__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2702:1: ( ( ',' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2703:1: ( ',' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2703:1: ( ',' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2704:1: ','
            {
             before(grammarAccess.getParamsBlockAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__ParamsBlock__Group_3__0__Impl5593); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2717:1: rule__ParamsBlock__Group_3__1 : rule__ParamsBlock__Group_3__1__Impl ;
    public final void rule__ParamsBlock__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2721:1: ( rule__ParamsBlock__Group_3__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2722:2: rule__ParamsBlock__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ParamsBlock__Group_3__1__Impl_in_rule__ParamsBlock__Group_3__15624);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2728:1: rule__ParamsBlock__Group_3__1__Impl : ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) ) ;
    public final void rule__ParamsBlock__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2732:1: ( ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2733:1: ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2733:1: ( ( rule__ParamsBlock__ParamsAssignment_3_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2734:1: ( rule__ParamsBlock__ParamsAssignment_3_1 )
            {
             before(grammarAccess.getParamsBlockAccess().getParamsAssignment_3_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2735:1: ( rule__ParamsBlock__ParamsAssignment_3_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2735:2: rule__ParamsBlock__ParamsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ParamsBlock__ParamsAssignment_3_1_in_rule__ParamsBlock__Group_3__1__Impl5651);
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


    // $ANTLR start "rule__SimpleMemberAssignment__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2749:1: rule__SimpleMemberAssignment__Group__0 : rule__SimpleMemberAssignment__Group__0__Impl rule__SimpleMemberAssignment__Group__1 ;
    public final void rule__SimpleMemberAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2753:1: ( rule__SimpleMemberAssignment__Group__0__Impl rule__SimpleMemberAssignment__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2754:2: rule__SimpleMemberAssignment__Group__0__Impl rule__SimpleMemberAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group__0__Impl_in_rule__SimpleMemberAssignment__Group__05685);
            rule__SimpleMemberAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group__1_in_rule__SimpleMemberAssignment__Group__05688);
            rule__SimpleMemberAssignment__Group__1();

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
    // $ANTLR end "rule__SimpleMemberAssignment__Group__0"


    // $ANTLR start "rule__SimpleMemberAssignment__Group__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2761:1: rule__SimpleMemberAssignment__Group__0__Impl : ( ( rule__SimpleMemberAssignment__MemberAssignment_0 ) ) ;
    public final void rule__SimpleMemberAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2765:1: ( ( ( rule__SimpleMemberAssignment__MemberAssignment_0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2766:1: ( ( rule__SimpleMemberAssignment__MemberAssignment_0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2766:1: ( ( rule__SimpleMemberAssignment__MemberAssignment_0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2767:1: ( rule__SimpleMemberAssignment__MemberAssignment_0 )
            {
             before(grammarAccess.getSimpleMemberAssignmentAccess().getMemberAssignment_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2768:1: ( rule__SimpleMemberAssignment__MemberAssignment_0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2768:2: rule__SimpleMemberAssignment__MemberAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleMemberAssignment__MemberAssignment_0_in_rule__SimpleMemberAssignment__Group__0__Impl5715);
            rule__SimpleMemberAssignment__MemberAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleMemberAssignmentAccess().getMemberAssignment_0()); 

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
    // $ANTLR end "rule__SimpleMemberAssignment__Group__0__Impl"


    // $ANTLR start "rule__SimpleMemberAssignment__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2778:1: rule__SimpleMemberAssignment__Group__1 : rule__SimpleMemberAssignment__Group__1__Impl ;
    public final void rule__SimpleMemberAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2782:1: ( rule__SimpleMemberAssignment__Group__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2783:2: rule__SimpleMemberAssignment__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group__1__Impl_in_rule__SimpleMemberAssignment__Group__15745);
            rule__SimpleMemberAssignment__Group__1__Impl();

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
    // $ANTLR end "rule__SimpleMemberAssignment__Group__1"


    // $ANTLR start "rule__SimpleMemberAssignment__Group__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2789:1: rule__SimpleMemberAssignment__Group__1__Impl : ( ( rule__SimpleMemberAssignment__Group_1__0 )? ) ;
    public final void rule__SimpleMemberAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2793:1: ( ( ( rule__SimpleMemberAssignment__Group_1__0 )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2794:1: ( ( rule__SimpleMemberAssignment__Group_1__0 )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2794:1: ( ( rule__SimpleMemberAssignment__Group_1__0 )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2795:1: ( rule__SimpleMemberAssignment__Group_1__0 )?
            {
             before(grammarAccess.getSimpleMemberAssignmentAccess().getGroup_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2796:1: ( rule__SimpleMemberAssignment__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2796:2: rule__SimpleMemberAssignment__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group_1__0_in_rule__SimpleMemberAssignment__Group__1__Impl5772);
                    rule__SimpleMemberAssignment__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleMemberAssignmentAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SimpleMemberAssignment__Group__1__Impl"


    // $ANTLR start "rule__SimpleMemberAssignment__Group_1__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2810:1: rule__SimpleMemberAssignment__Group_1__0 : rule__SimpleMemberAssignment__Group_1__0__Impl rule__SimpleMemberAssignment__Group_1__1 ;
    public final void rule__SimpleMemberAssignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2814:1: ( rule__SimpleMemberAssignment__Group_1__0__Impl rule__SimpleMemberAssignment__Group_1__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2815:2: rule__SimpleMemberAssignment__Group_1__0__Impl rule__SimpleMemberAssignment__Group_1__1
            {
            pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group_1__0__Impl_in_rule__SimpleMemberAssignment__Group_1__05807);
            rule__SimpleMemberAssignment__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group_1__1_in_rule__SimpleMemberAssignment__Group_1__05810);
            rule__SimpleMemberAssignment__Group_1__1();

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
    // $ANTLR end "rule__SimpleMemberAssignment__Group_1__0"


    // $ANTLR start "rule__SimpleMemberAssignment__Group_1__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2822:1: rule__SimpleMemberAssignment__Group_1__0__Impl : ( '=' ) ;
    public final void rule__SimpleMemberAssignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2826:1: ( ( '=' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2827:1: ( '=' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2827:1: ( '=' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2828:1: '='
            {
             before(grammarAccess.getSimpleMemberAssignmentAccess().getEqualsSignKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__SimpleMemberAssignment__Group_1__0__Impl5838); 
             after(grammarAccess.getSimpleMemberAssignmentAccess().getEqualsSignKeyword_1_0()); 

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
    // $ANTLR end "rule__SimpleMemberAssignment__Group_1__0__Impl"


    // $ANTLR start "rule__SimpleMemberAssignment__Group_1__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2841:1: rule__SimpleMemberAssignment__Group_1__1 : rule__SimpleMemberAssignment__Group_1__1__Impl ;
    public final void rule__SimpleMemberAssignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2845:1: ( rule__SimpleMemberAssignment__Group_1__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2846:2: rule__SimpleMemberAssignment__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleMemberAssignment__Group_1__1__Impl_in_rule__SimpleMemberAssignment__Group_1__15869);
            rule__SimpleMemberAssignment__Group_1__1__Impl();

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
    // $ANTLR end "rule__SimpleMemberAssignment__Group_1__1"


    // $ANTLR start "rule__SimpleMemberAssignment__Group_1__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2852:1: rule__SimpleMemberAssignment__Group_1__1__Impl : ( ( rule__SimpleMemberAssignment__DefaultValueAssignment_1_1 ) ) ;
    public final void rule__SimpleMemberAssignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2856:1: ( ( ( rule__SimpleMemberAssignment__DefaultValueAssignment_1_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2857:1: ( ( rule__SimpleMemberAssignment__DefaultValueAssignment_1_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2857:1: ( ( rule__SimpleMemberAssignment__DefaultValueAssignment_1_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2858:1: ( rule__SimpleMemberAssignment__DefaultValueAssignment_1_1 )
            {
             before(grammarAccess.getSimpleMemberAssignmentAccess().getDefaultValueAssignment_1_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2859:1: ( rule__SimpleMemberAssignment__DefaultValueAssignment_1_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2859:2: rule__SimpleMemberAssignment__DefaultValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SimpleMemberAssignment__DefaultValueAssignment_1_1_in_rule__SimpleMemberAssignment__Group_1__1__Impl5896);
            rule__SimpleMemberAssignment__DefaultValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleMemberAssignmentAccess().getDefaultValueAssignment_1_1()); 

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
    // $ANTLR end "rule__SimpleMemberAssignment__Group_1__1__Impl"


    // $ANTLR start "rule__Literal__Group_0__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2873:1: rule__Literal__Group_0__0 : rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 ;
    public final void rule__Literal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2877:1: ( rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2878:2: rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__05930);
            rule__Literal__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__05933);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2885:1: rule__Literal__Group_0__0__Impl : ( () ) ;
    public final void rule__Literal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2889:1: ( ( () ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2890:1: ( () )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2890:1: ( () )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2891:1: ()
            {
             before(grammarAccess.getLiteralAccess().getBooleanLiteralAction_0_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2892:1: ()
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2894:1: 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2904:1: rule__Literal__Group_0__1 : rule__Literal__Group_0__1__Impl ;
    public final void rule__Literal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2908:1: ( rule__Literal__Group_0__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2909:2: rule__Literal__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__15991);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2915:1: rule__Literal__Group_0__1__Impl : ( ( rule__Literal__LiteralAssignment_0_1 ) ) ;
    public final void rule__Literal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2919:1: ( ( ( rule__Literal__LiteralAssignment_0_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2920:1: ( ( rule__Literal__LiteralAssignment_0_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2920:1: ( ( rule__Literal__LiteralAssignment_0_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2921:1: ( rule__Literal__LiteralAssignment_0_1 )
            {
             before(grammarAccess.getLiteralAccess().getLiteralAssignment_0_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2922:1: ( rule__Literal__LiteralAssignment_0_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2922:2: rule__Literal__LiteralAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Literal__LiteralAssignment_0_1_in_rule__Literal__Group_0__1__Impl6018);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2936:1: rule__Literal__Group_1__0 : rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 ;
    public final void rule__Literal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2940:1: ( rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2941:2: rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_1__0__Impl_in_rule__Literal__Group_1__06052);
            rule__Literal__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_1__1_in_rule__Literal__Group_1__06055);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2948:1: rule__Literal__Group_1__0__Impl : ( () ) ;
    public final void rule__Literal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2952:1: ( ( () ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2953:1: ( () )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2953:1: ( () )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2954:1: ()
            {
             before(grammarAccess.getLiteralAccess().getStringLiteralAction_1_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2955:1: ()
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2957:1: 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2967:1: rule__Literal__Group_1__1 : rule__Literal__Group_1__1__Impl ;
    public final void rule__Literal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2971:1: ( rule__Literal__Group_1__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2972:2: rule__Literal__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_1__1__Impl_in_rule__Literal__Group_1__16113);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2978:1: rule__Literal__Group_1__1__Impl : ( ( rule__Literal__LiteralAssignment_1_1 ) ) ;
    public final void rule__Literal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2982:1: ( ( ( rule__Literal__LiteralAssignment_1_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2983:1: ( ( rule__Literal__LiteralAssignment_1_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2983:1: ( ( rule__Literal__LiteralAssignment_1_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2984:1: ( rule__Literal__LiteralAssignment_1_1 )
            {
             before(grammarAccess.getLiteralAccess().getLiteralAssignment_1_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2985:1: ( rule__Literal__LiteralAssignment_1_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2985:2: rule__Literal__LiteralAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Literal__LiteralAssignment_1_1_in_rule__Literal__Group_1__1__Impl6140);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:2999:1: rule__Literal__Group_2__0 : rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 ;
    public final void rule__Literal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3003:1: ( rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3004:2: rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__06174);
            rule__Literal__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__06177);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3011:1: rule__Literal__Group_2__0__Impl : ( () ) ;
    public final void rule__Literal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3015:1: ( ( () ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3016:1: ( () )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3016:1: ( () )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3017:1: ()
            {
             before(grammarAccess.getLiteralAccess().getNumericLiteralAction_2_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3018:1: ()
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3020:1: 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3030:1: rule__Literal__Group_2__1 : rule__Literal__Group_2__1__Impl ;
    public final void rule__Literal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3034:1: ( rule__Literal__Group_2__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3035:2: rule__Literal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__16235);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3041:1: rule__Literal__Group_2__1__Impl : ( ( rule__Literal__LiteralAssignment_2_1 ) ) ;
    public final void rule__Literal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3045:1: ( ( ( rule__Literal__LiteralAssignment_2_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3046:1: ( ( rule__Literal__LiteralAssignment_2_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3046:1: ( ( rule__Literal__LiteralAssignment_2_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3047:1: ( rule__Literal__LiteralAssignment_2_1 )
            {
             before(grammarAccess.getLiteralAccess().getLiteralAssignment_2_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3048:1: ( rule__Literal__LiteralAssignment_2_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3048:2: rule__Literal__LiteralAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Literal__LiteralAssignment_2_1_in_rule__Literal__Group_2__1__Impl6262);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3062:1: rule__BodyBlock__Group__0 : rule__BodyBlock__Group__0__Impl rule__BodyBlock__Group__1 ;
    public final void rule__BodyBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3066:1: ( rule__BodyBlock__Group__0__Impl rule__BodyBlock__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3067:2: rule__BodyBlock__Group__0__Impl rule__BodyBlock__Group__1
            {
            pushFollow(FOLLOW_rule__BodyBlock__Group__0__Impl_in_rule__BodyBlock__Group__06296);
            rule__BodyBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BodyBlock__Group__1_in_rule__BodyBlock__Group__06299);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3074:1: rule__BodyBlock__Group__0__Impl : ( 'body' ) ;
    public final void rule__BodyBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3078:1: ( ( 'body' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3079:1: ( 'body' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3079:1: ( 'body' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3080:1: 'body'
            {
             before(grammarAccess.getBodyBlockAccess().getBodyKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__BodyBlock__Group__0__Impl6327); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3093:1: rule__BodyBlock__Group__1 : rule__BodyBlock__Group__1__Impl ;
    public final void rule__BodyBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3097:1: ( rule__BodyBlock__Group__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3098:2: rule__BodyBlock__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BodyBlock__Group__1__Impl_in_rule__BodyBlock__Group__16358);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3104:1: rule__BodyBlock__Group__1__Impl : ( ( rule__BodyBlock__TypeAssignment_1 ) ) ;
    public final void rule__BodyBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3108:1: ( ( ( rule__BodyBlock__TypeAssignment_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3109:1: ( ( rule__BodyBlock__TypeAssignment_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3109:1: ( ( rule__BodyBlock__TypeAssignment_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3110:1: ( rule__BodyBlock__TypeAssignment_1 )
            {
             before(grammarAccess.getBodyBlockAccess().getTypeAssignment_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3111:1: ( rule__BodyBlock__TypeAssignment_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3111:2: rule__BodyBlock__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__BodyBlock__TypeAssignment_1_in_rule__BodyBlock__Group__1__Impl6385);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3125:1: rule__ResponseBlock__Group__0 : rule__ResponseBlock__Group__0__Impl rule__ResponseBlock__Group__1 ;
    public final void rule__ResponseBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3129:1: ( rule__ResponseBlock__Group__0__Impl rule__ResponseBlock__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3130:2: rule__ResponseBlock__Group__0__Impl rule__ResponseBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__0__Impl_in_rule__ResponseBlock__Group__06419);
            rule__ResponseBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__1_in_rule__ResponseBlock__Group__06422);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3137:1: rule__ResponseBlock__Group__0__Impl : ( () ) ;
    public final void rule__ResponseBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3141:1: ( ( () ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3142:1: ( () )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3142:1: ( () )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3143:1: ()
            {
             before(grammarAccess.getResponseBlockAccess().getResponseBlockAction_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3144:1: ()
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3146:1: 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3156:1: rule__ResponseBlock__Group__1 : rule__ResponseBlock__Group__1__Impl rule__ResponseBlock__Group__2 ;
    public final void rule__ResponseBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3160:1: ( rule__ResponseBlock__Group__1__Impl rule__ResponseBlock__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3161:2: rule__ResponseBlock__Group__1__Impl rule__ResponseBlock__Group__2
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__1__Impl_in_rule__ResponseBlock__Group__16480);
            rule__ResponseBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__2_in_rule__ResponseBlock__Group__16483);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3168:1: rule__ResponseBlock__Group__1__Impl : ( 'response' ) ;
    public final void rule__ResponseBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3172:1: ( ( 'response' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3173:1: ( 'response' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3173:1: ( 'response' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3174:1: 'response'
            {
             before(grammarAccess.getResponseBlockAccess().getResponseKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__ResponseBlock__Group__1__Impl6511); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3187:1: rule__ResponseBlock__Group__2 : rule__ResponseBlock__Group__2__Impl rule__ResponseBlock__Group__3 ;
    public final void rule__ResponseBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3191:1: ( rule__ResponseBlock__Group__2__Impl rule__ResponseBlock__Group__3 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3192:2: rule__ResponseBlock__Group__2__Impl rule__ResponseBlock__Group__3
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__2__Impl_in_rule__ResponseBlock__Group__26542);
            rule__ResponseBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group__3_in_rule__ResponseBlock__Group__26545);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3199:1: rule__ResponseBlock__Group__2__Impl : ( ( rule__ResponseBlock__Group_2__0 )? ) ;
    public final void rule__ResponseBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3203:1: ( ( ( rule__ResponseBlock__Group_2__0 )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3204:1: ( ( rule__ResponseBlock__Group_2__0 )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3204:1: ( ( rule__ResponseBlock__Group_2__0 )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3205:1: ( rule__ResponseBlock__Group_2__0 )?
            {
             before(grammarAccess.getResponseBlockAccess().getGroup_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3206:1: ( rule__ResponseBlock__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3206:2: rule__ResponseBlock__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ResponseBlock__Group_2__0_in_rule__ResponseBlock__Group__2__Impl6572);
                    rule__ResponseBlock__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResponseBlockAccess().getGroup_2()); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3216:1: rule__ResponseBlock__Group__3 : rule__ResponseBlock__Group__3__Impl ;
    public final void rule__ResponseBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3220:1: ( rule__ResponseBlock__Group__3__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3221:2: rule__ResponseBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group__3__Impl_in_rule__ResponseBlock__Group__36603);
            rule__ResponseBlock__Group__3__Impl();

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3227:1: rule__ResponseBlock__Group__3__Impl : ( ( rule__ResponseBlock__TypeAssignment_3 )? ) ;
    public final void rule__ResponseBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3231:1: ( ( ( rule__ResponseBlock__TypeAssignment_3 )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3232:1: ( ( rule__ResponseBlock__TypeAssignment_3 )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3232:1: ( ( rule__ResponseBlock__TypeAssignment_3 )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3233:1: ( rule__ResponseBlock__TypeAssignment_3 )?
            {
             before(grammarAccess.getResponseBlockAccess().getTypeAssignment_3()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3234:1: ( rule__ResponseBlock__TypeAssignment_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID||LA28_0==19||(LA28_0>=36 && LA28_0<=40)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3234:2: rule__ResponseBlock__TypeAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ResponseBlock__TypeAssignment_3_in_rule__ResponseBlock__Group__3__Impl6630);
                    rule__ResponseBlock__TypeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResponseBlockAccess().getTypeAssignment_3()); 

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


    // $ANTLR start "rule__ResponseBlock__Group_2__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3252:1: rule__ResponseBlock__Group_2__0 : rule__ResponseBlock__Group_2__0__Impl rule__ResponseBlock__Group_2__1 ;
    public final void rule__ResponseBlock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3256:1: ( rule__ResponseBlock__Group_2__0__Impl rule__ResponseBlock__Group_2__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3257:2: rule__ResponseBlock__Group_2__0__Impl rule__ResponseBlock__Group_2__1
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group_2__0__Impl_in_rule__ResponseBlock__Group_2__06669);
            rule__ResponseBlock__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResponseBlock__Group_2__1_in_rule__ResponseBlock__Group_2__06672);
            rule__ResponseBlock__Group_2__1();

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
    // $ANTLR end "rule__ResponseBlock__Group_2__0"


    // $ANTLR start "rule__ResponseBlock__Group_2__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3264:1: rule__ResponseBlock__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__ResponseBlock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3268:1: ( ( 'extends' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3269:1: ( 'extends' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3269:1: ( 'extends' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3270:1: 'extends'
            {
             before(grammarAccess.getResponseBlockAccess().getExtendsKeyword_2_0()); 
            match(input,30,FOLLOW_30_in_rule__ResponseBlock__Group_2__0__Impl6700); 
             after(grammarAccess.getResponseBlockAccess().getExtendsKeyword_2_0()); 

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
    // $ANTLR end "rule__ResponseBlock__Group_2__0__Impl"


    // $ANTLR start "rule__ResponseBlock__Group_2__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3283:1: rule__ResponseBlock__Group_2__1 : rule__ResponseBlock__Group_2__1__Impl ;
    public final void rule__ResponseBlock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3287:1: ( rule__ResponseBlock__Group_2__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3288:2: rule__ResponseBlock__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ResponseBlock__Group_2__1__Impl_in_rule__ResponseBlock__Group_2__16731);
            rule__ResponseBlock__Group_2__1__Impl();

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
    // $ANTLR end "rule__ResponseBlock__Group_2__1"


    // $ANTLR start "rule__ResponseBlock__Group_2__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3294:1: rule__ResponseBlock__Group_2__1__Impl : ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__ResponseBlock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3298:1: ( ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3299:1: ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3299:1: ( ( rule__ResponseBlock__SuperTypeAssignment_2_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3300:1: ( rule__ResponseBlock__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getResponseBlockAccess().getSuperTypeAssignment_2_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3301:1: ( rule__ResponseBlock__SuperTypeAssignment_2_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3301:2: rule__ResponseBlock__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ResponseBlock__SuperTypeAssignment_2_1_in_rule__ResponseBlock__Group_2__1__Impl6758);
            rule__ResponseBlock__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getResponseBlockAccess().getSuperTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__ResponseBlock__Group_2__1__Impl"


    // $ANTLR start "rule__Member__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3315:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3319:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3320:2: rule__Member__Group__0__Impl rule__Member__Group__1
            {
            pushFollow(FOLLOW_rule__Member__Group__0__Impl_in_rule__Member__Group__06792);
            rule__Member__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Member__Group__1_in_rule__Member__Group__06795);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3327:1: rule__Member__Group__0__Impl : ( ( rule__Member__NameAssignment_0 ) ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3331:1: ( ( ( rule__Member__NameAssignment_0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3332:1: ( ( rule__Member__NameAssignment_0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3332:1: ( ( rule__Member__NameAssignment_0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3333:1: ( rule__Member__NameAssignment_0 )
            {
             before(grammarAccess.getMemberAccess().getNameAssignment_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3334:1: ( rule__Member__NameAssignment_0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3334:2: rule__Member__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Member__NameAssignment_0_in_rule__Member__Group__0__Impl6822);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3344:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3348:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3349:2: rule__Member__Group__1__Impl rule__Member__Group__2
            {
            pushFollow(FOLLOW_rule__Member__Group__1__Impl_in_rule__Member__Group__16852);
            rule__Member__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Member__Group__2_in_rule__Member__Group__16855);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3356:1: rule__Member__Group__1__Impl : ( ':' ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3360:1: ( ( ':' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3361:1: ( ':' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3361:1: ( ':' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3362:1: ':'
            {
             before(grammarAccess.getMemberAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Member__Group__1__Impl6883); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3375:1: rule__Member__Group__2 : rule__Member__Group__2__Impl ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3379:1: ( rule__Member__Group__2__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3380:2: rule__Member__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Member__Group__2__Impl_in_rule__Member__Group__26914);
            rule__Member__Group__2__Impl();

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3386:1: rule__Member__Group__2__Impl : ( ( rule__Member__TypeAssignment_2 ) ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3390:1: ( ( ( rule__Member__TypeAssignment_2 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3391:1: ( ( rule__Member__TypeAssignment_2 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3391:1: ( ( rule__Member__TypeAssignment_2 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3392:1: ( rule__Member__TypeAssignment_2 )
            {
             before(grammarAccess.getMemberAccess().getTypeAssignment_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3393:1: ( rule__Member__TypeAssignment_2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3393:2: rule__Member__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Member__TypeAssignment_2_in_rule__Member__Group__2__Impl6941);
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


    // $ANTLR start "rule__SimpleMember__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3409:1: rule__SimpleMember__Group__0 : rule__SimpleMember__Group__0__Impl rule__SimpleMember__Group__1 ;
    public final void rule__SimpleMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3413:1: ( rule__SimpleMember__Group__0__Impl rule__SimpleMember__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3414:2: rule__SimpleMember__Group__0__Impl rule__SimpleMember__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleMember__Group__0__Impl_in_rule__SimpleMember__Group__06977);
            rule__SimpleMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleMember__Group__1_in_rule__SimpleMember__Group__06980);
            rule__SimpleMember__Group__1();

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
    // $ANTLR end "rule__SimpleMember__Group__0"


    // $ANTLR start "rule__SimpleMember__Group__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3421:1: rule__SimpleMember__Group__0__Impl : ( ( rule__SimpleMember__NameAssignment_0 ) ) ;
    public final void rule__SimpleMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3425:1: ( ( ( rule__SimpleMember__NameAssignment_0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3426:1: ( ( rule__SimpleMember__NameAssignment_0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3426:1: ( ( rule__SimpleMember__NameAssignment_0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3427:1: ( rule__SimpleMember__NameAssignment_0 )
            {
             before(grammarAccess.getSimpleMemberAccess().getNameAssignment_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3428:1: ( rule__SimpleMember__NameAssignment_0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3428:2: rule__SimpleMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleMember__NameAssignment_0_in_rule__SimpleMember__Group__0__Impl7007);
            rule__SimpleMember__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleMemberAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__SimpleMember__Group__0__Impl"


    // $ANTLR start "rule__SimpleMember__Group__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3438:1: rule__SimpleMember__Group__1 : rule__SimpleMember__Group__1__Impl rule__SimpleMember__Group__2 ;
    public final void rule__SimpleMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3442:1: ( rule__SimpleMember__Group__1__Impl rule__SimpleMember__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3443:2: rule__SimpleMember__Group__1__Impl rule__SimpleMember__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleMember__Group__1__Impl_in_rule__SimpleMember__Group__17037);
            rule__SimpleMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleMember__Group__2_in_rule__SimpleMember__Group__17040);
            rule__SimpleMember__Group__2();

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
    // $ANTLR end "rule__SimpleMember__Group__1"


    // $ANTLR start "rule__SimpleMember__Group__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3450:1: rule__SimpleMember__Group__1__Impl : ( ':' ) ;
    public final void rule__SimpleMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3454:1: ( ( ':' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3455:1: ( ':' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3455:1: ( ':' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3456:1: ':'
            {
             before(grammarAccess.getSimpleMemberAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__SimpleMember__Group__1__Impl7068); 
             after(grammarAccess.getSimpleMemberAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__SimpleMember__Group__1__Impl"


    // $ANTLR start "rule__SimpleMember__Group__2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3469:1: rule__SimpleMember__Group__2 : rule__SimpleMember__Group__2__Impl ;
    public final void rule__SimpleMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3473:1: ( rule__SimpleMember__Group__2__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3474:2: rule__SimpleMember__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SimpleMember__Group__2__Impl_in_rule__SimpleMember__Group__27099);
            rule__SimpleMember__Group__2__Impl();

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
    // $ANTLR end "rule__SimpleMember__Group__2"


    // $ANTLR start "rule__SimpleMember__Group__2__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3480:1: rule__SimpleMember__Group__2__Impl : ( ( rule__SimpleMember__TypeAssignment_2 ) ) ;
    public final void rule__SimpleMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3484:1: ( ( ( rule__SimpleMember__TypeAssignment_2 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3485:1: ( ( rule__SimpleMember__TypeAssignment_2 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3485:1: ( ( rule__SimpleMember__TypeAssignment_2 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3486:1: ( rule__SimpleMember__TypeAssignment_2 )
            {
             before(grammarAccess.getSimpleMemberAccess().getTypeAssignment_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3487:1: ( rule__SimpleMember__TypeAssignment_2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3487:2: rule__SimpleMember__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__SimpleMember__TypeAssignment_2_in_rule__SimpleMember__Group__2__Impl7126);
            rule__SimpleMember__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleMemberAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__SimpleMember__Group__2__Impl"


    // $ANTLR start "rule__ArrayType__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3503:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3507:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3508:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__07162);
            rule__ArrayType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__07165);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3515:1: rule__ArrayType__Group__0__Impl : ( ( rule__ArrayType__ElementTypeAssignment_0 ) ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3519:1: ( ( ( rule__ArrayType__ElementTypeAssignment_0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3520:1: ( ( rule__ArrayType__ElementTypeAssignment_0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3520:1: ( ( rule__ArrayType__ElementTypeAssignment_0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3521:1: ( rule__ArrayType__ElementTypeAssignment_0 )
            {
             before(grammarAccess.getArrayTypeAccess().getElementTypeAssignment_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3522:1: ( rule__ArrayType__ElementTypeAssignment_0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3522:2: rule__ArrayType__ElementTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__ArrayType__ElementTypeAssignment_0_in_rule__ArrayType__Group__0__Impl7192);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3532:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3536:1: ( rule__ArrayType__Group__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3537:2: rule__ArrayType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__17222);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3543:1: rule__ArrayType__Group__1__Impl : ( ( rule__ArrayType__IdAssignment_1 ) ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3547:1: ( ( ( rule__ArrayType__IdAssignment_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3548:1: ( ( rule__ArrayType__IdAssignment_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3548:1: ( ( rule__ArrayType__IdAssignment_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3549:1: ( rule__ArrayType__IdAssignment_1 )
            {
             before(grammarAccess.getArrayTypeAccess().getIdAssignment_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3550:1: ( rule__ArrayType__IdAssignment_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3550:2: rule__ArrayType__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__ArrayType__IdAssignment_1_in_rule__ArrayType__Group__1__Impl7249);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3564:1: rule__ComplexTypeDeclaration__Group__0 : rule__ComplexTypeDeclaration__Group__0__Impl rule__ComplexTypeDeclaration__Group__1 ;
    public final void rule__ComplexTypeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3568:1: ( rule__ComplexTypeDeclaration__Group__0__Impl rule__ComplexTypeDeclaration__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3569:2: rule__ComplexTypeDeclaration__Group__0__Impl rule__ComplexTypeDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__0__Impl_in_rule__ComplexTypeDeclaration__Group__07283);
            rule__ComplexTypeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__1_in_rule__ComplexTypeDeclaration__Group__07286);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3576:1: rule__ComplexTypeDeclaration__Group__0__Impl : ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) ) ;
    public final void rule__ComplexTypeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3580:1: ( ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3581:1: ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3581:1: ( ( rule__ComplexTypeDeclaration__KeywordAssignment_0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3582:1: ( rule__ComplexTypeDeclaration__KeywordAssignment_0 )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getKeywordAssignment_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3583:1: ( rule__ComplexTypeDeclaration__KeywordAssignment_0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3583:2: rule__ComplexTypeDeclaration__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__KeywordAssignment_0_in_rule__ComplexTypeDeclaration__Group__0__Impl7313);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3593:1: rule__ComplexTypeDeclaration__Group__1 : rule__ComplexTypeDeclaration__Group__1__Impl rule__ComplexTypeDeclaration__Group__2 ;
    public final void rule__ComplexTypeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3597:1: ( rule__ComplexTypeDeclaration__Group__1__Impl rule__ComplexTypeDeclaration__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3598:2: rule__ComplexTypeDeclaration__Group__1__Impl rule__ComplexTypeDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__1__Impl_in_rule__ComplexTypeDeclaration__Group__17343);
            rule__ComplexTypeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__2_in_rule__ComplexTypeDeclaration__Group__17346);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3605:1: rule__ComplexTypeDeclaration__Group__1__Impl : ( ( rule__ComplexTypeDeclaration__NogenAssignment_1 )? ) ;
    public final void rule__ComplexTypeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3609:1: ( ( ( rule__ComplexTypeDeclaration__NogenAssignment_1 )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3610:1: ( ( rule__ComplexTypeDeclaration__NogenAssignment_1 )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3610:1: ( ( rule__ComplexTypeDeclaration__NogenAssignment_1 )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3611:1: ( rule__ComplexTypeDeclaration__NogenAssignment_1 )?
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getNogenAssignment_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3612:1: ( rule__ComplexTypeDeclaration__NogenAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3612:2: rule__ComplexTypeDeclaration__NogenAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ComplexTypeDeclaration__NogenAssignment_1_in_rule__ComplexTypeDeclaration__Group__1__Impl7373);
                    rule__ComplexTypeDeclaration__NogenAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexTypeDeclarationAccess().getNogenAssignment_1()); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3622:1: rule__ComplexTypeDeclaration__Group__2 : rule__ComplexTypeDeclaration__Group__2__Impl rule__ComplexTypeDeclaration__Group__3 ;
    public final void rule__ComplexTypeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3626:1: ( rule__ComplexTypeDeclaration__Group__2__Impl rule__ComplexTypeDeclaration__Group__3 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3627:2: rule__ComplexTypeDeclaration__Group__2__Impl rule__ComplexTypeDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__2__Impl_in_rule__ComplexTypeDeclaration__Group__27404);
            rule__ComplexTypeDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__3_in_rule__ComplexTypeDeclaration__Group__27407);
            rule__ComplexTypeDeclaration__Group__3();

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3634:1: rule__ComplexTypeDeclaration__Group__2__Impl : ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) ) ;
    public final void rule__ComplexTypeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3638:1: ( ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3639:1: ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3639:1: ( ( rule__ComplexTypeDeclaration__NameAssignment_2 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3640:1: ( rule__ComplexTypeDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getNameAssignment_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3641:1: ( rule__ComplexTypeDeclaration__NameAssignment_2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3641:2: rule__ComplexTypeDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__NameAssignment_2_in_rule__ComplexTypeDeclaration__Group__2__Impl7434);
            rule__ComplexTypeDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeDeclarationAccess().getNameAssignment_2()); 

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


    // $ANTLR start "rule__ComplexTypeDeclaration__Group__3"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3651:1: rule__ComplexTypeDeclaration__Group__3 : rule__ComplexTypeDeclaration__Group__3__Impl ;
    public final void rule__ComplexTypeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3655:1: ( rule__ComplexTypeDeclaration__Group__3__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3656:2: rule__ComplexTypeDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ComplexTypeDeclaration__Group__3__Impl_in_rule__ComplexTypeDeclaration__Group__37464);
            rule__ComplexTypeDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__ComplexTypeDeclaration__Group__3"


    // $ANTLR start "rule__ComplexTypeDeclaration__Group__3__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3662:1: rule__ComplexTypeDeclaration__Group__3__Impl : ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? ) ;
    public final void rule__ComplexTypeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3666:1: ( ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3667:1: ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3667:1: ( ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3668:1: ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )?
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getLiteralAssignment_3()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3669:1: ( rule__ComplexTypeDeclaration__LiteralAssignment_3 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==19) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3669:2: rule__ComplexTypeDeclaration__LiteralAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ComplexTypeDeclaration__LiteralAssignment_3_in_rule__ComplexTypeDeclaration__Group__3__Impl7491);
                    rule__ComplexTypeDeclaration__LiteralAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexTypeDeclarationAccess().getLiteralAssignment_3()); 

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
    // $ANTLR end "rule__ComplexTypeDeclaration__Group__3__Impl"


    // $ANTLR start "rule__EnumTypeDeclaration__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3687:1: rule__EnumTypeDeclaration__Group__0 : rule__EnumTypeDeclaration__Group__0__Impl rule__EnumTypeDeclaration__Group__1 ;
    public final void rule__EnumTypeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3691:1: ( rule__EnumTypeDeclaration__Group__0__Impl rule__EnumTypeDeclaration__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3692:2: rule__EnumTypeDeclaration__Group__0__Impl rule__EnumTypeDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__0__Impl_in_rule__EnumTypeDeclaration__Group__07530);
            rule__EnumTypeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__1_in_rule__EnumTypeDeclaration__Group__07533);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3699:1: rule__EnumTypeDeclaration__Group__0__Impl : ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) ) ;
    public final void rule__EnumTypeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3703:1: ( ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3704:1: ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3704:1: ( ( rule__EnumTypeDeclaration__KeywordAssignment_0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3705:1: ( rule__EnumTypeDeclaration__KeywordAssignment_0 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getKeywordAssignment_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3706:1: ( rule__EnumTypeDeclaration__KeywordAssignment_0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3706:2: rule__EnumTypeDeclaration__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__KeywordAssignment_0_in_rule__EnumTypeDeclaration__Group__0__Impl7560);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3716:1: rule__EnumTypeDeclaration__Group__1 : rule__EnumTypeDeclaration__Group__1__Impl rule__EnumTypeDeclaration__Group__2 ;
    public final void rule__EnumTypeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3720:1: ( rule__EnumTypeDeclaration__Group__1__Impl rule__EnumTypeDeclaration__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3721:2: rule__EnumTypeDeclaration__Group__1__Impl rule__EnumTypeDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__1__Impl_in_rule__EnumTypeDeclaration__Group__17590);
            rule__EnumTypeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__2_in_rule__EnumTypeDeclaration__Group__17593);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3728:1: rule__EnumTypeDeclaration__Group__1__Impl : ( ( rule__EnumTypeDeclaration__NogenAssignment_1 )? ) ;
    public final void rule__EnumTypeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3732:1: ( ( ( rule__EnumTypeDeclaration__NogenAssignment_1 )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3733:1: ( ( rule__EnumTypeDeclaration__NogenAssignment_1 )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3733:1: ( ( rule__EnumTypeDeclaration__NogenAssignment_1 )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3734:1: ( rule__EnumTypeDeclaration__NogenAssignment_1 )?
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getNogenAssignment_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3735:1: ( rule__EnumTypeDeclaration__NogenAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3735:2: rule__EnumTypeDeclaration__NogenAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EnumTypeDeclaration__NogenAssignment_1_in_rule__EnumTypeDeclaration__Group__1__Impl7620);
                    rule__EnumTypeDeclaration__NogenAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumTypeDeclarationAccess().getNogenAssignment_1()); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3745:1: rule__EnumTypeDeclaration__Group__2 : rule__EnumTypeDeclaration__Group__2__Impl rule__EnumTypeDeclaration__Group__3 ;
    public final void rule__EnumTypeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3749:1: ( rule__EnumTypeDeclaration__Group__2__Impl rule__EnumTypeDeclaration__Group__3 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3750:2: rule__EnumTypeDeclaration__Group__2__Impl rule__EnumTypeDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__2__Impl_in_rule__EnumTypeDeclaration__Group__27651);
            rule__EnumTypeDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__3_in_rule__EnumTypeDeclaration__Group__27654);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3757:1: rule__EnumTypeDeclaration__Group__2__Impl : ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) ) ;
    public final void rule__EnumTypeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3761:1: ( ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3762:1: ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3762:1: ( ( rule__EnumTypeDeclaration__NameAssignment_2 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3763:1: ( rule__EnumTypeDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getNameAssignment_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3764:1: ( rule__EnumTypeDeclaration__NameAssignment_2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3764:2: rule__EnumTypeDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__NameAssignment_2_in_rule__EnumTypeDeclaration__Group__2__Impl7681);
            rule__EnumTypeDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeDeclarationAccess().getNameAssignment_2()); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3774:1: rule__EnumTypeDeclaration__Group__3 : rule__EnumTypeDeclaration__Group__3__Impl rule__EnumTypeDeclaration__Group__4 ;
    public final void rule__EnumTypeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3778:1: ( rule__EnumTypeDeclaration__Group__3__Impl rule__EnumTypeDeclaration__Group__4 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3779:2: rule__EnumTypeDeclaration__Group__3__Impl rule__EnumTypeDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__3__Impl_in_rule__EnumTypeDeclaration__Group__37711);
            rule__EnumTypeDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__4_in_rule__EnumTypeDeclaration__Group__37714);
            rule__EnumTypeDeclaration__Group__4();

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3786:1: rule__EnumTypeDeclaration__Group__3__Impl : ( ( rule__EnumTypeDeclaration__Group_3__0 )? ) ;
    public final void rule__EnumTypeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3790:1: ( ( ( rule__EnumTypeDeclaration__Group_3__0 )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3791:1: ( ( rule__EnumTypeDeclaration__Group_3__0 )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3791:1: ( ( rule__EnumTypeDeclaration__Group_3__0 )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3792:1: ( rule__EnumTypeDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getGroup_3()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3793:1: ( rule__EnumTypeDeclaration__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3793:2: rule__EnumTypeDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__0_in_rule__EnumTypeDeclaration__Group__3__Impl7741);
                    rule__EnumTypeDeclaration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumTypeDeclarationAccess().getGroup_3()); 

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


    // $ANTLR start "rule__EnumTypeDeclaration__Group__4"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3803:1: rule__EnumTypeDeclaration__Group__4 : rule__EnumTypeDeclaration__Group__4__Impl ;
    public final void rule__EnumTypeDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3807:1: ( rule__EnumTypeDeclaration__Group__4__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3808:2: rule__EnumTypeDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group__4__Impl_in_rule__EnumTypeDeclaration__Group__47772);
            rule__EnumTypeDeclaration__Group__4__Impl();

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
    // $ANTLR end "rule__EnumTypeDeclaration__Group__4"


    // $ANTLR start "rule__EnumTypeDeclaration__Group__4__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3814:1: rule__EnumTypeDeclaration__Group__4__Impl : ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? ) ;
    public final void rule__EnumTypeDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3818:1: ( ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3819:1: ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3819:1: ( ( rule__EnumTypeDeclaration__LiteralAssignment_4 )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3820:1: ( rule__EnumTypeDeclaration__LiteralAssignment_4 )?
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getLiteralAssignment_4()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3821:1: ( rule__EnumTypeDeclaration__LiteralAssignment_4 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==19) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3821:2: rule__EnumTypeDeclaration__LiteralAssignment_4
                    {
                    pushFollow(FOLLOW_rule__EnumTypeDeclaration__LiteralAssignment_4_in_rule__EnumTypeDeclaration__Group__4__Impl7799);
                    rule__EnumTypeDeclaration__LiteralAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumTypeDeclarationAccess().getLiteralAssignment_4()); 

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
    // $ANTLR end "rule__EnumTypeDeclaration__Group__4__Impl"


    // $ANTLR start "rule__EnumTypeDeclaration__Group_3__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3841:1: rule__EnumTypeDeclaration__Group_3__0 : rule__EnumTypeDeclaration__Group_3__0__Impl rule__EnumTypeDeclaration__Group_3__1 ;
    public final void rule__EnumTypeDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3845:1: ( rule__EnumTypeDeclaration__Group_3__0__Impl rule__EnumTypeDeclaration__Group_3__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3846:2: rule__EnumTypeDeclaration__Group_3__0__Impl rule__EnumTypeDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__0__Impl_in_rule__EnumTypeDeclaration__Group_3__07840);
            rule__EnumTypeDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__1_in_rule__EnumTypeDeclaration__Group_3__07843);
            rule__EnumTypeDeclaration__Group_3__1();

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
    // $ANTLR end "rule__EnumTypeDeclaration__Group_3__0"


    // $ANTLR start "rule__EnumTypeDeclaration__Group_3__0__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3853:1: rule__EnumTypeDeclaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__EnumTypeDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3857:1: ( ( 'extends' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3858:1: ( 'extends' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3858:1: ( 'extends' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3859:1: 'extends'
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getExtendsKeyword_3_0()); 
            match(input,30,FOLLOW_30_in_rule__EnumTypeDeclaration__Group_3__0__Impl7871); 
             after(grammarAccess.getEnumTypeDeclarationAccess().getExtendsKeyword_3_0()); 

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
    // $ANTLR end "rule__EnumTypeDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__EnumTypeDeclaration__Group_3__1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3872:1: rule__EnumTypeDeclaration__Group_3__1 : rule__EnumTypeDeclaration__Group_3__1__Impl ;
    public final void rule__EnumTypeDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3876:1: ( rule__EnumTypeDeclaration__Group_3__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3877:2: rule__EnumTypeDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__Group_3__1__Impl_in_rule__EnumTypeDeclaration__Group_3__17902);
            rule__EnumTypeDeclaration__Group_3__1__Impl();

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
    // $ANTLR end "rule__EnumTypeDeclaration__Group_3__1"


    // $ANTLR start "rule__EnumTypeDeclaration__Group_3__1__Impl"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3883:1: rule__EnumTypeDeclaration__Group_3__1__Impl : ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__EnumTypeDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3887:1: ( ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3888:1: ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3888:1: ( ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3889:1: ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeAssignment_3_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3890:1: ( rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3890:2: rule__EnumTypeDeclaration__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EnumTypeDeclaration__SuperTypeAssignment_3_1_in_rule__EnumTypeDeclaration__Group_3__1__Impl7929);
            rule__EnumTypeDeclaration__SuperTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__EnumTypeDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__EnumTypeLiteral__Group__0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3904:1: rule__EnumTypeLiteral__Group__0 : rule__EnumTypeLiteral__Group__0__Impl rule__EnumTypeLiteral__Group__1 ;
    public final void rule__EnumTypeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3908:1: ( rule__EnumTypeLiteral__Group__0__Impl rule__EnumTypeLiteral__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3909:2: rule__EnumTypeLiteral__Group__0__Impl rule__EnumTypeLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__0__Impl_in_rule__EnumTypeLiteral__Group__07963);
            rule__EnumTypeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__1_in_rule__EnumTypeLiteral__Group__07966);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3916:1: rule__EnumTypeLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__EnumTypeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3920:1: ( ( '{' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3921:1: ( '{' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3921:1: ( '{' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3922:1: '{'
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__EnumTypeLiteral__Group__0__Impl7994); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3935:1: rule__EnumTypeLiteral__Group__1 : rule__EnumTypeLiteral__Group__1__Impl rule__EnumTypeLiteral__Group__2 ;
    public final void rule__EnumTypeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3939:1: ( rule__EnumTypeLiteral__Group__1__Impl rule__EnumTypeLiteral__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3940:2: rule__EnumTypeLiteral__Group__1__Impl rule__EnumTypeLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__1__Impl_in_rule__EnumTypeLiteral__Group__18025);
            rule__EnumTypeLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__2_in_rule__EnumTypeLiteral__Group__18028);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3947:1: rule__EnumTypeLiteral__Group__1__Impl : ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) ) ;
    public final void rule__EnumTypeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3951:1: ( ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3952:1: ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3952:1: ( ( rule__EnumTypeLiteral__MembersAssignment_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3953:1: ( rule__EnumTypeLiteral__MembersAssignment_1 )
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersAssignment_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3954:1: ( rule__EnumTypeLiteral__MembersAssignment_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3954:2: rule__EnumTypeLiteral__MembersAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__MembersAssignment_1_in_rule__EnumTypeLiteral__Group__1__Impl8055);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3964:1: rule__EnumTypeLiteral__Group__2 : rule__EnumTypeLiteral__Group__2__Impl rule__EnumTypeLiteral__Group__3 ;
    public final void rule__EnumTypeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3968:1: ( rule__EnumTypeLiteral__Group__2__Impl rule__EnumTypeLiteral__Group__3 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3969:2: rule__EnumTypeLiteral__Group__2__Impl rule__EnumTypeLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__2__Impl_in_rule__EnumTypeLiteral__Group__28085);
            rule__EnumTypeLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__3_in_rule__EnumTypeLiteral__Group__28088);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3976:1: rule__EnumTypeLiteral__Group__2__Impl : ( ( rule__EnumTypeLiteral__Group_2__0 )* ) ;
    public final void rule__EnumTypeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3980:1: ( ( ( rule__EnumTypeLiteral__Group_2__0 )* ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3981:1: ( ( rule__EnumTypeLiteral__Group_2__0 )* )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3981:1: ( ( rule__EnumTypeLiteral__Group_2__0 )* )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3982:1: ( rule__EnumTypeLiteral__Group_2__0 )*
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getGroup_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3983:1: ( rule__EnumTypeLiteral__Group_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==22) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3983:2: rule__EnumTypeLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__0_in_rule__EnumTypeLiteral__Group__2__Impl8115);
            	    rule__EnumTypeLiteral__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3993:1: rule__EnumTypeLiteral__Group__3 : rule__EnumTypeLiteral__Group__3__Impl ;
    public final void rule__EnumTypeLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3997:1: ( rule__EnumTypeLiteral__Group__3__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:3998:2: rule__EnumTypeLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group__3__Impl_in_rule__EnumTypeLiteral__Group__38146);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4004:1: rule__EnumTypeLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__EnumTypeLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4008:1: ( ( '}' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4009:1: ( '}' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4009:1: ( '}' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4010:1: '}'
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getRightCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__EnumTypeLiteral__Group__3__Impl8174); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4031:1: rule__EnumTypeLiteral__Group_2__0 : rule__EnumTypeLiteral__Group_2__0__Impl rule__EnumTypeLiteral__Group_2__1 ;
    public final void rule__EnumTypeLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4035:1: ( rule__EnumTypeLiteral__Group_2__0__Impl rule__EnumTypeLiteral__Group_2__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4036:2: rule__EnumTypeLiteral__Group_2__0__Impl rule__EnumTypeLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__0__Impl_in_rule__EnumTypeLiteral__Group_2__08213);
            rule__EnumTypeLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__1_in_rule__EnumTypeLiteral__Group_2__08216);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4043:1: rule__EnumTypeLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__EnumTypeLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4047:1: ( ( ',' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4048:1: ( ',' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4048:1: ( ',' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4049:1: ','
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getCommaKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__EnumTypeLiteral__Group_2__0__Impl8244); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4062:1: rule__EnumTypeLiteral__Group_2__1 : rule__EnumTypeLiteral__Group_2__1__Impl ;
    public final void rule__EnumTypeLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4066:1: ( rule__EnumTypeLiteral__Group_2__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4067:2: rule__EnumTypeLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__Group_2__1__Impl_in_rule__EnumTypeLiteral__Group_2__18275);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4073:1: rule__EnumTypeLiteral__Group_2__1__Impl : ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) ) ;
    public final void rule__EnumTypeLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4077:1: ( ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4078:1: ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4078:1: ( ( rule__EnumTypeLiteral__MembersAssignment_2_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4079:1: ( rule__EnumTypeLiteral__MembersAssignment_2_1 )
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersAssignment_2_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4080:1: ( rule__EnumTypeLiteral__MembersAssignment_2_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4080:2: rule__EnumTypeLiteral__MembersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EnumTypeLiteral__MembersAssignment_2_1_in_rule__EnumTypeLiteral__Group_2__1__Impl8302);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4094:1: rule__EnumMember__Group__0 : rule__EnumMember__Group__0__Impl rule__EnumMember__Group__1 ;
    public final void rule__EnumMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4098:1: ( rule__EnumMember__Group__0__Impl rule__EnumMember__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4099:2: rule__EnumMember__Group__0__Impl rule__EnumMember__Group__1
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__0__Impl_in_rule__EnumMember__Group__08336);
            rule__EnumMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__08339);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4106:1: rule__EnumMember__Group__0__Impl : ( ( rule__EnumMember__NameAssignment_0 ) ) ;
    public final void rule__EnumMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4110:1: ( ( ( rule__EnumMember__NameAssignment_0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4111:1: ( ( rule__EnumMember__NameAssignment_0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4111:1: ( ( rule__EnumMember__NameAssignment_0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4112:1: ( rule__EnumMember__NameAssignment_0 )
            {
             before(grammarAccess.getEnumMemberAccess().getNameAssignment_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4113:1: ( rule__EnumMember__NameAssignment_0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4113:2: rule__EnumMember__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumMember__NameAssignment_0_in_rule__EnumMember__Group__0__Impl8366);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4123:1: rule__EnumMember__Group__1 : rule__EnumMember__Group__1__Impl ;
    public final void rule__EnumMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4127:1: ( rule__EnumMember__Group__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4128:2: rule__EnumMember__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__1__Impl_in_rule__EnumMember__Group__18396);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4134:1: rule__EnumMember__Group__1__Impl : ( ( rule__EnumMember__Group_1__0 )? ) ;
    public final void rule__EnumMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4138:1: ( ( ( rule__EnumMember__Group_1__0 )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4139:1: ( ( rule__EnumMember__Group_1__0 )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4139:1: ( ( rule__EnumMember__Group_1__0 )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4140:1: ( rule__EnumMember__Group_1__0 )?
            {
             before(grammarAccess.getEnumMemberAccess().getGroup_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4141:1: ( rule__EnumMember__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==27) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4141:2: rule__EnumMember__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EnumMember__Group_1__0_in_rule__EnumMember__Group__1__Impl8423);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4155:1: rule__EnumMember__Group_1__0 : rule__EnumMember__Group_1__0__Impl rule__EnumMember__Group_1__1 ;
    public final void rule__EnumMember__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4159:1: ( rule__EnumMember__Group_1__0__Impl rule__EnumMember__Group_1__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4160:2: rule__EnumMember__Group_1__0__Impl rule__EnumMember__Group_1__1
            {
            pushFollow(FOLLOW_rule__EnumMember__Group_1__0__Impl_in_rule__EnumMember__Group_1__08458);
            rule__EnumMember__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumMember__Group_1__1_in_rule__EnumMember__Group_1__08461);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4167:1: rule__EnumMember__Group_1__0__Impl : ( ( rule__EnumMember__AssignmentAssignment_1_0 ) ) ;
    public final void rule__EnumMember__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4171:1: ( ( ( rule__EnumMember__AssignmentAssignment_1_0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4172:1: ( ( rule__EnumMember__AssignmentAssignment_1_0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4172:1: ( ( rule__EnumMember__AssignmentAssignment_1_0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4173:1: ( rule__EnumMember__AssignmentAssignment_1_0 )
            {
             before(grammarAccess.getEnumMemberAccess().getAssignmentAssignment_1_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4174:1: ( rule__EnumMember__AssignmentAssignment_1_0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4174:2: rule__EnumMember__AssignmentAssignment_1_0
            {
            pushFollow(FOLLOW_rule__EnumMember__AssignmentAssignment_1_0_in_rule__EnumMember__Group_1__0__Impl8488);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4184:1: rule__EnumMember__Group_1__1 : rule__EnumMember__Group_1__1__Impl ;
    public final void rule__EnumMember__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4188:1: ( rule__EnumMember__Group_1__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4189:2: rule__EnumMember__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumMember__Group_1__1__Impl_in_rule__EnumMember__Group_1__18518);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4195:1: rule__EnumMember__Group_1__1__Impl : ( ( rule__EnumMember__ValueAssignment_1_1 ) ) ;
    public final void rule__EnumMember__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4199:1: ( ( ( rule__EnumMember__ValueAssignment_1_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4200:1: ( ( rule__EnumMember__ValueAssignment_1_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4200:1: ( ( rule__EnumMember__ValueAssignment_1_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4201:1: ( rule__EnumMember__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumMemberAccess().getValueAssignment_1_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4202:1: ( rule__EnumMember__ValueAssignment_1_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4202:2: rule__EnumMember__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumMember__ValueAssignment_1_1_in_rule__EnumMember__Group_1__1__Impl8545);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4216:1: rule__ComplexTypeLiteral__Group__0 : rule__ComplexTypeLiteral__Group__0__Impl rule__ComplexTypeLiteral__Group__1 ;
    public final void rule__ComplexTypeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4220:1: ( rule__ComplexTypeLiteral__Group__0__Impl rule__ComplexTypeLiteral__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4221:2: rule__ComplexTypeLiteral__Group__0__Impl rule__ComplexTypeLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__0__Impl_in_rule__ComplexTypeLiteral__Group__08579);
            rule__ComplexTypeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__1_in_rule__ComplexTypeLiteral__Group__08582);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4228:1: rule__ComplexTypeLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__ComplexTypeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4232:1: ( ( '{' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4233:1: ( '{' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4233:1: ( '{' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4234:1: '{'
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__ComplexTypeLiteral__Group__0__Impl8610); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4247:1: rule__ComplexTypeLiteral__Group__1 : rule__ComplexTypeLiteral__Group__1__Impl rule__ComplexTypeLiteral__Group__2 ;
    public final void rule__ComplexTypeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4251:1: ( rule__ComplexTypeLiteral__Group__1__Impl rule__ComplexTypeLiteral__Group__2 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4252:2: rule__ComplexTypeLiteral__Group__1__Impl rule__ComplexTypeLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__1__Impl_in_rule__ComplexTypeLiteral__Group__18641);
            rule__ComplexTypeLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__2_in_rule__ComplexTypeLiteral__Group__18644);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4259:1: rule__ComplexTypeLiteral__Group__1__Impl : ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) ) ;
    public final void rule__ComplexTypeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4263:1: ( ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4264:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4264:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4265:1: ( rule__ComplexTypeLiteral__MembersAssignment_1 )
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersAssignment_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4266:1: ( rule__ComplexTypeLiteral__MembersAssignment_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4266:2: rule__ComplexTypeLiteral__MembersAssignment_1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_1_in_rule__ComplexTypeLiteral__Group__1__Impl8671);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4276:1: rule__ComplexTypeLiteral__Group__2 : rule__ComplexTypeLiteral__Group__2__Impl rule__ComplexTypeLiteral__Group__3 ;
    public final void rule__ComplexTypeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4280:1: ( rule__ComplexTypeLiteral__Group__2__Impl rule__ComplexTypeLiteral__Group__3 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4281:2: rule__ComplexTypeLiteral__Group__2__Impl rule__ComplexTypeLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__2__Impl_in_rule__ComplexTypeLiteral__Group__28701);
            rule__ComplexTypeLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__3_in_rule__ComplexTypeLiteral__Group__28704);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4288:1: rule__ComplexTypeLiteral__Group__2__Impl : ( ( rule__ComplexTypeLiteral__Group_2__0 )* ) ;
    public final void rule__ComplexTypeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4292:1: ( ( ( rule__ComplexTypeLiteral__Group_2__0 )* ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4293:1: ( ( rule__ComplexTypeLiteral__Group_2__0 )* )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4293:1: ( ( rule__ComplexTypeLiteral__Group_2__0 )* )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4294:1: ( rule__ComplexTypeLiteral__Group_2__0 )*
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getGroup_2()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4295:1: ( rule__ComplexTypeLiteral__Group_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==22) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4295:2: rule__ComplexTypeLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__0_in_rule__ComplexTypeLiteral__Group__2__Impl8731);
            	    rule__ComplexTypeLiteral__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4305:1: rule__ComplexTypeLiteral__Group__3 : rule__ComplexTypeLiteral__Group__3__Impl ;
    public final void rule__ComplexTypeLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4309:1: ( rule__ComplexTypeLiteral__Group__3__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4310:2: rule__ComplexTypeLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group__3__Impl_in_rule__ComplexTypeLiteral__Group__38762);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4316:1: rule__ComplexTypeLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__ComplexTypeLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4320:1: ( ( '}' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4321:1: ( '}' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4321:1: ( '}' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4322:1: '}'
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getRightCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__ComplexTypeLiteral__Group__3__Impl8790); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4343:1: rule__ComplexTypeLiteral__Group_2__0 : rule__ComplexTypeLiteral__Group_2__0__Impl rule__ComplexTypeLiteral__Group_2__1 ;
    public final void rule__ComplexTypeLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4347:1: ( rule__ComplexTypeLiteral__Group_2__0__Impl rule__ComplexTypeLiteral__Group_2__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4348:2: rule__ComplexTypeLiteral__Group_2__0__Impl rule__ComplexTypeLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__0__Impl_in_rule__ComplexTypeLiteral__Group_2__08829);
            rule__ComplexTypeLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__1_in_rule__ComplexTypeLiteral__Group_2__08832);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4355:1: rule__ComplexTypeLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ComplexTypeLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4359:1: ( ( ',' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4360:1: ( ',' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4360:1: ( ',' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4361:1: ','
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getCommaKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__ComplexTypeLiteral__Group_2__0__Impl8860); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4374:1: rule__ComplexTypeLiteral__Group_2__1 : rule__ComplexTypeLiteral__Group_2__1__Impl ;
    public final void rule__ComplexTypeLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4378:1: ( rule__ComplexTypeLiteral__Group_2__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4379:2: rule__ComplexTypeLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__Group_2__1__Impl_in_rule__ComplexTypeLiteral__Group_2__18891);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4385:1: rule__ComplexTypeLiteral__Group_2__1__Impl : ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) ) ;
    public final void rule__ComplexTypeLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4389:1: ( ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4390:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4390:1: ( ( rule__ComplexTypeLiteral__MembersAssignment_2_1 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4391:1: ( rule__ComplexTypeLiteral__MembersAssignment_2_1 )
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersAssignment_2_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4392:1: ( rule__ComplexTypeLiteral__MembersAssignment_2_1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4392:2: rule__ComplexTypeLiteral__MembersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_2_1_in_rule__ComplexTypeLiteral__Group_2__1__Impl8918);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4406:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4410:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4411:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08952);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08955);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4418:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4422:1: ( ( RULE_ID ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4423:1: ( RULE_ID )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4423:1: ( RULE_ID )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4424:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8982); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4435:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4439:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4440:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__19011);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4446:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4450:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4451:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4451:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4452:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4453:1: ( rule__QualifiedName__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==31) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4453:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl9038);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4467:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4471:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4472:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__09073);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__09076);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4479:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4483:1: ( ( '.' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4484:1: ( '.' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4484:1: ( '.' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4485:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__QualifiedName__Group_1__0__Impl9104); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4498:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4502:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4503:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__19135);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4509:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4513:1: ( ( RULE_ID ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4514:1: ( RULE_ID )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4514:1: ( RULE_ID )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4515:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl9162); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4530:1: rule__SignedNumber__Group__0 : rule__SignedNumber__Group__0__Impl rule__SignedNumber__Group__1 ;
    public final void rule__SignedNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4534:1: ( rule__SignedNumber__Group__0__Impl rule__SignedNumber__Group__1 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4535:2: rule__SignedNumber__Group__0__Impl rule__SignedNumber__Group__1
            {
            pushFollow(FOLLOW_rule__SignedNumber__Group__0__Impl_in_rule__SignedNumber__Group__09195);
            rule__SignedNumber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignedNumber__Group__1_in_rule__SignedNumber__Group__09198);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4542:1: rule__SignedNumber__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SignedNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4546:1: ( ( ( '-' )? ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4547:1: ( ( '-' )? )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4547:1: ( ( '-' )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4548:1: ( '-' )?
            {
             before(grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4549:1: ( '-' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==25) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4550:2: '-'
                    {
                    match(input,25,FOLLOW_25_in_rule__SignedNumber__Group__0__Impl9227); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4561:1: rule__SignedNumber__Group__1 : rule__SignedNumber__Group__1__Impl ;
    public final void rule__SignedNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4565:1: ( rule__SignedNumber__Group__1__Impl )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4566:2: rule__SignedNumber__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SignedNumber__Group__1__Impl_in_rule__SignedNumber__Group__19260);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4572:1: rule__SignedNumber__Group__1__Impl : ( RULE_NUMBER ) ;
    public final void rule__SignedNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4576:1: ( ( RULE_NUMBER ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4577:1: ( RULE_NUMBER )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4577:1: ( RULE_NUMBER )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4578:1: RULE_NUMBER
            {
             before(grammarAccess.getSignedNumberAccess().getNUMBERTerminalRuleCall_1()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__SignedNumber__Group__1__Impl9287); 
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


    // $ANTLR start "rule__Model__PackageNameAssignment_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4594:1: rule__Model__PackageNameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4598:1: ( ( ruleQualifiedName ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4599:1: ( ruleQualifiedName )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4599:1: ( ruleQualifiedName )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4600:1: ruleQualifiedName
            {
             before(grammarAccess.getModelAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__PackageNameAssignment_19325);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__PackageNameAssignment_1"


    // $ANTLR start "rule__Model__DeclarationsAssignment_2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4609:1: rule__Model__DeclarationsAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4613:1: ( ( ruleDeclaration ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4614:1: ( ruleDeclaration )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4614:1: ( ruleDeclaration )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4615:1: ruleDeclaration
            {
             before(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Model__DeclarationsAssignment_29356);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__DeclarationsAssignment_2"


    // $ANTLR start "rule__Api__NameAssignment_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4624:1: rule__Api__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Api__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4628:1: ( ( RULE_ID ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4629:1: ( RULE_ID )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4629:1: ( RULE_ID )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4630:1: RULE_ID
            {
             before(grammarAccess.getApiAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Api__NameAssignment_19387); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4639:1: rule__Api__BaseUrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Api__BaseUrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4643:1: ( ( RULE_STRING ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4644:1: ( RULE_STRING )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4644:1: ( RULE_STRING )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4645:1: RULE_STRING
            {
             before(grammarAccess.getApiAccess().getBaseUrlSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Api__BaseUrlAssignment_29418); 
             after(grammarAccess.getApiAccess().getBaseUrlSTRINGTerminalRuleCall_2_0()); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4654:1: rule__Api__BlocksAssignment_4 : ( ruleServiceBlock ) ;
    public final void rule__Api__BlocksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4658:1: ( ( ruleServiceBlock ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4659:1: ( ruleServiceBlock )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4659:1: ( ruleServiceBlock )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4660:1: ruleServiceBlock
            {
             before(grammarAccess.getApiAccess().getBlocksServiceBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleServiceBlock_in_rule__Api__BlocksAssignment_49449);
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


    // $ANTLR start "rule__HeaderBlock__HeadersAssignment_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4669:1: rule__HeaderBlock__HeadersAssignment_1 : ( ruleHeader ) ;
    public final void rule__HeaderBlock__HeadersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4673:1: ( ( ruleHeader ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4674:1: ( ruleHeader )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4674:1: ( ruleHeader )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4675:1: ruleHeader
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersHeaderParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleHeader_in_rule__HeaderBlock__HeadersAssignment_19480);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderBlockAccess().getHeadersHeaderParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__HeaderBlock__HeadersAssignment_1"


    // $ANTLR start "rule__HeaderBlock__HeadersAssignment_2_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4684:1: rule__HeaderBlock__HeadersAssignment_2_1 : ( ruleHeader ) ;
    public final void rule__HeaderBlock__HeadersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4688:1: ( ( ruleHeader ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4689:1: ( ruleHeader )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4689:1: ( ruleHeader )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4690:1: ruleHeader
            {
             before(grammarAccess.getHeaderBlockAccess().getHeadersHeaderParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleHeader_in_rule__HeaderBlock__HeadersAssignment_2_19511);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderBlockAccess().getHeadersHeaderParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__HeaderBlock__HeadersAssignment_2_1"


    // $ANTLR start "rule__Header__NameAssignment_0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4699:1: rule__Header__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Header__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4703:1: ( ( RULE_STRING ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4704:1: ( RULE_STRING )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4704:1: ( RULE_STRING )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4705:1: RULE_STRING
            {
             before(grammarAccess.getHeaderAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Header__NameAssignment_09542); 
             after(grammarAccess.getHeaderAccess().getNameSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Header__NameAssignment_0"


    // $ANTLR start "rule__Header__ValueAssignment_2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4714:1: rule__Header__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Header__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4718:1: ( ( RULE_STRING ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4719:1: ( RULE_STRING )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4719:1: ( RULE_STRING )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4720:1: RULE_STRING
            {
             before(grammarAccess.getHeaderAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Header__ValueAssignment_29573); 
             after(grammarAccess.getHeaderAccess().getValueSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Header__ValueAssignment_2"


    // $ANTLR start "rule__HttpMethod__TypeAssignment_0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4729:1: rule__HttpMethod__TypeAssignment_0 : ( ruleHttpMethodType ) ;
    public final void rule__HttpMethod__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4733:1: ( ( ruleHttpMethodType ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4734:1: ( ruleHttpMethodType )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4734:1: ( ruleHttpMethodType )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4735:1: ruleHttpMethodType
            {
             before(grammarAccess.getHttpMethodAccess().getTypeHttpMethodTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleHttpMethodType_in_rule__HttpMethod__TypeAssignment_09604);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4744:1: rule__HttpMethod__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__HttpMethod__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4748:1: ( ( RULE_ID ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4749:1: ( RULE_ID )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4749:1: ( RULE_ID )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4750:1: RULE_ID
            {
             before(grammarAccess.getHttpMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HttpMethod__NameAssignment_19635); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4759:1: rule__HttpMethod__PathAssignment_2 : ( rulePath ) ;
    public final void rule__HttpMethod__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4763:1: ( ( rulePath ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4764:1: ( rulePath )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4764:1: ( rulePath )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4765:1: rulePath
            {
             before(grammarAccess.getHttpMethodAccess().getPathPathParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePath_in_rule__HttpMethod__PathAssignment_29666);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4774:1: rule__HttpMethod__BlocksAssignment_4 : ( ruleHttpMethodBlock ) ;
    public final void rule__HttpMethod__BlocksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4778:1: ( ( ruleHttpMethodBlock ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4779:1: ( ruleHttpMethodBlock )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4779:1: ( ruleHttpMethodBlock )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4780:1: ruleHttpMethodBlock
            {
             before(grammarAccess.getHttpMethodAccess().getBlocksHttpMethodBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleHttpMethodBlock_in_rule__HttpMethod__BlocksAssignment_49697);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4789:1: rule__Path__ParamsAssignment_2_1 : ( ruleSimpleMemberAssignment ) ;
    public final void rule__Path__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4793:1: ( ( ruleSimpleMemberAssignment ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4794:1: ( ruleSimpleMemberAssignment )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4794:1: ( ruleSimpleMemberAssignment )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4795:1: ruleSimpleMemberAssignment
            {
             before(grammarAccess.getPathAccess().getParamsSimpleMemberAssignmentParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_rule__Path__ParamsAssignment_2_19728);
            ruleSimpleMemberAssignment();

            state._fsp--;

             after(grammarAccess.getPathAccess().getParamsSimpleMemberAssignmentParserRuleCall_2_1_0()); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4804:1: rule__Path__ParamsAssignment_3_1_1 : ( ruleSimpleMemberAssignment ) ;
    public final void rule__Path__ParamsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4808:1: ( ( ruleSimpleMemberAssignment ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4809:1: ( ruleSimpleMemberAssignment )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4809:1: ( ruleSimpleMemberAssignment )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4810:1: ruleSimpleMemberAssignment
            {
             before(grammarAccess.getPathAccess().getParamsSimpleMemberAssignmentParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_rule__Path__ParamsAssignment_3_1_19759);
            ruleSimpleMemberAssignment();

            state._fsp--;

             after(grammarAccess.getPathAccess().getParamsSimpleMemberAssignmentParserRuleCall_3_1_1_0()); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4819:1: rule__ParamsBlock__ParamsAssignment_2 : ( ruleSimpleMemberAssignment ) ;
    public final void rule__ParamsBlock__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4823:1: ( ( ruleSimpleMemberAssignment ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4824:1: ( ruleSimpleMemberAssignment )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4824:1: ( ruleSimpleMemberAssignment )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4825:1: ruleSimpleMemberAssignment
            {
             before(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberAssignmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_rule__ParamsBlock__ParamsAssignment_29790);
            ruleSimpleMemberAssignment();

            state._fsp--;

             after(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberAssignmentParserRuleCall_2_0()); 

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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4834:1: rule__ParamsBlock__ParamsAssignment_3_1 : ( ruleSimpleMemberAssignment ) ;
    public final void rule__ParamsBlock__ParamsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4838:1: ( ( ruleSimpleMemberAssignment ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4839:1: ( ruleSimpleMemberAssignment )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4839:1: ( ruleSimpleMemberAssignment )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4840:1: ruleSimpleMemberAssignment
            {
             before(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberAssignmentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleSimpleMemberAssignment_in_rule__ParamsBlock__ParamsAssignment_3_19821);
            ruleSimpleMemberAssignment();

            state._fsp--;

             after(grammarAccess.getParamsBlockAccess().getParamsSimpleMemberAssignmentParserRuleCall_3_1_0()); 

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


    // $ANTLR start "rule__SimpleMemberAssignment__MemberAssignment_0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4849:1: rule__SimpleMemberAssignment__MemberAssignment_0 : ( ruleSimpleMember ) ;
    public final void rule__SimpleMemberAssignment__MemberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4853:1: ( ( ruleSimpleMember ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4854:1: ( ruleSimpleMember )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4854:1: ( ruleSimpleMember )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4855:1: ruleSimpleMember
            {
             before(grammarAccess.getSimpleMemberAssignmentAccess().getMemberSimpleMemberParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSimpleMember_in_rule__SimpleMemberAssignment__MemberAssignment_09852);
            ruleSimpleMember();

            state._fsp--;

             after(grammarAccess.getSimpleMemberAssignmentAccess().getMemberSimpleMemberParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__SimpleMemberAssignment__MemberAssignment_0"


    // $ANTLR start "rule__SimpleMemberAssignment__DefaultValueAssignment_1_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4864:1: rule__SimpleMemberAssignment__DefaultValueAssignment_1_1 : ( ruleLiteral ) ;
    public final void rule__SimpleMemberAssignment__DefaultValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4868:1: ( ( ruleLiteral ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4869:1: ( ruleLiteral )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4869:1: ( ruleLiteral )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4870:1: ruleLiteral
            {
             before(grammarAccess.getSimpleMemberAssignmentAccess().getDefaultValueLiteralParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__SimpleMemberAssignment__DefaultValueAssignment_1_19883);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getSimpleMemberAssignmentAccess().getDefaultValueLiteralParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__SimpleMemberAssignment__DefaultValueAssignment_1_1"


    // $ANTLR start "rule__Literal__LiteralAssignment_0_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4879:1: rule__Literal__LiteralAssignment_0_1 : ( ruleBooleanValue ) ;
    public final void rule__Literal__LiteralAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4883:1: ( ( ruleBooleanValue ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4884:1: ( ruleBooleanValue )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4884:1: ( ruleBooleanValue )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4885:1: ruleBooleanValue
            {
             before(grammarAccess.getLiteralAccess().getLiteralBooleanValueEnumRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_rule__Literal__LiteralAssignment_0_19914);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4894:1: rule__Literal__LiteralAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Literal__LiteralAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4898:1: ( ( RULE_STRING ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4899:1: ( RULE_STRING )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4899:1: ( RULE_STRING )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4900:1: RULE_STRING
            {
             before(grammarAccess.getLiteralAccess().getLiteralSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Literal__LiteralAssignment_1_19945); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4909:1: rule__Literal__LiteralAssignment_2_1 : ( ruleSignedNumber ) ;
    public final void rule__Literal__LiteralAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4913:1: ( ( ruleSignedNumber ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4914:1: ( ruleSignedNumber )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4914:1: ( ruleSignedNumber )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4915:1: ruleSignedNumber
            {
             before(grammarAccess.getLiteralAccess().getLiteralSignedNumberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleSignedNumber_in_rule__Literal__LiteralAssignment_2_19976);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4924:1: rule__BodyBlock__TypeAssignment_1 : ( ruleBlockType ) ;
    public final void rule__BodyBlock__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4928:1: ( ( ruleBlockType ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4929:1: ( ruleBlockType )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4929:1: ( ruleBlockType )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4930:1: ruleBlockType
            {
             before(grammarAccess.getBodyBlockAccess().getTypeBlockTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBlockType_in_rule__BodyBlock__TypeAssignment_110007);
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


    // $ANTLR start "rule__ResponseBlock__SuperTypeAssignment_2_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4939:1: rule__ResponseBlock__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ResponseBlock__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4943:1: ( ( ( RULE_ID ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4944:1: ( ( RULE_ID ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4944:1: ( ( RULE_ID ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4945:1: ( RULE_ID )
            {
             before(grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationCrossReference_2_1_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4946:1: ( RULE_ID )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4947:1: RULE_ID
            {
             before(grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResponseBlock__SuperTypeAssignment_2_110042); 
             after(grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getResponseBlockAccess().getSuperTypeComplexTypeDeclarationCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__ResponseBlock__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__ResponseBlock__TypeAssignment_3"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4958:1: rule__ResponseBlock__TypeAssignment_3 : ( ruleBlockType ) ;
    public final void rule__ResponseBlock__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4962:1: ( ( ruleBlockType ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4963:1: ( ruleBlockType )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4963:1: ( ruleBlockType )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4964:1: ruleBlockType
            {
             before(grammarAccess.getResponseBlockAccess().getTypeBlockTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBlockType_in_rule__ResponseBlock__TypeAssignment_310077);
            ruleBlockType();

            state._fsp--;

             after(grammarAccess.getResponseBlockAccess().getTypeBlockTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ResponseBlock__TypeAssignment_3"


    // $ANTLR start "rule__Member__NameAssignment_0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4973:1: rule__Member__NameAssignment_0 : ( ( rule__Member__NameAlternatives_0_0 ) ) ;
    public final void rule__Member__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4977:1: ( ( ( rule__Member__NameAlternatives_0_0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4978:1: ( ( rule__Member__NameAlternatives_0_0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4978:1: ( ( rule__Member__NameAlternatives_0_0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4979:1: ( rule__Member__NameAlternatives_0_0 )
            {
             before(grammarAccess.getMemberAccess().getNameAlternatives_0_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4980:1: ( rule__Member__NameAlternatives_0_0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4980:2: rule__Member__NameAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Member__NameAlternatives_0_0_in_rule__Member__NameAssignment_010108);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4989:1: rule__Member__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Member__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4993:1: ( ( ruleType ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4994:1: ( ruleType )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4994:1: ( ruleType )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:4995:1: ruleType
            {
             before(grammarAccess.getMemberAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Member__TypeAssignment_210141);
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


    // $ANTLR start "rule__SimpleMember__NameAssignment_0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5004:1: rule__SimpleMember__NameAssignment_0 : ( ( rule__SimpleMember__NameAlternatives_0_0 ) ) ;
    public final void rule__SimpleMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5008:1: ( ( ( rule__SimpleMember__NameAlternatives_0_0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5009:1: ( ( rule__SimpleMember__NameAlternatives_0_0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5009:1: ( ( rule__SimpleMember__NameAlternatives_0_0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5010:1: ( rule__SimpleMember__NameAlternatives_0_0 )
            {
             before(grammarAccess.getSimpleMemberAccess().getNameAlternatives_0_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5011:1: ( rule__SimpleMember__NameAlternatives_0_0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5011:2: rule__SimpleMember__NameAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__SimpleMember__NameAlternatives_0_0_in_rule__SimpleMember__NameAssignment_010172);
            rule__SimpleMember__NameAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleMemberAccess().getNameAlternatives_0_0()); 

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
    // $ANTLR end "rule__SimpleMember__NameAssignment_0"


    // $ANTLR start "rule__SimpleMember__TypeAssignment_2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5020:1: rule__SimpleMember__TypeAssignment_2 : ( ruleIntrinsicType ) ;
    public final void rule__SimpleMember__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5024:1: ( ( ruleIntrinsicType ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5025:1: ( ruleIntrinsicType )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5025:1: ( ruleIntrinsicType )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5026:1: ruleIntrinsicType
            {
             before(grammarAccess.getSimpleMemberAccess().getTypeIntrinsicTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIntrinsicType_in_rule__SimpleMember__TypeAssignment_210205);
            ruleIntrinsicType();

            state._fsp--;

             after(grammarAccess.getSimpleMemberAccess().getTypeIntrinsicTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SimpleMember__TypeAssignment_2"


    // $ANTLR start "rule__ArrayType__ElementTypeAssignment_0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5035:1: rule__ArrayType__ElementTypeAssignment_0 : ( ( rule__ArrayType__ElementTypeAlternatives_0_0 ) ) ;
    public final void rule__ArrayType__ElementTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5039:1: ( ( ( rule__ArrayType__ElementTypeAlternatives_0_0 ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5040:1: ( ( rule__ArrayType__ElementTypeAlternatives_0_0 ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5040:1: ( ( rule__ArrayType__ElementTypeAlternatives_0_0 ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5041:1: ( rule__ArrayType__ElementTypeAlternatives_0_0 )
            {
             before(grammarAccess.getArrayTypeAccess().getElementTypeAlternatives_0_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5042:1: ( rule__ArrayType__ElementTypeAlternatives_0_0 )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5042:2: rule__ArrayType__ElementTypeAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__ArrayType__ElementTypeAlternatives_0_0_in_rule__ArrayType__ElementTypeAssignment_010236);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5051:1: rule__ArrayType__IdAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__ArrayType__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5055:1: ( ( ( '[]' ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5056:1: ( ( '[]' ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5056:1: ( ( '[]' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5057:1: ( '[]' )
            {
             before(grammarAccess.getArrayTypeAccess().getIdLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5058:1: ( '[]' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5059:1: '[]'
            {
             before(grammarAccess.getArrayTypeAccess().getIdLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__ArrayType__IdAssignment_110274); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5074:1: rule__UserType__DeclarationAssignment : ( ( RULE_ID ) ) ;
    public final void rule__UserType__DeclarationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5078:1: ( ( ( RULE_ID ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5079:1: ( ( RULE_ID ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5079:1: ( ( RULE_ID ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5080:1: ( RULE_ID )
            {
             before(grammarAccess.getUserTypeAccess().getDeclarationUserTypeDeclarationCrossReference_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5081:1: ( RULE_ID )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5082:1: RULE_ID
            {
             before(grammarAccess.getUserTypeAccess().getDeclarationUserTypeDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserType__DeclarationAssignment10317); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5093:1: rule__ComplexTypeDeclaration__KeywordAssignment_0 : ( ( 'entity' ) ) ;
    public final void rule__ComplexTypeDeclaration__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5097:1: ( ( ( 'entity' ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5098:1: ( ( 'entity' ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5098:1: ( ( 'entity' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5099:1: ( 'entity' )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getKeywordEntityKeyword_0_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5100:1: ( 'entity' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5101:1: 'entity'
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getKeywordEntityKeyword_0_0()); 
            match(input,33,FOLLOW_33_in_rule__ComplexTypeDeclaration__KeywordAssignment_010357); 
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


    // $ANTLR start "rule__ComplexTypeDeclaration__NogenAssignment_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5116:1: rule__ComplexTypeDeclaration__NogenAssignment_1 : ( ( 'nogen' ) ) ;
    public final void rule__ComplexTypeDeclaration__NogenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5120:1: ( ( ( 'nogen' ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5121:1: ( ( 'nogen' ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5121:1: ( ( 'nogen' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5122:1: ( 'nogen' )
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getNogenNogenKeyword_1_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5123:1: ( 'nogen' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5124:1: 'nogen'
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getNogenNogenKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__ComplexTypeDeclaration__NogenAssignment_110401); 
             after(grammarAccess.getComplexTypeDeclarationAccess().getNogenNogenKeyword_1_0()); 

            }

             after(grammarAccess.getComplexTypeDeclarationAccess().getNogenNogenKeyword_1_0()); 

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
    // $ANTLR end "rule__ComplexTypeDeclaration__NogenAssignment_1"


    // $ANTLR start "rule__ComplexTypeDeclaration__NameAssignment_2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5139:1: rule__ComplexTypeDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ComplexTypeDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5143:1: ( ( RULE_ID ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5144:1: ( RULE_ID )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5144:1: ( RULE_ID )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5145:1: RULE_ID
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ComplexTypeDeclaration__NameAssignment_210440); 
             after(grammarAccess.getComplexTypeDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ComplexTypeDeclaration__NameAssignment_2"


    // $ANTLR start "rule__ComplexTypeDeclaration__LiteralAssignment_3"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5154:1: rule__ComplexTypeDeclaration__LiteralAssignment_3 : ( ruleComplexTypeLiteral ) ;
    public final void rule__ComplexTypeDeclaration__LiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5158:1: ( ( ruleComplexTypeLiteral ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5159:1: ( ruleComplexTypeLiteral )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5159:1: ( ruleComplexTypeLiteral )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5160:1: ruleComplexTypeLiteral
            {
             before(grammarAccess.getComplexTypeDeclarationAccess().getLiteralComplexTypeLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleComplexTypeLiteral_in_rule__ComplexTypeDeclaration__LiteralAssignment_310471);
            ruleComplexTypeLiteral();

            state._fsp--;

             after(grammarAccess.getComplexTypeDeclarationAccess().getLiteralComplexTypeLiteralParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ComplexTypeDeclaration__LiteralAssignment_3"


    // $ANTLR start "rule__EnumTypeDeclaration__KeywordAssignment_0"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5169:1: rule__EnumTypeDeclaration__KeywordAssignment_0 : ( ( 'enum' ) ) ;
    public final void rule__EnumTypeDeclaration__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5173:1: ( ( ( 'enum' ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5174:1: ( ( 'enum' ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5174:1: ( ( 'enum' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5175:1: ( 'enum' )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5176:1: ( 'enum' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5177:1: 'enum'
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getKeywordEnumKeyword_0_0()); 
            match(input,35,FOLLOW_35_in_rule__EnumTypeDeclaration__KeywordAssignment_010507); 
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


    // $ANTLR start "rule__EnumTypeDeclaration__NogenAssignment_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5192:1: rule__EnumTypeDeclaration__NogenAssignment_1 : ( ( 'nogen' ) ) ;
    public final void rule__EnumTypeDeclaration__NogenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5196:1: ( ( ( 'nogen' ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5197:1: ( ( 'nogen' ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5197:1: ( ( 'nogen' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5198:1: ( 'nogen' )
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getNogenNogenKeyword_1_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5199:1: ( 'nogen' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5200:1: 'nogen'
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getNogenNogenKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__EnumTypeDeclaration__NogenAssignment_110551); 
             after(grammarAccess.getEnumTypeDeclarationAccess().getNogenNogenKeyword_1_0()); 

            }

             after(grammarAccess.getEnumTypeDeclarationAccess().getNogenNogenKeyword_1_0()); 

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
    // $ANTLR end "rule__EnumTypeDeclaration__NogenAssignment_1"


    // $ANTLR start "rule__EnumTypeDeclaration__NameAssignment_2"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5215:1: rule__EnumTypeDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumTypeDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5219:1: ( ( RULE_ID ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5220:1: ( RULE_ID )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5220:1: ( RULE_ID )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5221:1: RULE_ID
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumTypeDeclaration__NameAssignment_210590); 
             after(grammarAccess.getEnumTypeDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__EnumTypeDeclaration__NameAssignment_2"


    // $ANTLR start "rule__EnumTypeDeclaration__SuperTypeAssignment_3_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5230:1: rule__EnumTypeDeclaration__SuperTypeAssignment_3_1 : ( ruleIntegerType ) ;
    public final void rule__EnumTypeDeclaration__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5234:1: ( ( ruleIntegerType ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5235:1: ( ruleIntegerType )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5235:1: ( ruleIntegerType )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5236:1: ruleIntegerType
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeIntegerTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntegerType_in_rule__EnumTypeDeclaration__SuperTypeAssignment_3_110621);
            ruleIntegerType();

            state._fsp--;

             after(grammarAccess.getEnumTypeDeclarationAccess().getSuperTypeIntegerTypeParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__EnumTypeDeclaration__SuperTypeAssignment_3_1"


    // $ANTLR start "rule__EnumTypeDeclaration__LiteralAssignment_4"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5245:1: rule__EnumTypeDeclaration__LiteralAssignment_4 : ( ruleEnumTypeLiteral ) ;
    public final void rule__EnumTypeDeclaration__LiteralAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5249:1: ( ( ruleEnumTypeLiteral ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5250:1: ( ruleEnumTypeLiteral )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5250:1: ( ruleEnumTypeLiteral )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5251:1: ruleEnumTypeLiteral
            {
             before(grammarAccess.getEnumTypeDeclarationAccess().getLiteralEnumTypeLiteralParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEnumTypeLiteral_in_rule__EnumTypeDeclaration__LiteralAssignment_410652);
            ruleEnumTypeLiteral();

            state._fsp--;

             after(grammarAccess.getEnumTypeDeclarationAccess().getLiteralEnumTypeLiteralParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__EnumTypeDeclaration__LiteralAssignment_4"


    // $ANTLR start "rule__EnumTypeLiteral__MembersAssignment_1"
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5260:1: rule__EnumTypeLiteral__MembersAssignment_1 : ( ruleEnumMember ) ;
    public final void rule__EnumTypeLiteral__MembersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5264:1: ( ( ruleEnumMember ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5265:1: ( ruleEnumMember )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5265:1: ( ruleEnumMember )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5266:1: ruleEnumMember
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_110683);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5275:1: rule__EnumTypeLiteral__MembersAssignment_2_1 : ( ruleEnumMember ) ;
    public final void rule__EnumTypeLiteral__MembersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5279:1: ( ( ruleEnumMember ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5280:1: ( ruleEnumMember )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5280:1: ( ruleEnumMember )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5281:1: ruleEnumMember
            {
             before(grammarAccess.getEnumTypeLiteralAccess().getMembersEnumMemberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_2_110714);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5290:1: rule__EnumMember__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5294:1: ( ( RULE_ID ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5295:1: ( RULE_ID )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5295:1: ( RULE_ID )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5296:1: RULE_ID
            {
             before(grammarAccess.getEnumMemberAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumMember__NameAssignment_010745); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5305:1: rule__EnumMember__AssignmentAssignment_1_0 : ( ( '=' ) ) ;
    public final void rule__EnumMember__AssignmentAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5309:1: ( ( ( '=' ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5310:1: ( ( '=' ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5310:1: ( ( '=' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5311:1: ( '=' )
            {
             before(grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5312:1: ( '=' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5313:1: '='
            {
             before(grammarAccess.getEnumMemberAccess().getAssignmentEqualsSignKeyword_1_0_0()); 
            match(input,27,FOLLOW_27_in_rule__EnumMember__AssignmentAssignment_1_010781); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5328:1: rule__EnumMember__ValueAssignment_1_1 : ( RULE_NUMBER ) ;
    public final void rule__EnumMember__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5332:1: ( ( RULE_NUMBER ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5333:1: ( RULE_NUMBER )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5333:1: ( RULE_NUMBER )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5334:1: RULE_NUMBER
            {
             before(grammarAccess.getEnumMemberAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__EnumMember__ValueAssignment_1_110820); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5343:1: rule__ComplexTypeLiteral__MembersAssignment_1 : ( ruleMember ) ;
    public final void rule__ComplexTypeLiteral__MembersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5347:1: ( ( ruleMember ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5348:1: ( ruleMember )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5348:1: ( ruleMember )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5349:1: ruleMember
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_110851);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5358:1: rule__ComplexTypeLiteral__MembersAssignment_2_1 : ( ruleMember ) ;
    public final void rule__ComplexTypeLiteral__MembersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5362:1: ( ( ruleMember ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5363:1: ( ruleMember )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5363:1: ( ruleMember )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5364:1: ruleMember
            {
             before(grammarAccess.getComplexTypeLiteralAccess().getMembersMemberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_2_110882);
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5373:1: rule__StringType__IdAssignment : ( ( 'string' ) ) ;
    public final void rule__StringType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5377:1: ( ( ( 'string' ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5378:1: ( ( 'string' ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5378:1: ( ( 'string' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5379:1: ( 'string' )
            {
             before(grammarAccess.getStringTypeAccess().getIdStringKeyword_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5380:1: ( 'string' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5381:1: 'string'
            {
             before(grammarAccess.getStringTypeAccess().getIdStringKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__StringType__IdAssignment10918); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5396:1: rule__BooleanType__IdAssignment : ( ( 'boolean' ) ) ;
    public final void rule__BooleanType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5400:1: ( ( ( 'boolean' ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5401:1: ( ( 'boolean' ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5401:1: ( ( 'boolean' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5402:1: ( 'boolean' )
            {
             before(grammarAccess.getBooleanTypeAccess().getIdBooleanKeyword_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5403:1: ( 'boolean' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5404:1: 'boolean'
            {
             before(grammarAccess.getBooleanTypeAccess().getIdBooleanKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__BooleanType__IdAssignment10962); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5419:1: rule__IntegerType__IdAssignment : ( ( 'int' ) ) ;
    public final void rule__IntegerType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5423:1: ( ( ( 'int' ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5424:1: ( ( 'int' ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5424:1: ( ( 'int' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5425:1: ( 'int' )
            {
             before(grammarAccess.getIntegerTypeAccess().getIdIntKeyword_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5426:1: ( 'int' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5427:1: 'int'
            {
             before(grammarAccess.getIntegerTypeAccess().getIdIntKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__IntegerType__IdAssignment11006); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5442:1: rule__LongType__IdAssignment : ( ( 'long' ) ) ;
    public final void rule__LongType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5446:1: ( ( ( 'long' ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5447:1: ( ( 'long' ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5447:1: ( ( 'long' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5448:1: ( 'long' )
            {
             before(grammarAccess.getLongTypeAccess().getIdLongKeyword_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5449:1: ( 'long' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5450:1: 'long'
            {
             before(grammarAccess.getLongTypeAccess().getIdLongKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__LongType__IdAssignment11050); 
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
    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5465:1: rule__DoubleType__IdAssignment : ( ( 'double' ) ) ;
    public final void rule__DoubleType__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5469:1: ( ( ( 'double' ) ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5470:1: ( ( 'double' ) )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5470:1: ( ( 'double' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5471:1: ( 'double' )
            {
             before(grammarAccess.getDoubleTypeAccess().getIdDoubleKeyword_0()); 
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5472:1: ( 'double' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5473:1: 'double'
            {
             before(grammarAccess.getDoubleTypeAccess().getIdDoubleKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__DoubleType__IdAssignment11094); 
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


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\12\uffff";
    static final String DFA10_eofS =
        "\1\uffff\1\7\5\11\3\uffff";
    static final String DFA10_minS =
        "\1\4\6\24\3\uffff";
    static final String DFA10_maxS =
        "\1\50\6\40\3\uffff";
    static final String DFA10_acceptS =
        "\7\uffff\1\1\1\3\1\2";
    static final String DFA10_specialS =
        "\12\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\37\uffff\1\2\1\3\1\4\1\5\1\6",
            "\3\7\3\uffff\1\7\1\uffff\2\7\2\uffff\1\10",
            "\3\11\3\uffff\1\11\1\uffff\2\11\2\uffff\1\10",
            "\3\11\3\uffff\1\11\1\uffff\2\11\2\uffff\1\10",
            "\3\11\3\uffff\1\11\1\uffff\2\11\2\uffff\1\10",
            "\3\11\3\uffff\1\11\1\uffff\2\11\2\uffff\1\10",
            "\3\11\3\uffff\1\11\1\uffff\2\11\2\uffff\1\10",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1328:1: rule__Type__Alternatives : ( ( ruleUserType ) | ( ruleIntrinsicType ) | ( ruleArrayType ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleHeader_in_entryRuleHeader361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__0_in_ruleHeader394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_entryRuleHttpMethod421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpMethod428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__0_in_ruleHttpMethod454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethodBlock_in_entryRuleHttpMethodBlock481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpMethodBlock488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethodBlock__Alternatives_in_ruleHttpMethodBlock514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__0_in_rulePath574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitraryPathSegment_in_entryRuleArbitraryPathSegment601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArbitraryPathSegment608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group__0_in_ruleArbitraryPathSegment634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_entryRuleParamsBlock661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamsBlock668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__0_in_ruleParamsBlock694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_entryRuleSimpleMemberAssignment721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleMemberAssignment728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group__0_in_ruleSimpleMemberAssignment754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_entryRuleBodyBlock841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyBlock848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__0_in_ruleBodyBlock874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_entryRuleResponseBlock901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResponseBlock908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__0_in_ruleResponseBlock934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_entryRuleBlockType961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockType968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockType__Alternatives_in_ruleBlockType994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Group__0_in_ruleMember1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_entryRuleSimpleMember1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleMember1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__0_in_ruleSimpleMember1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_entryRuleUserType1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserType1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserType__DeclarationAssignment_in_ruleUserType1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeDeclaration_in_entryRuleUserTypeDeclaration1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserTypeDeclaration1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserTypeDeclaration__Alternatives_in_ruleUserTypeDeclaration1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeDeclaration_in_entryRuleComplexTypeDeclaration1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeDeclaration1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__0_in_ruleComplexTypeDeclaration1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeDeclaration_in_entryRuleEnumTypeDeclaration1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeDeclaration1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__0_in_ruleEnumTypeDeclaration1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeLiteral_in_entryRuleEnumTypeLiteral1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumTypeLiteral1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__0_in_ruleEnumTypeLiteral1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__0_in_ruleEnumMember1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_entryRuleComplexTypeLiteral1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexTypeLiteral1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__0_in_ruleComplexTypeLiteral1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_entryRuleIntrinsicType1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntrinsicType1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntrinsicType__Alternatives_in_ruleIntrinsicType1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__IdAssignment_in_ruleStringType1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanType__IdAssignment_in_ruleBooleanType1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_entryRuleNumericType1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericType1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericType__Alternatives_in_ruleNumericType1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_entryRuleIntegerType1921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerType1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerType__IdAssignment_in_ruleIntegerType1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_entryRuleLongType1981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongType1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongType__IdAssignment_in_ruleLongType2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_entryRuleDoubleType2041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleType2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleType__IdAssignment_in_ruleDoubleType2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber2161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedNumber__Group__0_in_ruleSignedNumber2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethodType__Alternatives_in_ruleHttpMethodType2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__Alternatives_in_ruleBooleanValue2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeDeclaration_in_rule__Declaration__Alternatives2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApi_in_rule__Declaration__Alternatives2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderBlock_in_rule__ServiceBlock__Alternatives2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_rule__ServiceBlock__Alternatives2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_rule__ServiceBlock__Alternatives2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderBlock_in_rule__HttpMethodBlock__Alternatives2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamsBlock_in_rule__HttpMethodBlock__Alternatives2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyBlock_in_rule__HttpMethodBlock__Alternatives2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseBlock_in_rule__HttpMethodBlock__Alternatives2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitraryPathSegment_in_rule__Path__Alternatives_22500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__ParamsAssignment_2_1_in_rule__Path__Alternatives_22517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArbitraryPathSegment_in_rule__Path__Alternatives_3_12550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__ParamsAssignment_3_1_1_in_rule__Path__Alternatives_3_12567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__0_in_rule__Literal__Alternatives2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__BlockType__Alternatives2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_rule__BlockType__Alternatives2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Member__NameAlternatives_0_02718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Member__NameAlternatives_0_02735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleMember__NameAlternatives_0_02767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleMember__NameAlternatives_0_02784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_rule__Type__Alternatives2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_rule__Type__Alternatives2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_rule__Type__Alternatives2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserType_in_rule__ArrayType__ElementTypeAlternatives_0_02882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_rule__ArrayType__ElementTypeAlternatives_0_02899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeDeclaration_in_rule__UserTypeDeclaration__Alternatives2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rule__IntrinsicType__Alternatives2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rule__IntrinsicType__Alternatives2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_rule__IntrinsicType__Alternatives3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_rule__NumericType__Alternatives3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_rule__NumericType__Alternatives3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_rule__NumericType__Alternatives3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__HttpMethodType__Alternatives3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__HttpMethodType__Alternatives3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__HttpMethodType__Alternatives3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__HttpMethodType__Alternatives3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BooleanValue__Alternatives3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BooleanValue__Alternatives3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Model__Group__0__Impl3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13328 = new BitSet(new long[]{0x0000000A00040000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__1__Impl3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAssignment_2_in_rule__Model__Group__2__Impl3415 = new BitSet(new long[]{0x0000000A00040002L});
    public static final BitSet FOLLOW_rule__Api__Group__0__Impl_in_rule__Api__Group__03452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Api__Group__1_in_rule__Api__Group__03455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Api__Group__0__Impl3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Api__Group__1__Impl_in_rule__Api__Group__13514 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_rule__Api__Group__2_in_rule__Api__Group__13517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Api__NameAssignment_1_in_rule__Api__Group__1__Impl3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Api__Group__2__Impl_in_rule__Api__Group__23574 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_rule__Api__Group__3_in_rule__Api__Group__23577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Api__BaseUrlAssignment_2_in_rule__Api__Group__2__Impl3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Api__Group__3__Impl_in_rule__Api__Group__33635 = new BitSet(new long[]{0x0000000004307800L});
    public static final BitSet FOLLOW_rule__Api__Group__4_in_rule__Api__Group__33638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Api__Group__3__Impl3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Api__Group__4__Impl_in_rule__Api__Group__43697 = new BitSet(new long[]{0x0000000004307800L});
    public static final BitSet FOLLOW_rule__Api__Group__5_in_rule__Api__Group__43700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Api__BlocksAssignment_4_in_rule__Api__Group__4__Impl3727 = new BitSet(new long[]{0x0000000004207802L});
    public static final BitSet FOLLOW_rule__Api__Group__5__Impl_in_rule__Api__Group__53758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Api__Group__5__Impl3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__0__Impl_in_rule__HeaderBlock__Group__03829 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__1_in_rule__HeaderBlock__Group__03832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HeaderBlock__Group__0__Impl3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__1__Impl_in_rule__HeaderBlock__Group__13891 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__2_in_rule__HeaderBlock__Group__13894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__HeadersAssignment_1_in_rule__HeaderBlock__Group__1__Impl3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group__2__Impl_in_rule__HeaderBlock__Group__23951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group_2__0_in_rule__HeaderBlock__Group__2__Impl3978 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group_2__0__Impl_in_rule__HeaderBlock__Group_2__04015 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group_2__1_in_rule__HeaderBlock__Group_2__04018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__HeaderBlock__Group_2__0__Impl4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__Group_2__1__Impl_in_rule__HeaderBlock__Group_2__14077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HeaderBlock__HeadersAssignment_2_1_in_rule__HeaderBlock__Group_2__1__Impl4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__0__Impl_in_rule__Header__Group__04138 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Header__Group__1_in_rule__Header__Group__04141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__NameAssignment_0_in_rule__Header__Group__0__Impl4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__1__Impl_in_rule__Header__Group__14198 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Header__Group__2_in_rule__Header__Group__14201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Header__Group__1__Impl4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__2__Impl_in_rule__Header__Group__24260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__ValueAssignment_2_in_rule__Header__Group__2__Impl4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__0__Impl_in_rule__HttpMethod__Group__04323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__1_in_rule__HttpMethod__Group__04326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__TypeAssignment_0_in_rule__HttpMethod__Group__0__Impl4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__1__Impl_in_rule__HttpMethod__Group__14383 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__2_in_rule__HttpMethod__Group__14386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__NameAssignment_1_in_rule__HttpMethod__Group__1__Impl4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__2__Impl_in_rule__HttpMethod__Group__24443 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__3_in_rule__HttpMethod__Group__24446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__PathAssignment_2_in_rule__HttpMethod__Group__2__Impl4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__3__Impl_in_rule__HttpMethod__Group__34504 = new BitSet(new long[]{0x0000000034300000L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__4_in_rule__HttpMethod__Group__34507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__HttpMethod__Group__3__Impl4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__4__Impl_in_rule__HttpMethod__Group__44566 = new BitSet(new long[]{0x0000000034300000L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__5_in_rule__HttpMethod__Group__44569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__BlocksAssignment_4_in_rule__HttpMethod__Group__4__Impl4596 = new BitSet(new long[]{0x0000000034200002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__5__Impl_in_rule__HttpMethod__Group__54627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__HttpMethod__Group__5__Impl4655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__0__Impl_in_rule__Path__Group__04698 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Path__Group__1_in_rule__Path__Group__04701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__1__Impl_in_rule__Path__Group__14759 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Path__Group__2_in_rule__Path__Group__14762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Path__Group__1__Impl4790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__2__Impl_in_rule__Path__Group__24821 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Path__Group__3_in_rule__Path__Group__24824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Alternatives_2_in_rule__Path__Group__2__Impl4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__3__Impl_in_rule__Path__Group__34881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group_3__0_in_rule__Path__Group__3__Impl4908 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Path__Group_3__0__Impl_in_rule__Path__Group_3__04947 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Path__Group_3__1_in_rule__Path__Group_3__04950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Path__Group_3__0__Impl4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group_3__1__Impl_in_rule__Path__Group_3__15009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Alternatives_3_1_in_rule__Path__Group_3__1__Impl5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group__0__Impl_in_rule__ArbitraryPathSegment__Group__05070 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group__1_in_rule__ArbitraryPathSegment__Group__05073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ArbitraryPathSegment__Group__0__Impl5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group__1__Impl_in_rule__ArbitraryPathSegment__Group__15129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group_1__0_in_rule__ArbitraryPathSegment__Group__1__Impl5156 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group_1__0__Impl_in_rule__ArbitraryPathSegment__Group_1__05191 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group_1__1_in_rule__ArbitraryPathSegment__Group_1__05194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ArbitraryPathSegment__Group_1__0__Impl5222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArbitraryPathSegment__Group_1__1__Impl_in_rule__ArbitraryPathSegment__Group_1__15253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ArbitraryPathSegment__Group_1__1__Impl5280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__0__Impl_in_rule__ParamsBlock__Group__05313 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__1_in_rule__ParamsBlock__Group__05316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__1__Impl_in_rule__ParamsBlock__Group__15374 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__2_in_rule__ParamsBlock__Group__15377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ParamsBlock__Group__1__Impl5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__2__Impl_in_rule__ParamsBlock__Group__25436 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__3_in_rule__ParamsBlock__Group__25439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__ParamsAssignment_2_in_rule__ParamsBlock__Group__2__Impl5466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group__3__Impl_in_rule__ParamsBlock__Group__35496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__0_in_rule__ParamsBlock__Group__3__Impl5523 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__0__Impl_in_rule__ParamsBlock__Group_3__05562 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__1_in_rule__ParamsBlock__Group_3__05565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ParamsBlock__Group_3__0__Impl5593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__Group_3__1__Impl_in_rule__ParamsBlock__Group_3__15624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamsBlock__ParamsAssignment_3_1_in_rule__ParamsBlock__Group_3__1__Impl5651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group__0__Impl_in_rule__SimpleMemberAssignment__Group__05685 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group__1_in_rule__SimpleMemberAssignment__Group__05688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__MemberAssignment_0_in_rule__SimpleMemberAssignment__Group__0__Impl5715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group__1__Impl_in_rule__SimpleMemberAssignment__Group__15745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group_1__0_in_rule__SimpleMemberAssignment__Group__1__Impl5772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group_1__0__Impl_in_rule__SimpleMemberAssignment__Group_1__05807 = new BitSet(new long[]{0x0000000002018060L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group_1__1_in_rule__SimpleMemberAssignment__Group_1__05810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SimpleMemberAssignment__Group_1__0__Impl5838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__Group_1__1__Impl_in_rule__SimpleMemberAssignment__Group_1__15869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMemberAssignment__DefaultValueAssignment_1_1_in_rule__SimpleMemberAssignment__Group_1__1__Impl5896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__05930 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__05933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__15991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__LiteralAssignment_0_1_in_rule__Literal__Group_0__1__Impl6018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__0__Impl_in_rule__Literal__Group_1__06052 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__1_in_rule__Literal__Group_1__06055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__1__Impl_in_rule__Literal__Group_1__16113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__LiteralAssignment_1_1_in_rule__Literal__Group_1__1__Impl6140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__06174 = new BitSet(new long[]{0x0000000002018060L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__06177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__16235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__LiteralAssignment_2_1_in_rule__Literal__Group_2__1__Impl6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__0__Impl_in_rule__BodyBlock__Group__06296 = new BitSet(new long[]{0x000001F000080010L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__1_in_rule__BodyBlock__Group__06299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BodyBlock__Group__0__Impl6327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__Group__1__Impl_in_rule__BodyBlock__Group__16358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyBlock__TypeAssignment_1_in_rule__BodyBlock__Group__1__Impl6385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__0__Impl_in_rule__ResponseBlock__Group__06419 = new BitSet(new long[]{0x0000000034200000L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__1_in_rule__ResponseBlock__Group__06422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__1__Impl_in_rule__ResponseBlock__Group__16480 = new BitSet(new long[]{0x000001F040080010L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__2_in_rule__ResponseBlock__Group__16483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ResponseBlock__Group__1__Impl6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__2__Impl_in_rule__ResponseBlock__Group__26542 = new BitSet(new long[]{0x000001F040080010L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__3_in_rule__ResponseBlock__Group__26545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__0_in_rule__ResponseBlock__Group__2__Impl6572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group__3__Impl_in_rule__ResponseBlock__Group__36603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__TypeAssignment_3_in_rule__ResponseBlock__Group__3__Impl6630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__0__Impl_in_rule__ResponseBlock__Group_2__06669 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__1_in_rule__ResponseBlock__Group_2__06672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ResponseBlock__Group_2__0__Impl6700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__Group_2__1__Impl_in_rule__ResponseBlock__Group_2__16731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResponseBlock__SuperTypeAssignment_2_1_in_rule__ResponseBlock__Group_2__1__Impl6758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Group__0__Impl_in_rule__Member__Group__06792 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Member__Group__1_in_rule__Member__Group__06795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__NameAssignment_0_in_rule__Member__Group__0__Impl6822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Group__1__Impl_in_rule__Member__Group__16852 = new BitSet(new long[]{0x000001F000000010L});
    public static final BitSet FOLLOW_rule__Member__Group__2_in_rule__Member__Group__16855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Member__Group__1__Impl6883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Group__2__Impl_in_rule__Member__Group__26914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__TypeAssignment_2_in_rule__Member__Group__2__Impl6941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__0__Impl_in_rule__SimpleMember__Group__06977 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__1_in_rule__SimpleMember__Group__06980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__NameAssignment_0_in_rule__SimpleMember__Group__0__Impl7007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__1__Impl_in_rule__SimpleMember__Group__17037 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__2_in_rule__SimpleMember__Group__17040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SimpleMember__Group__1__Impl7068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__Group__2__Impl_in_rule__SimpleMember__Group__27099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__TypeAssignment_2_in_rule__SimpleMember__Group__2__Impl7126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__07162 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__07165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__ElementTypeAssignment_0_in_rule__ArrayType__Group__0__Impl7192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__17222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__IdAssignment_1_in_rule__ArrayType__Group__1__Impl7249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__0__Impl_in_rule__ComplexTypeDeclaration__Group__07283 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__1_in_rule__ComplexTypeDeclaration__Group__07286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__KeywordAssignment_0_in_rule__ComplexTypeDeclaration__Group__0__Impl7313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__1__Impl_in_rule__ComplexTypeDeclaration__Group__17343 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__2_in_rule__ComplexTypeDeclaration__Group__17346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__NogenAssignment_1_in_rule__ComplexTypeDeclaration__Group__1__Impl7373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__2__Impl_in_rule__ComplexTypeDeclaration__Group__27404 = new BitSet(new long[]{0x000001F000080010L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__3_in_rule__ComplexTypeDeclaration__Group__27407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__NameAssignment_2_in_rule__ComplexTypeDeclaration__Group__2__Impl7434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__Group__3__Impl_in_rule__ComplexTypeDeclaration__Group__37464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeDeclaration__LiteralAssignment_3_in_rule__ComplexTypeDeclaration__Group__3__Impl7491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__0__Impl_in_rule__EnumTypeDeclaration__Group__07530 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__1_in_rule__EnumTypeDeclaration__Group__07533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__KeywordAssignment_0_in_rule__EnumTypeDeclaration__Group__0__Impl7560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__1__Impl_in_rule__EnumTypeDeclaration__Group__17590 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__2_in_rule__EnumTypeDeclaration__Group__17593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__NogenAssignment_1_in_rule__EnumTypeDeclaration__Group__1__Impl7620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__2__Impl_in_rule__EnumTypeDeclaration__Group__27651 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__3_in_rule__EnumTypeDeclaration__Group__27654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__NameAssignment_2_in_rule__EnumTypeDeclaration__Group__2__Impl7681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__3__Impl_in_rule__EnumTypeDeclaration__Group__37711 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__4_in_rule__EnumTypeDeclaration__Group__37714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__0_in_rule__EnumTypeDeclaration__Group__3__Impl7741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group__4__Impl_in_rule__EnumTypeDeclaration__Group__47772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__LiteralAssignment_4_in_rule__EnumTypeDeclaration__Group__4__Impl7799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__0__Impl_in_rule__EnumTypeDeclaration__Group_3__07840 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__1_in_rule__EnumTypeDeclaration__Group_3__07843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EnumTypeDeclaration__Group_3__0__Impl7871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__Group_3__1__Impl_in_rule__EnumTypeDeclaration__Group_3__17902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeDeclaration__SuperTypeAssignment_3_1_in_rule__EnumTypeDeclaration__Group_3__1__Impl7929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__0__Impl_in_rule__EnumTypeLiteral__Group__07963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__1_in_rule__EnumTypeLiteral__Group__07966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EnumTypeLiteral__Group__0__Impl7994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__1__Impl_in_rule__EnumTypeLiteral__Group__18025 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__2_in_rule__EnumTypeLiteral__Group__18028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__MembersAssignment_1_in_rule__EnumTypeLiteral__Group__1__Impl8055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__2__Impl_in_rule__EnumTypeLiteral__Group__28085 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__3_in_rule__EnumTypeLiteral__Group__28088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__0_in_rule__EnumTypeLiteral__Group__2__Impl8115 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group__3__Impl_in_rule__EnumTypeLiteral__Group__38146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumTypeLiteral__Group__3__Impl8174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__0__Impl_in_rule__EnumTypeLiteral__Group_2__08213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__1_in_rule__EnumTypeLiteral__Group_2__08216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumTypeLiteral__Group_2__0__Impl8244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__Group_2__1__Impl_in_rule__EnumTypeLiteral__Group_2__18275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumTypeLiteral__MembersAssignment_2_1_in_rule__EnumTypeLiteral__Group_2__1__Impl8302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__0__Impl_in_rule__EnumMember__Group__08336 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__08339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__NameAssignment_0_in_rule__EnumMember__Group__0__Impl8366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__1__Impl_in_rule__EnumMember__Group__18396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__0_in_rule__EnumMember__Group__1__Impl8423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__0__Impl_in_rule__EnumMember__Group_1__08458 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__1_in_rule__EnumMember__Group_1__08461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__AssignmentAssignment_1_0_in_rule__EnumMember__Group_1__0__Impl8488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__1__Impl_in_rule__EnumMember__Group_1__18518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__ValueAssignment_1_1_in_rule__EnumMember__Group_1__1__Impl8545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__0__Impl_in_rule__ComplexTypeLiteral__Group__08579 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__1_in_rule__ComplexTypeLiteral__Group__08582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ComplexTypeLiteral__Group__0__Impl8610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__1__Impl_in_rule__ComplexTypeLiteral__Group__18641 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__2_in_rule__ComplexTypeLiteral__Group__18644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_1_in_rule__ComplexTypeLiteral__Group__1__Impl8671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__2__Impl_in_rule__ComplexTypeLiteral__Group__28701 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__3_in_rule__ComplexTypeLiteral__Group__28704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__0_in_rule__ComplexTypeLiteral__Group__2__Impl8731 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group__3__Impl_in_rule__ComplexTypeLiteral__Group__38762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ComplexTypeLiteral__Group__3__Impl8790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__0__Impl_in_rule__ComplexTypeLiteral__Group_2__08829 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__1_in_rule__ComplexTypeLiteral__Group_2__08832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ComplexTypeLiteral__Group_2__0__Impl8860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__Group_2__1__Impl_in_rule__ComplexTypeLiteral__Group_2__18891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexTypeLiteral__MembersAssignment_2_1_in_rule__ComplexTypeLiteral__Group_2__1__Impl8918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08952 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__19011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl9038 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__09073 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__09076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__QualifiedName__Group_1__0__Impl9104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__19135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl9162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedNumber__Group__0__Impl_in_rule__SignedNumber__Group__09195 = new BitSet(new long[]{0x0000000002018060L});
    public static final BitSet FOLLOW_rule__SignedNumber__Group__1_in_rule__SignedNumber__Group__09198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SignedNumber__Group__0__Impl9227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedNumber__Group__1__Impl_in_rule__SignedNumber__Group__19260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__SignedNumber__Group__1__Impl9287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__PackageNameAssignment_19325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Model__DeclarationsAssignment_29356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Api__NameAssignment_19387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Api__BaseUrlAssignment_29418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceBlock_in_rule__Api__BlocksAssignment_49449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_rule__HeaderBlock__HeadersAssignment_19480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_rule__HeaderBlock__HeadersAssignment_2_19511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Header__NameAssignment_09542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Header__ValueAssignment_29573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethodType_in_rule__HttpMethod__TypeAssignment_09604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HttpMethod__NameAssignment_19635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_rule__HttpMethod__PathAssignment_29666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethodBlock_in_rule__HttpMethod__BlocksAssignment_49697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_rule__Path__ParamsAssignment_2_19728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_rule__Path__ParamsAssignment_3_1_19759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_rule__ParamsBlock__ParamsAssignment_29790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMemberAssignment_in_rule__ParamsBlock__ParamsAssignment_3_19821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleMember_in_rule__SimpleMemberAssignment__MemberAssignment_09852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__SimpleMemberAssignment__DefaultValueAssignment_1_19883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__Literal__LiteralAssignment_0_19914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Literal__LiteralAssignment_1_19945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_rule__Literal__LiteralAssignment_2_19976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_rule__BodyBlock__TypeAssignment_110007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResponseBlock__SuperTypeAssignment_2_110042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockType_in_rule__ResponseBlock__TypeAssignment_310077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__NameAlternatives_0_0_in_rule__Member__NameAssignment_010108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Member__TypeAssignment_210141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleMember__NameAlternatives_0_0_in_rule__SimpleMember__NameAssignment_010172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntrinsicType_in_rule__SimpleMember__TypeAssignment_210205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__ElementTypeAlternatives_0_0_in_rule__ArrayType__ElementTypeAssignment_010236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ArrayType__IdAssignment_110274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserType__DeclarationAssignment10317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ComplexTypeDeclaration__KeywordAssignment_010357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ComplexTypeDeclaration__NogenAssignment_110401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ComplexTypeDeclaration__NameAssignment_210440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexTypeLiteral_in_rule__ComplexTypeDeclaration__LiteralAssignment_310471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EnumTypeDeclaration__KeywordAssignment_010507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EnumTypeDeclaration__NogenAssignment_110551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumTypeDeclaration__NameAssignment_210590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_rule__EnumTypeDeclaration__SuperTypeAssignment_3_110621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumTypeLiteral_in_rule__EnumTypeDeclaration__LiteralAssignment_410652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_110683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumTypeLiteral__MembersAssignment_2_110714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumMember__NameAssignment_010745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EnumMember__AssignmentAssignment_1_010781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__EnumMember__ValueAssignment_1_110820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_110851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__ComplexTypeLiteral__MembersAssignment_2_110882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__StringType__IdAssignment10918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__BooleanType__IdAssignment10962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__IntegerType__IdAssignment11006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__LongType__IdAssignment11050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DoubleType__IdAssignment11094 = new BitSet(new long[]{0x0000000000000002L});

}