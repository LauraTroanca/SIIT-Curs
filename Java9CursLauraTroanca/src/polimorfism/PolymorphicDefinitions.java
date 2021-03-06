/*
 * Program for polymorphic definitions
 */
package polimorfism;

import java.util.LinkedList;

/**
 *
 * @author Troanca
 */
public class PolymorphicDefinitions {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
// create and initialize a list of different shapes
 LinkedList listOfShapes = new LinkedList();
 listOfShapes.add(new Line());
 listOfShapes.add(new Square());
 listOfShapes.add(new Triangle());
 listOfShapes.add(new Square());
 listOfShapes.add(new Rectangle());
 listOfShapes.add(new Triangle());
 listOfShapes.add(new Rectangle());
 listOfShapes.add(new Line());
 
 // print definitions on console
 short shape = 0;
 try{
 while(listOfShapes.get(shape) != null){
 Shape currentShape;
 // use cast to type is possible because of polymorphic structure
 currentShape = (Shape)listOfShapes.get(shape);
 System.out.println("Definition is: " + currentShape.getDefinition());
 shape++;
 }
 }
 catch(IndexOutOfBoundsException e){
 System.out.println("List of shapes is ended.");
 }
    }
    
}
