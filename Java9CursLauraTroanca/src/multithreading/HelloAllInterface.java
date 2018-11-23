/*
 * HelloAllInterface implements Runnable
 */
package multithreading;

/**
 *
 * @author Troanca
 */
public class HelloAllInterface implements Runnable {
    
    
    @Override
 public void run() {
 System.out.println("Hello all");
 //System.out.println("My priority is: " + this.getPriority());
 //System.out.println("My thread ID is: " + this.getId());
 //System.out.println("My thread name is: " + this.getName());
 //System.out.println("My thread state is: " + this.getState());
 //System.out.println("My group of threads is: " + this.getThreadGroup() );
 }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Thread cucu = new Thread(new HelloAllInterface());
        cucu.start();

    }
    
}
