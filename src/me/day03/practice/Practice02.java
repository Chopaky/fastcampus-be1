package me.day03.practice;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        int max = (num1 > num2)? num1: num2;
        int min = (num1 > num2)? num2: num1;

        System.out.printf("최대값 : %d, 최솟값 : %d",max,min);
    }
}
