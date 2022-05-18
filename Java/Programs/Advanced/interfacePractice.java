interface Practice{
    void show();


class PracticeImpl implements Practice{
    public void show(){
        System.out.println("Showing...");
    }
}

public class InterfacePractice {
    public static void main(String[] args) {
        Practice obj = new PracticeImpl();
        obj.show();
    }
}
}
