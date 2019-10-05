package main;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine().trim();
        int index = s.nextInt();
        System.out.print(s1.substring(0,
                index));
    }
}

