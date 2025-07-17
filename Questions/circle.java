package Questions;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius:");
        float n = sc.nextFloat();
        System.out.printf("Circle's Area: %.2f",3.14*n*n);
    }
}
