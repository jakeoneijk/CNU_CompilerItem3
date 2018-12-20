import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class main {
	public static void main(String... args) throws Exception{
		MiniGoLexer lexer = new MiniGoLexer(CharStreams.fromFileName(main.class.getResource("").getPath()+"test.go"));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MiniGoParser parser = new MiniGoParser(tokens);
		ParseTree tree = parser.program();
		
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(new UCodeGenListener(), tree);
		
	}

}
