package Questions;

import java.util.Scanner;

public class great2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        if(a>b) System.out.print("The greatest of Two numbers : "+ a);
        else System.out.print("The greatest of Two numbers : "+ b);

    }
}
