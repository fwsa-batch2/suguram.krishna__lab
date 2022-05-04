package com.ENC;

public class overloadingPractice {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.add(5,6);
        System.out.println(obj.add(12, 4, 10));
        System.out.println(obj.add(90.3, 93.4));
    }
}


class Calc{
     void add(int a,int b){
    
        System.out.println(a+b);
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }

}

