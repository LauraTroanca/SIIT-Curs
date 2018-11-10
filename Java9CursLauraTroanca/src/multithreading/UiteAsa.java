/*
 * Lanseaza thread
 */
package multithreading;

/**
 *
 * @author Troanca
 */
public class UiteAsa {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        Thread tha = new HelloAllThread();
        tha.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Prioritatea threadului tha este: "+tha.getPriority());
        tha.start();
        
        Thread thw = new HelloWorldThread();
        thw.start();
        thw.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Prioritatea threadului thw este: "+thw.getPriority());

 }
    }
    

