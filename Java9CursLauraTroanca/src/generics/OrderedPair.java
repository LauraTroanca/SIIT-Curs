/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import javafx.util.Pair;

/**
 * @author Troanca
 */
public class OrderedPair<K, V> {
    
    private K key;
    private V value;
    
    public OrderedPair(K key, V value) {
    this.key = key;
    this.value = value;
    }
    
    
    public K getKey() { 
        return key;
    }
   
    public V getValue() { 
        return value; 
    }
    
}