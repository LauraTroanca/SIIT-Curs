/*
 * Program for Electronic Books
 */
package arraysandcollections;

import static arraysandcollections.EBook.EBookReaders.KINDLE;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

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
   
    /*
    // override equal method for hashSetForBooks to check by isbn
    @Override
    public boolean equals(Object o){
    boolean is = false; 
    //code
    //code
    return is;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
            
    */        
            
    public static void main(String[] args) {
        
        // create ElectronicBooks objects
        EBook book1 = new EBook("Amintiri din copilarie","Ion Creanga","1111111111111");
        book1.setYearOfPublication(2015);
        EBook book2 = new EBook("Viata ca o prada","Marin Preda","1111111111112");
        IBook book3 = new IBook("Panza de paianjen","Cella Serghi","1111111111113"); 
        EBook book4 = new EBook(KINDLE,"Amintiri din copilarie","Ion Creanga","1111111111111","mobi", 2010);
        
        // create and print an Array
        ElectronicBooks[] arrayForBooks = new ElectronicBooks[10];
        arrayForBooks[0]=book1;
        arrayForBooks[1]=book2;
        arrayForBooks[2]=book3;
        arrayForBooks[3]=book4;
        System.out.println("----------Array------------");
        printArray(arrayForBooks);
        
        // create and print an ArrayList
        ArrayList<ElectronicBooks> arrayListForBooks = new ArrayList<>();
        arrayListForBooks.add(book3);
        arrayListForBooks.add(book2);
        arrayListForBooks.add(2,book1);
        arrayListForBooks.add(book4);
        System.out.println("----------ArrayList------------");
        for(ElectronicBooks str: arrayListForBooks){
			System.out.println(str.getTitle()+", scris de "+ str.getAuthors());
        }
        
        //create and print a LinkedList
        LinkedList<ElectronicBooks> linkedListForBooks = new LinkedList<>();
        linkedListForBooks.add(book3);
        linkedListForBooks.add(book2);
        linkedListForBooks.addFirst(book1);
        linkedListForBooks.add(book4);
        System.out.println("----------LinkedList------------");
        for(ElectronicBooks str: linkedListForBooks){
			System.out.println(str.getTitle()+", scris de "+ str.getAuthors());
        }
        
        //create and print a HashSet
        HashSet<ElectronicBooks> hashSetForBooks = new HashSet<>();
        hashSetForBooks.add(book1);
        hashSetForBooks.add(book2);
        hashSetForBooks.add(book3);
        hashSetForBooks.add(book4);
        System.out.println("----------HashSet------------");
        System.out.println("There are "+ hashSetForBooks.size() + " books in this library:");
        int x=1;
        for(ElectronicBooks str: hashSetForBooks){       
            System.out.println(x+ ". "+ str.getTitle()+", scris de "+ str.getAuthors()+", isbn: "+ str.getIsbn());
            x++;
            
        }
        
      
        
        
    }   
}
