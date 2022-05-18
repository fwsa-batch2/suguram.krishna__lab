import java.util.*;
public class TreesetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Hello Dell");
        ts.add("Hello Apple");
        ts.add("Hello Google");
        ts.add("Hello Beauty");
        ts.add("Hello world");
        System.out.println(ts);

        System.out.println(ts.contains("Hello"));
        System.out.println(ts.first());
    }
}
