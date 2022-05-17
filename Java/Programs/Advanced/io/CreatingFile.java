package io;

import java.io.File;
import java.io.IOException;

public class CreatingFile {
    public static void main(String[] args) {
        File file = new File("C:\\SuguramIO\\SubFolder1\\SubFolder2\\SubFolder3\\sk3.txt");
        boolean existence = false;
        if(existence == false)
        try{
            boolean fileCreated = file.createNewFile();
            System.out.println("File Created" +fileCreated);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
