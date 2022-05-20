package io;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class BufferWriting {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("C:\\Txt_Files\\testing.txt");
        BufferedWriter bufferWriting = new BufferedWriter(file);
        bufferWriting.append("This is done by Buffer Writing");
        bufferWriting.close();
        System.out.println("File is written successfully with the Buffer");
    }
}
