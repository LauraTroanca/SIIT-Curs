/*
 * Test visibility in Java
 */
package access.test;

import access.packageone.Alfa;
import access.packageone.Beta;
import access.packageone.Ipsilon;
import access.packagetwo.Delta;
import access.packagetwo.Gamma;

/**
 *
 * @author Troanca
 */
public class TestVisibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alfa alfaObject = new Alfa();
        System.out.println("----------alfaObject.visibilityInClass--------");
        alfaObject.visibilityInClass();
        
        Beta betaObject = new Beta();
        System.out.println("----------betaObject.visibilityInSuperClass--------");
        betaObject.visibilityInSuperClass();
        
        Gamma gammaObject = new Gamma();
        System.out.println("----------gammaObject.visibilityInOtherPackage--------");
        gammaObject.visibilityInOtherPackage();
        
        Delta deltaObject = new Delta();
        System.out.println("----------deltaObject.visibilityInSuperclassInOtherPackage--------");
        deltaObject.visibilityInSuperclassInOtherPackage();
        
        Ipsilon ipsilonObject = new Ipsilon();
        System.out.println("----------ipsilonObject.visibilityInSamePackageInOtherClass--------");
        ipsilonObject.visibilityInClass();
        
        
        
    }
    
}
