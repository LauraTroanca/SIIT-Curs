/*
 * Obiectul partajat de cele doua threaduri.
 */
package multithreading;

/**
 *
 * @author Troanca
 */
public class Contor {
    
    /** 
     * Metoda incrementeaza valoare.
     */
    private volatile double valoare = 0.0;
    public synchronized void incrementeaza(){
        valoare++;
    }
    
   /**
    * Metoda decrementeaza valoare
    */
    public synchronized void  decrementeaza(){
        valoare--;
    }
    
    /**
     * Metoda returneaza valoarea
     * @return valoare
     */
    public double  getValoare(){
        return valoare;
    }
    
}
