/*
* Given the following class, called NumberHolder, write some code that creates
* an instance of the class, initializes its
* two member variables, and then displays the value of each member variable.
* public class NumberHolder {
* 3 public int anInt;
* 4 public float aFloat;
* 5 }
 */
package numberholder;

/**
 *
 * @author Troanca
 */
public class NumberHolder {
    
    public int anInt;
    public float aFloat;
    
    public static void main(String[] args) {
        NumberHolder o1 = new NumberHolder();
        o1.anInt=1;
        o1.aFloat=(float) 1.25;
        System.out.println("Numarul intreg este: "+o1.anInt);
        System.out.println("Numarul real este: "+o1.aFloat);
        
    }
    
}
