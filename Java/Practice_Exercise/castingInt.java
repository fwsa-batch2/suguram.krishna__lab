public class castingInt {
    public static void main(String args[]){
        int price = 10;
        // int finalPrice = price * 10.5/100; //casting error
        int finalPrice = price * (int)10.5/100;
        System.out.println(finalPrice);
    }
}
