package com.company;

public class opps_class {
    public static void main(String[] args) {
        Student sayan;
        sayan=new Student();
        System.out.println(sayan.name);
    }
}

class Student{
    int roll;
    String name;
    float marks;
    Student(){
        this.roll=12;
        this.name="Sayan Khanra";
        this.marks= 93.85f;
    }
}
