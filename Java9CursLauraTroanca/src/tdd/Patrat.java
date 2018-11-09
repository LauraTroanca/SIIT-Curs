/*
 * Patrat
 */
package tdd;

/**
 *
 * @author Troanca
 */
public class Patrat extends PatrulaterDreptunghic {
    
    public static final String PATRAT = " equal";
    public static final String PATRAT_BEGIN = "SQUARE:";
    
    @Override
    public String getDefinition(){
        String definitie = PATRAT_BEGIN + super.getDefinition().substring(0, 25)+PATRAT+super.getDefinition().substring(25)+"." ;
        return definitie;
    }
    
}
