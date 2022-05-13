package Programs.Exercises;

import java.util.Scanner;

public class prime {
    public static void main (String args[]){
        System.out.println("Enter a Number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number == 1){
            System.out.println("1 is neither a prime nor composite");
        }
        else{
            if(number ==2){
                System.out.println("The Given Number is a Prime Number");
            }
            else{
                for(int i=2; i<number; i++){
                    int result = number%i;
                    if(result == 0){
                        System.out.println("The Given Number is a Composite Number");
                        break;
                    }
                    else{
                        System.out.println("The Given Number is a Prime Number");
                    }
                }
            }
        }   
        scan.close();
    }
}
           