package io;
import java.io.*;

public class RenamingFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\SuguramIO\\SubFolder1\\SubFolder2\\SubFolder3\\sk3.txt");
        file.createNewFile();

        File newName = new File("C:\\SuguramIO\\SubFolder1\\SubFolder2\\SubFolder3\\suguram.txt");
        boolean renamingStatus = file.renameTo(newName);
        System.out.println("Renaming Result : " + renamingStatus);
    }
}
