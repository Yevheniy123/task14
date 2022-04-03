package com.company;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input a number to convert into drawing: ");
        NumberController n = new NumberController(s.nextLine());
        n.print();
    }
}
