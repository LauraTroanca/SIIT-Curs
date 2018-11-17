/*
 * Clasa este un thread paralel care va scadea o unitate la un obiect de tip Contor.
 */
package multithreading;

/**
 *
 * @author Troanca
 */
public class Scadere extends Thread {
    
    private Contor contor;
    
    public Scadere(Contor noulContor){
        contor = noulContor;
    }

    
    @Override
    public void run(){
        for(int i=0; i<5000; i++){
        contor.decrementeaza();
        }
        
    
}
}