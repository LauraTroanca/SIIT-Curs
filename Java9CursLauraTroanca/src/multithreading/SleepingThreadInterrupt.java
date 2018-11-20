/*
 * Program for SleepingThreads Class
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Troanca
 */
public class SleepingThreadInterrupt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create two diferent SleepingThread, start them and interrupt one of them
         SleepingThreads st1 = new SleepingThreads();
         SleepingThreads st2 = new SleepingThreads();
         st1.start();
         st2.start();
         // current thread will sleep for 1.5 seconds
         try {
             Thread.sleep(1500);
         } 
         catch (InterruptedException ex) {
        Logger.getLogger(SleepingThreadInterrupt.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         // before to interrupt st1
         st1.interrupt();
    }
    
}
