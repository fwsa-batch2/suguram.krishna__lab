package io;
import java.io.*;

public class ListingAllFilesFolders {
    public static void main(String[] args) {
        File file = new File("C:\\");
        String [] filesAndFolders = file.list();
        // for(int i=0; i<filesAndFolders.length; i++)
        // System.out.println(filesAndFolders);
        for(String s: filesAndFolders)
        System.out.println(s);
    }
}
