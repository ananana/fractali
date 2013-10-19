/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fractali;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;

/**
 *
 * @author razvan
 */
public class ParseManager {

    public static Fractal parseString(String s) throws RecognitionException {
        return parse(new ANTLRStringStream(s));
    }
    
    public static Fractal parseFile(String fname) throws RecognitionException,
            IOException {
        return parse(new ANTLRFileStream(fname));
    }

    public static Fractal parseURL(URL url) throws IOException, RecognitionException, URISyntaxException {
        return parse(new ANTLRReaderStream(new BufferedReader(new FileReader(
                new File(url.toURI())))));
    }

    public static Fractal parseFromReader(Reader r) 
            throws RecognitionException, IOException {
        return parse(new ANTLRReaderStream(r));
    }

    private static Fractal parse(CharStream cs) throws RecognitionException {
        NAFLLexer l = new NAFLLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(l);
        NAFLParser p = new NAFLParser(tokens);
        NAFLParser.program_return ret = p.program();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream((Tree) ret.tree);
        nodes.setTokenStream(tokens);
        NAFLTranslator t = new NAFLTranslator(nodes);
        return t.fractal();
    }
}
