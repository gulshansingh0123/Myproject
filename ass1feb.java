package com.java;
import java.util.Scanner;
public class ass1feb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        findNoOfDigits();
        findFactorial();
        System.out.println(isEvenOrOdd(79)?"Number is Even":"Number is Odd");


    }
    private static void findFactorial() {
        int fact=1,num,i=1;
        System.out.print("Enter a number: ");
        num=new Scanner(System.in).nextInt();
        do {
            fact*=i++;
        } while( i <= num );
        System.out.println("Factorial Is: "+fact);

        System.out.println("Do You want to Continue:y/n");
        char choice=new Scanner(System.in).next().charAt(0);
        if(choice=='n') return;else findFactorial();
    }

    private static boolean isEvenOrOdd(int num) {
        return num%2==0? true:false;
    }

    private static void findNoOfDigits() {
        System.out.print("Eneter numbers: ");
        int num=new Scanner(System.in).nextInt();
        int count=0;
        while(num>0) {
            num/=10;
            count++;
        }
        System.out.println("Total Digts: "+count);
    }


}

