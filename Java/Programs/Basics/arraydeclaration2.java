import java.util.Scanner;
public class arraydeclaration2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int size = scan.nextInt();
        int number[] = new int[size];

        for(int i=0; i<size; i++){
            number[i]=scan.nextInt();
        }

        for(int i=0; i<size;i++){
            System.out.print(number[i]);
        }

        scan.close();
    }
}
