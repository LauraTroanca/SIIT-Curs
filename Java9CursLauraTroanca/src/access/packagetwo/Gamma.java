/*
 *Class Gamma in packagtwo
*/

package access.packagetwo;

import access.packageone.Alfa;

/**
 *
 * @author Troanca
 */
public class Gamma {
    
    private int privateGammaVariable = 10;
    protected int protectedGammaVariable = 20;
    int packageGammaVariable = 30;
    public int publicGammaVariable = 40;
    
    public void visibilityInOtherPackage(){
        Alfa alfaObject = new Alfa();
        //System.out.println("Private member visibility:"+ alfaObject.privateAlfaVariable);
        //System.out.println("Protected member visibility:"+ alfaObject.protectedAlfaVariable);
        //System.out.println("Package member visibility:"+ alfaObject.packageAlfaVariable);
        System.out.println("Public member visibility:"+ alfaObject.publicAlfaVariable);
    }
    
}
