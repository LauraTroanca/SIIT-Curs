/*
 * Program for Receiver and Sender threads
 * https://www.baeldung.com/java-wait-notify
 */
package multithreading;

/**
 *
 * @author Troanca
 */
public class TheProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TheWorkBuffer data = new TheWorkBuffer();
        Thread sender = new Thread(new TheSender(data));
        Thread receiver = new Thread(new TheReceiver(data));

        sender.start();
        receiver.start();
    }
    
}
