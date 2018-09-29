/*
 * Class Bete extends Alfa
 */
package access.packageone;

/**
 *
 * @author Troanca
 */
public class Beta extends Alfa{
    
    private int privateBetaVariable = 10;
    protected int protectedBetaVariable = 20;
    int packageBetaVariable = 30;
    public int publicBetaVariable = 40;
    
     public void visibilityInSuperClass(){
        //System.out.println("Private member visibility:"+ privateAlfaVariable);
        System.out.println("Protected member visibility:"+ protectedAlfaVariable);
        System.out.println("Package member visibility:"+ packageAlfaVariable);
        System.out.println("Public member visibility:"+ publicAlfaVariable);
    }
    
}
