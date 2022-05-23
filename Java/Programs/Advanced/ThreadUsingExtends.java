public class ThreadUsingExtends extends Thread {

    public void run(){
        System.out.println("This is Thread using Thread Class");
    }
    public static void main(String[] args) {
        ThreadUsingExtends obj = new ThreadUsingExtends();
        obj.start();
    }
}
