/*
 * Class Triunghi
 */
package tdd;

/**
 *
 * @author Troanca
 */
public class Triunghi extends Plana {
    
    public static final String TRIUNGHI_BEGIN = "TRIANGLE:";
    public static final String TRIUNGHI = "with three straight sides and three angles.";
    
    @Override
    public String getDefinition(){
        
        String definitie = TRIUNGHI_BEGIN + super.getDefinition() + TRIUNGHI;
        return definitie;
    }
    
}
