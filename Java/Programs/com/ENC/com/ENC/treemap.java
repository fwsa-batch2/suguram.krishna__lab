package com.ENC;

import java.util.*;

public class treemap {
    public static void main(String[] args) {
    
        TreeMap<Integer, String> values = new TreeMap<>();

        // Insert elements to map
        values.put(1, "Volkswagen");
        values.put(2, "BMW");
        values.put(6, "Audi");
        values.put(4, "Tata");
        values.put(5, "Jaguar");
    
        System.out.println("Map using TreeMap: " + values);

        // Access keys of the map
        System.out.println("Keys: " + values.keySet());


        // Access values of the map
        System.out.println("Values: " + values.values());


        // Access entries of the map
        System.out.println("Entries: " + values.entrySet());

        // Replacing the values
        values.replace(4, "Land Rover");
       
    
        System.out.println("After Replacing: " + values);

        // Remove elements from the map
        String removedValue = values.remove(2);
        System.out.println("Removed Value: " + removedValue);

        
        System.out.println("New Map after removed element: " + values);

    }
}
