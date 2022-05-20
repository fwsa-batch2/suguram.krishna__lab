package io;
import java.io.*;


public class WritingFile {
    public static void main(String[] args) throws IOException {
        FileWriter fileWritingFile = new FileWriter("C:\\Txt_Files\\testing.txt");
        fileWritingFile.write("Hello World");
        fileWritingFile.write("Hello Beautiful Pavan");
        fileWritingFile.close();
        System.out.println("Program Successfull");
    }
}
