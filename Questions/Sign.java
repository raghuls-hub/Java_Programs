package Questions;

import java.util.Scanner;

public class Sign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0) System.out.print("It is positive number.");
        else if(n<0) System.out.print("It is a negative number.");
        else System.out.print("It is Zero");
    }
}
