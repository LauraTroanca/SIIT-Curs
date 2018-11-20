/*
 * SleepingThread
 */
package multithreading;

/**
 *
 * @author Troanca
 */
public class SleepingThread {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        
        String[] importantInfo = {
         "We can put a thread on pause,",
         " using static sleep method,",
         " of class Thread.",
         " But is this a perfect and precise way to do that?"
         };
         for (String importantInfo1 : importantInfo) {
         //Pause 4 secunde
         Thread.sleep(4000);
         //Print next String from initial array
         System.out.println(importantInfo1);
 }
    }
    
}
