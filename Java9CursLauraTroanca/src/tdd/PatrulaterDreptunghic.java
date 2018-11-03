/*
 * Pat Dr
 */
package tdd;

/**
 *
 * @author Troanca
 */
public class PatrulaterDreptunghic extends Patrulater {
    
    public static final String DREPTUNGHIC = "and four right angles";
    
    public String getDefinition() {
        String definitie = super.getDefinition() + DREPTUNGHIC;
        return definitie;
    }
    
}
