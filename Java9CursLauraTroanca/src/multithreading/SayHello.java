/*
 * Say Hello Programm
 */
package multithreading;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Troanca
 */
public class SayHello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     String newLine = System.getProperty("line.separator");   
     String numberOfParameters = args[0];
     int numberOfParam = Integer.parseInt(numberOfParameters);
     try (FileWriter fw = new FileWriter("C:\\Users\\Troanca\\Desktop\\MultithreadingFile.txt")) {
         for(int param=1;param <= numberOfParam;param++){
         fw.append("Hello " + args[param] +" ! "+ newLine);
         // read process environment. System will deliver default variables and also variables defined by me.
         Map<String, String> env = System.getenv();
         String congrats = env.get("TEXT_CONGRATS");
         String hi = env.get("TEXT_HI");
         fw.append("ENVIRONMENT VARIABLE CONGRATS: " + congrats + newLine);
         fw.append("ENVIRONMENT VARIABLE HI: " + hi + newLine);
         fw.append("Hello (to arguments): " + args[param] + newLine);
         System.out.println("ENVIRONMENT VARIABLE CONGRATS: " + congrats);
         System.out.println("ENVIRONMENT VARIABLE HI: " + hi);
         System.out.println("MAIN METHOD ARGUMENT: " + args[param]);
         }
     } catch (IOException ex) {
     Logger.getLogger(SayHello.class.getName()).log(Level.SEVERE, "File could not be open", ex);
     }
    }
    
}
