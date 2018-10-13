/*
 * Try to open a file
 */
package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Troanca
 */
public class OpenFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader r = new BufferedReader(new FileReader("text.txt"));
try {
String firstLine = r.readLine();
} catch (IOException e) {
System.out.println("Cannot read first line from text.txt: “ + e.getMessage());
} finally {
r.close();
}
    }
    
}
