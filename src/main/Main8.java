package main;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine().trim();
        char[] a = s1.toCharArray();
        int ref=0;
        int ref1 =0;
        for (char k : a)
        {
            int ascii = k;
            if(k<97)
                ref = ref+ascii;
            else
                ref1 = ref1 + ascii;
        }
        System.out.println(ref-ref1);
    }
}

