package main;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine().trim();
        int length = s1.length();
        System.out.print("Indexes : ");
        for (int i = 0; i <length; i++) {
            System.out.print(s1.indexOf(s1.charAt(i)) + "\t\t");
        }

        System.out.println();
        System.out.print("Characters : ");
        for (int i = 0; i < length; i++) {
            System.out.print(s1.charAt(i) + "\t\t");
        }
    }
}

