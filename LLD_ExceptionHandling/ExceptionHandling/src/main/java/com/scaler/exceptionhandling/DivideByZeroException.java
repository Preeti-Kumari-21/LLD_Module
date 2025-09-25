package com.scaler.exceptionhandling;

import java.util.Scanner;

public class DivideByZeroException {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // possible divide by 0 exception
        int z = x/y;
        System.out.println(z);
    }
}
