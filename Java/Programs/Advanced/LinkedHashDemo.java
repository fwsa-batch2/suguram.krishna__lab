import java.util.*;

public class LinkedHashDemo {
    public static void main(String args[]) {  
        LinkedHashMap<String, Integer> map=new LinkedHashMap<>();        
         // Insert elements to the map
         map.put("One", 240);
         map.put("Two", 241);
         map.put("Three", 242);
         map.put("Six", 243);
         map.put("Five", 244);
         map.put(null,244);
         map.put("Seven",null);
         map.put(null,null);
     
         System.out.println("Map: " + map);
     
         // Access keys of the map
         System.out.println("Keys: " + map.keySet());
     
         // Access values of the map
         System.out.println("Values: " + map.values());
     
         // Access entries of the map
         System.out.println("Entries: " + map.entrySet());
     

         // Remove Elements from the map
         int value = map.remove("Two");
         System.out.println("Removed Value: " + value);
         System.out.println("Entries: " + map.entrySet());
       }  
}