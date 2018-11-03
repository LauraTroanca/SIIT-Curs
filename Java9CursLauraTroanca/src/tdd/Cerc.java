/*
 * Cerc
 */
package tdd;

/**
 *
 * @author Troanca
 */
public class Cerc extends Plana{
    
    public static final String CIRCLE_BEGIN = "CIRCLE:";
    public static final String CIRCLE = "whose boundary (the circumference) consists of points equidistant from a fixed point (the centre).";
    
    public String getDefinition(){
        String definitie = CIRCLE_BEGIN+super.getDefinition()+CIRCLE;
        return definitie;
        
    }
    
}
