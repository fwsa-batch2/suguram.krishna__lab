package io;

import java.io.File;

public class SubFolderCreation {
    public static void main(String[] args) {
        File file = new File("C:\\SuguramIO\\SubFolder1\\SubFolder2\\SubFolder3");
        boolean existence = file.exists();
        System.out.println("Folder present : " +existence);
          if(existence == false)
           file.mkdirs(); 

           existence = file.exists();
           System.out.println("Folder present : "+ existence);
    }
}