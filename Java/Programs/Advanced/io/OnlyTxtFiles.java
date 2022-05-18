package io;
import java.io.*;;
public class OnlyTxtFiles {
    public static void main(String[] args) {
        File file = new File("C:\\suguram.krishna__lab");
        File [] txtFiles = file.listFiles();
        for(File f : txtFiles){
            if(f.isFile()){
                String fileName = f.getName();
                System.out.println(fileName);
                int lastDot = fileName.lastIndexOf(".");
                String extension = fileName.substring(lastDot+1);
                if(extension.equals("txt"))
                System.out.println(fileName);
            }
        }
    }
}
