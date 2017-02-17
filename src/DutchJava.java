import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

/**
 * Created by sklar on 2/17/2017.
 */
public class DutchJava {
    private static void evaluate(String filename) throws IOException {
        // Create input stream
        ANTLRInputStream inputStream = new ANTLRFileStream(filename);

        // Create lexer
        DutchJavaLexer lexer = new DutchJavaLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create parser
        DutchJavaParser parser = new DutchJavaParser(tokens);
        ParseTree tree = parser.parse(); // begin parsing at expression rule

        TypeChecker typeChecker = new TypeChecker();
        typeChecker.visit(tree);
        System.out.println("No errors.");

    }

    public static void main(String[] args) throws IOException {
        evaluate("File.djpp");
    }
}
