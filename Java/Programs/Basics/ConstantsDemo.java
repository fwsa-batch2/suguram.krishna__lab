
public class ConstantsDemo {
    public static void main (String args[]){
        int speed = 30; //This can be modified at any time 
        final int maxSpeed = 200; //Final is used to denote it is final
        System.out.println(speed);
        System.out.println(maxSpeed);
        // maxSpeed = speed+maxSpeed; In this line we are trying to update the maxSpeed but as it is final we cant modify it
    }
}
