package com.java;
import java.util.Scanner;
public class armstrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit :");
        int limit = sc.nextInt();
        for (int i = 0; i < limit; i++) {
            // i --> if armtsrong or not
            if (isArmstrong(i)) {
                System.out.print(i + ",");
            }
        }
    }

    private static boolean isArmstrong(int num) {
        int temp = num, digit = 0, sum = 0;
        // number of digits
        while (temp > 0) {
            temp = temp / 10;
            digit = digit + 1;
        }
        temp = num;
        // logic to check armstrong
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digit);
            temp = temp / 10;
        }
        return sum == num ? true : false;
    }
}


