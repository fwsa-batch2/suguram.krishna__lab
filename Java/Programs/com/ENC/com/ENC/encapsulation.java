package com.ENC;

class Userdetails{
    String mailId;
    String name;
    String password;

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class encapsulation {
    public static void main (String [] args){
        Userdetails obj = new Userdetails();
        obj.setName("Suguram");
        obj.setMailId("sk@gmail.com");
        obj.setPassword("123");
        System.out.println(obj.getMailId() + " " + obj.getName() + " " + obj.getPassword());
    }
}
