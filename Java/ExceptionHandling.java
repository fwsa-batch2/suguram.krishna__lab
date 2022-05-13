import java.io.IOException;

public class  ExceptionHandling {
    public static void fileFound() throws IOException{
        throw new IOException("File not Found");
    }
    public static void main(String[] args) {
        try{
            fileFound();
        }
        catch(IOException e){

            System.out.println(e);
        }
    }
}
