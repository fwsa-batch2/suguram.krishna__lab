package io;

import java.io.*;;

public class DeletingtxtFile {
    public static void main(String[] args) {
        File file = new File("C:\\");
        File[] fileSize = file.listFiles();
        for (File f : fileSize) {
            if (f.isFile()) {
                String fileName = f.getName();
                int lastDot = fileName.lastIndexOf(".");
                String extension = fileName.substring((lastDot + 1));
                if (extension.equals("txt"))
                  f.delete();
                   
            }
        }

    }
}
