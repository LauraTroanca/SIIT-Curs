/*
 * Program to test generic method
 */
package genericmethod;

/**
 *
 * @author Troanca
 */
public class TestForGenericMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // call a generyc type method
        PairClass<Integer, String> p1 = new PairClass<>(1, "apple");
        PairClass<Integer, String> p2 = new PairClass<>(2, "pear");
        PairClass<Integer, String> p3 = new PairClass<>(1, "apple");
        
        System.out.println("P1 ="+ p1.getKey()+", "+p1.getValue());
        
        boolean same;
        same = Util.<Integer, String>compare(p1, p2);
        System.out.println("("+p1.getKey()+","+p1.getValue()+") is equal with ("+p2.getKey()+","+p2.getValue()+") is "+same);
        
        same = Util.<Integer, String>compare(p1, p3);
        System.out.println("("+p1.getKey()+","+p1.getValue()+") is equal with ("+p3.getKey()+","+p3.getValue()+") is "+same);
    }
    
}
