package main;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine().trim();
        s1 = s1.replaceAll("[AaEeIiOoUu]", "*");
        System.out.println(s1);
    }
}
