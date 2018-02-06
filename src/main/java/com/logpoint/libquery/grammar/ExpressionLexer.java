// $ANTLR 3.5.2 Expression.g 2018-02-07 00:00:11

	package com.logpoint.libquery.grammar;
    import java.util.LinkedList;
                


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExpressionLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int CALL=4;
	public static final int CALLSIGNEDUNARY=5;
	public static final int DIGIT=6;
	public static final int EQUALS=7;
	public static final int EXPONENT=8;
	public static final int FUNC=9;
	public static final int ID=10;
	public static final int NUMERIC=11;
	public static final int SIGNEDUNARY=12;
	public static final int WS=13;

	        private List<String> errors = new LinkedList<String>();
	        public void displayRecognitionError(String[] tokenNames,
	                                        RecognitionException e) {
	            String hdr = getErrorHeader(e);
	            String msg = getErrorMessage(e, tokenNames);
	            errors.add(hdr + " " + msg);
	        }
	        public List<String> getErrors() {
	            return errors;
	        }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ExpressionLexer() {} 
	public ExpressionLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExpressionLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Expression.g"; }

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:20:7: ( '!=' )
			// Expression.g:20:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:21:7: ( '%' )
			// Expression.g:21:9: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:22:7: ( '&&' )
			// Expression.g:22:9: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:23:7: ( '(' )
			// Expression.g:23:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:24:7: ( ')' )
			// Expression.g:24:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:25:7: ( '*' )
			// Expression.g:25:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:26:7: ( '+' )
			// Expression.g:26:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:27:7: ( '-' )
			// Expression.g:27:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:28:7: ( '/' )
			// Expression.g:28:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:29:7: ( '<' )
			// Expression.g:29:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:30:7: ( '<=' )
			// Expression.g:30:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:31:7: ( '=' )
			// Expression.g:31:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:32:7: ( '==' )
			// Expression.g:32:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:33:7: ( '>' )
			// Expression.g:33:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:34:7: ( '>=' )
			// Expression.g:34:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:35:7: ( '^' )
			// Expression.g:35:9: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:36:7: ( '||' )
			// Expression.g:36:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:210:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '?' | '\"' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '?' | '\"' | DIGIT )* )
			// Expression.g:210:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '?' | '\"' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '?' | '\"' | DIGIT )*
			{
			if ( input.LA(1)=='\"'||input.LA(1)=='.'||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Expression.g:210:52: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '?' | '\"' | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\"'||LA1_0=='.'||(LA1_0 >= '0' && LA1_0 <= '9')||LA1_0=='?'||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Expression.g:
					{
					if ( input.LA(1)=='\"'||input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "NUMERIC"
	public final void mNUMERIC() throws RecognitionException {
		try {
			int _type = NUMERIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:214:3: ( ( DIGIT )+ '.' ( DIGIT )+ ( EXPONENT )? | ( '.' )? ( DIGIT )+ ( EXPONENT )? )
			int alt8=2;
			alt8 = dfa8.predict(input);
			switch (alt8) {
				case 1 :
					// Expression.g:214:6: ( DIGIT )+ '.' ( DIGIT )+ ( EXPONENT )?
					{
					// Expression.g:214:6: ( DIGIT )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// Expression.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					match('.'); 
					// Expression.g:214:17: ( DIGIT )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// Expression.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					// Expression.g:214:24: ( EXPONENT )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0=='E'||LA4_0=='e') ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// Expression.g:214:24: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// Expression.g:215:6: ( '.' )? ( DIGIT )+ ( EXPONENT )?
					{
					// Expression.g:215:6: ( '.' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='.') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// Expression.g:215:6: '.'
							{
							match('.'); 
							}
							break;

					}

					// Expression.g:215:11: ( DIGIT )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// Expression.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// Expression.g:215:18: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// Expression.g:215:18: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMERIC"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// Expression.g:221:3: ( ( 'e' | 'E' ) ( '+' | '-' )? ( DIGIT )+ )
			// Expression.g:221:6: ( 'e' | 'E' ) ( '+' | '-' )? ( DIGIT )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Expression.g:221:18: ( '+' | '-' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='+'||LA9_0=='-') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// Expression.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// Expression.g:221:31: ( DIGIT )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Expression.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// Expression.g:226:3: ( '0' .. '9' )
			// Expression.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expression.g:228:5: ( ( ' ' | '\\t' )+ )
			// Expression.g:228:9: ( ' ' | '\\t' )+
			{
			// Expression.g:228:9: ( ' ' | '\\t' )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0=='\t'||LA11_0==' ') ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// Expression.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// Expression.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | ID | NUMERIC | WS )
		int alt12=20;
		alt12 = dfa12.predict(input);
		switch (alt12) {
			case 1 :
				// Expression.g:1:10: T__14
				{
				mT__14(); 

				}
				break;
			case 2 :
				// Expression.g:1:16: T__15
				{
				mT__15(); 

				}
				break;
			case 3 :
				// Expression.g:1:22: T__16
				{
				mT__16(); 

				}
				break;
			case 4 :
				// Expression.g:1:28: T__17
				{
				mT__17(); 

				}
				break;
			case 5 :
				// Expression.g:1:34: T__18
				{
				mT__18(); 

				}
				break;
			case 6 :
				// Expression.g:1:40: T__19
				{
				mT__19(); 

				}
				break;
			case 7 :
				// Expression.g:1:46: T__20
				{
				mT__20(); 

				}
				break;
			case 8 :
				// Expression.g:1:52: T__21
				{
				mT__21(); 

				}
				break;
			case 9 :
				// Expression.g:1:58: T__22
				{
				mT__22(); 

				}
				break;
			case 10 :
				// Expression.g:1:64: T__23
				{
				mT__23(); 

				}
				break;
			case 11 :
				// Expression.g:1:70: T__24
				{
				mT__24(); 

				}
				break;
			case 12 :
				// Expression.g:1:76: T__25
				{
				mT__25(); 

				}
				break;
			case 13 :
				// Expression.g:1:82: T__26
				{
				mT__26(); 

				}
				break;
			case 14 :
				// Expression.g:1:88: T__27
				{
				mT__27(); 

				}
				break;
			case 15 :
				// Expression.g:1:94: T__28
				{
				mT__28(); 

				}
				break;
			case 16 :
				// Expression.g:1:100: T__29
				{
				mT__29(); 

				}
				break;
			case 17 :
				// Expression.g:1:106: T__30
				{
				mT__30(); 

				}
				break;
			case 18 :
				// Expression.g:1:112: ID
				{
				mID(); 

				}
				break;
			case 19 :
				// Expression.g:1:115: NUMERIC
				{
				mNUMERIC(); 

				}
				break;
			case 20 :
				// Expression.g:1:123: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA8_eotS =
		"\1\uffff\1\2\2\uffff";
	static final String DFA8_eofS =
		"\4\uffff";
	static final String DFA8_minS =
		"\2\56\2\uffff";
	static final String DFA8_maxS =
		"\2\71\2\uffff";
	static final String DFA8_acceptS =
		"\2\uffff\1\2\1\1";
	static final String DFA8_specialS =
		"\4\uffff}>";
	static final String[] DFA8_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "213:1: NUMERIC : ( ( DIGIT )+ '.' ( DIGIT )+ ( EXPONENT )? | ( '.' )? ( DIGIT )+ ( EXPONENT )? );";
		}
	}

	static final String DFA12_eotS =
		"\12\uffff\1\24\1\26\1\30\2\uffff\1\21\11\uffff\3\21";
	static final String DFA12_eofS =
		"\34\uffff";
	static final String DFA12_minS =
		"\1\11\11\uffff\3\75\2\uffff\1\60\11\uffff\1\60\1\53\1\60";
	static final String DFA12_maxS =
		"\1\174\11\uffff\3\75\2\uffff\1\71\11\uffff\1\145\2\71";
	static final String DFA12_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\3\uffff\1\20\1\21\1\uffff"+
		"\1\23\1\22\1\24\1\13\1\12\1\15\1\14\1\17\1\16\3\uffff";
	static final String DFA12_specialS =
		"\34\uffff}>";
	static final String[] DFA12_transitionS = {
			"\1\22\26\uffff\1\22\1\1\1\21\2\uffff\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7"+
			"\1\uffff\1\10\1\17\1\11\12\20\2\uffff\1\12\1\13\1\14\1\21\1\uffff\32"+
			"\21\3\uffff\1\15\1\21\1\uffff\32\21\1\uffff\1\16",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\23",
			"\1\25",
			"\1\27",
			"",
			"",
			"\12\31",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\31\13\uffff\1\32\37\uffff\1\32",
			"\1\20\1\uffff\1\20\2\uffff\12\33",
			"\12\33"
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | ID | NUMERIC | WS );";
		}
	}

}
