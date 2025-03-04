/*
 * Copyright 2022 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openrewrite.xml.internal.grammar;

// Generated from /Users/yoshi/Development/Repos/openrewrite/rewrite/rewrite-xml/src/main/antlr/XMLLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			COMMENT=1, CDATA=2, ParamEntityRef=3, EntityRef=4, CharRef=5, SEA_WS=6,
			UTF_ENCODING_BOM=7, SPECIAL_OPEN_XML=8, OPEN=9, SPECIAL_OPEN=10, DTD_OPEN=11,
			TEXT=12, DTD_CLOSE=13, DTD_SUBSET_OPEN=14, DTD_S=15, DOCTYPE=16, DTD_SUBSET_CLOSE=17,
			MARKUP_OPEN=18, DTS_SUBSET_S=19, MARK_UP_CLOSE=20, MARKUP_S=21, MARKUP_TEXT=22,
			MARKUP_SUBSET=23, PI_S=24, PI_TEXT=25, CLOSE=26, SPECIAL_CLOSE=27, SLASH_CLOSE=28,
			S=29, SLASH=30, EQUALS=31, STRING=32, Name=33;
	public static final int
			INSIDE_DTD=1, INSIDE_DTD_SUBSET=2, INSIDE_MARKUP=3, INSIDE_MARKUP_SUBSET=4,
			INSIDE_PROCESS_INSTRUCTION=5, INSIDE=6;
	public static String[] channelNames = {
			"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
			"DEFAULT_MODE", "INSIDE_DTD", "INSIDE_DTD_SUBSET", "INSIDE_MARKUP", "INSIDE_MARKUP_SUBSET",
			"INSIDE_PROCESS_INSTRUCTION", "INSIDE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
				"COMMENT", "CDATA", "ParamEntityRef", "EntityRef", "CharRef", "SEA_WS",
				"UTF_ENCODING_BOM", "SPECIAL_OPEN_XML", "OPEN", "SPECIAL_OPEN", "DTD_OPEN",
				"TEXT", "UTF_8_BOM_CHARS", "UTF_8_BOM", "DTD_CLOSE", "DTD_SUBSET_OPEN",
				"DTD_S", "DOCTYPE", "DTD_NAME", "DTD_STRING", "DTD_SUBSET_CLOSE", "MARKUP_OPEN",
				"DTS_SUBSET_S", "DTD_PERef", "DTD_SUBSET_COMMENT", "MARK_UP_CLOSE", "MARKUP_SUBSET_OPEN",
				"MARKUP_S", "MARKUP_TEXT", "MARKUP_SUBSET", "TXT", "PI_SPECIAL_CLOSE",
				"PI_S", "PI_TEXT", "CLOSE", "SPECIAL_CLOSE", "SLASH_CLOSE", "S", "SLASH",
				"EQUALS", "STRING", "Name", "HEXDIGIT", "DIGIT", "NameChar", "NameStartChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, null, null, null, null, null, null, null, null, "'<'", null, null,
				null, null, null, null, "'DOCTYPE'", null, null, null, null, null, null,
				null, null, null, null, "'?>'", "'/>'", null, "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
				null, "COMMENT", "CDATA", "ParamEntityRef", "EntityRef", "CharRef", "SEA_WS",
				"UTF_ENCODING_BOM", "SPECIAL_OPEN_XML", "OPEN", "SPECIAL_OPEN", "DTD_OPEN",
				"TEXT", "DTD_CLOSE", "DTD_SUBSET_OPEN", "DTD_S", "DOCTYPE", "DTD_SUBSET_CLOSE",
				"MARKUP_OPEN", "DTS_SUBSET_S", "MARK_UP_CLOSE", "MARKUP_S", "MARKUP_TEXT",
				"MARKUP_SUBSET", "PI_S", "PI_TEXT", "CLOSE", "SPECIAL_CLOSE", "SLASH_CLOSE",
				"S", "SLASH", "EQUALS", "STRING", "Name"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public XMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XMLLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0172\b\1\b\1\b"+
					"\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
					"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
					"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
					"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
					"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
					"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2"+
					"\7\2l\n\2\f\2\16\2o\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
					"\3\3\3\3\3\3\3\7\3\u0080\n\3\f\3\16\3\u0083\13\3\3\3\3\3\3\3\3\3\3\4\3"+
					"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\6\6\u0095\n\6\r\6\16\6\u0096"+
					"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u00a0\n\6\r\6\16\6\u00a1\3\6\3\6\5\6"+
					"\u00a6\n\6\3\7\3\7\5\7\u00aa\n\7\3\7\6\7\u00ad\n\7\r\7\16\7\u00ae\3\7"+
					"\3\7\3\b\3\b\5\b\u00b5\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
					"\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
					"\f\3\f\3\r\6\r\u00d4\n\r\r\r\16\r\u00d5\3\16\3\16\3\16\3\16\3\17\3\17"+
					"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
					"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
					"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
					"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
					"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\6\36\u011d\n\36\r\36\16\36\u011e\3"+
					"\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\6#\u0133"+
					"\n#\r#\16#\u0134\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
					"\3\'\3(\3(\3)\3)\3*\3*\7*\u014f\n*\f*\16*\u0152\13*\3*\3*\3*\7*\u0157"+
					"\n*\f*\16*\u015a\13*\3*\5*\u015d\n*\3+\3+\7+\u0161\n+\f+\16+\u0164\13"+
					"+\3,\3,\3-\3-\3.\3.\3.\3.\5.\u016e\n.\3/\5/\u0171\n/\4m\u0081\2\60\t\3"+
					"\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\2#\2%\17\'\20"+
					")\21+\22-\2/\2\61\23\63\24\65\25\67\29\2;\26=\2?\27A\30C\31E\2G\2I\32"+
					"K\33M\34O\35Q\36S\37U W!Y\"[#]\2_\2a\2c\2\t\2\3\4\5\6\7\b\r\4\2\13\13"+
					"\"\"\4\2((>>\4\2@@]]\3\2@A\5\2\13\f\17\17\"\"\4\2$$>>\4\2))>>\5\2\62;"+
					"CHch\3\2\62;\4\2/\60aa\5\2\u00b9\u00b9\u0302\u0371\u2041\u2042\3\21\2"+
					"<\2<\2C\2\\\2a\2a\2c\2|\2\u00c2\2\u00d8\2\u00da\2\u00f8\2\u00fa\2\u0301"+
					"\2\u0372\2\u037f\2\u0381\2\u2001\2\u200e\2\u200f\2\u2072\2\u2191\2\u3003"+
					"\2\ud801\2\uf902\2\ufdd1\2\ufdf2\2\uffff\2\2\3\1\20\u0178\2\t\3\2\2\2"+
					"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
					"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
					"\2\2\3%\3\2\2\2\3\'\3\2\2\2\3)\3\2\2\2\3+\3\2\2\2\3-\3\2\2\2\3/\3\2\2"+
					"\2\4\61\3\2\2\2\4\63\3\2\2\2\4\65\3\2\2\2\4\67\3\2\2\2\49\3\2\2\2\5;\3"+
					"\2\2\2\5=\3\2\2\2\5?\3\2\2\2\5A\3\2\2\2\6C\3\2\2\2\6E\3\2\2\2\7G\3\2\2"+
					"\2\7I\3\2\2\2\7K\3\2\2\2\bM\3\2\2\2\bO\3\2\2\2\bQ\3\2\2\2\bS\3\2\2\2\b"+
					"U\3\2\2\2\bW\3\2\2\2\bY\3\2\2\2\b[\3\2\2\2\te\3\2\2\2\13t\3\2\2\2\r\u0088"+
					"\3\2\2\2\17\u008c\3\2\2\2\21\u00a5\3\2\2\2\23\u00ac\3\2\2\2\25\u00b4\3"+
					"\2\2\2\27\u00b8\3\2\2\2\31\u00c2\3\2\2\2\33\u00c6\3\2\2\2\35\u00cd\3\2"+
					"\2\2\37\u00d3\3\2\2\2!\u00d7\3\2\2\2#\u00db\3\2\2\2%\u00dd\3\2\2\2\'\u00e1"+
					"\3\2\2\2)\u00e5\3\2\2\2+\u00e9\3\2\2\2-\u00f1\3\2\2\2/\u00f5\3\2\2\2\61"+
					"\u00f9\3\2\2\2\63\u00fd\3\2\2\2\65\u0102\3\2\2\2\67\u0106\3\2\2\29\u010a"+
					"\3\2\2\2;\u010e\3\2\2\2=\u0112\3\2\2\2?\u0117\3\2\2\2A\u011c\3\2\2\2C"+
					"\u0120\3\2\2\2E\u0124\3\2\2\2G\u0128\3\2\2\2I\u012d\3\2\2\2K\u0132\3\2"+
					"\2\2M\u0136\3\2\2\2O\u013a\3\2\2\2Q\u013f\3\2\2\2S\u0144\3\2\2\2U\u0148"+
					"\3\2\2\2W\u014a\3\2\2\2Y\u015c\3\2\2\2[\u015e\3\2\2\2]\u0165\3\2\2\2_"+
					"\u0167\3\2\2\2a\u016d\3\2\2\2c\u0170\3\2\2\2ef\7>\2\2fg\7#\2\2gh\7/\2"+
					"\2hi\7/\2\2im\3\2\2\2jl\13\2\2\2kj\3\2\2\2lo\3\2\2\2mn\3\2\2\2mk\3\2\2"+
					"\2np\3\2\2\2om\3\2\2\2pq\7/\2\2qr\7/\2\2rs\7@\2\2s\n\3\2\2\2tu\7>\2\2"+
					"uv\7#\2\2vw\7]\2\2wx\7E\2\2xy\7F\2\2yz\7C\2\2z{\7V\2\2{|\7C\2\2|}\7]\2"+
					"\2}\u0081\3\2\2\2~\u0080\13\2\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
					"\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2"+
					"\2\u0084\u0085\7_\2\2\u0085\u0086\7_\2\2\u0086\u0087\7@\2\2\u0087\f\3"+
					"\2\2\2\u0088\u0089\7\'\2\2\u0089\u008a\5[+\2\u008a\u008b\7=\2\2\u008b"+
					"\16\3\2\2\2\u008c\u008d\7(\2\2\u008d\u008e\5[+\2\u008e\u008f\7=\2\2\u008f"+
					"\20\3\2\2\2\u0090\u0091\7(\2\2\u0091\u0092\7%\2\2\u0092\u0094\3\2\2\2"+
					"\u0093\u0095\5_-\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094"+
					"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7=\2\2\u0099"+
					"\u00a6\3\2\2\2\u009a\u009b\7(\2\2\u009b\u009c\7%\2\2\u009c\u009d\7z\2"+
					"\2\u009d\u009f\3\2\2\2\u009e\u00a0\5],\2\u009f\u009e\3\2\2\2\u00a0\u00a1"+
					"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
					"\u00a4\7=\2\2\u00a4\u00a6\3\2\2\2\u00a5\u0090\3\2\2\2\u00a5\u009a\3\2"+
					"\2\2\u00a6\22\3\2\2\2\u00a7\u00ad\t\2\2\2\u00a8\u00aa\7\17\2\2\u00a9\u00a8"+
					"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\7\f\2\2\u00ac"+
					"\u00a7\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2"+
					"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\7\2\2\u00b1"+
					"\24\3\2\2\2\u00b2\u00b5\5!\16\2\u00b3\u00b5\5#\17\2\u00b4\u00b2\3\2\2"+
					"\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b\b\2\2\u00b7\26"+
					"\3\2\2\2\u00b8\u00b9\7>\2\2\u00b9\u00ba\7A\2\2\u00ba\u00bb\7z\2\2\u00bb"+
					"\u00bc\7o\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\5S\'"+
					"\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\b\t\3\2\u00c1\30\3\2\2\2\u00c2\u00c3"+
					"\7>\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\b\n\3\2\u00c5\32\3\2\2\2\u00c6"+
					"\u00c7\7>\2\2\u00c7\u00c8\7A\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\5[+\2"+
					"\u00ca\u00cb\3\2\2\2\u00cb\u00cc\b\13\4\2\u00cc\34\3\2\2\2\u00cd\u00ce"+
					"\7>\2\2\u00ce\u00cf\7#\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b\f\5\2\u00d1"+
					"\36\3\2\2\2\u00d2\u00d4\n\3\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2"+
					"\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6 \3\2\2\2\u00d7\u00d8"+
					"\7\u00f1\2\2\u00d8\u00d9\7\u00bd\2\2\u00d9\u00da\7\u00c1\2\2\u00da\"\3"+
					"\2\2\2\u00db\u00dc\7\uff01\2\2\u00dc$\3\2\2\2\u00dd\u00de\7@\2\2\u00de"+
					"\u00df\3\2\2\2\u00df\u00e0\b\20\6\2\u00e0&\3\2\2\2\u00e1\u00e2\7]\2\2"+
					"\u00e2\u00e3\3\2\2\2\u00e3\u00e4\b\21\7\2\u00e4(\3\2\2\2\u00e5\u00e6\5"+
					"S\'\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\b\22\2\2\u00e8*\3\2\2\2\u00e9\u00ea"+
					"\7F\2\2\u00ea\u00eb\7Q\2\2\u00eb\u00ec\7E\2\2\u00ec\u00ed\7V\2\2\u00ed"+
					"\u00ee\7[\2\2\u00ee\u00ef\7R\2\2\u00ef\u00f0\7G\2\2\u00f0,\3\2\2\2\u00f1"+
					"\u00f2\5[+\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b\24\b\2\u00f4.\3\2\2\2\u00f5"+
					"\u00f6\5Y*\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\b\25\t\2\u00f8\60\3\2\2\2"+
					"\u00f9\u00fa\7_\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\b\26\6\2\u00fc\62"+
					"\3\2\2\2\u00fd\u00fe\7>\2\2\u00fe\u00ff\7#\2\2\u00ff\u0100\3\2\2\2\u0100"+
					"\u0101\b\27\n\2\u0101\64\3\2\2\2\u0102\u0103\5S\'\2\u0103\u0104\3\2\2"+
					"\2\u0104\u0105\b\30\2\2\u0105\66\3\2\2\2\u0106\u0107\5\r\4\2\u0107\u0108"+
					"\3\2\2\2\u0108\u0109\b\31\13\2\u01098\3\2\2\2\u010a\u010b\5\t\2\2\u010b"+
					"\u010c\3\2\2\2\u010c\u010d\b\32\f\2\u010d:\3\2\2\2\u010e\u010f\7@\2\2"+
					"\u010f\u0110\3\2\2\2\u0110\u0111\b\33\6\2\u0111<\3\2\2\2\u0112\u0113\7"+
					"]\2\2\u0113\u0114\3\2\2\2\u0114\u0115\b\34\r\2\u0115\u0116\b\34\16\2\u0116"+
					">\3\2\2\2\u0117\u0118\5S\'\2\u0118\u0119\3\2\2\2\u0119\u011a\b\35\2\2"+
					"\u011a@\3\2\2\2\u011b\u011d\n\4\2\2\u011c\u011b\3\2\2\2\u011d\u011e\3"+
					"\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011fB\3\2\2\2\u0120\u0121"+
					"\7_\2\2\u0121\u0122\3\2\2\2\u0122\u0123\b\37\6\2\u0123D\3\2\2\2\u0124"+
					"\u0125\13\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\b \r\2\u0127F\3\2\2\2"+
					"\u0128\u0129\5O%\2\u0129\u012a\3\2\2\2\u012a\u012b\b!\17\2\u012b\u012c"+
					"\b!\6\2\u012cH\3\2\2\2\u012d\u012e\5S\'\2\u012e\u012f\3\2\2\2\u012f\u0130"+
					"\b\"\2\2\u0130J\3\2\2\2\u0131\u0133\n\5\2\2\u0132\u0131\3\2\2\2\u0133"+
					"\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135L\3\2\2\2"+
					"\u0136\u0137\7@\2\2\u0137\u0138\3\2\2\2\u0138\u0139\b$\6\2\u0139N\3\2"+
					"\2\2\u013a\u013b\7A\2\2\u013b\u013c\7@\2\2\u013c\u013d\3\2\2\2\u013d\u013e"+
					"\b%\6\2\u013eP\3\2\2\2\u013f\u0140\7\61\2\2\u0140\u0141\7@\2\2\u0141\u0142"+
					"\3\2\2\2\u0142\u0143\b&\6\2\u0143R\3\2\2\2\u0144\u0145\t\6\2\2\u0145\u0146"+
					"\3\2\2\2\u0146\u0147\b\'\2\2\u0147T\3\2\2\2\u0148\u0149\7\61\2\2\u0149"+
					"V\3\2\2\2\u014a\u014b\7?\2\2\u014bX\3\2\2\2\u014c\u0150\7$\2\2\u014d\u014f"+
					"\n\7\2\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
					"\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u015d\7$"+
					"\2\2\u0154\u0158\7)\2\2\u0155\u0157\n\b\2\2\u0156\u0155\3\2\2\2\u0157"+
					"\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2"+
					"\2\2\u015a\u0158\3\2\2\2\u015b\u015d\7)\2\2\u015c\u014c\3\2\2\2\u015c"+
					"\u0154\3\2\2\2\u015dZ\3\2\2\2\u015e\u0162\5c/\2\u015f\u0161\5a.\2\u0160"+
					"\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2"+
					"\2\2\u0163\\\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\t\t\2\2\u0166^\3"+
					"\2\2\2\u0167\u0168\t\n\2\2\u0168`\3\2\2\2\u0169\u016e\5c/\2\u016a\u016e"+
					"\t\13\2\2\u016b\u016e\5_-\2\u016c\u016e\t\f\2\2\u016d\u0169\3\2\2\2\u016d"+
					"\u016a\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016c\3\2\2\2\u016eb\3\2\2\2"+
					"\u016f\u0171\t\r\2\2\u0170\u016f\3\2\2\2\u0171d\3\2\2\2\33\2\3\4\5\6\7"+
					"\bm\u0081\u0096\u00a1\u00a5\u00a9\u00ac\u00ae\u00b4\u00d5\u011e\u0134"+
					"\u0150\u0158\u015c\u0162\u016d\u0170\20\b\2\2\7\b\2\7\7\2\7\3\2\6\2\2"+
					"\7\4\2\t#\2\t\"\2\7\5\2\t\5\2\t\3\2\5\2\2\7\6\2\t\35\2";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}