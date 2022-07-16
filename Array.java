package com.company;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] roll=new int[10];
        float[] marks=new float[10];
        String[] name=new String[10];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the roll of the students: ");
        for (int i=0;i<5;i++){
            roll[i]= sc.nextInt();
        }
        System.out.println("****************");
        for (int i=0;i<5;i++){
            System.out.println(roll[i]);
        }
    }
}
