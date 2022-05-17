package io;
import java.io.*;

public class FolderCreation {
    public static void main(String[] args) {
        File file = new File("C:\\SuguramIO");
        boolean existence = file.exists();
        System.out.println("Folder present : " +existence);
        if(existence == false)
          file.mkdir();

          existence = file.exists();
          System.out.println("Folder present: " +existence);

    }
}
