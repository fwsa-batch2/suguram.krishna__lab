package Practice_Exercise;

public class factorial {
    public static void main (String[] args)
    {
    int num = 5;
    int factorial = 1;
    for(int i = 1; i <= num; ++i)
    {
        factorial = factorial * i;
    }
    System.out.println("Factorial of the given number is "+factorial);;
}
}

