package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
  
public class BufferReading {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("C:\\Txt_Files\\testing.txt");
        BufferedReader bufferRedear = new BufferedReader(file);

        Scanner scan=new Scanner(bufferRedear);
        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
        scan.close();

    }
}