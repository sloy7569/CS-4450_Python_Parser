import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ParserMainD3 {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName(args[0]);
        deliverable3Lexer lexer = new deliverable3Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        deliverable3Parser parser = new deliverable3Parser(tokens);

        ParseTree parsetree = parser.program();
        System.out.println(parsetree.toStringTree(parser));
    }
}