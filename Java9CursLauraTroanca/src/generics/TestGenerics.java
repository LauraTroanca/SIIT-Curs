/*
 * Java program to test Generics
 */
package generics;

/**
 *
 * @author Troanca
 */
public class TestGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create a box for Integers
        GenericBox<Integer> boxForInteger = new GenericBox<>();
        Integer value = 5;
        boxForInteger.setContent(value);
        
        System.out.println("Box of Integers contains:" + boxForInteger.getContent().toString());
        
        //create a box for String
        GenericBox<String> boxForString = new GenericBox<>();
        String message = "Hello Java 9 collegues";
        boxForString.setContent(message);
        System.out.println("Box of String ontains:" + boxForString.getContent());
        
        //create a box for Viezure
        GenericBox<Viezure> boxForViezure = new GenericBox<>();
        Viezure viezurelePrim = new Viezure();
        boxForViezure.setContent(viezurelePrim);
        System.out.println("Box of Viezure contains:" + boxForViezure.getContent().getNumarPicioareViezure());
       
        
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.setContent(14);
        //integerBox.inspect("some text"); // error: this is still String!
        System.out.println("IntegerBox contains:" + integerBox.getContent());
        
        // call inspect method with an Integer parameter
        Integer intObject;
        intObject= 20;
        integerBox.inspect(intObject);
        
        // call inspet method with a Double object
        Double doubleObject;
        doubleObject = 30.30;
        integerBox.inspect(doubleObject);
        
        //copiat din slide-ul de la curs
        // create three keys as Integers
        Integer key1 = 10;
        Integer key2 = 20;
        Integer key3 = 30;
        Integer key4 = 40;
        // create three values as Strings
        String value1 = "Value 1";
        String value2 = "Value 2";
        String value3 = "Value 3";
        
        // Declare, instantiate and initialized three OrderedPair objects
        OrderedPair<Integer, String> orderedPair1, orderedPair2, orderedPair3;
        orderedPair1 = new OrderedPair<>(key1,value1);
        orderedPair2 = new OrderedPair<>(key2,value2);
        orderedPair3 = new OrderedPair<>(key3,value3);
        
        // print values of all three objects
        System.out.println("OrderedPair1("+orderedPair1.getKey()+","+orderedPair1.getValue()+")");
        System.out.println("OrderedPair2("+orderedPair2.getKey()+","+orderedPair2.getValue()+")");
        System.out.println("OrderedPair3("+orderedPair3.getKey()+","+orderedPair3.getValue()+")");
        
        // Create a new Box instance        
        // create a Box for Integers
        Box<Integer> intBox = new Box<>();
        // set value of Integer field t to 80
        intBox.set(80);
        OrderedPair<Integer, Box<Integer>> interestingPair;
        interestingPair = new OrderedPair<>(key4, intBox);
        System.out.println("InterestingPair("+interestingPair.getKey()+","+interestingPair.getValue()+")");
        System.out.println("InterestingPair("+interestingPair.getKey()+","+interestingPair.getValue().get()+")");
        // using raw type
        Box rawBox = intBox;
        System.out.println("Raw Box ("+ rawBox.get()+")");
    }   
}
