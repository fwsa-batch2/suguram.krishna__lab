package io;
import java.io.*;

public class ListingFiles {
    public static void main(String[] args) {
        File file = new File("C:\\suguram.krishna__lab");
        File[] filesInFolder = file.listFiles();
        for(File onlyFiles : filesInFolder)
          if(onlyFiles.isFile())
          System.out.println(onlyFiles);
        
        System.out.println(" ");
        System.out.println(" ");


        //Getting the Folders
        for(File onlyFolder: filesInFolder)
           if(onlyFolder.isDirectory())
           System.out.println(onlyFolder);
    }
}
