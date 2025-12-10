import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ParserMainD2 {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName(args[0]);
        deliverable2Lexer lexer = new deliverable2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        deliverable2Parser parser = new deliverable2Parser(tokens);

        ParseTree parsetree = parser.program();
        System.out.println(parsetree.toStringTree(parser));
    }
}