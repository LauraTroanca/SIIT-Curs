/*
 * Generic Box 
 */
package generics;

/**
 *
 * @author Troanca
 */
public class GenericBox<T> {
 
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
    
    public <U extends Number> void inspect(U u){
System.out.println("T: " + content.getClass().getName());
System.out.println("U: " + u.getClass().getName());
}

    
}
