import java.util.Scanner;
public class swapping {

        public static void main(String[] args) {
            int a, b, temp;
            Scanner scan = new Scanner(System.in);  
            System.out.println("Enter the value of a and b");  
            a = scan.nextInt();  
            b = scan.nextInt();  
            temp = a;  
            a = b;  
            b = temp;  
            System.out.println("After swapping: "+a +"   " + b);  

            scan.close();
}
}
