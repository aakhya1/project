package main;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine().trim();
        char[] a = s1.toCharArray();
        int sum=0;
        for (char k : a)
        {
            int ascii = k;
            sum = sum+ascii;
        }
        System.out.println(sum);
    }
}

