package org.specapi.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecApiLangLexer extends Lexer {
    public static final int T__40=40;
    public static final int RULE_ID=4;
    public static final int T__41=41;
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
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__12=12;
    public static final int T__37=37;
    public static final int RULE_NUMBER=6;
    public static final int T__11=11;
    public static final int T__38=38;
    public static final int T__14=14;
    public static final int T__39=39;
    public static final int T__13=13;
    public static final int RULE_WS=9;

    // delegates
    // delegators

    public InternalSpecApiLangLexer() {;} 
    public InternalSpecApiLangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSpecApiLangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:11:7: ( 'get' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:11:9: 'get'
            {
            match("get"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:12:7: ( 'put' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:12:9: 'put'
            {
            match("put"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:13:7: ( 'post' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:13:9: 'post'
            {
            match("post"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:14:7: ( 'delete' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:14:9: 'delete'
            {
            match("delete"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:15:7: ( 'patch' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:15:9: 'patch'
            {
            match("patch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:16:7: ( 'true' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:16:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:17:7: ( 'false' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:17:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:18:7: ( 'package' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:18:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:19:7: ( 'api' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:19:9: 'api'
            {
            match("api"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:20:7: ( '{' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:20:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:21:7: ( '}' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:21:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:22:7: ( 'headers' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:22:9: 'headers'
            {
            match("headers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:23:7: ( ',' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:23:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:24:7: ( ':' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:24:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:25:7: ( '/' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:25:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:26:7: ( '-' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:26:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:27:7: ( 'params' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:27:9: 'params'
            {
            match("params"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:28:7: ( '=' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:28:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:29:7: ( 'body' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:29:9: 'body'
            {
            match("body"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:30:7: ( 'response' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:30:9: 'response'
            {
            match("response"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:31:7: ( 'extends' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:31:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:32:7: ( '.' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:32:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:33:7: ( '[]' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:33:9: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:34:7: ( 'entity' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:34:9: 'entity'
            {
            match("entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:35:7: ( 'nogen' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:35:9: 'nogen'
            {
            match("nogen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:36:7: ( 'enum' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:36:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:37:7: ( 'string' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:37:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:38:7: ( 'boolean' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:38:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:39:7: ( 'int' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:39:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:40:7: ( 'long' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:40:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:41:7: ( 'double' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:41:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5496:13: ( ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5496:15: ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )?
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5496:15: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5496:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5496:27: ( '.' ( '0' .. '9' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5496:28: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5496:32: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5496:33: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5498:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5498:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5498:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5498:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5498:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5500:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5500:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5500:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5500:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5500:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5500:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5500:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5500:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5500:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5500:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5500:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5502:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5502:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5502:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5502:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5504:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5504:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5504:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5504:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5504:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5504:41: ( '\\r' )? '\\n'
                    {
                    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5504:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5504:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5506:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5506:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5506:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5508:16: ( . )
            // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:5508:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_NUMBER | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=38;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:196: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 33 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:208: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 34 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:216: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:228: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 36 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:244: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 37 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:260: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 38 :
                // ../org.specapi.ui/src-gen/org/specapi/ui/contentassist/antlr/internal/InternalSpecApiLang.g:1:268: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\31\6\41\2\uffff\1\41\2\uffff\1\61\2\uffff\3\41\1\70\1\37\4\41"+
        "\2\uffff\1\37\1\uffff\2\37\2\uffff\1\41\1\uffff\10\41\2\uffff\1"+
        "\41\7\uffff\4\41\2\uffff\4\41\2\uffff\1\126\1\127\10\41\1\140\11"+
        "\41\1\152\1\41\2\uffff\1\154\5\41\1\162\1\41\1\uffff\1\41\1\165"+
        "\4\41\1\172\2\41\1\uffff\1\175\1\uffff\1\176\4\41\1\uffff\1\u0083"+
        "\1\41\1\uffff\4\41\1\uffff\1\u0089\1\41\2\uffff\1\41\1\u008c\1\u008d"+
        "\1\u008e\1\uffff\4\41\1\u0093\1\uffff\1\u0094\1\u0095\3\uffff\1"+
        "\u0096\1\u0097\1\41\1\u0099\5\uffff\1\u009a\2\uffff";
    static final String DFA14_eofS =
        "\u009b\uffff";
    static final String DFA14_minS =
        "\1\0\1\145\1\141\1\145\1\162\1\141\1\160\2\uffff\1\145\2\uffff\1"+
        "\52\2\uffff\1\157\1\145\1\156\1\60\1\135\1\157\1\164\1\156\1\157"+
        "\2\uffff\1\101\1\uffff\2\0\2\uffff\1\164\1\uffff\1\164\1\163\1\143"+
        "\1\154\2\165\1\154\1\151\2\uffff\1\141\7\uffff\1\144\1\163\2\164"+
        "\2\uffff\1\147\1\162\1\164\1\156\2\uffff\2\60\1\164\1\143\1\153"+
        "\1\141\1\145\1\142\1\145\1\163\1\60\1\144\1\171\1\154\1\160\1\145"+
        "\1\151\1\155\1\145\1\151\1\60\1\147\2\uffff\1\60\1\150\1\141\1\155"+
        "\1\164\1\154\1\60\1\145\1\uffff\1\145\1\60\1\145\1\157\1\156\1\164"+
        "\1\60\2\156\1\uffff\1\60\1\uffff\1\60\1\147\1\163\2\145\1\uffff"+
        "\1\60\1\162\1\uffff\1\141\1\156\1\144\1\171\1\uffff\1\60\1\147\2"+
        "\uffff\1\145\3\60\1\uffff\1\163\1\156\2\163\1\60\1\uffff\2\60\3"+
        "\uffff\2\60\1\145\1\60\5\uffff\1\60\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\145\1\165\1\157\1\162\1\141\1\160\2\uffff\1\145\2\uffff"+
        "\1\57\2\uffff\1\157\1\145\1\170\1\71\1\135\1\157\1\164\1\156\1\157"+
        "\2\uffff\1\172\1\uffff\2\uffff\2\uffff\1\164\1\uffff\1\164\1\163"+
        "\1\164\1\154\2\165\1\154\1\151\2\uffff\1\141\7\uffff\1\157\1\163"+
        "\1\164\1\165\2\uffff\1\147\1\162\1\164\1\156\2\uffff\2\172\1\164"+
        "\1\143\1\153\1\141\1\145\1\142\1\145\1\163\1\172\1\144\1\171\1\154"+
        "\1\160\1\145\1\151\1\155\1\145\1\151\1\172\1\147\2\uffff\1\172\1"+
        "\150\1\141\1\155\1\164\1\154\1\172\1\145\1\uffff\1\145\1\172\1\145"+
        "\1\157\1\156\1\164\1\172\2\156\1\uffff\1\172\1\uffff\1\172\1\147"+
        "\1\163\2\145\1\uffff\1\172\1\162\1\uffff\1\141\1\156\1\144\1\171"+
        "\1\uffff\1\172\1\147\2\uffff\1\145\3\172\1\uffff\1\163\1\156\2\163"+
        "\1\172\1\uffff\2\172\3\uffff\2\172\1\145\1\172\5\uffff\1\172\2\uffff";
    static final String DFA14_acceptS =
        "\7\uffff\1\12\1\13\1\uffff\1\15\1\16\1\uffff\1\20\1\22\11\uffff"+
        "\2\40\1\uffff\1\41\2\uffff\1\45\1\46\1\uffff\1\41\10\uffff\1\12"+
        "\1\13\1\uffff\1\15\1\16\1\43\1\44\1\17\1\20\1\22\4\uffff\1\26\1"+
        "\27\4\uffff\1\42\1\45\26\uffff\1\1\1\2\10\uffff\1\11\11\uffff\1"+
        "\35\1\uffff\1\3\5\uffff\1\6\2\uffff\1\23\4\uffff\1\32\2\uffff\1"+
        "\36\1\5\4\uffff\1\7\5\uffff\1\31\2\uffff\1\21\1\4\1\37\4\uffff\1"+
        "\30\1\33\1\10\1\14\1\34\1\uffff\1\25\1\24";
    static final String DFA14_specialS =
        "\1\0\33\uffff\1\1\1\2\175\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\34\4\37\1\35\4\37\1"+
            "\12\1\15\1\22\1\14\12\30\1\13\2\37\1\16\3\37\32\33\1\23\2\37"+
            "\1\32\1\33\1\37\1\6\1\17\1\33\1\3\1\21\1\5\1\1\1\11\1\26\2\33"+
            "\1\27\1\33\1\24\1\33\1\2\1\33\1\20\1\25\1\4\6\33\1\7\1\37\1"+
            "\10\uff82\37",
            "\1\40",
            "\1\44\15\uffff\1\43\5\uffff\1\42",
            "\1\45\11\uffff\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "",
            "",
            "\1\54",
            "",
            "",
            "\1\57\4\uffff\1\60",
            "",
            "",
            "\1\64",
            "\1\65",
            "\1\67\11\uffff\1\66",
            "\12\31",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\0\76",
            "\0\76",
            "",
            "",
            "\1\100",
            "",
            "\1\101",
            "\1\102",
            "\1\104\16\uffff\1\105\1\uffff\1\103",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "",
            "\1\113",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\114\12\uffff\1\115",
            "\1\116",
            "\1\117",
            "\1\120\1\121",
            "",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\153",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\163",
            "",
            "\1\164",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\173",
            "\1\174",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0084",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u008a",
            "",
            "",
            "\1\u008b",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0098",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_NUMBER | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='g') ) {s = 1;}

                        else if ( (LA14_0=='p') ) {s = 2;}

                        else if ( (LA14_0=='d') ) {s = 3;}

                        else if ( (LA14_0=='t') ) {s = 4;}

                        else if ( (LA14_0=='f') ) {s = 5;}

                        else if ( (LA14_0=='a') ) {s = 6;}

                        else if ( (LA14_0=='{') ) {s = 7;}

                        else if ( (LA14_0=='}') ) {s = 8;}

                        else if ( (LA14_0=='h') ) {s = 9;}

                        else if ( (LA14_0==',') ) {s = 10;}

                        else if ( (LA14_0==':') ) {s = 11;}

                        else if ( (LA14_0=='/') ) {s = 12;}

                        else if ( (LA14_0=='-') ) {s = 13;}

                        else if ( (LA14_0=='=') ) {s = 14;}

                        else if ( (LA14_0=='b') ) {s = 15;}

                        else if ( (LA14_0=='r') ) {s = 16;}

                        else if ( (LA14_0=='e') ) {s = 17;}

                        else if ( (LA14_0=='.') ) {s = 18;}

                        else if ( (LA14_0=='[') ) {s = 19;}

                        else if ( (LA14_0=='n') ) {s = 20;}

                        else if ( (LA14_0=='s') ) {s = 21;}

                        else if ( (LA14_0=='i') ) {s = 22;}

                        else if ( (LA14_0=='l') ) {s = 23;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 24;}

                        else if ( (LA14_0=='^') ) {s = 26;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='c'||(LA14_0>='j' && LA14_0<='k')||LA14_0=='m'||LA14_0=='o'||LA14_0=='q'||(LA14_0>='u' && LA14_0<='z')) ) {s = 27;}

                        else if ( (LA14_0=='\"') ) {s = 28;}

                        else if ( (LA14_0=='\'') ) {s = 29;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 30;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='+')||(LA14_0>=';' && LA14_0<='<')||(LA14_0>='>' && LA14_0<='@')||(LA14_0>='\\' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 31;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_28 = input.LA(1);

                        s = -1;
                        if ( ((LA14_28>='\u0000' && LA14_28<='\uFFFF')) ) {s = 62;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_29 = input.LA(1);

                        s = -1;
                        if ( ((LA14_29>='\u0000' && LA14_29<='\uFFFF')) ) {s = 62;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}