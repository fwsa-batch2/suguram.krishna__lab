package Programs.Exercise;

import java.util.Scanner;
public class PerfectNumberExercise {
    public static void main(String args[]){
        System.out.println("Enter a Number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int reaminderResult = 0;
        for(int i=2; i<num; i++){
            int divisor = num%i;
            if(divisor == 0){
                reaminderResult += i;
            }
        }
        System.out.println(reaminderResult);
        if(reaminderResult==num){
            System.out.println("The Number is a Perfect Number");
        }
        else{
            System.out.println("The Number is not a Perfect Number");
        }
        scan.close();
    }
}
