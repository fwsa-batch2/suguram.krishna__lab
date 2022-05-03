package com.ENC;

class parentClass{
    public void testing(){
        System.out.println("Hello! This is Parent Class");
    }
}

class childClass extends parentClass{
    @Override
    public void testing(){
        System.out.println("Hello! This is Child Class");
    }
}

public class overridingPractice {
    public static void main(String[] args) {
        childClass obj = new childClass();
        obj.testing();
    }
}
