/*
 * ElectronicBooks Class
 */
package arraysandcollections;

/**
 *
 * @author Troanca
 */
public class ElectronicBooks {
    
    private String title;
    private String isbn;
    private String authors; //array de string
    private String downloadLinks;//array de strings
    private String remarksAndNotes; // la fel
    private String publisher;
    private float price;
    private String electronicFormat;
    private int yearOfPublication;

    public ElectronicBooks(String title, String isbn, String authors) {
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
    }
    
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getDownloadLinks() {
        return downloadLinks;
    }

    public void setDownloadLinks(String downloadLinks) {
        this.downloadLinks = downloadLinks;
    }

    public String getRemarksAndNotes() {
        return remarksAndNotes;
    }

    public void setRemarksAndNotes(String remarksAndNotes) {
        this.remarksAndNotes = remarksAndNotes;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getElectronicFormat() {
        return electronicFormat;
    }

    public void setElectronicFormat(String electronicFormat) {
        this.electronicFormat = electronicFormat;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    
 
       
            
}
