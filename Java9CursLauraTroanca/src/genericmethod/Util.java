/*
 * class Util with generic method
 */
package genericmethod;

/**
 * @author Troanca
 */
public class Util {
    
    /** static method returns true or false after comparing two objects by type
    * Pair with two generic parameters K and V (Key and Value)
    * @param <K> generic type key
    * @param <V> generic type value
    * @param p1 formal parameter by type PairClass
    * @param p2 formal parameter by type PairClass
    * @return boolean
    */
    public static <K, V> boolean compare(PairClass<K, V> p1, PairClass<K, V> p2) {
    return p1.getKey().equals(p2.getKey()) &&
    p1.getValue().equals(p2.getValue());
    }    
}
