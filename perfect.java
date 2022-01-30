package com.java;
import java.util.Scanner;
public class perfect {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number ; ");
        n=sc.nextInt();
        int i =1;

         while(i<n/2){
             if(n % 1 ==0){
                 sum = sum +i;
             }
             i++;
         }
         if(sum==n){
             System.out.println(n+ "is perfect. ");

         } else
             System.out.println(n+ "is nt perfect.");


    }
}
