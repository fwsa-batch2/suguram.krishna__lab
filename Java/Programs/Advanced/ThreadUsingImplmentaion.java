import java.lang.Thread;
public class ThreadUsingImplmentaion implements Runnable{

    
    public static void main(String[] args) {
        Runnable obj = new ThreadUsingImplmentaion();
        ((Thread) obj).start();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Jerusheya and Swetha are best friendsd");
    }
}
