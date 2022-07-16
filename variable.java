package com.company;

import java.util.Scanner;

public class variable {
    public static void main(String[] args) {
        int x,y;
        Scanner syn=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        x= syn.nextInt();
        y= syn.nextInt();
        System.out.println("Sum= "+(x+y));
    }
}
