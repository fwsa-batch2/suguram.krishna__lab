public class ThreadUsingExtends extends Thread {

    public void run(){
        System.out.println("Swetha is one of my best friend I have ever got");
    }
    public static void main(String[] args) {
        ThreadUsingExtends obj = new ThreadUsingExtends();
        obj.start();
    }
}
