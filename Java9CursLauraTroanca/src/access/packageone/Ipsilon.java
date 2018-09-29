/*
 * Ipsilon in packageone
 */
package access.packageone;

/**
 *
 * @author Troanca
 */
public class Ipsilon {
    
    private int privateIpsilonVariable = 10;
    protected int protectedIpsilonVariable = 20;
    int packageIpsilonVariable = 30;
    public int publicIpsilonVariable = 40;
    
    public void visibilityInClass(){
        Alfa alfaObject = new Alfa();
        //System.out.println("Private member visibility:"+ alfaObject.privateAlfaVariable);
        System.out.println("Protected member visibility:"+ alfaObject.protectedAlfaVariable);
        System.out.println("Package member visibility:"+ alfaObject.packageAlfaVariable);
        System.out.println("Public member visibility:"+ alfaObject.publicAlfaVariable);
    }
    
}
