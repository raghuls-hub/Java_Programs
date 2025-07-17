package Questions;

import java.util.Scanner;

public class great3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A:");
        int a=sc.nextInt();
        System.out.print("Enter B:");
        int b=sc.nextInt();
        System.out.print("Enter C:");
        int c=sc.nextInt();
        if(a>b && a>c) System.out.print("A is Greatest.");
        else if(b>c) System.out.print("B is Greatest.");
        else System.out.print("C is Greatest.");
    }
}
