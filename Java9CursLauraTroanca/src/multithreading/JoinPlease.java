/*
 * JoinPlease
 */
package multithreading;

/**
 *
 * @author Troanca
 */
public class JoinPlease {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        try{
             System.out.println("Create SleepMessages thread");
             SleepingThreads t = new SleepingThreads();
             t.start();
             //Wait 4x4 seconds
             t.join();
             //Print a message after join
             System.out.println("We did wait to have all texts printed by SleepMessages Thread");
         }
         catch (InterruptedException e) {
             //metoda sleep este intreruptibila.
             System.out.println("I was interrupted");
         }
    }
    
}
