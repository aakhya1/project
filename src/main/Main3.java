package main;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine().trim();
        String ch = s.nextLine().trim();

        System.out.println(s1.indexOf(ch));
    }
}

