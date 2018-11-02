/*
 * Program for Electronic Books
 */
package arraysandcollections;

import java.util.ArrayList;

/**
 *
 * @author Troanca
 */
public class ElectronicBooksTest {

    /**
     * @param array param for printArray method
     */
    
    public static void printArray(ElectronicBooks[] array) {
        for(int x = 0; x < array.length; x++) {
            System.out.println("Book no. "+ (x+1) + ": " + array[x].getTitle() + " , written by " + array[x].getAuthors());
        }
    }
        
    /**
     *
     * @param args
     */
    
    public static void main(String[] args) {
        
        // create 3 objects
        EBook book1 = new EBook("Amintiri din copilarie","Ion Creanga","1111111111111");
        EBook book2 = new EBook("Viata ca o prada","Marin Preda","1111111111112");
        IBook book3 = new IBook("Panza de paianjen","Cella Serghi","1111111111113");        
        
        // create and print an Array
        ElectronicBooks[] arrayForBooks = new ElectronicBooks[3];
        arrayForBooks[0]=book1;
        arrayForBooks[1]=book2;
        arrayForBooks[2]=book3;
        System.out.println("----------Array------------");
        printArray(arrayForBooks);
        
        // create and print an ArrayList
        ArrayList<ElectronicBooks> arrayListForBooks = new ArrayList<>();
        arrayListForBooks.add(book3);
        arrayListForBooks.add(book2);
        arrayListForBooks.add(2,book1);
        System.out.println("----------ArrayList------------");
        System.out.println(arrayListForBooks);
        for(ElectronicBooks str: arrayListForBooks){
			System.out.println(str);
        }
        
        
    }
    
}
