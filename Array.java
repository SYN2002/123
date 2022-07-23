package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] roll=new int[5];
        float[] marks=new float[5];
        String[] name=new String[5];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the roll of the students: ");
        for (int i=0;i<roll.length;i++){
            roll[i]= sc.nextInt();
        }
//        System.out.println("****************");
//        for (int i=0;i<5;i++){
//            System.out.println(roll[i]);
//        }
        System.out.println(Arrays.toString(roll));
    }
}
