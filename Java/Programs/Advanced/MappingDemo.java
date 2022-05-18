import java.util.*;

public class MappingDemo {
    public static void main(String[] args) {
        // Creating a map using the HashMap
        HashMap<Integer,String> numbers = new HashMap<>();
    
        // Insert elements to the map
        numbers.put(-1, "Ram");
        numbers.put(-2, "SK");
        numbers.put(-3, "Sugu");
        numbers.put(-4, "Suguram");
        // numbers.put(null,"Ram");
        numbers.put(null,null); //Both key and value can be null
    
        //Showing the Output
        System.out.println("Map: " + numbers);

        /*Output is not shown in a proper sequence because it is a hashmap because 
        they use the hash code which won't show the output in a proper sequence*/


        // Access keys of the map
        System.out.println("Keys: " + numbers.keySet());

        // .keySet() method is used to create a set out of the key elements contained in the hash map
    
        // Access values of the map
        System.out.println("Values: " + numbers.values());

        //In the above sout we are getting the values of the map
    
        // Access entries of the map
        System.out.println("Entries: " + numbers.entrySet());

        //Both the key and value together is know as entries
    
        // Remove Elements from the map
        String value = numbers.remove(1);
        System.out.println("Removed Value: " + value);
        System.out.println("Entries: " + numbers.entrySet());
    }
}
