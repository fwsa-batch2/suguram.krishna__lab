import java.util.*;


public class Arraylistpractice {
    public static void main(String[] args) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++)
            newArray.add(i);
        System.out.println(newArray);

        newArray.remove(4);
        System.out.println(newArray);

        for(int i=0; i<newArray.size(); i++)
        System.out.println(newArray.get(i)+ " ");

        System.out.println(" ");

        ArrayList <Integer> al = new ArrayList<Integer>();
        al.add(19);
        al.add(20);
        al.add(10);
        al.add(15);
        al.add(26);
        al.add(30);
        // al.add("Suguram");
        // al.add(4.5);
        // al.add(true);
        al.add(5,7);
        // System.out.println(al.contains("SK"));
        // System.out.println(al.indexOf("Suguram"));
        // System.out.println(al.remove(4));
        // System.out.println(al.get(0));
        System.out.println("al list" +al);
        // System.out.println(al.add(90));
        // System.out.println(al.size());

        ArrayList <Integer> al2 = new ArrayList<Integer>();
        al2.addAll(al);
        System.out.println("al2 list" +al2);

        ArrayList <Integer> al3 = new ArrayList<Integer>();
        al3.add(14);
        al3.add(16);
        al3.add(32);
        al3.add(42);
        al3.add(45);
        System.out.println("al3 list" +al3);
        al3.addAll(4,al2);
        System.out.println("al3 after inserting the al2" +al3);

        List al4 = al3.subList(0, 5);
        System.out.println(al4);
    }
}
