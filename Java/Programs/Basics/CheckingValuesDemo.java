public class CheckingValuesDemo {
    public static void main(String[] args) {
        String a = "Cool down!! Just";
        String b = " five more to go";

        if ( (a+b).equals("Cool down!! Just five more to go") ){
            System.out.println(a+b);
        }
        else{
            System.out.println("Error");
        }


        int x = 4;
        int y= 3;

        if(x == y){
            System.out.println("x and y is equal");
        }
        else{
            System.out.println("Error");
        }


        int i = 3;
        int j = 4;
        int temp = i+j;
        System.out.println(temp);
    }
}
