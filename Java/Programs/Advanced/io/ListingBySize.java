package io;

import java.io.*;;

public class ListingBySize {
    public static void main(String[] args) {
        File file = new File("C:\\suguram.krishna__lab");
        File[] fileSize = file.listFiles();
        for (File f : fileSize) {
            if (f.isFile()) {
                String fileName = f.getName();
                int lastDot = fileName.lastIndexOf(".");
                String extension = fileName.substring((lastDot + 1));
                if (f.length() > 0.5)
                    System.out.println(fileName + "Size : " +f.length());
            }
        }

    }
}
