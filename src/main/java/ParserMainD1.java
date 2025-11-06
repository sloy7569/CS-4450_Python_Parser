import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ParserMainD1 {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName(args[0]);
        deliverable1Lexer lexer = new deliverable1Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        deliverable1Parser parser = new deliverable1Parser(tokens);

        ParseTree parsetree = parser.program();
        System.out.println(parsetree.toStringTree(parser));
    }
}