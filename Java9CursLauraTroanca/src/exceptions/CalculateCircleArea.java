/*
 * Program to calculate the area of a circle.
 */
package exceptions;

import java.util.Scanner;

/**
 *
 * @author Troanca
 */
public class CalculateCircleArea {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        System.out.println("Insert radius of circle:");
        Scanner sc = new Scanner(System.in);
        double i = sc.nextInt();
        
        
        System.out.println("Circle area for radius "+ i + " is "+ circleArea(i));
    }
    
    static double circleArea(double radius) throws Exception {
    if(radius < 0){
    throw new Exception("radius should be positive");
    }
    return Math.PI * radius * radius;
    }
    
}
