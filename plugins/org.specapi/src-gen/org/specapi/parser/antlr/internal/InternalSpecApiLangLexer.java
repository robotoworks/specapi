package org.specapi.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecApiLangLexer extends Lexer {
    public static final int T__42=42;
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
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_URL=5;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_NUMBER=8;
    public static final int T__38=38;
    public static final int T__14=14;
    public static final int T__39=39;
    public static final int T__13=13;
    public static final int RULE_WS=11;
    public static final int RULE_INTEGER=7;

    // delegates
    // delegators

    public InternalSpecApiLangLexer() {;} 
    public InternalSpecApiLangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSpecApiLangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:11:7: ( 'package' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:11:9: 'package'
            {
            match("package"); 


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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:12:7: ( 'api' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:12:9: 'api'
            {
            match("api"); 


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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:13:7: ( '{' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:13:9: '{'
            {
            match('{'); 

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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:14:7: ( '}' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:14:9: '}'
            {
            match('}'); 

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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:15:7: ( 'headers' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:15:9: 'headers'
            {
            match("headers"); 


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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:16:7: ( ',' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:16:9: ','
            {
            match(','); 

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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:17:7: ( '/' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:17:9: '/'
            {
            match('/'); 

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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:18:7: ( '-' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:18:9: '-'
            {
            match('-'); 

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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:19:7: ( 'params' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:19:9: 'params'
            {
            match("params"); 


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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:20:7: ( 'request' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:20:9: 'request'
            {
            match("request"); 


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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:21:7: ( 'response' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:21:9: 'response'
            {
            match("response"); 


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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:22:7: ( ':' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:22:9: ':'
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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:23:7: ( '=' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:23:9: '='
            {
            match('='); 

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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:24:7: ( '[]' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:24:9: '[]'
            {
            match("[]"); 


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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:25:7: ( 'entity' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:25:9: 'entity'
            {
            match("entity"); 


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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:26:7: ( 'enum' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:26:9: 'enum'
            {
            match("enum"); 


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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:27:7: ( 'extends' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:27:9: 'extends'
            {
            match("extends"); 


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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:28:7: ( 'string' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:28:9: 'string'
            {
            match("string"); 


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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:29:7: ( 'boolean' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:29:9: 'boolean'
            {
            match("boolean"); 


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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:30:7: ( 'int' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:30:9: 'int'
            {
            match("int"); 


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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:31:7: ( 'long' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:31:9: 'long'
            {
            match("long"); 


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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:32:7: ( 'double' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:32:9: 'double'
            {
            match("double"); 


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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:33:7: ( '.' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:33:9: '.'
            {
            match('.'); 

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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:34:7: ( 'get' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:34:9: 'get'
            {
            match("get"); 


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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:35:7: ( 'put' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:35:9: 'put'
            {
            match("put"); 


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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:36:7: ( 'post' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:36:9: 'post'
            {
            match("post"); 


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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:37:7: ( 'delete' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:37:9: 'delete'
            {
            match("delete"); 


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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:38:7: ( 'patch' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:38:9: 'patch'
            {
            match("patch"); 


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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:39:7: ( 'true' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:39:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:40:7: ( 'false' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:40:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2093:13: ( RULE_INTEGER '.' RULE_INTEGER )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2093:15: RULE_INTEGER '.' RULE_INTEGER
            {
            mRULE_INTEGER(); 
            match('.'); 
            mRULE_INTEGER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_INTEGER"
    public final void mRULE_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2095:14: ( ( '0' .. '9' )* )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2095:16: ( '0' .. '9' )*
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2095:16: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2095:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2097:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2097:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2097:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2097:11: '^'
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

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2097:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:
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
            	    break loop3;
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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2099:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2099:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2099:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2099:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2099:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2099:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2099:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2099:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2099:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2099:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2099:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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

    // $ANTLR start "RULE_URL"
    public final void mRULE_URL() throws RecognitionException {
        try {
            int _type = RULE_URL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2101:10: ( ( 'http' | 'https' ) ':' '//' (~ ( ( ' ' | '{' ) ) )* )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2101:12: ( 'http' | 'https' ) ':' '//' (~ ( ( ' ' | '{' ) ) )*
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2101:12: ( 'http' | 'https' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='h') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='t') ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2=='t') ) {
                        int LA7_3 = input.LA(4);

                        if ( (LA7_3=='p') ) {
                            int LA7_4 = input.LA(5);

                            if ( (LA7_4=='s') ) {
                                alt7=2;
                            }
                            else if ( (LA7_4==':') ) {
                                alt7=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 7, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2101:13: 'http'
                    {
                    match("http"); 


                    }
                    break;
                case 2 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2101:20: 'https'
                    {
                    match("https"); 


                    }
                    break;

            }

            match(':'); 
            match("//"); 

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2101:38: (~ ( ( ' ' | '{' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\u001F')||(LA8_0>='!' && LA8_0<='z')||(LA8_0>='|' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2101:38: ~ ( ( ' ' | '{' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='z')||(input.LA(1)>='|' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_URL"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2103:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2103:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2103:24: ( options {greedy=false; } : . )*
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
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2103:52: .
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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2105:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2105:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2105:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2105:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2105:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2105:41: ( '\\r' )? '\\n'
                    {
                    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2105:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2105:41: '\\r'
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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2107:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2107:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2107:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:
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
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2109:16: ( . )
            // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:2109:18: .
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
        // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_NUMBER | RULE_INTEGER | RULE_ID | RULE_STRING | RULE_URL | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=39;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:190: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 32 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:202: RULE_INTEGER
                {
                mRULE_INTEGER(); 

                }
                break;
            case 33 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:215: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 34 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:223: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:235: RULE_URL
                {
                mRULE_URL(); 

                }
                break;
            case 36 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:244: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:260: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 38 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:276: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // ../org.specapi/src-gen/org/specapi/parser/antlr/internal/InternalSpecApiLang.g:1:284: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\30\2\42\2\uffff\1\42\1\uffff\1\53\1\uffff\1\42\2\uffff\1\36\6"+
        "\42\1\72\3\42\1\30\1\uffff\1\36\1\uffff\2\36\2\uffff\3\42\1\uffff"+
        "\1\42\2\uffff\2\42\5\uffff\1\42\3\uffff\10\42\2\uffff\3\42\1\30"+
        "\2\uffff\3\42\1\132\1\42\1\134\11\42\1\146\3\42\1\152\5\42\1\uffff"+
        "\1\160\1\uffff\5\42\1\167\3\42\1\uffff\1\173\2\42\1\uffff\1\176"+
        "\3\42\1\u0082\1\uffff\2\42\1\uffff\3\42\1\uffff\3\42\1\uffff\2\42"+
        "\1\uffff\1\u008c\1\42\1\u008e\1\uffff\3\42\1\u0092\1\42\1\u0094"+
        "\1\42\1\u0096\1\u0097\1\uffff\1\u0098\1\uffff\1\u0099\1\u009a\1"+
        "\42\1\uffff\1\u009c\1\uffff\1\u009d\5\uffff\1\u009e\3\uffff";
    static final String DFA14_eofS =
        "\u009f\uffff";
    static final String DFA14_minS =
        "\1\0\1\141\1\160\2\uffff\1\145\1\uffff\1\52\1\uffff\1\145\2\uffff"+
        "\1\135\1\156\1\164\1\157\1\156\1\157\1\145\1\60\1\145\1\162\1\141"+
        "\1\56\1\uffff\1\101\1\uffff\2\0\2\uffff\1\143\1\164\1\163\1\uffff"+
        "\1\151\2\uffff\1\141\1\164\5\uffff\1\161\3\uffff\2\164\1\162\1\157"+
        "\1\164\1\156\1\165\1\154\2\uffff\1\164\1\165\1\154\1\56\2\uffff"+
        "\1\153\1\141\1\143\1\60\1\164\1\60\1\144\1\160\1\165\1\160\1\151"+
        "\1\155\1\145\1\151\1\154\1\60\1\147\1\142\1\145\1\60\1\145\1\163"+
        "\1\141\1\155\1\150\1\uffff\1\60\1\uffff\1\145\1\72\1\145\1\157\1"+
        "\164\1\60\2\156\1\145\1\uffff\1\60\1\154\1\164\1\uffff\1\60\1\145"+
        "\1\147\1\163\1\60\1\uffff\1\162\1\72\1\uffff\1\163\1\156\1\171\1"+
        "\uffff\1\144\1\147\1\141\1\uffff\2\145\1\uffff\1\60\1\145\1\60\1"+
        "\uffff\1\163\1\164\1\163\1\60\1\163\1\60\1\156\2\60\1\uffff\1\60"+
        "\1\uffff\2\60\1\145\1\uffff\1\60\1\uffff\1\60\5\uffff\1\60\3\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\165\1\160\2\uffff\1\164\1\uffff\1\57\1\uffff\1\145\2"+
        "\uffff\1\135\1\170\1\164\1\157\1\156\2\157\1\71\1\145\1\162\1\141"+
        "\1\71\1\uffff\1\172\1\uffff\2\uffff\2\uffff\2\164\1\163\1\uffff"+
        "\1\151\2\uffff\1\141\1\164\5\uffff\1\163\3\uffff\1\165\1\164\1\162"+
        "\1\157\1\164\1\156\1\165\1\154\2\uffff\1\164\1\165\1\154\1\71\2"+
        "\uffff\1\153\1\141\1\143\1\172\1\164\1\172\1\144\1\160\1\165\1\160"+
        "\1\151\1\155\1\145\1\151\1\154\1\172\1\147\1\142\1\145\1\172\1\145"+
        "\1\163\1\141\1\155\1\150\1\uffff\1\172\1\uffff\1\145\1\163\1\145"+
        "\1\157\1\164\1\172\2\156\1\145\1\uffff\1\172\1\154\1\164\1\uffff"+
        "\1\172\1\145\1\147\1\163\1\172\1\uffff\1\162\1\72\1\uffff\1\163"+
        "\1\156\1\171\1\uffff\1\144\1\147\1\141\1\uffff\2\145\1\uffff\1\172"+
        "\1\145\1\172\1\uffff\1\163\1\164\1\163\1\172\1\163\1\172\1\156\2"+
        "\172\1\uffff\1\172\1\uffff\2\172\1\145\1\uffff\1\172\1\uffff\1\172"+
        "\5\uffff\1\172\3\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\3\1\4\1\uffff\1\6\1\uffff\1\10\1\uffff\1\14\1\15\14\uffff"+
        "\1\40\1\uffff\1\41\2\uffff\1\46\1\47\3\uffff\1\41\1\uffff\1\3\1"+
        "\4\2\uffff\1\6\1\44\1\45\1\7\1\10\1\uffff\1\14\1\15\1\16\10\uffff"+
        "\1\37\1\27\4\uffff\1\42\1\46\31\uffff\1\31\1\uffff\1\2\11\uffff"+
        "\1\24\3\uffff\1\30\5\uffff\1\32\2\uffff\1\43\3\uffff\1\20\3\uffff"+
        "\1\25\2\uffff\1\35\3\uffff\1\34\11\uffff\1\36\1\uffff\1\11\3\uffff"+
        "\1\17\1\uffff\1\22\1\uffff\1\26\1\33\1\1\1\5\1\12\1\uffff\1\21\1"+
        "\23\1\13";
    static final String DFA14_specialS =
        "\1\1\32\uffff\1\0\1\2\u0082\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\36\2\35\2\36\1\35\22\36\1\35\1\36\1\33\4\36\1\34\4\36\1"+
            "\6\1\10\1\23\1\7\12\27\1\12\2\36\1\13\3\36\32\32\1\14\2\36\1"+
            "\31\1\32\1\36\1\2\1\17\1\32\1\22\1\15\1\26\1\24\1\5\1\20\2\32"+
            "\1\21\3\32\1\1\1\32\1\11\1\16\1\25\6\32\1\3\1\36\1\4\uff82\36",
            "\1\37\15\uffff\1\41\5\uffff\1\40",
            "\1\43",
            "",
            "",
            "\1\46\16\uffff\1\47",
            "",
            "\1\51\4\uffff\1\52",
            "",
            "\1\55",
            "",
            "",
            "\1\60",
            "\1\61\11\uffff\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\70\11\uffff\1\67",
            "\12\71",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\71\1\uffff\12\76",
            "",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\0\77",
            "\0\77",
            "",
            "",
            "\1\101\16\uffff\1\102\1\uffff\1\103",
            "\1\104",
            "\1\105",
            "",
            "\1\106",
            "",
            "",
            "\1\107",
            "\1\110",
            "",
            "",
            "",
            "",
            "",
            "\1\111\1\uffff\1\112",
            "",
            "",
            "",
            "\1\113\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\71\1\uffff\12\76",
            "",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\133",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\161",
            "\1\163\70\uffff\1\162",
            "\1\164",
            "\1\165",
            "\1\166",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\174",
            "\1\175",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u0083",
            "\1\163",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u008d",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0093",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0095",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u009b",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
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
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_NUMBER | RULE_INTEGER | RULE_ID | RULE_STRING | RULE_URL | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_27 = input.LA(1);

                        s = -1;
                        if ( ((LA14_27>='\u0000' && LA14_27<='\uFFFF')) ) {s = 63;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='p') ) {s = 1;}

                        else if ( (LA14_0=='a') ) {s = 2;}

                        else if ( (LA14_0=='{') ) {s = 3;}

                        else if ( (LA14_0=='}') ) {s = 4;}

                        else if ( (LA14_0=='h') ) {s = 5;}

                        else if ( (LA14_0==',') ) {s = 6;}

                        else if ( (LA14_0=='/') ) {s = 7;}

                        else if ( (LA14_0=='-') ) {s = 8;}

                        else if ( (LA14_0=='r') ) {s = 9;}

                        else if ( (LA14_0==':') ) {s = 10;}

                        else if ( (LA14_0=='=') ) {s = 11;}

                        else if ( (LA14_0=='[') ) {s = 12;}

                        else if ( (LA14_0=='e') ) {s = 13;}

                        else if ( (LA14_0=='s') ) {s = 14;}

                        else if ( (LA14_0=='b') ) {s = 15;}

                        else if ( (LA14_0=='i') ) {s = 16;}

                        else if ( (LA14_0=='l') ) {s = 17;}

                        else if ( (LA14_0=='d') ) {s = 18;}

                        else if ( (LA14_0=='.') ) {s = 19;}

                        else if ( (LA14_0=='g') ) {s = 20;}

                        else if ( (LA14_0=='t') ) {s = 21;}

                        else if ( (LA14_0=='f') ) {s = 22;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 23;}

                        else if ( (LA14_0=='^') ) {s = 25;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='c'||(LA14_0>='j' && LA14_0<='k')||(LA14_0>='m' && LA14_0<='o')||LA14_0=='q'||(LA14_0>='u' && LA14_0<='z')) ) {s = 26;}

                        else if ( (LA14_0=='\"') ) {s = 27;}

                        else if ( (LA14_0=='\'') ) {s = 28;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 29;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='+')||(LA14_0>=';' && LA14_0<='<')||(LA14_0>='>' && LA14_0<='@')||(LA14_0>='\\' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 30;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_28 = input.LA(1);

                        s = -1;
                        if ( ((LA14_28>='\u0000' && LA14_28<='\uFFFF')) ) {s = 63;}

                        else s = 30;

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