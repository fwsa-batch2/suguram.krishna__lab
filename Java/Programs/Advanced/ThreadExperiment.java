public class ThreadExperiment extends ExtendingTest implements Runnable {

    public static void main(String[] args)  {
        ThreadExperiment obj=new ThreadExperiment();
        Thread obj1 = new Thread(obj);
        obj1.start();
        obj.sleep1();
    }

    public void run(){
        System.out.println("Experiment Success");
    }
}
  
class ExtendingTest{
    public void sleep1(){
        System.out.println("Two Hours");
    }
}
