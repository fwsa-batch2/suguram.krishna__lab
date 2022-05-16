import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
         LinkedList <Integer> ll = new LinkedList <Integer>();
         ll.add(19);
         ll.add(20);
         ll.add(10);
         ll.add(15);
         ll.add(26);
         ll.add(30);
         System.out.println(ll);
         System.out.println(" ");
         ll.addFirst(26);
         System.out.println(ll);
         System.out.println(" ");
         System.out.println("Before Poll" +ll);
         System.out.println(ll.poll());
         System.out.println("After Poll" +ll);
         ll.offer(404);
         System.out.println("After offer" +ll);
         LinkedList<Integer> ll2 = (LinkedList)ll.clone();
         System.out.println("cloned object" +ll2);
         
    }
}

