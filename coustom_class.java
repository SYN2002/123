package com.company;

class employ{
    int id;
    String name;
    public void details(){
        System.out.println("id="+id);
        System.out.println("name="+name);
    }
}

public class coustom_class {
    public static void main(String[] args) {
        System.out.println("Hello!!");
        employ sayan=new employ();
        sayan.id=12;
        sayan.name="SAYAN";
        employ biswa=new employ();
        biswa.id=126;
        biswa.name="BISWAJIT";
        sayan.details();
        biswa.details();
//        System.out.println(sayan.id);
//        System.out.println(sayan.name);
    }
}
