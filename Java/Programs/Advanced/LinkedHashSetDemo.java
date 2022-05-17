import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
    LinkedHashSet<Integer> newhs = new LinkedHashSet<Integer>();
        newhs.add(14);
        newhs.add(27);
        newhs.add(45);
        newhs.add(18);
        newhs.add(21);
        System.out.println(newhs);
        newhs.toArray();

        // try{
            LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(newhs);
            System.out.println("After removing duplicates"+ lhs);
        // }
        // catch(Exception e){
        //     System.out.println("error");
        // }

        LinkedHashSet <Integer>hs = new LinkedHashSet<Integer>();

        hs.toArray(); //Used to change a collection to array

        hs.add(15);
        hs.add(32);
        hs.add(250);
        hs.add(70);
        hs.add(46);
        // try{
            System.out.println(hs.add(250));

        // }
        // catch(Exception w){
        //     System.out.println("ee");
        // }

        System.out.println(hs);

    }
}
