/*
 * Clasa este un thread paralel care va aduna o unitate la un obiect de tip Contor.
 */
        package multithreading;

/**
 *
 * @author Troanca
 */
public class Adunare extends Thread {
    
    private Contor contor;
    
    //constructor, ca Adunare sa aiba acces la acelasi contor din Contor
    public Adunare(Contor contorulComun){
        contor = contorulComun;   
    }
   
     @Override
    public void run(){
        for(int i=0; i<5000; i++){
        contor.incrementeaza();
        }   
    }
    
}
   
    
