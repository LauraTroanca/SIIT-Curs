/*
 * Delta extends Alfa.
 */
package access.packagetwo;

import access.packageone.Alfa;

/**
 *
 * @author Troanca
 */
public class Delta extends Alfa {
    
    private int privateDeltaVariable = 10;
    protected int protectedDeltaVariable = 20;
    int packageDeltaVariable = 30;
    public int publicDeltaVariable = 40;
    
    public void visibilityInSuperclassInOtherPackage(){
        
        //System.out.println("Private member visibility:"+ super.privateAlfaVariable);
        System.out.println("Protected member visibility:"+ super.protectedAlfaVariable);
        //System.out.println("Package member visibility:"+ super.packageAlfaVariable);
        System.out.println("Public member visibility:"+ super.publicAlfaVariable);
    }
    
}
