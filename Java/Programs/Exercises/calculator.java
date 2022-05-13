package Programs.Exercises;

import java.util.Scanner;
public class calculator {
    public static void main (String args[]){
        Scanner firstNo = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int x = firstNo.nextInt();
        Scanner secondNo = new Scanner(System.in);
        System.out.println("Enter the second Number");
        int y = secondNo.nextInt();
        int z = x;
        System.out.println("Sum of the " +x +"and" +y +"is: " +add(x,y));
        System.out.println("Subtraction of the " +x +" and " +y +"is: " +sub(x,y));
        System.out.println("Multiplication of the " +x +" and " +y +"is: " +product(x,y));
        System.out.println("Division of the " +x +" and " +y +"is: " +division(x,y));
        System.out.println("Exponent of the " +x +" and " +y +"is: " +exponent(x,y,z));
        firstNo.close();
        secondNo.close();
    }

    public static int add(int x,int y){
        return x+y;
    }

    public static int sub(int x, int y){
        return x-y;
    }

    public static int product(int x, int y){
        return x*y;
    }

    public static float division(float x, float y){
        return x/y;
    }

    public static int exponent(int x, int y, int z){
        for(int i=1; i<y; i++){
            z = z*x;
        } 
        return z;
    }
    // public static int exponent(int x, int y){
    //     int z = 1;
    //     for(int i=1; i<=y; i++){
    //         z = z*x;
    //     } 
    //     return z;
    // }
}
