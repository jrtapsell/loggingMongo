import uk.ac.rhul.cs.csle.art.ARTException;
import uk.ac.rhul.cs.csle.artgll.*;
import uk.ac.rhul.cs.csle.artgraph.*;
import uk.ac.rhul.cs.csle.arttext.*;
/*******************************************************************************
*
* ARTGLLParser.java
*
*******************************************************************************/
public class ARTGLLParser extends uk.ac.rhul.cs.csle.artgll.ARTGLLParserHashPool implements uk.ac.rhul.cs.csle.artgll.ARTGLLAPI {
  private static boolean[] ARTSet1;
  private static boolean[] ARTSet2;
  private static boolean[] ARTSet3;
  private static boolean[] ARTSet4;
  private static boolean[] ARTSet5;
  private static boolean[] ARTSet6;
  private static boolean[] ARTSet7;
  private static boolean[] ARTSet8;
  private static boolean[] ARTSet9;
  private static boolean[] ARTSet10;
  private static boolean[] ARTSet11;
  private static boolean[] ARTSet12;
  private static boolean[] ARTSet13;
  private static boolean[] ARTSet14;
  private static boolean[] ARTSet15;
  private static boolean[] ARTSet16;
  private static boolean[] ARTSet17;
  private static boolean[] ARTSet18;
  private static boolean[] ARTSet19;
  private static boolean[] ARTSet20;
  private static boolean[] ARTSet21;
  private static boolean[] ARTSet22;
  private static boolean[] ARTSet23;
  private static boolean[] ARTSet24;
  private static boolean[] ARTSet25;
  private static boolean[] ARTSet26;
  private static boolean[] ARTSet27;
  private static boolean[] ARTSet28;
  private static boolean[] ARTSet29;
  private static boolean[] ARTSet30;
  private static boolean[] ARTSet31;
  private static boolean[] ARTSet32;
  private static boolean[] ARTSet33;
  private static boolean[] ARTSet34;
  private static boolean[] ARTSet35;
  private static boolean[] ARTSet36;
  private static boolean[] ARTSet37;
  private static boolean[] ARTSet38;
  private static boolean[] ARTSet39;
  private static boolean[] ARTSet40;
  private static boolean[] ARTSet41;
  private static boolean[] ARTSet42;
  private static boolean[] ARTSet43;
  private static boolean[] ARTSet44;
  private static boolean[] ARTSet45;
  private static boolean[] ARTSet46;
  private static boolean[] ARTSet47;
  private static boolean[] ARTSet48;
  private static boolean[] ARTSet49;
  private static boolean[] ARTSet50;
  private static boolean[] ARTSet51;
  private static boolean[] ARTSet52;
  private static boolean[] ARTSet53;
  private static boolean[] ARTSet54;
  private static boolean[] ARTSet55;
  private static boolean[] ARTSet56;
  private static boolean[] ARTSet57;

  /* Start of artLabel enumeration */
  public static final int ARTX_EOS = 0;
  public static final int ARTTB_ID = 1;
  public static final int ARTTB_STRING_DQ = 2;
  public static final int ARTTB_STRING_SQ = 3;
  public static final int ARTTC__DOLLAR = 4;
  public static final int ARTTC__MINUS = 5;
  public static final int ARTTS__RPAR = 6;
  public static final int ARTTS__PLUS = 7;
  public static final int ARTTS__COMMA = 8;
  public static final int ARTTS__MINUS = 9;
  public static final int ARTTS__PERIOD = 10;
  public static final int ARTTS_0 = 11;
  public static final int ARTTS_1 = 12;
  public static final int ARTTS_2 = 13;
  public static final int ARTTS_3 = 14;
  public static final int ARTTS_4 = 15;
  public static final int ARTTS_5 = 16;
  public static final int ARTTS_6 = 17;
  public static final int ARTTS_7 = 18;
  public static final int ARTTS_8 = 19;
  public static final int ARTTS_9 = 20;
  public static final int ARTTS__COLON = 21;
  public static final int ARTTS_ObjectId_LPAR = 22;
  public static final int ARTTS__LBRACK = 23;
  public static final int ARTTS__RBRACK = 24;
  public static final int ARTTS_false = 25;
  public static final int ARTTS_null = 26;
  public static final int ARTTS_true = 27;
  public static final int ARTTS__LBRACE = 28;
  public static final int ARTTS__RBRACE = 29;
  public static final int ARTTI_e = 30;
  public static final int ARTX_EPSILON = 31;
  public static final int ARTL_ART_O_array_values = 32;
  public static final int ARTL_ART_O_array_values_5 = 33;
  public static final int ARTL_ART_O_array_values_7 = 34;
  public static final int ARTL_ART_O_array_values_9 = 35;
  public static final int ARTL_ART_O_array_values_11 = 36;
  public static final int ARTL_ART_O_exponent = 37;
  public static final int ARTL_ART_O_exponent_14 = 38;
  public static final int ARTL_ART_O_exponent_16 = 39;
  public static final int ARTL_ART_O_exponent_18 = 40;
  public static final int ARTL_ART_O_exponent_20 = 41;
  public static final int ARTL_ART_O_exponent_22 = 42;
  public static final int ARTL_ART_O_exponent_24 = 43;
  public static final int ARTL_ART_O_fraction = 44;
  public static final int ARTL_ART_O_fraction_27 = 45;
  public static final int ARTL_ART_O_fraction_31 = 46;
  public static final int ARTL_ART_O_fraction_28 = 47;
  public static final int ARTL_ART_O_fraction_29 = 48;
  public static final int ARTL_ART_O_fraction_33 = 49;
  public static final int ARTL_ART_O_fraction_35 = 50;
  public static final int ARTL_ART_O_members = 51;
  public static final int ARTL_ART_O_members_38 = 52;
  public static final int ARTL_ART_O_members_40 = 53;
  public static final int ARTL_ART_O_members_42 = 54;
  public static final int ARTL_ART_O_members_44 = 55;
  public static final int ARTL_ART_O_minus = 56;
  public static final int ARTL_ART_O_minus_47 = 57;
  public static final int ARTL_ART_O_minus_49 = 58;
  public static final int ARTL_ART_O_minus_48 = 59;
  public static final int ARTL_ART_O_minus_51 = 60;
  public static final int ARTL_ART_O_minus_53 = 61;
  public static final int ARTL_ART_O_sign = 62;
  public static final int ARTL_ART_O_sign_56 = 63;
  public static final int ARTL_ART_O_sign_58 = 64;
  public static final int ARTL_ART_O_sign_57 = 65;
  public static final int ARTL_ART_O_sign_60 = 66;
  public static final int ARTL_ART_O_sign_62 = 67;
  public static final int ARTL_ART_array = 68;
  public static final int ARTL_ART_array_65 = 69;
  public static final int ARTL_ART_array_69 = 70;
  public static final int ARTL_ART_array_71 = 71;
  public static final int ARTL_ART_array_66 = 72;
  public static final int ARTL_ART_array_67 = 73;
  public static final int ARTL_ART_array_70 = 74;
  public static final int ARTL_ART_array_values = 75;
  public static final int ARTL_ART_array_values_74 = 76;
  public static final int ARTL_ART_array_values_76 = 77;
  public static final int ARTL_ART_array_values_78 = 78;
  public static final int ARTL_ART_array_values_80 = 79;
  public static final int ARTL_ART_array_values_82 = 80;
  public static final int ARTL_ART_array_values_84 = 81;
  public static final int ARTL_ART_array_values_81 = 82;
  public static final int ARTL_ART_boolean = 83;
  public static final int ARTL_ART_boolean_87 = 84;
  public static final int ARTL_ART_boolean_89 = 85;
  public static final int ARTL_ART_boolean_88 = 86;
  public static final int ARTL_ART_boolean_91 = 87;
  public static final int ARTL_ART_boolean_93 = 88;
  public static final int ARTL_ART_boolean_92 = 89;
  public static final int ARTL_ART_bson_id = 90;
  public static final int ARTL_ART_bson_id_96 = 91;
  public static final int ARTL_ART_bson_id_100 = 92;
  public static final int ARTL_ART_bson_id_102 = 93;
  public static final int ARTL_ART_bson_id_97 = 94;
  public static final int ARTL_ART_bson_id_98 = 95;
  public static final int ARTL_ART_bson_id_101 = 96;
  public static final int ARTL_ART_bson_no_quote = 97;
  public static final int ARTL_ART_bson_no_quote_105 = 98;
  public static final int ARTL_ART_bson_no_quote_107 = 99;
  public static final int ARTL_ART_bson_no_quote_106 = 100;
  public static final int ARTL_ART_bson_no_quote_109 = 101;
  public static final int ARTL_ART_bson_no_quote_111 = 102;
  public static final int ARTL_ART_bson_no_quote_113 = 103;
  public static final int ARTL_ART_bson_no_quote_117 = 104;
  public static final int ARTL_ART_bson_no_quote_114 = 105;
  public static final int ARTL_ART_bson_no_quote_115 = 106;
  public static final int ARTL_ART_bson_no_quote_119 = 107;
  public static final int ARTL_ART_bson_no_quote_121 = 108;
  public static final int ARTL_ART_bson_no_quote_123 = 109;
  public static final int ARTL_ART_bson_no_quote_125 = 110;
  public static final int ARTL_ART_bson_no_quote_122 = 111;
  public static final int ARTL_ART_digit = 112;
  public static final int ARTL_ART_digit_128 = 113;
  public static final int ARTL_ART_digit_130 = 114;
  public static final int ARTL_ART_digit_129 = 115;
  public static final int ARTL_ART_digit_132 = 116;
  public static final int ARTL_ART_digit_134 = 117;
  public static final int ARTL_ART_digits = 118;
  public static final int ARTL_ART_digits_137 = 119;
  public static final int ARTL_ART_digits_139 = 120;
  public static final int ARTL_ART_digits_141 = 121;
  public static final int ARTL_ART_digits_143 = 122;
  public static final int ARTL_ART_digits_145 = 123;
  public static final int ARTL_ART_exp_letter = 124;
  public static final int ARTL_ART_exp_letter_148 = 125;
  public static final int ARTL_ART_exp_letter_150 = 126;
  public static final int ARTL_ART_exp_letter_149 = 127;
  public static final int ARTL_ART_id_number = 128;
  public static final int ARTL_ART_id_number_153 = 129;
  public static final int ARTL_ART_id_number_157 = 130;
  public static final int ARTL_ART_id_number_156 = 131;
  public static final int ARTL_ART_key = 132;
  public static final int ARTL_ART_key_160 = 133;
  public static final int ARTL_ART_key_164 = 134;
  public static final int ARTL_ART_key_166 = 135;
  public static final int ARTL_ART_key_170 = 136;
  public static final int ARTL_ART_members = 137;
  public static final int ARTL_ART_members_173 = 138;
  public static final int ARTL_ART_members_175 = 139;
  public static final int ARTL_ART_members_177 = 140;
  public static final int ARTL_ART_members_179 = 141;
  public static final int ARTL_ART_members_176 = 142;
  public static final int ARTL_ART_members_181 = 143;
  public static final int ARTL_ART_members_183 = 144;
  public static final int ARTL_ART_no_leading_zeros = 145;
  public static final int ARTL_ART_no_leading_zeros_186 = 146;
  public static final int ARTL_ART_no_leading_zeros_188 = 147;
  public static final int ARTL_ART_no_leading_zeros_190 = 148;
  public static final int ARTL_ART_no_leading_zeros_192 = 149;
  public static final int ARTL_ART_no_leading_zeros_194 = 150;
  public static final int ARTL_ART_non_zero_digits = 151;
  public static final int ARTL_ART_non_zero_digits_197 = 152;
  public static final int ARTL_ART_non_zero_digits_199 = 153;
  public static final int ARTL_ART_non_zero_digits_198 = 154;
  public static final int ARTL_ART_non_zero_digits_201 = 155;
  public static final int ARTL_ART_non_zero_digits_203 = 156;
  public static final int ARTL_ART_non_zero_digits_202 = 157;
  public static final int ARTL_ART_non_zero_digits_205 = 158;
  public static final int ARTL_ART_non_zero_digits_207 = 159;
  public static final int ARTL_ART_non_zero_digits_206 = 160;
  public static final int ARTL_ART_non_zero_digits_209 = 161;
  public static final int ARTL_ART_non_zero_digits_211 = 162;
  public static final int ARTL_ART_non_zero_digits_210 = 163;
  public static final int ARTL_ART_non_zero_digits_213 = 164;
  public static final int ARTL_ART_non_zero_digits_215 = 165;
  public static final int ARTL_ART_non_zero_digits_214 = 166;
  public static final int ARTL_ART_non_zero_digits_217 = 167;
  public static final int ARTL_ART_non_zero_digits_219 = 168;
  public static final int ARTL_ART_non_zero_digits_218 = 169;
  public static final int ARTL_ART_non_zero_digits_221 = 170;
  public static final int ARTL_ART_non_zero_digits_223 = 171;
  public static final int ARTL_ART_non_zero_digits_222 = 172;
  public static final int ARTL_ART_non_zero_digits_225 = 173;
  public static final int ARTL_ART_non_zero_digits_227 = 174;
  public static final int ARTL_ART_non_zero_digits_226 = 175;
  public static final int ARTL_ART_non_zero_digits_229 = 176;
  public static final int ARTL_ART_non_zero_digits_231 = 177;
  public static final int ARTL_ART_non_zero_digits_230 = 178;
  public static final int ARTL_ART_null = 179;
  public static final int ARTL_ART_null_234 = 180;
  public static final int ARTL_ART_null_236 = 181;
  public static final int ARTL_ART_null_235 = 182;
  public static final int ARTL_ART_number = 183;
  public static final int ARTL_ART_number_239 = 184;
  public static final int ARTL_ART_number_241 = 185;
  public static final int ARTL_ART_number_243 = 186;
  public static final int ARTL_ART_number_245 = 187;
  public static final int ARTL_ART_number_247 = 188;
  public static final int ARTL_ART_object = 189;
  public static final int ARTL_ART_object_250 = 190;
  public static final int ARTL_ART_object_254 = 191;
  public static final int ARTL_ART_object_256 = 192;
  public static final int ARTL_ART_object_251 = 193;
  public static final int ARTL_ART_object_252 = 194;
  public static final int ARTL_ART_object_255 = 195;
  public static final int ARTL_ART_pair = 196;
  public static final int ARTL_ART_pair_259 = 197;
  public static final int ARTL_ART_pair_261 = 198;
  public static final int ARTL_ART_pair_263 = 199;
  public static final int ARTL_ART_pair_265 = 200;
  public static final int ARTL_ART_pair_262 = 201;
  public static final int ARTL_ART_string = 202;
  public static final int ARTL_ART_string_268 = 203;
  public static final int ARTL_ART_string_270 = 204;
  public static final int ARTL_ART_string_269 = 205;
  public static final int ARTL_ART_value = 206;
  public static final int ARTL_ART_value_273 = 207;
  public static final int ARTL_ART_value_275 = 208;
  public static final int ARTL_ART_value_277 = 209;
  public static final int ARTL_ART_value_279 = 210;
  public static final int ARTL_ART_value_281 = 211;
  public static final int ARTL_ART_value_283 = 212;
  public static final int ARTL_ART_value_285 = 213;
  public static final int ARTL_ART_value_287 = 214;
  public static final int ARTL_ART_value_289 = 215;
  public static final int ARTL_ART_value_291 = 216;
  public static final int ARTL_ART_value_293 = 217;
  public static final int ARTL_ART_value_295 = 218;
  public static final int ARTL_ART_value_297 = 219;
  public static final int ARTL_ART_value_299 = 220;
  public static final int ARTX_DESPATCH = 221;
  public static final int ARTX_DUMMY = 222;
  public static final int ARTX_LABEL_EXTENT = 223;
  /* End of artLabel enumeration */

  /* Start of artName enumeration */
  public static final int ARTNAME_NONE = 0;
  public static final int ARTNAME_EXTENT = 1;
  /* End of artName enumeration */
  public void ARTPF_ART_O_array_values() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal O_array_values production descriptor loads*/
      case ARTL_ART_O_array_values: 
        if (ARTSet4[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_O_array_values_5, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet3[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_O_array_values_9, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal O_array_values: match production*/
      case ARTL_ART_O_array_values_5: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_O_array_values_7, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_array_values; return; }
      case ARTL_ART_O_array_values_7: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal O_array_values: match production*/
      case ARTL_ART_O_array_values_9: 
        /* Cat/unary template start */
        /* Epsilon template start */
        artCurrentSPPFRightChildNode = artFindSPPFEpsilon(artLexer.artCurrentInputIndex);
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_O_array_values_11, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Epsilon template end */
        /* Cat/unary template end */
        if (!ARTSet3[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_O_exponent() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal O_exponent production descriptor loads*/
      case ARTL_ART_O_exponent: 
        if (ARTSet8[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_O_exponent_14, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet7[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_O_exponent_22, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal O_exponent: match production*/
      case ARTL_ART_O_exponent_14: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_O_exponent_16, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_exp_letter; return; }
      case ARTL_ART_O_exponent_16: 
        /* Nonterminal template end */
        if (!ARTSet9[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_O_exponent_18, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_O_sign; return; }
      case ARTL_ART_O_exponent_18: 
        /* Nonterminal template end */
        if (!ARTSet11[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_O_exponent_20, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_digits; return; }
      case ARTL_ART_O_exponent_20: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet7[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal O_exponent: match production*/
      case ARTL_ART_O_exponent_22: 
        /* Cat/unary template start */
        /* Epsilon template start */
        artCurrentSPPFRightChildNode = artFindSPPFEpsilon(artLexer.artCurrentInputIndex);
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_O_exponent_24, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Epsilon template end */
        /* Cat/unary template end */
        if (!ARTSet7[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_O_fraction() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal O_fraction production descriptor loads*/
      case ARTL_ART_O_fraction: 
        if (ARTSet14[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_O_fraction_27, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet13[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_O_fraction_33, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal O_fraction: match production*/
      case ARTL_ART_O_fraction_27: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PERIOD, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_O_fraction_29, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_O_fraction_31, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_digits; return; }
      case ARTL_ART_O_fraction_31: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal O_fraction: match production*/
      case ARTL_ART_O_fraction_33: 
        /* Cat/unary template start */
        /* Epsilon template start */
        artCurrentSPPFRightChildNode = artFindSPPFEpsilon(artLexer.artCurrentInputIndex);
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_O_fraction_35, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Epsilon template end */
        /* Cat/unary template end */
        if (!ARTSet13[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_O_members() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal O_members production descriptor loads*/
      case ARTL_ART_O_members: 
        if (ARTSet17[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_O_members_38, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet16[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_O_members_42, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal O_members: match production*/
      case ARTL_ART_O_members_38: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_O_members_40, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_members; return; }
      case ARTL_ART_O_members_40: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal O_members: match production*/
      case ARTL_ART_O_members_42: 
        /* Cat/unary template start */
        /* Epsilon template start */
        artCurrentSPPFRightChildNode = artFindSPPFEpsilon(artLexer.artCurrentInputIndex);
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_O_members_44, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Epsilon template end */
        /* Cat/unary template end */
        if (!ARTSet16[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_O_minus() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal O_minus production descriptor loads*/
      case ARTL_ART_O_minus: 
        if (ARTSet19[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_O_minus_47, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet11[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_O_minus_51, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal O_minus: match production*/
      case ARTL_ART_O_minus_47: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_O_minus_49, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet11[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal O_minus: match production*/
      case ARTL_ART_O_minus_51: 
        /* Cat/unary template start */
        /* Epsilon template start */
        artCurrentSPPFRightChildNode = artFindSPPFEpsilon(artLexer.artCurrentInputIndex);
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_O_minus_53, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Epsilon template end */
        /* Cat/unary template end */
        if (!ARTSet11[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_O_sign() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal O_sign production descriptor loads*/
      case ARTL_ART_O_sign: 
        if (ARTSet20[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_O_sign_56, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet21[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_O_sign_60, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal O_sign: match production*/
      case ARTL_ART_O_sign_56: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PLUS, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_O_sign_58, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet11[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal O_sign: match production*/
      case ARTL_ART_O_sign_60: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_O_sign_62, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_O_minus; return; }
      case ARTL_ART_O_sign_62: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet11[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_array() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal array production descriptor loads*/
      case ARTL_ART_array: 
        if (ARTSet22[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_array_65, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal array: match production*/
      case ARTL_ART_array_65: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACK, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_array_67, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet23[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_array_69, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_O_array_values; return; }
      case ARTL_ART_array_69: 
        /* Nonterminal template end */
        if (!ARTSet3[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACK, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_array_71, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet7[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_array_values() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal array_values production descriptor loads*/
      case ARTL_ART_array_values: 
        if (ARTSet4[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_array_values_74, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet4[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_array_values_78, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal array_values: match production*/
      case ARTL_ART_array_values_74: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_array_values_76, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_value; return; }
      case ARTL_ART_array_values_76: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet24[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal array_values: match production*/
      case ARTL_ART_array_values_78: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_array_values_80, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_array_values; return; }
      case ARTL_ART_array_values_80: 
        /* Nonterminal template end */
        if (!ARTSet25[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_array_values_82, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet4[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_array_values_84, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_value; return; }
      case ARTL_ART_array_values_84: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet24[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_boolean() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal boolean production descriptor loads*/
      case ARTL_ART_boolean: 
        if (ARTSet27[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_boolean_87, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet28[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_boolean_91, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal boolean: match production*/
      case ARTL_ART_boolean_87: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_true, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_boolean_89, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet7[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal boolean: match production*/
      case ARTL_ART_boolean_91: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_false, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_boolean_93, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet7[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_bson_id() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal bson_id production descriptor loads*/
      case ARTL_ART_bson_id: 
        if (ARTSet29[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_bson_id_96, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal bson_id: match production*/
      case ARTL_ART_bson_id_96: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_ObjectId_LPAR, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_bson_id_98, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet30[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_bson_id_100, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_id_number; return; }
      case ARTL_ART_bson_id_100: 
        /* Nonterminal template end */
        if (!ARTSet31[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_bson_id_102, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet7[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_bson_no_quote() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal bson_no_quote production descriptor loads*/
      case ARTL_ART_bson_no_quote: 
        if (ARTSet34[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_bson_no_quote_105, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet11[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_bson_no_quote_109, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet35[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_bson_no_quote_113, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet32[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_bson_no_quote_119, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal bson_no_quote: match production*/
      case ARTL_ART_bson_no_quote_105: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_ID, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_bson_no_quote_107, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet33[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal bson_no_quote: match production*/
      case ARTL_ART_bson_no_quote_109: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_bson_no_quote_111, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_digits; return; }
      case ARTL_ART_bson_no_quote_111: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet33[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal bson_no_quote: match production*/
      case ARTL_ART_bson_no_quote_113: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTC__DOLLAR, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_bson_no_quote_115, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet32[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_bson_no_quote_117, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_bson_no_quote; return; }
      case ARTL_ART_bson_no_quote_117: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet33[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal bson_no_quote: match production*/
      case ARTL_ART_bson_no_quote_119: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_bson_no_quote_121, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_bson_no_quote; return; }
      case ARTL_ART_bson_no_quote_121: 
        /* Nonterminal template end */
        if (!ARTSet36[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTC__MINUS, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_bson_no_quote_123, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet32[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_bson_no_quote_125, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_bson_no_quote; return; }
      case ARTL_ART_bson_no_quote_125: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet33[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_digit() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal digit production descriptor loads*/
      case ARTL_ART_digit: 
        if (ARTSet38[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_digit_128, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet39[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_digit_132, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal digit: match production*/
      case ARTL_ART_digit_128: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_0, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_digit_130, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal digit: match production*/
      case ARTL_ART_digit_132: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_digit_134, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_non_zero_digits; return; }
      case ARTL_ART_digit_134: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_digits() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal digits production descriptor loads*/
      case ARTL_ART_digits: 
        if (ARTSet11[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_digits_137, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet11[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_digits_143, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal digits: match production*/
      case ARTL_ART_digits_137: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_digits_139, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_digits; return; }
      case ARTL_ART_digits_139: 
        /* Nonterminal template end */
        if (!ARTSet11[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_digits_141, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_digit; return; }
      case ARTL_ART_digits_141: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal digits: match production*/
      case ARTL_ART_digits_143: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_digits_145, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_digit; return; }
      case ARTL_ART_digits_145: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_exp_letter() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal exp_letter production descriptor loads*/
      case ARTL_ART_exp_letter: 
        if (ARTSet8[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_exp_letter_148, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal exp_letter: match production*/
      case ARTL_ART_exp_letter_148: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTI_e, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_exp_letter_150, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet9[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_id_number() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal id_number production descriptor loads*/
      case ARTL_ART_id_number: 
        if (ARTSet30[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_id_number_153, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal id_number: match production*/
      case ARTL_ART_id_number_153: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_STRING_SQ, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_id_number_157, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet31[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_key() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal key production descriptor loads*/
      case ARTL_ART_key: 
        if (ARTSet41[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_key_160, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet32[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_key_166, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal key: match production*/
      case ARTL_ART_key_160: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_key_164, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_string; return; }
      case ARTL_ART_key_164: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet40[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal key: match production*/
      case ARTL_ART_key_166: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_key_170, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_bson_no_quote; return; }
      case ARTL_ART_key_170: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet40[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_members() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal members production descriptor loads*/
      case ARTL_ART_members: 
        if (ARTSet17[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_members_173, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet17[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_members_181, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal members: match production*/
      case ARTL_ART_members_173: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_members_175, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_members; return; }
      case ARTL_ART_members_175: 
        /* Nonterminal template end */
        if (!ARTSet25[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_members_177, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet17[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_members_179, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_pair; return; }
      case ARTL_ART_members_179: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet42[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal members: match production*/
      case ARTL_ART_members_181: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_members_183, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_pair; return; }
      case ARTL_ART_members_183: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet42[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_no_leading_zeros() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal no_leading_zeros production descriptor loads*/
      case ARTL_ART_no_leading_zeros: 
        if (ARTSet11[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_no_leading_zeros_186, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet39[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_no_leading_zeros_190, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal no_leading_zeros: match production*/
      case ARTL_ART_no_leading_zeros_186: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_no_leading_zeros_188, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_digit; return; }
      case ARTL_ART_no_leading_zeros_188: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet43[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal no_leading_zeros: match production*/
      case ARTL_ART_no_leading_zeros_190: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_no_leading_zeros_192, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_non_zero_digits; return; }
      case ARTL_ART_no_leading_zeros_192: 
        /* Nonterminal template end */
        if (!ARTSet11[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_no_leading_zeros_194, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_digits; return; }
      case ARTL_ART_no_leading_zeros_194: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet43[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_non_zero_digits() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal non_zero_digits production descriptor loads*/
      case ARTL_ART_non_zero_digits: 
        if (ARTSet44[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_non_zero_digits_197, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet45[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_non_zero_digits_201, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet46[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_non_zero_digits_205, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet47[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_non_zero_digits_209, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet48[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_non_zero_digits_213, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet49[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_non_zero_digits_217, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet50[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_non_zero_digits_221, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet51[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_non_zero_digits_225, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet52[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_non_zero_digits_229, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal non_zero_digits: match production*/
      case ARTL_ART_non_zero_digits_197: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_1, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_non_zero_digits_199, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal non_zero_digits: match production*/
      case ARTL_ART_non_zero_digits_201: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_2, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_non_zero_digits_203, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal non_zero_digits: match production*/
      case ARTL_ART_non_zero_digits_205: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_3, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_non_zero_digits_207, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal non_zero_digits: match production*/
      case ARTL_ART_non_zero_digits_209: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_4, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_non_zero_digits_211, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal non_zero_digits: match production*/
      case ARTL_ART_non_zero_digits_213: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_5, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_non_zero_digits_215, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal non_zero_digits: match production*/
      case ARTL_ART_non_zero_digits_217: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_6, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_non_zero_digits_219, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal non_zero_digits: match production*/
      case ARTL_ART_non_zero_digits_221: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_7, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_non_zero_digits_223, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal non_zero_digits: match production*/
      case ARTL_ART_non_zero_digits_225: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_8, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_non_zero_digits_227, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal non_zero_digits: match production*/
      case ARTL_ART_non_zero_digits_229: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_9, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_non_zero_digits_231, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet37[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_null() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal null production descriptor loads*/
      case ARTL_ART_null: 
        if (ARTSet53[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_null_234, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal null: match production*/
      case ARTL_ART_null_234: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_null, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_null_236, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet7[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_number() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal number production descriptor loads*/
      case ARTL_ART_number: 
        if (ARTSet21[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_number_239, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal number: match production*/
      case ARTL_ART_number_239: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_number_241, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_O_minus; return; }
      case ARTL_ART_number_241: 
        /* Nonterminal template end */
        if (!ARTSet11[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_number_243, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_no_leading_zeros; return; }
      case ARTL_ART_number_243: 
        /* Nonterminal template end */
        if (!ARTSet43[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_number_245, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_O_fraction; return; }
      case ARTL_ART_number_245: 
        /* Nonterminal template end */
        if (!ARTSet13[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_number_247, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_O_exponent; return; }
      case ARTL_ART_number_247: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet7[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_object() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal object production descriptor loads*/
      case ARTL_ART_object: 
        if (ARTSet55[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_object_250, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal object: match production*/
      case ARTL_ART_object_250: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_object_252, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet56[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_object_254, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_O_members; return; }
      case ARTL_ART_object_254: 
        /* Nonterminal template end */
        if (!ARTSet16[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACE, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_object_256, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet7[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_pair() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal pair production descriptor loads*/
      case ARTL_ART_pair: 
        if (ARTSet17[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_pair_259, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal pair: match production*/
      case ARTL_ART_pair_259: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_pair_261, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_key; return; }
      case ARTL_ART_pair_261: 
        /* Nonterminal template end */
        if (!ARTSet40[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COLON, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_pair_263, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet4[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_pair_265, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_value; return; }
      case ARTL_ART_pair_265: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet42[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_string() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal string production descriptor loads*/
      case ARTL_ART_string: 
        if (ARTSet41[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_string_268, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal string: match production*/
      case ARTL_ART_string_268: 
        /* Cat/unary template start */
        /* Terminal template start */
        artLexer.artCurrentInputPairReference = artLexer.artInputSuccessorIndex[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]][artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_STRING_DQ, artLexer.artCurrentInputIndex, artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1]);
        artLexer.artCurrentInputIndex = artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_string_270, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet57[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_value() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal value production descriptor loads*/
      case ARTL_ART_value: 
        if (ARTSet41[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_value_273, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet21[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_value_277, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet55[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_value_281, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet22[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_value_285, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet53[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_value_289, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet26[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_value_293, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        if (ARTSet29[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_value_297, artCurrentGSSNode, artLexer.artCurrentInputIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal value: match production*/
      case ARTL_ART_value_273: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_value_275, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_string; return; }
      case ARTL_ART_value_275: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet7[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal value: match production*/
      case ARTL_ART_value_277: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_value_279, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_number; return; }
      case ARTL_ART_value_279: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet7[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal value: match production*/
      case ARTL_ART_value_281: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_value_283, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_object; return; }
      case ARTL_ART_value_283: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet7[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal value: match production*/
      case ARTL_ART_value_285: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_value_287, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_array; return; }
      case ARTL_ART_value_287: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet7[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal value: match production*/
      case ARTL_ART_value_289: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_value_291, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_null; return; }
      case ARTL_ART_value_291: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet7[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal value: match production*/
      case ARTL_ART_value_293: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_value_295, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_boolean; return; }
      case ARTL_ART_value_295: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet7[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal value: match production*/
      case ARTL_ART_value_297: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_value_299, artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_bson_id; return; }
      case ARTL_ART_value_299: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet7[artLexer.artInputPairBuffer[artLexer.artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artLexer.artCurrentInputIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void artParseGenerated(String artCharacterString, int artStartLabel) throws ARTException {
    String artCharacterStringInput = artCharacterString + "\0";
    artStartSymbolLabel = artStartLabel;
    artIsInLanguage = false;
    artLexer.artLexicaliseUsingLongestMatch(artCharacterStringInput);
    artDummySPPFNode = artFindSPPFInitial(ARTL_DUMMY, 0, 0);
    artCurrentSPPFNode = artDummySPPFNode;
    artRootGSSNode = artFindGSS(ARTL_EOS, 0, 0, 0);
    artCurrentGSSNode = artRootGSSNode;
    artStartClock();
    artCurrentRestartLabel = artStartSymbolLabel;
    artLexer.artCurrentInputIndex = 0;
    artLexer.artCurrentInputPairReference = 0;
    while (true)
      switch (artlhsL[artCurrentRestartLabel]) {
        case ARTL_ART_O_array_values: 
          ARTPF_ART_O_array_values();
          break;
        case ARTL_ART_O_exponent: 
          ARTPF_ART_O_exponent();
          break;
        case ARTL_ART_O_fraction: 
          ARTPF_ART_O_fraction();
          break;
        case ARTL_ART_O_members: 
          ARTPF_ART_O_members();
          break;
        case ARTL_ART_O_minus: 
          ARTPF_ART_O_minus();
          break;
        case ARTL_ART_O_sign: 
          ARTPF_ART_O_sign();
          break;
        case ARTL_ART_array: 
          ARTPF_ART_array();
          break;
        case ARTL_ART_array_values: 
          ARTPF_ART_array_values();
          break;
        case ARTL_ART_boolean: 
          ARTPF_ART_boolean();
          break;
        case ARTL_ART_bson_id: 
          ARTPF_ART_bson_id();
          break;
        case ARTL_ART_bson_no_quote: 
          ARTPF_ART_bson_no_quote();
          break;
        case ARTL_ART_digit: 
          ARTPF_ART_digit();
          break;
        case ARTL_ART_digits: 
          ARTPF_ART_digits();
          break;
        case ARTL_ART_exp_letter: 
          ARTPF_ART_exp_letter();
          break;
        case ARTL_ART_id_number: 
          ARTPF_ART_id_number();
          break;
        case ARTL_ART_key: 
          ARTPF_ART_key();
          break;
        case ARTL_ART_members: 
          ARTPF_ART_members();
          break;
        case ARTL_ART_no_leading_zeros: 
          ARTPF_ART_no_leading_zeros();
          break;
        case ARTL_ART_non_zero_digits: 
          ARTPF_ART_non_zero_digits();
          break;
        case ARTL_ART_null: 
          ARTPF_ART_null();
          break;
        case ARTL_ART_number: 
          ARTPF_ART_number();
          break;
        case ARTL_ART_object: 
          ARTPF_ART_object();
          break;
        case ARTL_ART_pair: 
          ARTPF_ART_pair();
          break;
        case ARTL_ART_string: 
          ARTPF_ART_string();
          break;
        case ARTL_ART_value: 
          ARTPF_ART_value();
          break;
        case ARTX_DESPATCH: 
          if (artNoDescriptors()) { 
            artCheckAcceptance();
            artStopClock();
            return;
           }
          artUnloadDescriptor();
      }
  }

  public void ARTSet1initialise() {
    ARTSet1 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet1, 0, artSetExtent, false);
  }

  public void ARTSet8initialise() {
    ARTSet8 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet8, 0, artSetExtent, false);
    ARTSet8[30] = true;
  }

  public void ARTSet24initialise() {
    ARTSet24 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet24, 0, artSetExtent, false);
    ARTSet24[8] = true;
    ARTSet24[24] = true;
  }

  public void ARTSet35initialise() {
    ARTSet35 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet35, 0, artSetExtent, false);
    ARTSet35[4] = true;
  }

  public void ARTSet15initialise() {
    ARTSet15 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet15, 0, artSetExtent, false);
    ARTSet15[1] = true;
    ARTSet15[2] = true;
    ARTSet15[4] = true;
    ARTSet15[11] = true;
    ARTSet15[12] = true;
    ARTSet15[13] = true;
    ARTSet15[14] = true;
    ARTSet15[15] = true;
    ARTSet15[16] = true;
    ARTSet15[17] = true;
    ARTSet15[18] = true;
    ARTSet15[19] = true;
    ARTSet15[20] = true;
    ARTSet15[31] = true;
  }

  public void ARTSet2initialise() {
    ARTSet2 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet2, 0, artSetExtent, false);
    ARTSet2[2] = true;
    ARTSet2[9] = true;
    ARTSet2[11] = true;
    ARTSet2[12] = true;
    ARTSet2[13] = true;
    ARTSet2[14] = true;
    ARTSet2[15] = true;
    ARTSet2[16] = true;
    ARTSet2[17] = true;
    ARTSet2[18] = true;
    ARTSet2[19] = true;
    ARTSet2[20] = true;
    ARTSet2[22] = true;
    ARTSet2[23] = true;
    ARTSet2[25] = true;
    ARTSet2[26] = true;
    ARTSet2[27] = true;
    ARTSet2[28] = true;
    ARTSet2[31] = true;
  }

  public void ARTSet18initialise() {
    ARTSet18 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet18, 0, artSetExtent, false);
    ARTSet18[9] = true;
    ARTSet18[31] = true;
  }

  public void ARTSet12initialise() {
    ARTSet12 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet12, 0, artSetExtent, false);
    ARTSet12[10] = true;
    ARTSet12[31] = true;
  }

  public void ARTSet54initialise() {
    ARTSet54 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet54, 0, artSetExtent, false);
    ARTSet54[10] = true;
    ARTSet54[30] = true;
    ARTSet54[31] = true;
  }

  public void ARTSet23initialise() {
    ARTSet23 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet23, 0, artSetExtent, false);
    ARTSet23[2] = true;
    ARTSet23[9] = true;
    ARTSet23[11] = true;
    ARTSet23[12] = true;
    ARTSet23[13] = true;
    ARTSet23[14] = true;
    ARTSet23[15] = true;
    ARTSet23[16] = true;
    ARTSet23[17] = true;
    ARTSet23[18] = true;
    ARTSet23[19] = true;
    ARTSet23[20] = true;
    ARTSet23[22] = true;
    ARTSet23[23] = true;
    ARTSet23[24] = true;
    ARTSet23[25] = true;
    ARTSet23[26] = true;
    ARTSet23[27] = true;
    ARTSet23[28] = true;
  }

  public void ARTSet36initialise() {
    ARTSet36 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet36, 0, artSetExtent, false);
    ARTSet36[5] = true;
  }

  public void ARTSet37initialise() {
    ARTSet37 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet37, 0, artSetExtent, false);
    ARTSet37[0] = true;
    ARTSet37[5] = true;
    ARTSet37[8] = true;
    ARTSet37[10] = true;
    ARTSet37[11] = true;
    ARTSet37[12] = true;
    ARTSet37[13] = true;
    ARTSet37[14] = true;
    ARTSet37[15] = true;
    ARTSet37[16] = true;
    ARTSet37[17] = true;
    ARTSet37[18] = true;
    ARTSet37[19] = true;
    ARTSet37[20] = true;
    ARTSet37[21] = true;
    ARTSet37[24] = true;
    ARTSet37[29] = true;
    ARTSet37[30] = true;
  }

  public void ARTSet21initialise() {
    ARTSet21 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet21, 0, artSetExtent, false);
    ARTSet21[9] = true;
    ARTSet21[11] = true;
    ARTSet21[12] = true;
    ARTSet21[13] = true;
    ARTSet21[14] = true;
    ARTSet21[15] = true;
    ARTSet21[16] = true;
    ARTSet21[17] = true;
    ARTSet21[18] = true;
    ARTSet21[19] = true;
    ARTSet21[20] = true;
  }

  public void ARTSet42initialise() {
    ARTSet42 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet42, 0, artSetExtent, false);
    ARTSet42[8] = true;
    ARTSet42[29] = true;
  }

  public void ARTSet56initialise() {
    ARTSet56 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet56, 0, artSetExtent, false);
    ARTSet56[1] = true;
    ARTSet56[2] = true;
    ARTSet56[4] = true;
    ARTSet56[11] = true;
    ARTSet56[12] = true;
    ARTSet56[13] = true;
    ARTSet56[14] = true;
    ARTSet56[15] = true;
    ARTSet56[16] = true;
    ARTSet56[17] = true;
    ARTSet56[18] = true;
    ARTSet56[19] = true;
    ARTSet56[20] = true;
    ARTSet56[29] = true;
  }

  public void ARTSet29initialise() {
    ARTSet29 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet29, 0, artSetExtent, false);
    ARTSet29[22] = true;
  }

  public void ARTSet31initialise() {
    ARTSet31 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet31, 0, artSetExtent, false);
    ARTSet31[6] = true;
  }

  public void ARTSet20initialise() {
    ARTSet20 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet20, 0, artSetExtent, false);
    ARTSet20[7] = true;
  }

  public void ARTSet17initialise() {
    ARTSet17 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet17, 0, artSetExtent, false);
    ARTSet17[1] = true;
    ARTSet17[2] = true;
    ARTSet17[4] = true;
    ARTSet17[11] = true;
    ARTSet17[12] = true;
    ARTSet17[13] = true;
    ARTSet17[14] = true;
    ARTSet17[15] = true;
    ARTSet17[16] = true;
    ARTSet17[17] = true;
    ARTSet17[18] = true;
    ARTSet17[19] = true;
    ARTSet17[20] = true;
  }

  public void ARTSet25initialise() {
    ARTSet25 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet25, 0, artSetExtent, false);
    ARTSet25[8] = true;
  }

  public void ARTSet26initialise() {
    ARTSet26 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet26, 0, artSetExtent, false);
    ARTSet26[25] = true;
    ARTSet26[27] = true;
  }

  public void ARTSet19initialise() {
    ARTSet19 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet19, 0, artSetExtent, false);
    ARTSet19[9] = true;
  }

  public void ARTSet14initialise() {
    ARTSet14 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet14, 0, artSetExtent, false);
    ARTSet14[10] = true;
  }

  public void ARTSet38initialise() {
    ARTSet38 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet38, 0, artSetExtent, false);
    ARTSet38[11] = true;
  }

  public void ARTSet10initialise() {
    ARTSet10 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet10, 0, artSetExtent, false);
    ARTSet10[7] = true;
    ARTSet10[9] = true;
    ARTSet10[31] = true;
  }

  public void ARTSet44initialise() {
    ARTSet44 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet44, 0, artSetExtent, false);
    ARTSet44[12] = true;
  }

  public void ARTSet45initialise() {
    ARTSet45 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet45, 0, artSetExtent, false);
    ARTSet45[13] = true;
  }

  public void ARTSet46initialise() {
    ARTSet46 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet46, 0, artSetExtent, false);
    ARTSet46[14] = true;
  }

  public void ARTSet47initialise() {
    ARTSet47 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet47, 0, artSetExtent, false);
    ARTSet47[15] = true;
  }

  public void ARTSet53initialise() {
    ARTSet53 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet53, 0, artSetExtent, false);
    ARTSet53[26] = true;
  }

  public void ARTSet48initialise() {
    ARTSet48 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet48, 0, artSetExtent, false);
    ARTSet48[16] = true;
  }

  public void ARTSet49initialise() {
    ARTSet49 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet49, 0, artSetExtent, false);
    ARTSet49[17] = true;
  }

  public void ARTSet50initialise() {
    ARTSet50 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet50, 0, artSetExtent, false);
    ARTSet50[18] = true;
  }

  public void ARTSet51initialise() {
    ARTSet51 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet51, 0, artSetExtent, false);
    ARTSet51[19] = true;
  }

  public void ARTSet9initialise() {
    ARTSet9 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet9, 0, artSetExtent, false);
    ARTSet9[7] = true;
    ARTSet9[9] = true;
    ARTSet9[11] = true;
    ARTSet9[12] = true;
    ARTSet9[13] = true;
    ARTSet9[14] = true;
    ARTSet9[15] = true;
    ARTSet9[16] = true;
    ARTSet9[17] = true;
    ARTSet9[18] = true;
    ARTSet9[19] = true;
    ARTSet9[20] = true;
  }

  public void ARTSet52initialise() {
    ARTSet52 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet52, 0, artSetExtent, false);
    ARTSet52[20] = true;
  }

  public void ARTSet40initialise() {
    ARTSet40 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet40, 0, artSetExtent, false);
    ARTSet40[21] = true;
  }

  public void ARTSet39initialise() {
    ARTSet39 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet39, 0, artSetExtent, false);
    ARTSet39[12] = true;
    ARTSet39[13] = true;
    ARTSet39[14] = true;
    ARTSet39[15] = true;
    ARTSet39[16] = true;
    ARTSet39[17] = true;
    ARTSet39[18] = true;
    ARTSet39[19] = true;
    ARTSet39[20] = true;
  }

  public void ARTSet27initialise() {
    ARTSet27 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet27, 0, artSetExtent, false);
    ARTSet27[27] = true;
  }

  public void ARTSet7initialise() {
    ARTSet7 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet7, 0, artSetExtent, false);
    ARTSet7[0] = true;
    ARTSet7[8] = true;
    ARTSet7[24] = true;
    ARTSet7[29] = true;
  }

  public void ARTSet13initialise() {
    ARTSet13 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet13, 0, artSetExtent, false);
    ARTSet13[0] = true;
    ARTSet13[8] = true;
    ARTSet13[24] = true;
    ARTSet13[29] = true;
    ARTSet13[30] = true;
  }

  public void ARTSet32initialise() {
    ARTSet32 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet32, 0, artSetExtent, false);
    ARTSet32[1] = true;
    ARTSet32[4] = true;
    ARTSet32[11] = true;
    ARTSet32[12] = true;
    ARTSet32[13] = true;
    ARTSet32[14] = true;
    ARTSet32[15] = true;
    ARTSet32[16] = true;
    ARTSet32[17] = true;
    ARTSet32[18] = true;
    ARTSet32[19] = true;
    ARTSet32[20] = true;
  }

  public void ARTSet33initialise() {
    ARTSet33 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet33, 0, artSetExtent, false);
    ARTSet33[5] = true;
    ARTSet33[21] = true;
  }

  public void ARTSet28initialise() {
    ARTSet28 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet28, 0, artSetExtent, false);
    ARTSet28[25] = true;
  }

  public void ARTSet22initialise() {
    ARTSet22 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet22, 0, artSetExtent, false);
    ARTSet22[23] = true;
  }

  public void ARTSet3initialise() {
    ARTSet3 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet3, 0, artSetExtent, false);
    ARTSet3[24] = true;
  }

  public void ARTSet34initialise() {
    ARTSet34 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet34, 0, artSetExtent, false);
    ARTSet34[1] = true;
  }

  public void ARTSet30initialise() {
    ARTSet30 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet30, 0, artSetExtent, false);
    ARTSet30[3] = true;
  }

  public void ARTSet5initialise() {
    ARTSet5 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet5, 0, artSetExtent, false);
    ARTSet5[31] = true;
  }

  public void ARTSet6initialise() {
    ARTSet6 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet6, 0, artSetExtent, false);
    ARTSet6[30] = true;
    ARTSet6[31] = true;
  }

  public void ARTSet4initialise() {
    ARTSet4 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet4, 0, artSetExtent, false);
    ARTSet4[2] = true;
    ARTSet4[9] = true;
    ARTSet4[11] = true;
    ARTSet4[12] = true;
    ARTSet4[13] = true;
    ARTSet4[14] = true;
    ARTSet4[15] = true;
    ARTSet4[16] = true;
    ARTSet4[17] = true;
    ARTSet4[18] = true;
    ARTSet4[19] = true;
    ARTSet4[20] = true;
    ARTSet4[22] = true;
    ARTSet4[23] = true;
    ARTSet4[25] = true;
    ARTSet4[26] = true;
    ARTSet4[27] = true;
    ARTSet4[28] = true;
  }

  public void ARTSet11initialise() {
    ARTSet11 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet11, 0, artSetExtent, false);
    ARTSet11[11] = true;
    ARTSet11[12] = true;
    ARTSet11[13] = true;
    ARTSet11[14] = true;
    ARTSet11[15] = true;
    ARTSet11[16] = true;
    ARTSet11[17] = true;
    ARTSet11[18] = true;
    ARTSet11[19] = true;
    ARTSet11[20] = true;
  }

  public void ARTSet43initialise() {
    ARTSet43 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet43, 0, artSetExtent, false);
    ARTSet43[0] = true;
    ARTSet43[8] = true;
    ARTSet43[10] = true;
    ARTSet43[24] = true;
    ARTSet43[29] = true;
    ARTSet43[30] = true;
  }

  public void ARTSet41initialise() {
    ARTSet41 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet41, 0, artSetExtent, false);
    ARTSet41[2] = true;
  }

  public void ARTSet57initialise() {
    ARTSet57 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet57, 0, artSetExtent, false);
    ARTSet57[0] = true;
    ARTSet57[8] = true;
    ARTSet57[21] = true;
    ARTSet57[24] = true;
    ARTSet57[29] = true;
  }

  public void ARTSet55initialise() {
    ARTSet55 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet55, 0, artSetExtent, false);
    ARTSet55[28] = true;
  }

  public void ARTSet16initialise() {
    ARTSet16 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet16, 0, artSetExtent, false);
    ARTSet16[29] = true;
  }

  public void artSetInitialise() {
    ARTSet1initialise();
    ARTSet8initialise();
    ARTSet24initialise();
    ARTSet35initialise();
    ARTSet15initialise();
    ARTSet2initialise();
    ARTSet18initialise();
    ARTSet12initialise();
    ARTSet54initialise();
    ARTSet23initialise();
    ARTSet36initialise();
    ARTSet37initialise();
    ARTSet21initialise();
    ARTSet42initialise();
    ARTSet56initialise();
    ARTSet29initialise();
    ARTSet31initialise();
    ARTSet20initialise();
    ARTSet17initialise();
    ARTSet25initialise();
    ARTSet26initialise();
    ARTSet19initialise();
    ARTSet14initialise();
    ARTSet38initialise();
    ARTSet10initialise();
    ARTSet44initialise();
    ARTSet45initialise();
    ARTSet46initialise();
    ARTSet47initialise();
    ARTSet53initialise();
    ARTSet48initialise();
    ARTSet49initialise();
    ARTSet50initialise();
    ARTSet51initialise();
    ARTSet9initialise();
    ARTSet52initialise();
    ARTSet40initialise();
    ARTSet39initialise();
    ARTSet27initialise();
    ARTSet7initialise();
    ARTSet13initialise();
    ARTSet32initialise();
    ARTSet33initialise();
    ARTSet28initialise();
    ARTSet22initialise();
    ARTSet3initialise();
    ARTSet34initialise();
    ARTSet30initialise();
    ARTSet5initialise();
    ARTSet6initialise();
    ARTSet4initialise();
    ARTSet11initialise();
    ARTSet43initialise();
    ARTSet41initialise();
    ARTSet57initialise();
    ARTSet55initialise();
    ARTSet16initialise();
  }

  public void artTableInitialiser_ART_O_array_values() {
    artLabelInternalStrings[ARTL_ART_O_array_values] = "O_array_values";
    artLabelStrings[ARTL_ART_O_array_values] = "O_array_values";
    artKindOfs[ARTL_ART_O_array_values] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_O_array_values_5] = "O_array_values ::= . array_values ";
    artLabelStrings[ARTL_ART_O_array_values_5] = "";
    artlhsL[ARTL_ART_O_array_values_5] = ARTL_ART_O_array_values;
    artKindOfs[ARTL_ART_O_array_values_5] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_O_array_values_7] = "O_array_values ::= array_values .";
    artLabelStrings[ARTL_ART_O_array_values_7] = "";
    artlhsL[ARTL_ART_O_array_values_7] = ARTL_ART_O_array_values;
    artSlotInstanceOfs[ARTL_ART_O_array_values_7] = ARTL_ART_array_values;
    artKindOfs[ARTL_ART_O_array_values_7] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_O_array_values_7] = true;
    arteoR_pL[ARTL_ART_O_array_values_7] = true;
    artPopD[ARTL_ART_O_array_values_7] = true;
    artLabelInternalStrings[ARTL_ART_O_array_values_9] = "O_array_values ::= . # ";
    artLabelStrings[ARTL_ART_O_array_values_9] = "";
    artlhsL[ARTL_ART_O_array_values_9] = ARTL_ART_O_array_values;
    artKindOfs[ARTL_ART_O_array_values_9] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_O_array_values_9] = true;
    artLabelInternalStrings[ARTL_ART_O_array_values_11] = "O_array_values ::= # .";
    artLabelStrings[ARTL_ART_O_array_values_11] = "";
    artlhsL[ARTL_ART_O_array_values_11] = ARTL_ART_O_array_values;
    artKindOfs[ARTL_ART_O_array_values_11] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_O_array_values_11] = true;
    arteoR_pL[ARTL_ART_O_array_values_11] = true;
    artPopD[ARTL_ART_O_array_values_11] = true;
  }

  public void artTableInitialiser_ART_O_exponent() {
    artLabelInternalStrings[ARTL_ART_O_exponent] = "O_exponent";
    artLabelStrings[ARTL_ART_O_exponent] = "O_exponent";
    artKindOfs[ARTL_ART_O_exponent] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_O_exponent_14] = "O_exponent ::= . exp_letter O_sign digits ";
    artLabelStrings[ARTL_ART_O_exponent_14] = "";
    artlhsL[ARTL_ART_O_exponent_14] = ARTL_ART_O_exponent;
    artKindOfs[ARTL_ART_O_exponent_14] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_O_exponent_16] = "O_exponent ::= exp_letter . O_sign digits ";
    artLabelStrings[ARTL_ART_O_exponent_16] = "";
    artlhsL[ARTL_ART_O_exponent_16] = ARTL_ART_O_exponent;
    artSlotInstanceOfs[ARTL_ART_O_exponent_16] = ARTL_ART_exp_letter;
    artKindOfs[ARTL_ART_O_exponent_16] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_O_exponent_16] = true;
    artLabelInternalStrings[ARTL_ART_O_exponent_18] = "O_exponent ::= exp_letter O_sign . digits ";
    artLabelStrings[ARTL_ART_O_exponent_18] = "";
    artlhsL[ARTL_ART_O_exponent_18] = ARTL_ART_O_exponent;
    artSlotInstanceOfs[ARTL_ART_O_exponent_18] = ARTL_ART_O_sign;
    artKindOfs[ARTL_ART_O_exponent_18] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_O_exponent_20] = "O_exponent ::= exp_letter O_sign digits .";
    artLabelStrings[ARTL_ART_O_exponent_20] = "";
    artlhsL[ARTL_ART_O_exponent_20] = ARTL_ART_O_exponent;
    artSlotInstanceOfs[ARTL_ART_O_exponent_20] = ARTL_ART_digits;
    artKindOfs[ARTL_ART_O_exponent_20] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_O_exponent_20] = true;
    arteoR_pL[ARTL_ART_O_exponent_20] = true;
    artPopD[ARTL_ART_O_exponent_20] = true;
    artLabelInternalStrings[ARTL_ART_O_exponent_22] = "O_exponent ::= . # ";
    artLabelStrings[ARTL_ART_O_exponent_22] = "";
    artlhsL[ARTL_ART_O_exponent_22] = ARTL_ART_O_exponent;
    artKindOfs[ARTL_ART_O_exponent_22] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_O_exponent_22] = true;
    artLabelInternalStrings[ARTL_ART_O_exponent_24] = "O_exponent ::= # .";
    artLabelStrings[ARTL_ART_O_exponent_24] = "";
    artlhsL[ARTL_ART_O_exponent_24] = ARTL_ART_O_exponent;
    artKindOfs[ARTL_ART_O_exponent_24] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_O_exponent_24] = true;
    arteoR_pL[ARTL_ART_O_exponent_24] = true;
    artPopD[ARTL_ART_O_exponent_24] = true;
  }

  public void artTableInitialiser_ART_O_fraction() {
    artLabelInternalStrings[ARTL_ART_O_fraction] = "O_fraction";
    artLabelStrings[ARTL_ART_O_fraction] = "O_fraction";
    artKindOfs[ARTL_ART_O_fraction] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_O_fraction_27] = "O_fraction ::= . '.' digits ";
    artLabelStrings[ARTL_ART_O_fraction_27] = "";
    artlhsL[ARTL_ART_O_fraction_27] = ARTL_ART_O_fraction;
    artKindOfs[ARTL_ART_O_fraction_27] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_O_fraction_28] = "O_fraction ::= '.' digits ";
    artLabelStrings[ARTL_ART_O_fraction_28] = "";
    artlhsL[ARTL_ART_O_fraction_28] = ARTL_ART_O_fraction;
    artLabelInternalStrings[ARTL_ART_O_fraction_29] = "O_fraction ::= '.' . digits ";
    artLabelStrings[ARTL_ART_O_fraction_29] = "";
    artlhsL[ARTL_ART_O_fraction_29] = ARTL_ART_O_fraction;
    artKindOfs[ARTL_ART_O_fraction_29] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_O_fraction_29] = true;
    artLabelInternalStrings[ARTL_ART_O_fraction_31] = "O_fraction ::= '.' digits .";
    artLabelStrings[ARTL_ART_O_fraction_31] = "";
    artlhsL[ARTL_ART_O_fraction_31] = ARTL_ART_O_fraction;
    artSlotInstanceOfs[ARTL_ART_O_fraction_31] = ARTL_ART_digits;
    artKindOfs[ARTL_ART_O_fraction_31] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_O_fraction_31] = true;
    arteoR_pL[ARTL_ART_O_fraction_31] = true;
    artPopD[ARTL_ART_O_fraction_31] = true;
    artLabelInternalStrings[ARTL_ART_O_fraction_33] = "O_fraction ::= . # ";
    artLabelStrings[ARTL_ART_O_fraction_33] = "";
    artlhsL[ARTL_ART_O_fraction_33] = ARTL_ART_O_fraction;
    artKindOfs[ARTL_ART_O_fraction_33] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_O_fraction_33] = true;
    artLabelInternalStrings[ARTL_ART_O_fraction_35] = "O_fraction ::= # .";
    artLabelStrings[ARTL_ART_O_fraction_35] = "";
    artlhsL[ARTL_ART_O_fraction_35] = ARTL_ART_O_fraction;
    artKindOfs[ARTL_ART_O_fraction_35] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_O_fraction_35] = true;
    arteoR_pL[ARTL_ART_O_fraction_35] = true;
    artPopD[ARTL_ART_O_fraction_35] = true;
  }

  public void artTableInitialiser_ART_O_members() {
    artLabelInternalStrings[ARTL_ART_O_members] = "O_members";
    artLabelStrings[ARTL_ART_O_members] = "O_members";
    artKindOfs[ARTL_ART_O_members] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_O_members_38] = "O_members ::= . members ";
    artLabelStrings[ARTL_ART_O_members_38] = "";
    artlhsL[ARTL_ART_O_members_38] = ARTL_ART_O_members;
    artKindOfs[ARTL_ART_O_members_38] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_O_members_40] = "O_members ::= members .";
    artLabelStrings[ARTL_ART_O_members_40] = "";
    artlhsL[ARTL_ART_O_members_40] = ARTL_ART_O_members;
    artSlotInstanceOfs[ARTL_ART_O_members_40] = ARTL_ART_members;
    artKindOfs[ARTL_ART_O_members_40] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_O_members_40] = true;
    arteoR_pL[ARTL_ART_O_members_40] = true;
    artPopD[ARTL_ART_O_members_40] = true;
    artLabelInternalStrings[ARTL_ART_O_members_42] = "O_members ::= . # ";
    artLabelStrings[ARTL_ART_O_members_42] = "";
    artlhsL[ARTL_ART_O_members_42] = ARTL_ART_O_members;
    artKindOfs[ARTL_ART_O_members_42] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_O_members_42] = true;
    artLabelInternalStrings[ARTL_ART_O_members_44] = "O_members ::= # .";
    artLabelStrings[ARTL_ART_O_members_44] = "";
    artlhsL[ARTL_ART_O_members_44] = ARTL_ART_O_members;
    artKindOfs[ARTL_ART_O_members_44] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_O_members_44] = true;
    arteoR_pL[ARTL_ART_O_members_44] = true;
    artPopD[ARTL_ART_O_members_44] = true;
  }

  public void artTableInitialiser_ART_O_minus() {
    artLabelInternalStrings[ARTL_ART_O_minus] = "O_minus";
    artLabelStrings[ARTL_ART_O_minus] = "O_minus";
    artKindOfs[ARTL_ART_O_minus] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_O_minus_47] = "O_minus ::= . '-' ";
    artLabelStrings[ARTL_ART_O_minus_47] = "";
    artlhsL[ARTL_ART_O_minus_47] = ARTL_ART_O_minus;
    artKindOfs[ARTL_ART_O_minus_47] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_O_minus_47] = true;
    artLabelInternalStrings[ARTL_ART_O_minus_48] = "O_minus ::= '-' ";
    artLabelStrings[ARTL_ART_O_minus_48] = "";
    artlhsL[ARTL_ART_O_minus_48] = ARTL_ART_O_minus;
    artPopD[ARTL_ART_O_minus_48] = true;
    artLabelInternalStrings[ARTL_ART_O_minus_49] = "O_minus ::= '-' .";
    artLabelStrings[ARTL_ART_O_minus_49] = "";
    artlhsL[ARTL_ART_O_minus_49] = ARTL_ART_O_minus;
    artKindOfs[ARTL_ART_O_minus_49] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_O_minus_49] = true;
    arteoR_pL[ARTL_ART_O_minus_49] = true;
    artPopD[ARTL_ART_O_minus_49] = true;
    artLabelInternalStrings[ARTL_ART_O_minus_51] = "O_minus ::= . # ";
    artLabelStrings[ARTL_ART_O_minus_51] = "";
    artlhsL[ARTL_ART_O_minus_51] = ARTL_ART_O_minus;
    artKindOfs[ARTL_ART_O_minus_51] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_O_minus_51] = true;
    artLabelInternalStrings[ARTL_ART_O_minus_53] = "O_minus ::= # .";
    artLabelStrings[ARTL_ART_O_minus_53] = "";
    artlhsL[ARTL_ART_O_minus_53] = ARTL_ART_O_minus;
    artKindOfs[ARTL_ART_O_minus_53] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_O_minus_53] = true;
    arteoR_pL[ARTL_ART_O_minus_53] = true;
    artPopD[ARTL_ART_O_minus_53] = true;
  }

  public void artTableInitialiser_ART_O_sign() {
    artLabelInternalStrings[ARTL_ART_O_sign] = "O_sign";
    artLabelStrings[ARTL_ART_O_sign] = "O_sign";
    artKindOfs[ARTL_ART_O_sign] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_O_sign_56] = "O_sign ::= . '+' ";
    artLabelStrings[ARTL_ART_O_sign_56] = "";
    artlhsL[ARTL_ART_O_sign_56] = ARTL_ART_O_sign;
    artKindOfs[ARTL_ART_O_sign_56] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_O_sign_56] = true;
    artLabelInternalStrings[ARTL_ART_O_sign_57] = "O_sign ::= '+' ";
    artLabelStrings[ARTL_ART_O_sign_57] = "";
    artlhsL[ARTL_ART_O_sign_57] = ARTL_ART_O_sign;
    artPopD[ARTL_ART_O_sign_57] = true;
    artLabelInternalStrings[ARTL_ART_O_sign_58] = "O_sign ::= '+' .";
    artLabelStrings[ARTL_ART_O_sign_58] = "";
    artlhsL[ARTL_ART_O_sign_58] = ARTL_ART_O_sign;
    artKindOfs[ARTL_ART_O_sign_58] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_O_sign_58] = true;
    arteoR_pL[ARTL_ART_O_sign_58] = true;
    artPopD[ARTL_ART_O_sign_58] = true;
    artLabelInternalStrings[ARTL_ART_O_sign_60] = "O_sign ::= . O_minus ";
    artLabelStrings[ARTL_ART_O_sign_60] = "";
    artlhsL[ARTL_ART_O_sign_60] = ARTL_ART_O_sign;
    artKindOfs[ARTL_ART_O_sign_60] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_O_sign_62] = "O_sign ::= O_minus .";
    artLabelStrings[ARTL_ART_O_sign_62] = "";
    artlhsL[ARTL_ART_O_sign_62] = ARTL_ART_O_sign;
    artSlotInstanceOfs[ARTL_ART_O_sign_62] = ARTL_ART_O_minus;
    artKindOfs[ARTL_ART_O_sign_62] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_O_sign_62] = true;
    arteoR_pL[ARTL_ART_O_sign_62] = true;
    artPopD[ARTL_ART_O_sign_62] = true;
  }

  public void artTableInitialiser_ART_array() {
    artLabelInternalStrings[ARTL_ART_array] = "array";
    artLabelStrings[ARTL_ART_array] = "array";
    artKindOfs[ARTL_ART_array] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_array_65] = "array ::= . '[' O_array_values ']' ";
    artLabelStrings[ARTL_ART_array_65] = "";
    artlhsL[ARTL_ART_array_65] = ARTL_ART_array;
    artKindOfs[ARTL_ART_array_65] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_array_66] = "array ::= '[' O_array_values ']' ";
    artLabelStrings[ARTL_ART_array_66] = "";
    artlhsL[ARTL_ART_array_66] = ARTL_ART_array;
    artLabelInternalStrings[ARTL_ART_array_67] = "array ::= '[' . O_array_values ']' ";
    artLabelStrings[ARTL_ART_array_67] = "";
    artlhsL[ARTL_ART_array_67] = ARTL_ART_array;
    artKindOfs[ARTL_ART_array_67] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_array_67] = true;
    artLabelInternalStrings[ARTL_ART_array_69] = "array ::= '[' O_array_values . ']' ";
    artLabelStrings[ARTL_ART_array_69] = "";
    artlhsL[ARTL_ART_array_69] = ARTL_ART_array;
    artSlotInstanceOfs[ARTL_ART_array_69] = ARTL_ART_O_array_values;
    artKindOfs[ARTL_ART_array_69] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_array_69] = true;
    artLabelInternalStrings[ARTL_ART_array_70] = "array ::= '[' O_array_values ']' ";
    artLabelStrings[ARTL_ART_array_70] = "";
    artlhsL[ARTL_ART_array_70] = ARTL_ART_array;
    artPopD[ARTL_ART_array_70] = true;
    artLabelInternalStrings[ARTL_ART_array_71] = "array ::= '[' O_array_values ']' .";
    artLabelStrings[ARTL_ART_array_71] = "";
    artlhsL[ARTL_ART_array_71] = ARTL_ART_array;
    artKindOfs[ARTL_ART_array_71] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_array_71] = true;
    arteoR_pL[ARTL_ART_array_71] = true;
    artPopD[ARTL_ART_array_71] = true;
  }

  public void artTableInitialiser_ART_array_values() {
    artLabelInternalStrings[ARTL_ART_array_values] = "array_values";
    artLabelStrings[ARTL_ART_array_values] = "array_values";
    artKindOfs[ARTL_ART_array_values] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_array_values_74] = "array_values ::= . value ";
    artLabelStrings[ARTL_ART_array_values_74] = "";
    artlhsL[ARTL_ART_array_values_74] = ARTL_ART_array_values;
    artKindOfs[ARTL_ART_array_values_74] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_array_values_76] = "array_values ::= value .";
    artLabelStrings[ARTL_ART_array_values_76] = "";
    artlhsL[ARTL_ART_array_values_76] = ARTL_ART_array_values;
    artSlotInstanceOfs[ARTL_ART_array_values_76] = ARTL_ART_value;
    artKindOfs[ARTL_ART_array_values_76] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_array_values_76] = true;
    arteoR_pL[ARTL_ART_array_values_76] = true;
    artPopD[ARTL_ART_array_values_76] = true;
    artLabelInternalStrings[ARTL_ART_array_values_78] = "array_values ::= . array_values ',' value ";
    artLabelStrings[ARTL_ART_array_values_78] = "";
    artlhsL[ARTL_ART_array_values_78] = ARTL_ART_array_values;
    artKindOfs[ARTL_ART_array_values_78] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_array_values_80] = "array_values ::= array_values . ',' value ";
    artLabelStrings[ARTL_ART_array_values_80] = "";
    artlhsL[ARTL_ART_array_values_80] = ARTL_ART_array_values;
    artSlotInstanceOfs[ARTL_ART_array_values_80] = ARTL_ART_array_values;
    artKindOfs[ARTL_ART_array_values_80] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_array_values_80] = true;
    artLabelInternalStrings[ARTL_ART_array_values_81] = "array_values ::= array_values ',' value ";
    artLabelStrings[ARTL_ART_array_values_81] = "";
    artlhsL[ARTL_ART_array_values_81] = ARTL_ART_array_values;
    artLabelInternalStrings[ARTL_ART_array_values_82] = "array_values ::= array_values ',' . value ";
    artLabelStrings[ARTL_ART_array_values_82] = "";
    artlhsL[ARTL_ART_array_values_82] = ARTL_ART_array_values;
    artKindOfs[ARTL_ART_array_values_82] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_array_values_84] = "array_values ::= array_values ',' value .";
    artLabelStrings[ARTL_ART_array_values_84] = "";
    artlhsL[ARTL_ART_array_values_84] = ARTL_ART_array_values;
    artSlotInstanceOfs[ARTL_ART_array_values_84] = ARTL_ART_value;
    artKindOfs[ARTL_ART_array_values_84] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_array_values_84] = true;
    arteoR_pL[ARTL_ART_array_values_84] = true;
    artPopD[ARTL_ART_array_values_84] = true;
  }

  public void artTableInitialiser_ART_boolean() {
    artLabelInternalStrings[ARTL_ART_boolean] = "boolean";
    artLabelStrings[ARTL_ART_boolean] = "boolean";
    artKindOfs[ARTL_ART_boolean] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_boolean_87] = "boolean ::= . 'true' ";
    artLabelStrings[ARTL_ART_boolean_87] = "";
    artlhsL[ARTL_ART_boolean_87] = ARTL_ART_boolean;
    artKindOfs[ARTL_ART_boolean_87] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_boolean_87] = true;
    artLabelInternalStrings[ARTL_ART_boolean_88] = "boolean ::= 'true' ";
    artLabelStrings[ARTL_ART_boolean_88] = "";
    artlhsL[ARTL_ART_boolean_88] = ARTL_ART_boolean;
    artPopD[ARTL_ART_boolean_88] = true;
    artLabelInternalStrings[ARTL_ART_boolean_89] = "boolean ::= 'true' .";
    artLabelStrings[ARTL_ART_boolean_89] = "";
    artlhsL[ARTL_ART_boolean_89] = ARTL_ART_boolean;
    artKindOfs[ARTL_ART_boolean_89] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_boolean_89] = true;
    arteoR_pL[ARTL_ART_boolean_89] = true;
    artPopD[ARTL_ART_boolean_89] = true;
    artLabelInternalStrings[ARTL_ART_boolean_91] = "boolean ::= . 'false' ";
    artLabelStrings[ARTL_ART_boolean_91] = "";
    artlhsL[ARTL_ART_boolean_91] = ARTL_ART_boolean;
    artKindOfs[ARTL_ART_boolean_91] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_boolean_91] = true;
    artLabelInternalStrings[ARTL_ART_boolean_92] = "boolean ::= 'false' ";
    artLabelStrings[ARTL_ART_boolean_92] = "";
    artlhsL[ARTL_ART_boolean_92] = ARTL_ART_boolean;
    artPopD[ARTL_ART_boolean_92] = true;
    artLabelInternalStrings[ARTL_ART_boolean_93] = "boolean ::= 'false' .";
    artLabelStrings[ARTL_ART_boolean_93] = "";
    artlhsL[ARTL_ART_boolean_93] = ARTL_ART_boolean;
    artKindOfs[ARTL_ART_boolean_93] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_boolean_93] = true;
    arteoR_pL[ARTL_ART_boolean_93] = true;
    artPopD[ARTL_ART_boolean_93] = true;
  }

  public void artTableInitialiser_ART_bson_id() {
    artLabelInternalStrings[ARTL_ART_bson_id] = "bson_id";
    artLabelStrings[ARTL_ART_bson_id] = "bson_id";
    artKindOfs[ARTL_ART_bson_id] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_bson_id_96] = "bson_id ::= . 'ObjectId(' id_number ')' ";
    artLabelStrings[ARTL_ART_bson_id_96] = "";
    artlhsL[ARTL_ART_bson_id_96] = ARTL_ART_bson_id;
    artKindOfs[ARTL_ART_bson_id_96] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_bson_id_97] = "bson_id ::= 'ObjectId(' id_number ')' ";
    artLabelStrings[ARTL_ART_bson_id_97] = "";
    artlhsL[ARTL_ART_bson_id_97] = ARTL_ART_bson_id;
    artLabelInternalStrings[ARTL_ART_bson_id_98] = "bson_id ::= 'ObjectId(' . id_number ')' ";
    artLabelStrings[ARTL_ART_bson_id_98] = "";
    artlhsL[ARTL_ART_bson_id_98] = ARTL_ART_bson_id;
    artKindOfs[ARTL_ART_bson_id_98] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_bson_id_98] = true;
    artLabelInternalStrings[ARTL_ART_bson_id_100] = "bson_id ::= 'ObjectId(' id_number . ')' ";
    artLabelStrings[ARTL_ART_bson_id_100] = "";
    artlhsL[ARTL_ART_bson_id_100] = ARTL_ART_bson_id;
    artSlotInstanceOfs[ARTL_ART_bson_id_100] = ARTL_ART_id_number;
    artKindOfs[ARTL_ART_bson_id_100] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_bson_id_100] = true;
    artLabelInternalStrings[ARTL_ART_bson_id_101] = "bson_id ::= 'ObjectId(' id_number ')' ";
    artLabelStrings[ARTL_ART_bson_id_101] = "";
    artlhsL[ARTL_ART_bson_id_101] = ARTL_ART_bson_id;
    artPopD[ARTL_ART_bson_id_101] = true;
    artLabelInternalStrings[ARTL_ART_bson_id_102] = "bson_id ::= 'ObjectId(' id_number ')' .";
    artLabelStrings[ARTL_ART_bson_id_102] = "";
    artlhsL[ARTL_ART_bson_id_102] = ARTL_ART_bson_id;
    artKindOfs[ARTL_ART_bson_id_102] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_bson_id_102] = true;
    arteoR_pL[ARTL_ART_bson_id_102] = true;
    artPopD[ARTL_ART_bson_id_102] = true;
  }

  public void artTableInitialiser_ART_bson_no_quote() {
    artLabelInternalStrings[ARTL_ART_bson_no_quote] = "bson_no_quote";
    artLabelStrings[ARTL_ART_bson_no_quote] = "bson_no_quote";
    artKindOfs[ARTL_ART_bson_no_quote] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_bson_no_quote_105] = "bson_no_quote ::= . &ID ";
    artLabelStrings[ARTL_ART_bson_no_quote_105] = "";
    artlhsL[ARTL_ART_bson_no_quote_105] = ARTL_ART_bson_no_quote;
    artKindOfs[ARTL_ART_bson_no_quote_105] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_bson_no_quote_105] = true;
    artLabelInternalStrings[ARTL_ART_bson_no_quote_106] = "bson_no_quote ::= &ID ";
    artLabelStrings[ARTL_ART_bson_no_quote_106] = "";
    artlhsL[ARTL_ART_bson_no_quote_106] = ARTL_ART_bson_no_quote;
    artPopD[ARTL_ART_bson_no_quote_106] = true;
    artLabelInternalStrings[ARTL_ART_bson_no_quote_107] = "bson_no_quote ::= &ID .";
    artLabelStrings[ARTL_ART_bson_no_quote_107] = "";
    artlhsL[ARTL_ART_bson_no_quote_107] = ARTL_ART_bson_no_quote;
    artKindOfs[ARTL_ART_bson_no_quote_107] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_bson_no_quote_107] = true;
    arteoR_pL[ARTL_ART_bson_no_quote_107] = true;
    artPopD[ARTL_ART_bson_no_quote_107] = true;
    artLabelInternalStrings[ARTL_ART_bson_no_quote_109] = "bson_no_quote ::= . digits ";
    artLabelStrings[ARTL_ART_bson_no_quote_109] = "";
    artlhsL[ARTL_ART_bson_no_quote_109] = ARTL_ART_bson_no_quote;
    artKindOfs[ARTL_ART_bson_no_quote_109] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_bson_no_quote_111] = "bson_no_quote ::= digits .";
    artLabelStrings[ARTL_ART_bson_no_quote_111] = "";
    artlhsL[ARTL_ART_bson_no_quote_111] = ARTL_ART_bson_no_quote;
    artSlotInstanceOfs[ARTL_ART_bson_no_quote_111] = ARTL_ART_digits;
    artKindOfs[ARTL_ART_bson_no_quote_111] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_bson_no_quote_111] = true;
    arteoR_pL[ARTL_ART_bson_no_quote_111] = true;
    artPopD[ARTL_ART_bson_no_quote_111] = true;
    artLabelInternalStrings[ARTL_ART_bson_no_quote_113] = "bson_no_quote ::= . `$ bson_no_quote ";
    artLabelStrings[ARTL_ART_bson_no_quote_113] = "";
    artlhsL[ARTL_ART_bson_no_quote_113] = ARTL_ART_bson_no_quote;
    artKindOfs[ARTL_ART_bson_no_quote_113] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_bson_no_quote_114] = "bson_no_quote ::= `$ bson_no_quote ";
    artLabelStrings[ARTL_ART_bson_no_quote_114] = "";
    artlhsL[ARTL_ART_bson_no_quote_114] = ARTL_ART_bson_no_quote;
    artLabelInternalStrings[ARTL_ART_bson_no_quote_115] = "bson_no_quote ::= `$ . bson_no_quote ";
    artLabelStrings[ARTL_ART_bson_no_quote_115] = "";
    artlhsL[ARTL_ART_bson_no_quote_115] = ARTL_ART_bson_no_quote;
    artKindOfs[ARTL_ART_bson_no_quote_115] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_bson_no_quote_115] = true;
    artLabelInternalStrings[ARTL_ART_bson_no_quote_117] = "bson_no_quote ::= `$ bson_no_quote .";
    artLabelStrings[ARTL_ART_bson_no_quote_117] = "";
    artlhsL[ARTL_ART_bson_no_quote_117] = ARTL_ART_bson_no_quote;
    artSlotInstanceOfs[ARTL_ART_bson_no_quote_117] = ARTL_ART_bson_no_quote;
    artKindOfs[ARTL_ART_bson_no_quote_117] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_bson_no_quote_117] = true;
    arteoR_pL[ARTL_ART_bson_no_quote_117] = true;
    artPopD[ARTL_ART_bson_no_quote_117] = true;
    artLabelInternalStrings[ARTL_ART_bson_no_quote_119] = "bson_no_quote ::= . bson_no_quote `- bson_no_quote ";
    artLabelStrings[ARTL_ART_bson_no_quote_119] = "";
    artlhsL[ARTL_ART_bson_no_quote_119] = ARTL_ART_bson_no_quote;
    artKindOfs[ARTL_ART_bson_no_quote_119] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_bson_no_quote_121] = "bson_no_quote ::= bson_no_quote . `- bson_no_quote ";
    artLabelStrings[ARTL_ART_bson_no_quote_121] = "";
    artlhsL[ARTL_ART_bson_no_quote_121] = ARTL_ART_bson_no_quote;
    artSlotInstanceOfs[ARTL_ART_bson_no_quote_121] = ARTL_ART_bson_no_quote;
    artKindOfs[ARTL_ART_bson_no_quote_121] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_bson_no_quote_121] = true;
    artLabelInternalStrings[ARTL_ART_bson_no_quote_122] = "bson_no_quote ::= bson_no_quote `- bson_no_quote ";
    artLabelStrings[ARTL_ART_bson_no_quote_122] = "";
    artlhsL[ARTL_ART_bson_no_quote_122] = ARTL_ART_bson_no_quote;
    artLabelInternalStrings[ARTL_ART_bson_no_quote_123] = "bson_no_quote ::= bson_no_quote `- . bson_no_quote ";
    artLabelStrings[ARTL_ART_bson_no_quote_123] = "";
    artlhsL[ARTL_ART_bson_no_quote_123] = ARTL_ART_bson_no_quote;
    artKindOfs[ARTL_ART_bson_no_quote_123] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_bson_no_quote_125] = "bson_no_quote ::= bson_no_quote `- bson_no_quote .";
    artLabelStrings[ARTL_ART_bson_no_quote_125] = "";
    artlhsL[ARTL_ART_bson_no_quote_125] = ARTL_ART_bson_no_quote;
    artSlotInstanceOfs[ARTL_ART_bson_no_quote_125] = ARTL_ART_bson_no_quote;
    artKindOfs[ARTL_ART_bson_no_quote_125] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_bson_no_quote_125] = true;
    arteoR_pL[ARTL_ART_bson_no_quote_125] = true;
    artPopD[ARTL_ART_bson_no_quote_125] = true;
  }

  public void artTableInitialiser_ART_digit() {
    artLabelInternalStrings[ARTL_ART_digit] = "digit";
    artLabelStrings[ARTL_ART_digit] = "digit";
    artKindOfs[ARTL_ART_digit] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_digit_128] = "digit ::= . '0' ";
    artLabelStrings[ARTL_ART_digit_128] = "";
    artlhsL[ARTL_ART_digit_128] = ARTL_ART_digit;
    artKindOfs[ARTL_ART_digit_128] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_digit_128] = true;
    artLabelInternalStrings[ARTL_ART_digit_129] = "digit ::= '0' ";
    artLabelStrings[ARTL_ART_digit_129] = "";
    artlhsL[ARTL_ART_digit_129] = ARTL_ART_digit;
    artPopD[ARTL_ART_digit_129] = true;
    artLabelInternalStrings[ARTL_ART_digit_130] = "digit ::= '0' .";
    artLabelStrings[ARTL_ART_digit_130] = "";
    artlhsL[ARTL_ART_digit_130] = ARTL_ART_digit;
    artKindOfs[ARTL_ART_digit_130] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_digit_130] = true;
    arteoR_pL[ARTL_ART_digit_130] = true;
    artPopD[ARTL_ART_digit_130] = true;
    artLabelInternalStrings[ARTL_ART_digit_132] = "digit ::= . non_zero_digits ";
    artLabelStrings[ARTL_ART_digit_132] = "";
    artlhsL[ARTL_ART_digit_132] = ARTL_ART_digit;
    artKindOfs[ARTL_ART_digit_132] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_digit_134] = "digit ::= non_zero_digits .";
    artLabelStrings[ARTL_ART_digit_134] = "";
    artlhsL[ARTL_ART_digit_134] = ARTL_ART_digit;
    artSlotInstanceOfs[ARTL_ART_digit_134] = ARTL_ART_non_zero_digits;
    artKindOfs[ARTL_ART_digit_134] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_digit_134] = true;
    arteoR_pL[ARTL_ART_digit_134] = true;
    artPopD[ARTL_ART_digit_134] = true;
  }

  public void artTableInitialiser_ART_digits() {
    artLabelInternalStrings[ARTL_ART_digits] = "digits";
    artLabelStrings[ARTL_ART_digits] = "digits";
    artKindOfs[ARTL_ART_digits] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_digits_137] = "digits ::= . digits digit ";
    artLabelStrings[ARTL_ART_digits_137] = "";
    artlhsL[ARTL_ART_digits_137] = ARTL_ART_digits;
    artKindOfs[ARTL_ART_digits_137] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_digits_139] = "digits ::= digits . digit ";
    artLabelStrings[ARTL_ART_digits_139] = "";
    artlhsL[ARTL_ART_digits_139] = ARTL_ART_digits;
    artSlotInstanceOfs[ARTL_ART_digits_139] = ARTL_ART_digits;
    artKindOfs[ARTL_ART_digits_139] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_digits_139] = true;
    artLabelInternalStrings[ARTL_ART_digits_141] = "digits ::= digits digit .";
    artLabelStrings[ARTL_ART_digits_141] = "";
    artlhsL[ARTL_ART_digits_141] = ARTL_ART_digits;
    artSlotInstanceOfs[ARTL_ART_digits_141] = ARTL_ART_digit;
    artKindOfs[ARTL_ART_digits_141] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_digits_141] = true;
    arteoR_pL[ARTL_ART_digits_141] = true;
    artPopD[ARTL_ART_digits_141] = true;
    artLabelInternalStrings[ARTL_ART_digits_143] = "digits ::= . digit ";
    artLabelStrings[ARTL_ART_digits_143] = "";
    artlhsL[ARTL_ART_digits_143] = ARTL_ART_digits;
    artKindOfs[ARTL_ART_digits_143] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_digits_145] = "digits ::= digit .";
    artLabelStrings[ARTL_ART_digits_145] = "";
    artlhsL[ARTL_ART_digits_145] = ARTL_ART_digits;
    artSlotInstanceOfs[ARTL_ART_digits_145] = ARTL_ART_digit;
    artKindOfs[ARTL_ART_digits_145] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_digits_145] = true;
    arteoR_pL[ARTL_ART_digits_145] = true;
    artPopD[ARTL_ART_digits_145] = true;
  }

  public void artTableInitialiser_ART_exp_letter() {
    artLabelInternalStrings[ARTL_ART_exp_letter] = "exp_letter";
    artLabelStrings[ARTL_ART_exp_letter] = "exp_letter";
    artKindOfs[ARTL_ART_exp_letter] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_exp_letter_148] = "exp_letter ::= . \"e\" ";
    artLabelStrings[ARTL_ART_exp_letter_148] = "";
    artlhsL[ARTL_ART_exp_letter_148] = ARTL_ART_exp_letter;
    artKindOfs[ARTL_ART_exp_letter_148] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_exp_letter_148] = true;
    artLabelInternalStrings[ARTL_ART_exp_letter_149] = "exp_letter ::= \"e\" ";
    artLabelStrings[ARTL_ART_exp_letter_149] = "";
    artlhsL[ARTL_ART_exp_letter_149] = ARTL_ART_exp_letter;
    artPopD[ARTL_ART_exp_letter_149] = true;
    artLabelInternalStrings[ARTL_ART_exp_letter_150] = "exp_letter ::= \"e\" .";
    artLabelStrings[ARTL_ART_exp_letter_150] = "";
    artlhsL[ARTL_ART_exp_letter_150] = ARTL_ART_exp_letter;
    artKindOfs[ARTL_ART_exp_letter_150] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_exp_letter_150] = true;
    arteoR_pL[ARTL_ART_exp_letter_150] = true;
    artPopD[ARTL_ART_exp_letter_150] = true;
  }

  public void artTableInitialiser_ART_id_number() {
    artLabelInternalStrings[ARTL_ART_id_number] = "id_number";
    artLabelStrings[ARTL_ART_id_number] = "id_number";
    artKindOfs[ARTL_ART_id_number] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_id_number_153] = "id_number ::= . &STRING_SQ ";
    artLabelStrings[ARTL_ART_id_number_153] = "";
    artlhsL[ARTL_ART_id_number_153] = ARTL_ART_id_number;
    artKindOfs[ARTL_ART_id_number_153] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_id_number_153] = true;
    artLabelInternalStrings[ARTL_ART_id_number_156] = "id_number ::= &STRING_SQ ";
    artLabelStrings[ARTL_ART_id_number_156] = "";
    artlhsL[ARTL_ART_id_number_156] = ARTL_ART_id_number;
    artPopD[ARTL_ART_id_number_156] = true;
    artLabelInternalStrings[ARTL_ART_id_number_157] = "id_number ::= &STRING_SQ .";
    artLabelStrings[ARTL_ART_id_number_157] = "";
    artlhsL[ARTL_ART_id_number_157] = ARTL_ART_id_number;
    artKindOfs[ARTL_ART_id_number_157] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_id_number_157] = true;
    arteoR_pL[ARTL_ART_id_number_157] = true;
    artPopD[ARTL_ART_id_number_157] = true;
  }

  public void artTableInitialiser_ART_key() {
    artLabelInternalStrings[ARTL_ART_key] = "key";
    artLabelStrings[ARTL_ART_key] = "key";
    artKindOfs[ARTL_ART_key] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_key_160] = "key ::= . string ";
    artLabelStrings[ARTL_ART_key_160] = "";
    artlhsL[ARTL_ART_key_160] = ARTL_ART_key;
    artKindOfs[ARTL_ART_key_160] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_key_164] = "key ::= string .";
    artLabelStrings[ARTL_ART_key_164] = "";
    artlhsL[ARTL_ART_key_164] = ARTL_ART_key;
    artSlotInstanceOfs[ARTL_ART_key_164] = ARTL_ART_string;
    artKindOfs[ARTL_ART_key_164] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_key_164] = true;
    arteoR_pL[ARTL_ART_key_164] = true;
    artPopD[ARTL_ART_key_164] = true;
    artLabelInternalStrings[ARTL_ART_key_166] = "key ::= . bson_no_quote ";
    artLabelStrings[ARTL_ART_key_166] = "";
    artlhsL[ARTL_ART_key_166] = ARTL_ART_key;
    artKindOfs[ARTL_ART_key_166] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_key_170] = "key ::= bson_no_quote .";
    artLabelStrings[ARTL_ART_key_170] = "";
    artlhsL[ARTL_ART_key_170] = ARTL_ART_key;
    artSlotInstanceOfs[ARTL_ART_key_170] = ARTL_ART_bson_no_quote;
    artKindOfs[ARTL_ART_key_170] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_key_170] = true;
    arteoR_pL[ARTL_ART_key_170] = true;
    artPopD[ARTL_ART_key_170] = true;
  }

  public void artTableInitialiser_ART_members() {
    artLabelInternalStrings[ARTL_ART_members] = "members";
    artLabelStrings[ARTL_ART_members] = "members";
    artKindOfs[ARTL_ART_members] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_members_173] = "members ::= . members ',' pair ";
    artLabelStrings[ARTL_ART_members_173] = "";
    artlhsL[ARTL_ART_members_173] = ARTL_ART_members;
    artKindOfs[ARTL_ART_members_173] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_members_175] = "members ::= members . ',' pair ";
    artLabelStrings[ARTL_ART_members_175] = "";
    artlhsL[ARTL_ART_members_175] = ARTL_ART_members;
    artSlotInstanceOfs[ARTL_ART_members_175] = ARTL_ART_members;
    artKindOfs[ARTL_ART_members_175] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_members_175] = true;
    artLabelInternalStrings[ARTL_ART_members_176] = "members ::= members ',' pair ";
    artLabelStrings[ARTL_ART_members_176] = "";
    artlhsL[ARTL_ART_members_176] = ARTL_ART_members;
    artLabelInternalStrings[ARTL_ART_members_177] = "members ::= members ',' . pair ";
    artLabelStrings[ARTL_ART_members_177] = "";
    artlhsL[ARTL_ART_members_177] = ARTL_ART_members;
    artKindOfs[ARTL_ART_members_177] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_members_179] = "members ::= members ',' pair .";
    artLabelStrings[ARTL_ART_members_179] = "";
    artlhsL[ARTL_ART_members_179] = ARTL_ART_members;
    artSlotInstanceOfs[ARTL_ART_members_179] = ARTL_ART_pair;
    artKindOfs[ARTL_ART_members_179] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_members_179] = true;
    arteoR_pL[ARTL_ART_members_179] = true;
    artPopD[ARTL_ART_members_179] = true;
    artLabelInternalStrings[ARTL_ART_members_181] = "members ::= . pair ";
    artLabelStrings[ARTL_ART_members_181] = "";
    artlhsL[ARTL_ART_members_181] = ARTL_ART_members;
    artKindOfs[ARTL_ART_members_181] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_members_183] = "members ::= pair .";
    artLabelStrings[ARTL_ART_members_183] = "";
    artlhsL[ARTL_ART_members_183] = ARTL_ART_members;
    artSlotInstanceOfs[ARTL_ART_members_183] = ARTL_ART_pair;
    artKindOfs[ARTL_ART_members_183] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_members_183] = true;
    arteoR_pL[ARTL_ART_members_183] = true;
    artPopD[ARTL_ART_members_183] = true;
  }

  public void artTableInitialiser_ART_no_leading_zeros() {
    artLabelInternalStrings[ARTL_ART_no_leading_zeros] = "no_leading_zeros";
    artLabelStrings[ARTL_ART_no_leading_zeros] = "no_leading_zeros";
    artKindOfs[ARTL_ART_no_leading_zeros] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_no_leading_zeros_186] = "no_leading_zeros ::= . digit ";
    artLabelStrings[ARTL_ART_no_leading_zeros_186] = "";
    artlhsL[ARTL_ART_no_leading_zeros_186] = ARTL_ART_no_leading_zeros;
    artKindOfs[ARTL_ART_no_leading_zeros_186] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_no_leading_zeros_188] = "no_leading_zeros ::= digit .";
    artLabelStrings[ARTL_ART_no_leading_zeros_188] = "";
    artlhsL[ARTL_ART_no_leading_zeros_188] = ARTL_ART_no_leading_zeros;
    artSlotInstanceOfs[ARTL_ART_no_leading_zeros_188] = ARTL_ART_digit;
    artKindOfs[ARTL_ART_no_leading_zeros_188] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_no_leading_zeros_188] = true;
    arteoR_pL[ARTL_ART_no_leading_zeros_188] = true;
    artPopD[ARTL_ART_no_leading_zeros_188] = true;
    artLabelInternalStrings[ARTL_ART_no_leading_zeros_190] = "no_leading_zeros ::= . non_zero_digits digits ";
    artLabelStrings[ARTL_ART_no_leading_zeros_190] = "";
    artlhsL[ARTL_ART_no_leading_zeros_190] = ARTL_ART_no_leading_zeros;
    artKindOfs[ARTL_ART_no_leading_zeros_190] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_no_leading_zeros_192] = "no_leading_zeros ::= non_zero_digits . digits ";
    artLabelStrings[ARTL_ART_no_leading_zeros_192] = "";
    artlhsL[ARTL_ART_no_leading_zeros_192] = ARTL_ART_no_leading_zeros;
    artSlotInstanceOfs[ARTL_ART_no_leading_zeros_192] = ARTL_ART_non_zero_digits;
    artKindOfs[ARTL_ART_no_leading_zeros_192] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_no_leading_zeros_192] = true;
    artLabelInternalStrings[ARTL_ART_no_leading_zeros_194] = "no_leading_zeros ::= non_zero_digits digits .";
    artLabelStrings[ARTL_ART_no_leading_zeros_194] = "";
    artlhsL[ARTL_ART_no_leading_zeros_194] = ARTL_ART_no_leading_zeros;
    artSlotInstanceOfs[ARTL_ART_no_leading_zeros_194] = ARTL_ART_digits;
    artKindOfs[ARTL_ART_no_leading_zeros_194] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_no_leading_zeros_194] = true;
    arteoR_pL[ARTL_ART_no_leading_zeros_194] = true;
    artPopD[ARTL_ART_no_leading_zeros_194] = true;
  }

  public void artTableInitialiser_ART_non_zero_digits() {
    artLabelInternalStrings[ARTL_ART_non_zero_digits] = "non_zero_digits";
    artLabelStrings[ARTL_ART_non_zero_digits] = "non_zero_digits";
    artKindOfs[ARTL_ART_non_zero_digits] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_197] = "non_zero_digits ::= . '1' ";
    artLabelStrings[ARTL_ART_non_zero_digits_197] = "";
    artlhsL[ARTL_ART_non_zero_digits_197] = ARTL_ART_non_zero_digits;
    artKindOfs[ARTL_ART_non_zero_digits_197] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_non_zero_digits_197] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_198] = "non_zero_digits ::= '1' ";
    artLabelStrings[ARTL_ART_non_zero_digits_198] = "";
    artlhsL[ARTL_ART_non_zero_digits_198] = ARTL_ART_non_zero_digits;
    artPopD[ARTL_ART_non_zero_digits_198] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_199] = "non_zero_digits ::= '1' .";
    artLabelStrings[ARTL_ART_non_zero_digits_199] = "";
    artlhsL[ARTL_ART_non_zero_digits_199] = ARTL_ART_non_zero_digits;
    artKindOfs[ARTL_ART_non_zero_digits_199] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_non_zero_digits_199] = true;
    arteoR_pL[ARTL_ART_non_zero_digits_199] = true;
    artPopD[ARTL_ART_non_zero_digits_199] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_201] = "non_zero_digits ::= . '2' ";
    artLabelStrings[ARTL_ART_non_zero_digits_201] = "";
    artlhsL[ARTL_ART_non_zero_digits_201] = ARTL_ART_non_zero_digits;
    artKindOfs[ARTL_ART_non_zero_digits_201] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_non_zero_digits_201] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_202] = "non_zero_digits ::= '2' ";
    artLabelStrings[ARTL_ART_non_zero_digits_202] = "";
    artlhsL[ARTL_ART_non_zero_digits_202] = ARTL_ART_non_zero_digits;
    artPopD[ARTL_ART_non_zero_digits_202] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_203] = "non_zero_digits ::= '2' .";
    artLabelStrings[ARTL_ART_non_zero_digits_203] = "";
    artlhsL[ARTL_ART_non_zero_digits_203] = ARTL_ART_non_zero_digits;
    artKindOfs[ARTL_ART_non_zero_digits_203] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_non_zero_digits_203] = true;
    arteoR_pL[ARTL_ART_non_zero_digits_203] = true;
    artPopD[ARTL_ART_non_zero_digits_203] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_205] = "non_zero_digits ::= . '3' ";
    artLabelStrings[ARTL_ART_non_zero_digits_205] = "";
    artlhsL[ARTL_ART_non_zero_digits_205] = ARTL_ART_non_zero_digits;
    artKindOfs[ARTL_ART_non_zero_digits_205] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_non_zero_digits_205] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_206] = "non_zero_digits ::= '3' ";
    artLabelStrings[ARTL_ART_non_zero_digits_206] = "";
    artlhsL[ARTL_ART_non_zero_digits_206] = ARTL_ART_non_zero_digits;
    artPopD[ARTL_ART_non_zero_digits_206] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_207] = "non_zero_digits ::= '3' .";
    artLabelStrings[ARTL_ART_non_zero_digits_207] = "";
    artlhsL[ARTL_ART_non_zero_digits_207] = ARTL_ART_non_zero_digits;
    artKindOfs[ARTL_ART_non_zero_digits_207] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_non_zero_digits_207] = true;
    arteoR_pL[ARTL_ART_non_zero_digits_207] = true;
    artPopD[ARTL_ART_non_zero_digits_207] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_209] = "non_zero_digits ::= . '4' ";
    artLabelStrings[ARTL_ART_non_zero_digits_209] = "";
    artlhsL[ARTL_ART_non_zero_digits_209] = ARTL_ART_non_zero_digits;
    artKindOfs[ARTL_ART_non_zero_digits_209] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_non_zero_digits_209] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_210] = "non_zero_digits ::= '4' ";
    artLabelStrings[ARTL_ART_non_zero_digits_210] = "";
    artlhsL[ARTL_ART_non_zero_digits_210] = ARTL_ART_non_zero_digits;
    artPopD[ARTL_ART_non_zero_digits_210] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_211] = "non_zero_digits ::= '4' .";
    artLabelStrings[ARTL_ART_non_zero_digits_211] = "";
    artlhsL[ARTL_ART_non_zero_digits_211] = ARTL_ART_non_zero_digits;
    artKindOfs[ARTL_ART_non_zero_digits_211] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_non_zero_digits_211] = true;
    arteoR_pL[ARTL_ART_non_zero_digits_211] = true;
    artPopD[ARTL_ART_non_zero_digits_211] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_213] = "non_zero_digits ::= . '5' ";
    artLabelStrings[ARTL_ART_non_zero_digits_213] = "";
    artlhsL[ARTL_ART_non_zero_digits_213] = ARTL_ART_non_zero_digits;
    artKindOfs[ARTL_ART_non_zero_digits_213] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_non_zero_digits_213] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_214] = "non_zero_digits ::= '5' ";
    artLabelStrings[ARTL_ART_non_zero_digits_214] = "";
    artlhsL[ARTL_ART_non_zero_digits_214] = ARTL_ART_non_zero_digits;
    artPopD[ARTL_ART_non_zero_digits_214] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_215] = "non_zero_digits ::= '5' .";
    artLabelStrings[ARTL_ART_non_zero_digits_215] = "";
    artlhsL[ARTL_ART_non_zero_digits_215] = ARTL_ART_non_zero_digits;
    artKindOfs[ARTL_ART_non_zero_digits_215] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_non_zero_digits_215] = true;
    arteoR_pL[ARTL_ART_non_zero_digits_215] = true;
    artPopD[ARTL_ART_non_zero_digits_215] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_217] = "non_zero_digits ::= . '6' ";
    artLabelStrings[ARTL_ART_non_zero_digits_217] = "";
    artlhsL[ARTL_ART_non_zero_digits_217] = ARTL_ART_non_zero_digits;
    artKindOfs[ARTL_ART_non_zero_digits_217] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_non_zero_digits_217] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_218] = "non_zero_digits ::= '6' ";
    artLabelStrings[ARTL_ART_non_zero_digits_218] = "";
    artlhsL[ARTL_ART_non_zero_digits_218] = ARTL_ART_non_zero_digits;
    artPopD[ARTL_ART_non_zero_digits_218] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_219] = "non_zero_digits ::= '6' .";
    artLabelStrings[ARTL_ART_non_zero_digits_219] = "";
    artlhsL[ARTL_ART_non_zero_digits_219] = ARTL_ART_non_zero_digits;
    artKindOfs[ARTL_ART_non_zero_digits_219] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_non_zero_digits_219] = true;
    arteoR_pL[ARTL_ART_non_zero_digits_219] = true;
    artPopD[ARTL_ART_non_zero_digits_219] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_221] = "non_zero_digits ::= . '7' ";
    artLabelStrings[ARTL_ART_non_zero_digits_221] = "";
    artlhsL[ARTL_ART_non_zero_digits_221] = ARTL_ART_non_zero_digits;
    artKindOfs[ARTL_ART_non_zero_digits_221] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_non_zero_digits_221] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_222] = "non_zero_digits ::= '7' ";
    artLabelStrings[ARTL_ART_non_zero_digits_222] = "";
    artlhsL[ARTL_ART_non_zero_digits_222] = ARTL_ART_non_zero_digits;
    artPopD[ARTL_ART_non_zero_digits_222] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_223] = "non_zero_digits ::= '7' .";
    artLabelStrings[ARTL_ART_non_zero_digits_223] = "";
    artlhsL[ARTL_ART_non_zero_digits_223] = ARTL_ART_non_zero_digits;
    artKindOfs[ARTL_ART_non_zero_digits_223] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_non_zero_digits_223] = true;
    arteoR_pL[ARTL_ART_non_zero_digits_223] = true;
    artPopD[ARTL_ART_non_zero_digits_223] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_225] = "non_zero_digits ::= . '8' ";
    artLabelStrings[ARTL_ART_non_zero_digits_225] = "";
    artlhsL[ARTL_ART_non_zero_digits_225] = ARTL_ART_non_zero_digits;
    artKindOfs[ARTL_ART_non_zero_digits_225] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_non_zero_digits_225] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_226] = "non_zero_digits ::= '8' ";
    artLabelStrings[ARTL_ART_non_zero_digits_226] = "";
    artlhsL[ARTL_ART_non_zero_digits_226] = ARTL_ART_non_zero_digits;
    artPopD[ARTL_ART_non_zero_digits_226] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_227] = "non_zero_digits ::= '8' .";
    artLabelStrings[ARTL_ART_non_zero_digits_227] = "";
    artlhsL[ARTL_ART_non_zero_digits_227] = ARTL_ART_non_zero_digits;
    artKindOfs[ARTL_ART_non_zero_digits_227] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_non_zero_digits_227] = true;
    arteoR_pL[ARTL_ART_non_zero_digits_227] = true;
    artPopD[ARTL_ART_non_zero_digits_227] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_229] = "non_zero_digits ::= . '9' ";
    artLabelStrings[ARTL_ART_non_zero_digits_229] = "";
    artlhsL[ARTL_ART_non_zero_digits_229] = ARTL_ART_non_zero_digits;
    artKindOfs[ARTL_ART_non_zero_digits_229] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_non_zero_digits_229] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_230] = "non_zero_digits ::= '9' ";
    artLabelStrings[ARTL_ART_non_zero_digits_230] = "";
    artlhsL[ARTL_ART_non_zero_digits_230] = ARTL_ART_non_zero_digits;
    artPopD[ARTL_ART_non_zero_digits_230] = true;
    artLabelInternalStrings[ARTL_ART_non_zero_digits_231] = "non_zero_digits ::= '9' .";
    artLabelStrings[ARTL_ART_non_zero_digits_231] = "";
    artlhsL[ARTL_ART_non_zero_digits_231] = ARTL_ART_non_zero_digits;
    artKindOfs[ARTL_ART_non_zero_digits_231] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_non_zero_digits_231] = true;
    arteoR_pL[ARTL_ART_non_zero_digits_231] = true;
    artPopD[ARTL_ART_non_zero_digits_231] = true;
  }

  public void artTableInitialiser_ART_null() {
    artLabelInternalStrings[ARTL_ART_null] = "null";
    artLabelStrings[ARTL_ART_null] = "null";
    artKindOfs[ARTL_ART_null] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_null_234] = "null ::= . 'null' ";
    artLabelStrings[ARTL_ART_null_234] = "";
    artlhsL[ARTL_ART_null_234] = ARTL_ART_null;
    artKindOfs[ARTL_ART_null_234] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_null_234] = true;
    artLabelInternalStrings[ARTL_ART_null_235] = "null ::= 'null' ";
    artLabelStrings[ARTL_ART_null_235] = "";
    artlhsL[ARTL_ART_null_235] = ARTL_ART_null;
    artPopD[ARTL_ART_null_235] = true;
    artLabelInternalStrings[ARTL_ART_null_236] = "null ::= 'null' .";
    artLabelStrings[ARTL_ART_null_236] = "";
    artlhsL[ARTL_ART_null_236] = ARTL_ART_null;
    artKindOfs[ARTL_ART_null_236] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_null_236] = true;
    arteoR_pL[ARTL_ART_null_236] = true;
    artPopD[ARTL_ART_null_236] = true;
  }

  public void artTableInitialiser_ART_number() {
    artLabelInternalStrings[ARTL_ART_number] = "number";
    artLabelStrings[ARTL_ART_number] = "number";
    artKindOfs[ARTL_ART_number] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_number_239] = "number ::= . O_minus no_leading_zeros O_fraction O_exponent ";
    artLabelStrings[ARTL_ART_number_239] = "";
    artlhsL[ARTL_ART_number_239] = ARTL_ART_number;
    artKindOfs[ARTL_ART_number_239] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_number_241] = "number ::= O_minus . no_leading_zeros O_fraction O_exponent ";
    artLabelStrings[ARTL_ART_number_241] = "";
    artlhsL[ARTL_ART_number_241] = ARTL_ART_number;
    artSlotInstanceOfs[ARTL_ART_number_241] = ARTL_ART_O_minus;
    artKindOfs[ARTL_ART_number_241] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_number_241] = true;
    artLabelInternalStrings[ARTL_ART_number_243] = "number ::= O_minus no_leading_zeros . O_fraction O_exponent ";
    artLabelStrings[ARTL_ART_number_243] = "";
    artlhsL[ARTL_ART_number_243] = ARTL_ART_number;
    artSlotInstanceOfs[ARTL_ART_number_243] = ARTL_ART_no_leading_zeros;
    artKindOfs[ARTL_ART_number_243] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_number_245] = "number ::= O_minus no_leading_zeros O_fraction . O_exponent ";
    artLabelStrings[ARTL_ART_number_245] = "";
    artlhsL[ARTL_ART_number_245] = ARTL_ART_number;
    artSlotInstanceOfs[ARTL_ART_number_245] = ARTL_ART_O_fraction;
    artKindOfs[ARTL_ART_number_245] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_number_247] = "number ::= O_minus no_leading_zeros O_fraction O_exponent .";
    artLabelStrings[ARTL_ART_number_247] = "";
    artlhsL[ARTL_ART_number_247] = ARTL_ART_number;
    artSlotInstanceOfs[ARTL_ART_number_247] = ARTL_ART_O_exponent;
    artKindOfs[ARTL_ART_number_247] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_number_247] = true;
    arteoR_pL[ARTL_ART_number_247] = true;
    artPopD[ARTL_ART_number_247] = true;
  }

  public void artTableInitialiser_ART_object() {
    artLabelInternalStrings[ARTL_ART_object] = "object";
    artLabelStrings[ARTL_ART_object] = "object";
    artKindOfs[ARTL_ART_object] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_object_250] = "object ::= . '{' O_members '}' ";
    artLabelStrings[ARTL_ART_object_250] = "";
    artlhsL[ARTL_ART_object_250] = ARTL_ART_object;
    artKindOfs[ARTL_ART_object_250] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_object_251] = "object ::= '{' O_members '}' ";
    artLabelStrings[ARTL_ART_object_251] = "";
    artlhsL[ARTL_ART_object_251] = ARTL_ART_object;
    artLabelInternalStrings[ARTL_ART_object_252] = "object ::= '{' . O_members '}' ";
    artLabelStrings[ARTL_ART_object_252] = "";
    artlhsL[ARTL_ART_object_252] = ARTL_ART_object;
    artKindOfs[ARTL_ART_object_252] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_object_252] = true;
    artLabelInternalStrings[ARTL_ART_object_254] = "object ::= '{' O_members . '}' ";
    artLabelStrings[ARTL_ART_object_254] = "";
    artlhsL[ARTL_ART_object_254] = ARTL_ART_object;
    artSlotInstanceOfs[ARTL_ART_object_254] = ARTL_ART_O_members;
    artKindOfs[ARTL_ART_object_254] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_object_254] = true;
    artLabelInternalStrings[ARTL_ART_object_255] = "object ::= '{' O_members '}' ";
    artLabelStrings[ARTL_ART_object_255] = "";
    artlhsL[ARTL_ART_object_255] = ARTL_ART_object;
    artPopD[ARTL_ART_object_255] = true;
    artLabelInternalStrings[ARTL_ART_object_256] = "object ::= '{' O_members '}' .";
    artLabelStrings[ARTL_ART_object_256] = "";
    artlhsL[ARTL_ART_object_256] = ARTL_ART_object;
    artKindOfs[ARTL_ART_object_256] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_object_256] = true;
    arteoR_pL[ARTL_ART_object_256] = true;
    artPopD[ARTL_ART_object_256] = true;
  }

  public void artTableInitialiser_ART_pair() {
    artLabelInternalStrings[ARTL_ART_pair] = "pair";
    artLabelStrings[ARTL_ART_pair] = "pair";
    artKindOfs[ARTL_ART_pair] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_pair_259] = "pair ::= . key ':' value ";
    artLabelStrings[ARTL_ART_pair_259] = "";
    artlhsL[ARTL_ART_pair_259] = ARTL_ART_pair;
    artKindOfs[ARTL_ART_pair_259] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_pair_261] = "pair ::= key . ':' value ";
    artLabelStrings[ARTL_ART_pair_261] = "";
    artlhsL[ARTL_ART_pair_261] = ARTL_ART_pair;
    artSlotInstanceOfs[ARTL_ART_pair_261] = ARTL_ART_key;
    artKindOfs[ARTL_ART_pair_261] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_pair_261] = true;
    artLabelInternalStrings[ARTL_ART_pair_262] = "pair ::= key ':' value ";
    artLabelStrings[ARTL_ART_pair_262] = "";
    artlhsL[ARTL_ART_pair_262] = ARTL_ART_pair;
    artLabelInternalStrings[ARTL_ART_pair_263] = "pair ::= key ':' . value ";
    artLabelStrings[ARTL_ART_pair_263] = "";
    artlhsL[ARTL_ART_pair_263] = ARTL_ART_pair;
    artKindOfs[ARTL_ART_pair_263] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_pair_265] = "pair ::= key ':' value .";
    artLabelStrings[ARTL_ART_pair_265] = "";
    artlhsL[ARTL_ART_pair_265] = ARTL_ART_pair;
    artSlotInstanceOfs[ARTL_ART_pair_265] = ARTL_ART_value;
    artKindOfs[ARTL_ART_pair_265] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_pair_265] = true;
    arteoR_pL[ARTL_ART_pair_265] = true;
    artPopD[ARTL_ART_pair_265] = true;
  }

  public void artTableInitialiser_ART_string() {
    artLabelInternalStrings[ARTL_ART_string] = "string";
    artLabelStrings[ARTL_ART_string] = "string";
    artKindOfs[ARTL_ART_string] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_string_268] = "string ::= . &STRING_DQ ";
    artLabelStrings[ARTL_ART_string_268] = "";
    artlhsL[ARTL_ART_string_268] = ARTL_ART_string;
    artKindOfs[ARTL_ART_string_268] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_string_268] = true;
    artLabelInternalStrings[ARTL_ART_string_269] = "string ::= &STRING_DQ ";
    artLabelStrings[ARTL_ART_string_269] = "";
    artlhsL[ARTL_ART_string_269] = ARTL_ART_string;
    artPopD[ARTL_ART_string_269] = true;
    artLabelInternalStrings[ARTL_ART_string_270] = "string ::= &STRING_DQ .";
    artLabelStrings[ARTL_ART_string_270] = "";
    artlhsL[ARTL_ART_string_270] = ARTL_ART_string;
    artKindOfs[ARTL_ART_string_270] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_string_270] = true;
    arteoR_pL[ARTL_ART_string_270] = true;
    artPopD[ARTL_ART_string_270] = true;
  }

  public void artTableInitialiser_ART_value() {
    artLabelInternalStrings[ARTL_ART_value] = "value";
    artLabelStrings[ARTL_ART_value] = "value";
    artKindOfs[ARTL_ART_value] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_value_273] = "value ::= . string ";
    artLabelStrings[ARTL_ART_value_273] = "";
    artlhsL[ARTL_ART_value_273] = ARTL_ART_value;
    artKindOfs[ARTL_ART_value_273] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_value_275] = "value ::= string .";
    artLabelStrings[ARTL_ART_value_275] = "";
    artlhsL[ARTL_ART_value_275] = ARTL_ART_value;
    artSlotInstanceOfs[ARTL_ART_value_275] = ARTL_ART_string;
    artKindOfs[ARTL_ART_value_275] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_value_275] = true;
    arteoR_pL[ARTL_ART_value_275] = true;
    artPopD[ARTL_ART_value_275] = true;
    artLabelInternalStrings[ARTL_ART_value_277] = "value ::= . number ";
    artLabelStrings[ARTL_ART_value_277] = "";
    artlhsL[ARTL_ART_value_277] = ARTL_ART_value;
    artKindOfs[ARTL_ART_value_277] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_value_279] = "value ::= number .";
    artLabelStrings[ARTL_ART_value_279] = "";
    artlhsL[ARTL_ART_value_279] = ARTL_ART_value;
    artSlotInstanceOfs[ARTL_ART_value_279] = ARTL_ART_number;
    artKindOfs[ARTL_ART_value_279] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_value_279] = true;
    arteoR_pL[ARTL_ART_value_279] = true;
    artPopD[ARTL_ART_value_279] = true;
    artLabelInternalStrings[ARTL_ART_value_281] = "value ::= . object ";
    artLabelStrings[ARTL_ART_value_281] = "";
    artlhsL[ARTL_ART_value_281] = ARTL_ART_value;
    artKindOfs[ARTL_ART_value_281] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_value_283] = "value ::= object .";
    artLabelStrings[ARTL_ART_value_283] = "";
    artlhsL[ARTL_ART_value_283] = ARTL_ART_value;
    artSlotInstanceOfs[ARTL_ART_value_283] = ARTL_ART_object;
    artKindOfs[ARTL_ART_value_283] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_value_283] = true;
    arteoR_pL[ARTL_ART_value_283] = true;
    artPopD[ARTL_ART_value_283] = true;
    artLabelInternalStrings[ARTL_ART_value_285] = "value ::= . array ";
    artLabelStrings[ARTL_ART_value_285] = "";
    artlhsL[ARTL_ART_value_285] = ARTL_ART_value;
    artKindOfs[ARTL_ART_value_285] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_value_287] = "value ::= array .";
    artLabelStrings[ARTL_ART_value_287] = "";
    artlhsL[ARTL_ART_value_287] = ARTL_ART_value;
    artSlotInstanceOfs[ARTL_ART_value_287] = ARTL_ART_array;
    artKindOfs[ARTL_ART_value_287] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_value_287] = true;
    arteoR_pL[ARTL_ART_value_287] = true;
    artPopD[ARTL_ART_value_287] = true;
    artLabelInternalStrings[ARTL_ART_value_289] = "value ::= . null ";
    artLabelStrings[ARTL_ART_value_289] = "";
    artlhsL[ARTL_ART_value_289] = ARTL_ART_value;
    artKindOfs[ARTL_ART_value_289] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_value_291] = "value ::= null .";
    artLabelStrings[ARTL_ART_value_291] = "";
    artlhsL[ARTL_ART_value_291] = ARTL_ART_value;
    artSlotInstanceOfs[ARTL_ART_value_291] = ARTL_ART_null;
    artKindOfs[ARTL_ART_value_291] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_value_291] = true;
    arteoR_pL[ARTL_ART_value_291] = true;
    artPopD[ARTL_ART_value_291] = true;
    artLabelInternalStrings[ARTL_ART_value_293] = "value ::= . boolean ";
    artLabelStrings[ARTL_ART_value_293] = "";
    artlhsL[ARTL_ART_value_293] = ARTL_ART_value;
    artKindOfs[ARTL_ART_value_293] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_value_295] = "value ::= boolean .";
    artLabelStrings[ARTL_ART_value_295] = "";
    artlhsL[ARTL_ART_value_295] = ARTL_ART_value;
    artSlotInstanceOfs[ARTL_ART_value_295] = ARTL_ART_boolean;
    artKindOfs[ARTL_ART_value_295] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_value_295] = true;
    arteoR_pL[ARTL_ART_value_295] = true;
    artPopD[ARTL_ART_value_295] = true;
    artLabelInternalStrings[ARTL_ART_value_297] = "value ::= . bson_id ";
    artLabelStrings[ARTL_ART_value_297] = "";
    artlhsL[ARTL_ART_value_297] = ARTL_ART_value;
    artKindOfs[ARTL_ART_value_297] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_value_299] = "value ::= bson_id .";
    artLabelStrings[ARTL_ART_value_299] = "";
    artlhsL[ARTL_ART_value_299] = ARTL_ART_value;
    artSlotInstanceOfs[ARTL_ART_value_299] = ARTL_ART_bson_id;
    artKindOfs[ARTL_ART_value_299] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_value_299] = true;
    arteoR_pL[ARTL_ART_value_299] = true;
    artPopD[ARTL_ART_value_299] = true;
  }

  public void artTableInitialise() {
    artLabelInternalStrings = new String[ARTX_LABEL_EXTENT + 1];
    artLabelStrings = new String[ARTX_LABEL_EXTENT + 1];
    artLabelInternalStrings[ARTL_EOS] = "ART$";
    artLabelStrings[ARTL_EOS] = " EOS $";
    artLabelInternalStrings[ARTX_DESPATCH] = "ARTX_DESPATCH";
    artLabelStrings[ARTX_DESPATCH] = " DESPATCH";
    artLabelInternalStrings[ARTL_DUMMY] = "ARTL_DUMMY";
    artLabelStrings[ARTL_DUMMY] = " DUMMY";
    artLabelInternalStrings[ARTX_LABEL_EXTENT] = "!!ILLEGAL!!";
    artLabelStrings[ARTX_LABEL_EXTENT] = " ILLEGAL";
    artLabelStrings[ARTL_EPSILON] = "#";
    artLabelInternalStrings[ARTL_EPSILON] = "#";

    artAnnotations = new String[ARTX_LABEL_EXTENT];
    artInitialiseStringArray(artAnnotations, 0, ARTX_LABEL_EXTENT, null);

    artPreSlots = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artPreSlots, 0, ARTX_LABEL_EXTENT);

    artPostSlots = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artPostSlots, 0, ARTX_LABEL_EXTENT);

    artInstanceOfs = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artInstanceOfs, 0, ARTX_LABEL_EXTENT);

    artSlotInstanceOfs = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artSlotInstanceOfs, 0, ARTX_LABEL_EXTENT);

    artKindOfs = new int[ARTX_LABEL_EXTENT + 1];
    artKindOfs[ARTL_EOS] = ARTK_EOS;
    artKindOfs[ARTL_EPSILON] = ARTK_EPSILON;

    artUserNameOfs = new int[ARTX_LABEL_EXTENT + 1];

    artTerminalRequiresWhiteSpace = new boolean[ARTL_EPSILON];
    artInitialiseBooleanArray(artTerminalRequiresWhiteSpace, 0, ARTL_EPSILON, false);

    artTerminalCaseInsensitive = new boolean[ARTL_EPSILON];
    artInitialiseBooleanArray(artTerminalCaseInsensitive, 0, ARTL_EPSILON, false);

    artGathers = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artGathers, 0, ARTX_LABEL_EXTENT);

    artFolds = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artFolds, 0, ARTX_LABEL_EXTENT, 0);

    artlhsL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artlhsL, 0, ARTX_LABEL_EXTENT);
    artlhsL[ARTX_DESPATCH] = ARTX_DESPATCH;

    artpL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artpL, 0, ARTX_LABEL_EXTENT);

    artaL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artaL, 0, ARTX_LABEL_EXTENT);

    artcolonL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artcolonL, 0, ARTX_LABEL_EXTENT);

    arteoOPL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoOPL, 0, ARTX_LABEL_EXTENT, false);

    artfiRL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artfiRL, 0, ARTX_LABEL_EXTENT, false);

    artfiPCL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artfiPCL, 0, ARTX_LABEL_EXTENT, false);

    arteoRL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoRL, 0, ARTX_LABEL_EXTENT, false);

    arteoR_pL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoR_pL, 0, ARTX_LABEL_EXTENT, false);

    artPopD = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artPopD, 0, ARTX_LABEL_EXTENT, false);

    artLabelStrings[ARTTB_ID] = "ID";
    artLabelInternalStrings[ARTTB_ID] = "&ID";
    artKindOfs[ARTTB_ID] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_ID] = true;
    artLabelStrings[ARTTB_STRING_DQ] = "STRING_DQ";
    artLabelInternalStrings[ARTTB_STRING_DQ] = "&STRING_DQ";
    artKindOfs[ARTTB_STRING_DQ] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_STRING_DQ] = true;
    artLabelStrings[ARTTB_STRING_SQ] = "STRING_SQ";
    artLabelInternalStrings[ARTTB_STRING_SQ] = "&STRING_SQ";
    artKindOfs[ARTTB_STRING_SQ] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_STRING_SQ] = true;
    artLabelStrings[ARTTC__DOLLAR] = "$";
    artLabelInternalStrings[ARTTC__DOLLAR] = "`$";
    artKindOfs[ARTTC__DOLLAR] = ARTK_CHARACTER_TERMINAL;
    artLabelStrings[ARTTC__MINUS] = "-";
    artLabelInternalStrings[ARTTC__MINUS] = "`-";
    artKindOfs[ARTTC__MINUS] = ARTK_CHARACTER_TERMINAL;
    artLabelStrings[ARTTS__RPAR] = ")";
    artLabelInternalStrings[ARTTS__RPAR] = "')'";
    artKindOfs[ARTTS__RPAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__RPAR] = true;
    artLabelStrings[ARTTS__PLUS] = "+";
    artLabelInternalStrings[ARTTS__PLUS] = "'+'";
    artKindOfs[ARTTS__PLUS] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PLUS] = true;
    artLabelStrings[ARTTS__COMMA] = ",";
    artLabelInternalStrings[ARTTS__COMMA] = "','";
    artKindOfs[ARTTS__COMMA] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__COMMA] = true;
    artLabelStrings[ARTTS__MINUS] = "-";
    artLabelInternalStrings[ARTTS__MINUS] = "'-'";
    artKindOfs[ARTTS__MINUS] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__MINUS] = true;
    artLabelStrings[ARTTS__PERIOD] = ".";
    artLabelInternalStrings[ARTTS__PERIOD] = "'.'";
    artKindOfs[ARTTS__PERIOD] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PERIOD] = true;
    artLabelStrings[ARTTS_0] = "0";
    artLabelInternalStrings[ARTTS_0] = "'0'";
    artKindOfs[ARTTS_0] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_0] = true;
    artLabelStrings[ARTTS_1] = "1";
    artLabelInternalStrings[ARTTS_1] = "'1'";
    artKindOfs[ARTTS_1] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_1] = true;
    artLabelStrings[ARTTS_2] = "2";
    artLabelInternalStrings[ARTTS_2] = "'2'";
    artKindOfs[ARTTS_2] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_2] = true;
    artLabelStrings[ARTTS_3] = "3";
    artLabelInternalStrings[ARTTS_3] = "'3'";
    artKindOfs[ARTTS_3] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_3] = true;
    artLabelStrings[ARTTS_4] = "4";
    artLabelInternalStrings[ARTTS_4] = "'4'";
    artKindOfs[ARTTS_4] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_4] = true;
    artLabelStrings[ARTTS_5] = "5";
    artLabelInternalStrings[ARTTS_5] = "'5'";
    artKindOfs[ARTTS_5] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_5] = true;
    artLabelStrings[ARTTS_6] = "6";
    artLabelInternalStrings[ARTTS_6] = "'6'";
    artKindOfs[ARTTS_6] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_6] = true;
    artLabelStrings[ARTTS_7] = "7";
    artLabelInternalStrings[ARTTS_7] = "'7'";
    artKindOfs[ARTTS_7] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_7] = true;
    artLabelStrings[ARTTS_8] = "8";
    artLabelInternalStrings[ARTTS_8] = "'8'";
    artKindOfs[ARTTS_8] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_8] = true;
    artLabelStrings[ARTTS_9] = "9";
    artLabelInternalStrings[ARTTS_9] = "'9'";
    artKindOfs[ARTTS_9] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_9] = true;
    artLabelStrings[ARTTS__COLON] = ":";
    artLabelInternalStrings[ARTTS__COLON] = "':'";
    artKindOfs[ARTTS__COLON] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__COLON] = true;
    artLabelStrings[ARTTS_ObjectId_LPAR] = "ObjectId(";
    artLabelInternalStrings[ARTTS_ObjectId_LPAR] = "'ObjectId('";
    artKindOfs[ARTTS_ObjectId_LPAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_ObjectId_LPAR] = true;
    artLabelStrings[ARTTS__LBRACK] = "[";
    artLabelInternalStrings[ARTTS__LBRACK] = "'['";
    artKindOfs[ARTTS__LBRACK] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LBRACK] = true;
    artLabelStrings[ARTTS__RBRACK] = "]";
    artLabelInternalStrings[ARTTS__RBRACK] = "']'";
    artKindOfs[ARTTS__RBRACK] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__RBRACK] = true;
    artLabelStrings[ARTTS_false] = "false";
    artLabelInternalStrings[ARTTS_false] = "'false'";
    artKindOfs[ARTTS_false] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_false] = true;
    artLabelStrings[ARTTS_null] = "null";
    artLabelInternalStrings[ARTTS_null] = "'null'";
    artKindOfs[ARTTS_null] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_null] = true;
    artLabelStrings[ARTTS_true] = "true";
    artLabelInternalStrings[ARTTS_true] = "'true'";
    artKindOfs[ARTTS_true] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_true] = true;
    artLabelStrings[ARTTS__LBRACE] = "{";
    artLabelInternalStrings[ARTTS__LBRACE] = "'{'";
    artKindOfs[ARTTS__LBRACE] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LBRACE] = true;
    artLabelStrings[ARTTS__RBRACE] = "}";
    artLabelInternalStrings[ARTTS__RBRACE] = "'}'";
    artKindOfs[ARTTS__RBRACE] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__RBRACE] = true;
    artLabelStrings[ARTTI_e] = "e";
    artLabelInternalStrings[ARTTI_e] = "\"e\"";
    artKindOfs[ARTTI_e] = ARTK_CASE_INSENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTI_e] = true;
    artTerminalCaseInsensitive[ARTTI_e] = true;
    artTableInitialiser_ART_O_array_values();
    artTableInitialiser_ART_O_exponent();
    artTableInitialiser_ART_O_fraction();
    artTableInitialiser_ART_O_members();
    artTableInitialiser_ART_O_minus();
    artTableInitialiser_ART_O_sign();
    artTableInitialiser_ART_array();
    artTableInitialiser_ART_array_values();
    artTableInitialiser_ART_boolean();
    artTableInitialiser_ART_bson_id();
    artTableInitialiser_ART_bson_no_quote();
    artTableInitialiser_ART_digit();
    artTableInitialiser_ART_digits();
    artTableInitialiser_ART_exp_letter();
    artTableInitialiser_ART_id_number();
    artTableInitialiser_ART_key();
    artTableInitialiser_ART_members();
    artTableInitialiser_ART_no_leading_zeros();
    artTableInitialiser_ART_non_zero_digits();
    artTableInitialiser_ART_null();
    artTableInitialiser_ART_number();
    artTableInitialiser_ART_object();
    artTableInitialiser_ART_pair();
    artTableInitialiser_ART_string();
    artTableInitialiser_ART_value();
  }

  public ARTGLLParser(ARTGLLLexerBase artGLLLexerBase) {
    artText = new ARTText(new ARTTextHandlerConsole());
    artLexer = artGLLLexerBase;
    artLexer.artSetParser(this);
    artFirstTerminalLabel = ARTTC__DOLLAR;
    artFirstUnusedLabel = ARTX_LABEL_EXTENT + 1;
    artSetExtent = ARTX_EPSILON + 1;
    ARTL_EOS = ARTX_EOS;
    ARTL_EPSILON = ARTX_EPSILON;
    ARTL_DUMMY = ARTX_DUMMY;
    artDefaultStartSymbolLabel = ARTL_ART_value;
    artBuildOptions = "ARTOptionBlock [verbosityLevel=0, version=false, closureLeft=false, closureRight=false, warnOnMultiple=false, multiplyOut=false, leftFactor=false, bracketToNonterminal=false, suppressPopGuard=false, suppressProductionGuard=false, suppressNonterminalGuard=false, testRepeatNo=false, errorOnWirth=false, suppressSemantics=false, treeLevel=3, exploitDeterminism=false, clusteredGSS=false, delayPoppingDescriptors=false, predictivePops=false, FIFODescriptors=false, EOSFollow=false, mGLL=false, outputDirectory=., despatchModeString=fragment, supportModeString=HashPool, targetLanguageString=Java, grammarFormatString=, parserName=ARTGLLParser, lexerName=ARTGLLLexer, namespace=null, despatchMode=fragment, supportMode=HashPool, targetLanguageMode=Java, grammarFormatMode=NONE]";
    artFIFODescriptors = false;
    artSetInitialise();
    artTableInitialise();
  }

  private ARTGLLRDT artRDT;
  private int artNextFreeNodeNumber = 1;
  public static class ARTAT_ART_id_number extends ARTGLLAttributeBlock {
    protected String STYLE_COLOUR;
    public String toString() {
      String ret = "";
    ret += " STYLE_COLOUR=" + STYLE_COLOUR;
      return ret + " ";
}
  }

  public static class ARTAT_ART_key extends ARTGLLAttributeBlock {
    protected String STYLE_COLOUR;
    public String toString() {
      String ret = "";
    ret += " STYLE_COLOUR=" + STYLE_COLOUR;
      return ret + " ";
}
  }

  public void ARTRD_O_array_values(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
  ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
      /*O_array_values ::= array_values .*/
      case ARTL_ART_O_array_values_7: 
                ARTRD_O_array_values(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
        artNewWriteable = false; artNewParent = artParent;
        ARTRD_array_values(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
                break;
      /*O_array_values ::= # .*/
      case ARTL_ART_O_array_values_11: 
                ARTRD_O_array_values(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                        break;
        default:
          throw new ARTException("ARTRD_O_array_values: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_O_exponent(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*O_exponent ::= exp_letter O_sign . digits */
    case ARTL_ART_O_exponent_18: 
      artNewWriteable = false; artNewParent = artParent;
      ARTRD_exp_letter(artSPPFPackNodeLeftChild(artPackNode), artNewParent, artNewWriteable);
            artNewWriteable = false; artNewParent = artParent;
      ARTRD_O_sign(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
    /*O_exponent ::= exp_letter O_sign digits .*/
    case ARTL_ART_O_exponent_20: 
            ARTRD_O_exponent(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
      artNewWriteable = false; artNewParent = artParent;
      ARTRD_digits(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
    /*O_exponent ::= # .*/
    case ARTL_ART_O_exponent_24: 
            ARTRD_O_exponent(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_O_exponent: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_O_fraction(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*O_fraction ::= '.' digits .*/
    case ARTL_ART_O_fraction_31: 
                        artNewWriteable = false; artNewParent = artParent;
      ARTRD_digits(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
    /*O_fraction ::= # .*/
    case ARTL_ART_O_fraction_35: 
            ARTRD_O_fraction(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_O_fraction: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_O_members(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*O_members ::= members .*/
    case ARTL_ART_O_members_40: 
            ARTRD_O_members(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
      artNewWriteable = false; artNewParent = artParent;
      ARTRD_members(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
    /*O_members ::= # .*/
    case ARTL_ART_O_members_44: 
            ARTRD_O_members(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_O_members: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_O_minus(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*O_minus ::= '-' .*/
    case ARTL_ART_O_minus_49: 
            ARTRD_O_minus(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
    /*O_minus ::= # .*/
    case ARTL_ART_O_minus_53: 
            ARTRD_O_minus(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_O_minus: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_O_sign(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*O_sign ::= '+' .*/
    case ARTL_ART_O_sign_58: 
            ARTRD_O_sign(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
    /*O_sign ::= O_minus .*/
    case ARTL_ART_O_sign_62: 
            ARTRD_O_sign(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
      artNewWriteable = false; artNewParent = artParent;
      ARTRD_O_minus(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_O_sign: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_array(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*array ::= '[' O_array_values . ']' */
    case ARTL_ART_array_69: 
                  artNewWriteable = false; artNewParent = artParent;
      ARTRD_O_array_values(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
    /*array ::= '[' O_array_values ']' .*/
    case ARTL_ART_array_71: 
            ARTRD_array(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_array: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_array_values(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*array_values ::= value .*/
    case ARTL_ART_array_values_76: 
            ARTRD_array_values(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeRightExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeLabel(artSPPFPackNodeRightChild(artPackNode)), null));
      ARTRD_value(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
    /*array_values ::= array_values ',' . value */
    case ARTL_ART_array_values_82: 
      artNewWriteable = false; artNewParent = artParent;
      ARTRD_array_values(artSPPFPackNodeLeftChild(artPackNode), artNewParent, artNewWriteable);
                        break;
    /*array_values ::= array_values ',' value .*/
    case ARTL_ART_array_values_84: 
            ARTRD_array_values(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeRightExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeLabel(artSPPFPackNodeRightChild(artPackNode)), null));
      ARTRD_value(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_array_values: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_boolean(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*boolean ::= 'true' .*/
    case ARTL_ART_boolean_89: 
            ARTRD_boolean(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
    /*boolean ::= 'false' .*/
    case ARTL_ART_boolean_93: 
            ARTRD_boolean(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_boolean: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_bson_id(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_id_number id_number1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*bson_id ::= 'ObjectId(' id_number . ')' */
    case ARTL_ART_bson_id_100: 
                  artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeRightExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeLabel(artSPPFPackNodeRightChild(artPackNode)), id_number1));
      ARTRD_id_number(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable, id_number1);
            break;
    /*bson_id ::= 'ObjectId(' id_number ')' .*/
    case ARTL_ART_bson_id_102: 
      id_number1 = new ARTAT_ART_id_number();
            ARTRD_bson_id(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable, id_number1);
                  break;
        default:
          throw new ARTException("ARTRD_bson_id: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_bson_no_quote(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*bson_no_quote ::= &ID .*/
    case ARTL_ART_bson_no_quote_107: 
            ARTRD_bson_no_quote(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
    /*bson_no_quote ::= digits .*/
    case ARTL_ART_bson_no_quote_111: 
            ARTRD_bson_no_quote(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeRightExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeLabel(artSPPFPackNodeRightChild(artPackNode)), null));
      ARTRD_digits(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
    /*bson_no_quote ::= `$ bson_no_quote .*/
    case ARTL_ART_bson_no_quote_117: 
                        artNewWriteable = false; artNewParent = artParent;
      ARTRD_bson_no_quote(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
    /*bson_no_quote ::= bson_no_quote `- . bson_no_quote */
    case ARTL_ART_bson_no_quote_123: 
      artNewWriteable = false; artNewParent = artParent;
      ARTRD_bson_no_quote(artSPPFPackNodeLeftChild(artPackNode), artNewParent, artNewWriteable);
                        break;
    /*bson_no_quote ::= bson_no_quote `- bson_no_quote .*/
    case ARTL_ART_bson_no_quote_125: 
            ARTRD_bson_no_quote(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
      artNewWriteable = false; artNewParent = artParent;
      ARTRD_bson_no_quote(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_bson_no_quote: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_digit(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*digit ::= '0' .*/
    case ARTL_ART_digit_130: 
            ARTRD_digit(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
    /*digit ::= non_zero_digits .*/
    case ARTL_ART_digit_134: 
            ARTRD_digit(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
      artNewWriteable = false; artNewParent = artParent;
      ARTRD_non_zero_digits(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_digit: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_digits(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*digits ::= digits digit .*/
    case ARTL_ART_digits_141: 
            artNewWriteable = false; artNewParent = artParent;
      ARTRD_digits(artSPPFPackNodeLeftChild(artPackNode), artNewParent, artNewWriteable);
            artNewWriteable = false; artNewParent = artParent;
      ARTRD_digit(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
    /*digits ::= digit .*/
    case ARTL_ART_digits_145: 
            ARTRD_digits(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
      artNewWriteable = false; artNewParent = artParent;
      ARTRD_digit(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_digits: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_exp_letter(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*exp_letter ::= "e" .*/
    case ARTL_ART_exp_letter_150: 
            ARTRD_exp_letter(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_exp_letter: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_id_number(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_id_number id_number) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*id_number ::= &STRING_SQ .*/
    case ARTL_ART_id_number_157: 
      id_number.STYLE_COLOUR = "red";
      ARTRD_id_number(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable, id_number);
                  break;
        default:
          throw new ARTException("ARTRD_id_number: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_key(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_key key) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*key ::= string .*/
    case ARTL_ART_key_164: 
      key.STYLE_COLOUR = "blue";
      ARTRD_key(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable, key);
      artNewWriteable = false; artNewParent = artParent;
      ARTRD_string(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
    /*key ::= bson_no_quote .*/
    case ARTL_ART_key_170: 
      key.STYLE_COLOUR = "blue";
      ARTRD_key(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable, key);
      artNewWriteable = false; artNewParent = artParent;
      ARTRD_bson_no_quote(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_key: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_members(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*members ::= members ',' . pair */
    case ARTL_ART_members_177: 
      artNewWriteable = false; artNewParent = artParent;
      ARTRD_members(artSPPFPackNodeLeftChild(artPackNode), artNewParent, artNewWriteable);
                        break;
    /*members ::= members ',' pair .*/
    case ARTL_ART_members_179: 
            ARTRD_members(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeRightExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeLabel(artSPPFPackNodeRightChild(artPackNode)), null));
      ARTRD_pair(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable, null);
            break;
    /*members ::= pair .*/
    case ARTL_ART_members_183: 
            ARTRD_members(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeRightExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeLabel(artSPPFPackNodeRightChild(artPackNode)), null));
      ARTRD_pair(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable, null);
            break;
        default:
          throw new ARTException("ARTRD_members: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_no_leading_zeros(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*no_leading_zeros ::= digit .*/
    case ARTL_ART_no_leading_zeros_188: 
            ARTRD_no_leading_zeros(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
      artNewWriteable = false; artNewParent = artParent;
      ARTRD_digit(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
    /*no_leading_zeros ::= non_zero_digits digits .*/
    case ARTL_ART_no_leading_zeros_194: 
            artNewWriteable = false; artNewParent = artParent;
      ARTRD_non_zero_digits(artSPPFPackNodeLeftChild(artPackNode), artNewParent, artNewWriteable);
            artNewWriteable = false; artNewParent = artParent;
      ARTRD_digits(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_no_leading_zeros: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_non_zero_digits(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*non_zero_digits ::= '1' .*/
    case ARTL_ART_non_zero_digits_199: 
            ARTRD_non_zero_digits(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
    /*non_zero_digits ::= '2' .*/
    case ARTL_ART_non_zero_digits_203: 
            ARTRD_non_zero_digits(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
    /*non_zero_digits ::= '3' .*/
    case ARTL_ART_non_zero_digits_207: 
            ARTRD_non_zero_digits(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
    /*non_zero_digits ::= '4' .*/
    case ARTL_ART_non_zero_digits_211: 
            ARTRD_non_zero_digits(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
    /*non_zero_digits ::= '5' .*/
    case ARTL_ART_non_zero_digits_215: 
            ARTRD_non_zero_digits(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
    /*non_zero_digits ::= '6' .*/
    case ARTL_ART_non_zero_digits_219: 
            ARTRD_non_zero_digits(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
    /*non_zero_digits ::= '7' .*/
    case ARTL_ART_non_zero_digits_223: 
            ARTRD_non_zero_digits(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
    /*non_zero_digits ::= '8' .*/
    case ARTL_ART_non_zero_digits_227: 
            ARTRD_non_zero_digits(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
    /*non_zero_digits ::= '9' .*/
    case ARTL_ART_non_zero_digits_231: 
            ARTRD_non_zero_digits(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_non_zero_digits: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_null(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*null ::= 'null' .*/
    case ARTL_ART_null_236: 
            ARTRD_null(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_null: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_number(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*number ::= O_minus no_leading_zeros . O_fraction O_exponent */
    case ARTL_ART_number_243: 
      artNewWriteable = false; artNewParent = artParent;
      ARTRD_O_minus(artSPPFPackNodeLeftChild(artPackNode), artNewParent, artNewWriteable);
            artNewWriteable = false; artNewParent = artParent;
      ARTRD_no_leading_zeros(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
    /*number ::= O_minus no_leading_zeros O_fraction . O_exponent */
    case ARTL_ART_number_245: 
      ARTRD_number(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
      artNewWriteable = false; artNewParent = artParent;
      ARTRD_O_fraction(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
    /*number ::= O_minus no_leading_zeros O_fraction O_exponent .*/
    case ARTL_ART_number_247: 
            ARTRD_number(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
      artNewWriteable = false; artNewParent = artParent;
      ARTRD_O_exponent(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_number: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_object(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*object ::= '{' O_members . '}' */
    case ARTL_ART_object_254: 
                  artNewWriteable = false; artNewParent = artParent;
      ARTRD_O_members(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
    /*object ::= '{' O_members '}' .*/
    case ARTL_ART_object_256: 
            ARTRD_object(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_object: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_pair(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_key key1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*pair ::= key ':' . value */
    case ARTL_ART_pair_263: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackNodeLeftChild(artPackNode)), artSPPFNodeRightExtent(artSPPFPackNodeLeftChild(artPackNode)), artSPPFNodeLabel(artSPPFPackNodeLeftChild(artPackNode)), key1));
      ARTRD_key(artSPPFPackNodeLeftChild(artPackNode), artNewParent, artNewWriteable, key1);
                        break;
    /*pair ::= key ':' value .*/
    case ARTL_ART_pair_265: 
      key1 = new ARTAT_ART_key();
            ARTRD_pair(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable, key1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeRightExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeLabel(artSPPFPackNodeRightChild(artPackNode)), null));
      ARTRD_value(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_pair: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_string(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*string ::= &STRING_DQ .*/
    case ARTL_ART_string_270: 
            ARTRD_string(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_string: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void ARTRD_value(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackNode = artSPPFNodePackNodeList(artElement); artPackNode != 0; artPackNode = artSPPFPackNodePackNodeList(artPackNode)) {
      if (artSPPFPackNodeSelected(artPackNode)) {
        switch (artSPPFPackNodeLabel(artPackNode)) {
    /*value ::= string .*/
    case ARTL_ART_value_275: 
            ARTRD_value(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeRightExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeLabel(artSPPFPackNodeRightChild(artPackNode)), null));
      ARTRD_string(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
    /*value ::= number .*/
    case ARTL_ART_value_279: 
            ARTRD_value(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeRightExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeLabel(artSPPFPackNodeRightChild(artPackNode)), null));
      ARTRD_number(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
    /*value ::= object .*/
    case ARTL_ART_value_283: 
            ARTRD_value(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeRightExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeLabel(artSPPFPackNodeRightChild(artPackNode)), null));
      ARTRD_object(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
    /*value ::= array .*/
    case ARTL_ART_value_287: 
            ARTRD_value(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeRightExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeLabel(artSPPFPackNodeRightChild(artPackNode)), null));
      ARTRD_array(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
    /*value ::= null .*/
    case ARTL_ART_value_291: 
            ARTRD_value(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeRightExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeLabel(artSPPFPackNodeRightChild(artPackNode)), null));
      ARTRD_null(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
    /*value ::= boolean .*/
    case ARTL_ART_value_295: 
            ARTRD_value(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeRightExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeLabel(artSPPFPackNodeRightChild(artPackNode)), null));
      ARTRD_boolean(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable);
            break;
    /*value ::= bson_id .*/
    case ARTL_ART_value_299: 
            ARTRD_value(artSPPFPackNodeLeftChild(artPackNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeRightExtent(artSPPFPackNodeRightChild(artPackNode)), artSPPFNodeLabel(artSPPFPackNodeRightChild(artPackNode)), null));
      ARTRD_bson_id(artSPPFPackNodeRightChild(artPackNode), artNewParent, artNewWriteable, null);
            break;
        default:
          throw new ARTException("ARTRD_value: unhandled pack node " + artPackNode + " with label " + artSPPFPackNodeLabel(artPackNode) + " - " + artLabelInternalStrings[artSPPFPackNodeLabel(artPackNode)]);
        }
      }
    }
}

public void artEvaluate(ARTGLLRDTHandle artElement, Object artAttributes, ARTGLLRDTVertex artParent, Boolean artWriteable) throws ARTException {
  switch (artSPPFNodeLabel(artElement.element)) {
    case ARTL_ART_O_array_values: ARTRD_O_array_values(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_O_exponent: ARTRD_O_exponent(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_O_fraction: ARTRD_O_fraction(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_O_members: ARTRD_O_members(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_O_minus: ARTRD_O_minus(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_O_sign: ARTRD_O_sign(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_array: ARTRD_array(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_array_values: ARTRD_array_values(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_boolean: ARTRD_boolean(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_bson_id: ARTRD_bson_id(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_bson_no_quote: ARTRD_bson_no_quote(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_digit: ARTRD_digit(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_digits: ARTRD_digits(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_exp_letter: ARTRD_exp_letter(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_id_number:  ARTRD_id_number(artElement.element, artParent, artWriteable, (ARTAT_ART_id_number) artAttributes); break;
    case ARTL_ART_key:  ARTRD_key(artElement.element, artParent, artWriteable, (ARTAT_ART_key) artAttributes); break;
    case ARTL_ART_members: ARTRD_members(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_no_leading_zeros: ARTRD_no_leading_zeros(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_non_zero_digits: ARTRD_non_zero_digits(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_null: ARTRD_null(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_number: ARTRD_number(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_object: ARTRD_object(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_pair: ARTRD_pair(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_string: ARTRD_string(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_value: ARTRD_value(artElement.element, artParent, artWriteable); break;
  }
}

public ARTGLLRDT artEvaluator() throws ARTException {
  artRDT = new ARTGLLRDT("RDT", artKindOfs, artLabelStrings, artAnnotations, artLexer.artCharacterStringInput);
  ARTGLLRDTVertex artNewParent = new ARTGLLRDTVertex(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artRootSPPFNode),artSPPFNodeRightExtent(artRootSPPFNode),artSPPFNodeLabel(artRootSPPFNode), null));
  artRDT.setRoot(artNewParent);
  boolean artNewWriteable = true;
  artEvaluate(new ARTGLLRDTHandle(artRootSPPFNode), null, artNewParent, artNewWriteable);
  return artRDT;
}
};
