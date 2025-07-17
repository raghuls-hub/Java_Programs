package Questions;

import java.util.Scanner;

public class cases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character:");
        char Ch = sc.next().charAt(0);
        if(Character.isUpperCase(Ch)) System.out.print("It is Upper case.");
        else if(Character.isLowerCase(Ch)) System.out.print("It is Lower case.");
        else System.out.print("It is a Special Character.");
    }
}
