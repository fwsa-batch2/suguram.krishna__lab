package com.ENC;

class inheritance {
    public void firstOut(){
        // System.out.println("Hello!! This is First one");
        System.out.println("Thank you guys Varataa!!!!");
    }
}

class inher1   extends inheritance{
    public  void secondOut()
    {
        // System.out.println("This is Second one");
        System.out.println("If you want to contact mail to www.pichu.com");
    }

    public static void main(String[] args) {
        inher1 obj = new inher1();
        obj.firstOut();
        obj.secondOut();
    }
}

