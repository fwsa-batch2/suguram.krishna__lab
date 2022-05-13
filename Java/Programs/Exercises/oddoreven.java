package Programs.Exercises;

import java.util.Scanner;
public class oddoreven {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num % 2 == 0){
            System.out.println("The Given Number is an Even Number");
        }
        else{
            System.out.println("The Given Number is an Odd Number");
        }
        scan.close();
    }

}
