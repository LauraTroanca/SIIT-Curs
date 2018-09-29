/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access.packageone;

/**
 *
 * @author Troanca
 */
public class Alfa {
    
    private int privateAlfaVariable = 10;
    protected int protectedAlfaVariable = 20;
    int packageAlfaVariable = 30;
    public int publicAlfaVariable = 40;
    
    public void visibilityInClass(){
        System.out.println("Private member visibility:"+ privateAlfaVariable);
        System.out.println("Protected member visibility:"+ protectedAlfaVariable);
        System.out.println("Package member visibility:"+ packageAlfaVariable);
        System.out.println("Public member visibility:"+ publicAlfaVariable);
    }
}
