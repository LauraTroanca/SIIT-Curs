/*
 * Ebook Class
 */
package arraysandcollections;

/**
 *
 * @author Troanca
 */
public class EBook extends ElectronicBooks {

    public EBook(String title, String isbn, String authors) {
        super(title, authors, isbn);
    }

    public EBook(EBookReaders recommendedReader, String title, String isbn, String authors) {
        super(title, authors, isbn);
        this.recommendedReader = recommendedReader;
    }
    
    public EBook(EBookReaders recommendedReader, String title, String isbn, String authors, String electronicFormat, int yearOfPublication) {
        super(title, authors, isbn);
        this.recommendedReader = recommendedReader;
    }
    
    
    
    public enum EBookReaders {KINDLE, NOOK, SONY, HANLIN, ALEX, KOBO};
    private EBookReaders recommendedReader;




    
    

    
    
    public EBookReaders getRecommendedReader() {
        return recommendedReader;
    }

    public void setRecommendedReader(EBookReaders recommendedReader) {
        this.recommendedReader = recommendedReader;
    }
}
