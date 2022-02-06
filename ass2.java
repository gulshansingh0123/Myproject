package com.java;
import java.util.Scanner;
public class ass2{
    //public static void main(String args[]) {
        /*1- No program is required. Just give value of exp by calculating manually.
        Scanner sc = new Scanner(System.in);
          int num = sc.nextInt();
          String str= num>10?"number is greater 10\nnumber is greater 5":num>5?"number is less than 10 \nnumber is greater 5":"number is less than 10 \nnumber is lesser 5";
         System.out.print(str);/*

        // 2- WAP to check whether given number is 10,20,30,40,50 or not any of these
        //using ternary operator.
        /*private static boolean isNumberPresent(int num) {
            return (num==10||num==20||num==30||num==40||num==50)?true:false;
        }/*

    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean res=isNumberPresent(num);
        System.out.println("Number is "+(res?"present":"not present"));*/

    //3- write a program to print name of the month by passing number of the month
    //using ternary operator.
       /* private static String printMonth (int month) {
            return month==1?"Jan":month==2?"Feb":month==3?"Mar":month==4?"Apr":month==5?"May":month==6?"Jun":month==7?"Jul":month==8?"Aug":month==9?"Sep":month==10?"Oct":month==11?"Nov":"Dec";
        }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();

        System.out.println(printMonth(month));*/

    //4. write a program to print given character is vowel or Consonant using ternary operator.

    private static boolean isVowel(char input) {
        String ch = String.valueOf(input).toLowerCase();
        return (ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")) ? true : false;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        System.out.println(ch+" is"+(isVowel(ch)?" Vowel":" Consonant"));

        //5. Evaluate below expression without running the code
     //int x = 9, y = 12;
    // int a = 2, b = 4, c = 6;
     //int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
	 // 1*43+9*26+(3+y*4))/50
	 // 1*43+9*26+51/50
	  //43+234+1
	 // 278 (ANS)/*


    }
    }






