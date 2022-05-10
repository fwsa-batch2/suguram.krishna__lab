class Calc {
    public int add(int firstNum,int secondNum){
        return firstNum+secondNum;
    }
    public int sub(int firstNum,int secondNum){
        return firstNum-secondNum;
    }
}

class SuperCalc extends Calc{
    public int modulo(int firstNum, int secondNum){
        return firstNum%secondNum; 
    }
}     
public class calcUsingInheritance {
    public static void main(String[] args) {
    SuperCalc sumClass = new SuperCalc();
    int sum = sumClass.add(12,14);
    int sub = sumClass.sub(12,4);
    int modulo = sumClass.modulo(12,10);
    System.out.println(sum);
    System.out.println(sub);
    System.out.println(modulo);
    }
}