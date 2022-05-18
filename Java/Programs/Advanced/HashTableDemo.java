import java.util.*;

public class HashTableDemo {
    public static void main(String args[])
    {
      
        Hashtable<Integer, String> hashtable = new Hashtable<>();
  
        // Inserting the Elements
        // using put() method
        hashtable.put(1, "suguram");
        hashtable.put(2, "sugu");
        hashtable.put(3, "ram");
        hashtable.put(4, "sk");
        hashtable.put(5, "sk");
        // hashtable.put(null, "sk");
  
        // Print mappings to the console
        System.out.println("HashTable Mapping" +hashtable);

        // HashSet jeru=new HashSet();

        // jeru.add(12);
        // jeru.add("jeru");
        // jeru.add(true);

        // System.out.println(jeru);

        // Object[] one=jeru.toArray();

        // System.out.println(one);

    }
}