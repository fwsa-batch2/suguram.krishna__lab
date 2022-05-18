class parentClass{

    //Static Method Overriding 

    // public static void testing(){
    //     System.out.println("Hello! This is Parent Class");
    // }


    public void testing(){
        System.out.println("Hello! This is Parent Class");
    }

}

class childClass extends parentClass{

    // Static Method Overriding

    // @Override
    // public static void testing(){
    //     System.out.println("Hello! This is Child Class");
    // }

    @Override
    public void testing(){
        System.out.println("Hello! This is Child Class");
    }

}

public class OverridingPracticeDemo {

    // Static Method Intialising 

    // public static void main(String[] args) {
    //     // childClass obj = new childClass();
    //     // obj.testing();
    //     childClass.testing();
    // }

    public static void main(String[] args) {
        childClass obj = new childClass();
        obj.testing();
    }

}