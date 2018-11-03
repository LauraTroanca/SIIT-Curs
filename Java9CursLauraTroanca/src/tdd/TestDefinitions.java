/*
 * Test definitions
 */
package tdd;

import java.util.LinkedList;

/**
 *
 * @author Troanca
 */
public class TestDefinitions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // creeem mai multe instante dein fiecare clasa 
        Dreptunghi d1= new Dreptunghi();
        Dreptunghi d2 = new Dreptunghi();
        Cerc c = new Cerc();
        Patrat p = new Patrat();
        Triunghi t1 = new Triunghi();
        Triunghi t2 = new Triunghi();
        
        // creem o colectie de date si incarcam obiectele in ea
        LinkedList<FiguraGeometrica> listaDeFiguri = new LinkedList();
        listaDeFiguri.add(d1);
        listaDeFiguri.add(d2);
        listaDeFiguri.add(c);
        listaDeFiguri.add(p);
        listaDeFiguri.add(t1);
        listaDeFiguri.add(t2);
        
        //parcurgem lista si listam figurile
        listaDeFiguri.forEach((t) -> {
            System.out.println(t.getDefinition());    
        });
                
    }
    
}
