package Casting;

public class castingInt {
    public static void main(String args[]){
        int price = 10;
        // int finalPrice = price * 10.5/100; //casting error
        int finalPrice = price * (int)10.5/100;
        System.out.println(finalPrice);

        //You can cast small data type to the big data type it is known as Implicit
        //You can cast big data type to small data type but there will be some loss in the data it is known as Explicit

        //Implicit Casting 

        int a = 100;
        System.out.println("This is Int" +a);
        long b =  a;
        System.out.println("This is Long" +b);
        float c = b;
        System.out.println("This is Float" +c);


        //Explicit Casting

        double  d = 99.99d;
        System.out.println("This is Double " +d);
        float e = (float) d;
        System.out.println("This is Float" +e);
        

    }
}
