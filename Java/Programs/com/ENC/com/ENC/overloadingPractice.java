package com.ENC;


class Calc{
    public void add(int a, int b){
        System.out.println(a+b);
    }

    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public void add(double a, double b){
        System.out.println(a+b);
    }

}

public class overloadingPractice {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.add(5, 5);
        obj.add(12, 4, 10);;
        obj.add(90.3, 93.4);
    }
}
