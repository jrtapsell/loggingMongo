import uk.ac.rhul.cs.csle.art.ARTException;
import uk.ac.rhul.cs.csle.artgll.*;
import uk.ac.rhul.cs.csle.artgraph.*;
import uk.ac.rhul.cs.csle.arttext.*;
/*******************************************************************************
*
* ARTGLLLexer.java
*
*******************************************************************************/
public class ARTGLLLexer extends uk.ac.rhul.cs.csle.artgll.ARTGLLLexerBase {
public void artLexicaliseBuiltinInstances() {
  artUpdateLongestLength(artBuiltin_ID(artCharacterStringInputIndex), ARTGLLParser.ARTTB_ID);
  artUpdateLongestLength(artBuiltin_STRING_DQ(artCharacterStringInputIndex), ARTGLLParser.ARTTB_STRING_DQ);
  artUpdateLongestLength(artBuiltin_STRING_SQ(artCharacterStringInputIndex), ARTGLLParser.ARTTB_STRING_SQ);
}

public void artLexicalisePreparseWhitespaceInstances() {
  artCharacterStringInputIndex += artBuiltin_WHITESPACE(artCharacterStringInputIndex);
}

};
