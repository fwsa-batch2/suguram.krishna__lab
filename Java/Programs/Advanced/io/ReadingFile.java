package io;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class ReadingFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Txt_Files\\testing.txt");
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
        scan.close();

    }
}
