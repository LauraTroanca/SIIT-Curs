/*
 * The Receiver Class
 */
package multithreading;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Troanca
 */
public class TheReceiver implements Runnable {
    
    private TheWorkBuffer load;
  
    // standard constructor

    public TheReceiver(TheWorkBuffer load) {
        this.load = load;
    }
    
  
    @Override
    public void run() {
        for(String receivedMessage = load.take();
          !"End".equals(receivedMessage);
          receivedMessage = load.take()) {
             
            System.out.println(receivedMessage);
 
            // ...
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
                System.out.println(e.getMessage()); 
            }
        }
    }
    
}
