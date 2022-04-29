package com.ENC;

class inheritance {
    public void firstOut(){
        System.out.println("Hello!! This is First one");
    }
}

class inher1   extends inheritance{
    public  void secondOut()
    {
        System.out.println("This is Second one");
    }

    public static void main(String[] args) {
        inher1 obj = new inher1();
        obj.firstOut();
        obj.secondOut();
    }
}

