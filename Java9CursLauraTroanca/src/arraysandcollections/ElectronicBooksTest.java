/*
 * Program for Electronic Books
 */
package arraysandcollections;

import java.util.Arrays;

/**
 *
 * @author Troanca
 */
public class ElectronicBooksTest {

    /**
     * @param args the command line arguments
     */
    
    public static void printArray(ElectronicBooks[] array) {
        for(int x = 0; x < array.length; x++) {
            System.out.println(Arrays.toString(array));
            //System.out.println("Book no. "+ (x+1) + ": " + this.getTitle + " written by " + this.getAuthor);
        }
    }
        
    public static void main(String[] args) {
        
        
        EBook book1 = new EBook("Amintiri din copilarie","Ion Creanga","1111111111111");
        EBook book2 = new EBook("Viata ca o prada","Marin Preda","1111111111112");
        IBook book3 = new IBook("Panza de paianjen","Cella Serghi","1111111111113");        
        
        ElectronicBooks[] arrayForBooks = new ElectronicBooks[3];
        arrayForBooks[0]=book1;
        arrayForBooks[1]=book2;
        arrayForBooks[2]=book3;
        
        printArray(arrayForBooks);
        
        
        
    }
    
}
