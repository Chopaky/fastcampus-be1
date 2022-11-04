package me.day03.practice;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        int price;
        double tax = 0.1;
        Scanner scanner = new Scanner(System.in);

        price = scanner.nextInt();

        price += price *tax;

        System.out.println("price = " + price);
    }
}
