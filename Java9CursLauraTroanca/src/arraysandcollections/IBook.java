/*
 * IBook Class
 */
package arraysandcollections;

/**
 *
 * @author Troanca
 */
public class IBook extends ElectronicBooks {

    public IBook(String title, String isbn, String authors) {
        super(title, authors, isbn);
    }

    public IBook(IBookReader iBookReader, String title, String isbn, String authors) {
        super(title, authors, isbn);
        this.iBookReader = iBookReader;
    }
    
    
    
    public enum IBookReader {IPHONE, IPAD, APPLE_BOOK};
    private IBookReader iBookReader;
    
   

    public IBookReader getiBookReader() {
        return iBookReader;
    }

    public void setiBookReader(IBookReader iBookReader) {
        this.iBookReader = iBookReader;
    }
    
    
}
