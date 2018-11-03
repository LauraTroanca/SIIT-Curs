/*
 * Dreptunghi
 */
package tdd;

/**
 *
 * @author Troanca
 */
public class Dreptunghi extends PatrulaterDreptunghic {
    
    public static final String DREPTUNGHI = " especially one with unequal adjacent sides, in contrast to a square.";
    public static final String DREPTUNGHI_BEGIN = " RECTANGLE:";
    
    @Override
    public String getDefinition(){
        String definitie = DREPTUNGHI_BEGIN + super.getDefinition()+DREPTUNGHI ;
        return definitie;
    }
    
}
