package lecture3;

import java.util.Scanner;

public class Sheet35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 6;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        a = 6;
        b = ++a;
        System.out.println(a);
        System.out.println(b);
    }
}
