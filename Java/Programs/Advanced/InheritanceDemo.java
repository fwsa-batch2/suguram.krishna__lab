public class InheritanceDemo {

    public static void main(String[] args) {
        inher1 obj = new inher1();
        obj.firstOut();
        obj.secondOut();
    }

    public void firstOut(){
        // System.out.println("Hello!! This is First one");
        System.out.println("Thank you guys Varataa!!!!");
    }
}

class inher1   extends InheritanceDemo{
    public  void secondOut()
    {
        // System.out.println("This is Second one");
        System.out.println("If you want to contact mail to www.pichu.com");
    }

}
