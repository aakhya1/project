package main;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine().trim();
        String ch1 = s.nextLine().trim();
        int index = s1.indexOf(ch1);
        while (index >= 0) {
            System.out.println(index);
            index = s1.indexOf(ch1, index + 1);
        }
    }
}

