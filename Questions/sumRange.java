package Questions;

import java.util.Scanner;

public class sumRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        for(int i=a;i<=b;i++) System.out.print(i+" ");
    }
}
