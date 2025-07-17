package Questions;

import java.util.Scanner;

public class asc {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character:");
        char Ch = sc.next().charAt(0);
        int CH=(int)Ch;
        System.out.printf("Ascii Value:%d",CH);
    }
}