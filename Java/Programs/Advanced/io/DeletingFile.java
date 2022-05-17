package io;

import java.io.File;
import java.io.IOException;

public class DeletingFile  {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\SuguramIO\\SubFolder1\\SubFolder2\\SubFolder3\\sk3.txt");
        file.delete();
        boolean existence = file.exists();
        System.out.println("File Deleted : " +existence);
    }
}
