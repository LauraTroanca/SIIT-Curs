/*
 * The Sender Class
 */
package multithreading;

import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author Troanca
 */
public class TheSender implements Runnable{
    
    private TheWorkBuffer data;
  
    // standard constructor
    public TheSender(TheWorkBuffer data) {
        this.data = data;
    }
    
  
    @Override
    public void run() {
        String packets[] = {
          "First packet",
          "Second packet",
          "Third packet",
          "Fourth packet",
          "End"
        };
  
        for (String packet : packets) {
            data.put(packet);
 
            // Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt(); 
                System.out.println(e.getMessage()); 
            }
        }
    }
    
}
