package Programs.Exercise;
import java.util.Scanner;
public class FactorialExercise {
    public static void main (String[] args)
    {
    System.out.println("Enter A Number");
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    long factorial = 1;
    for(long i = 1; i <= num; i++)
    {
        factorial = factorial * i;
    }
    scan.close();
    System.out.println("Factorial of the given number is "+factorial);;
}
}

