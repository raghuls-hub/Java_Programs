package Questions;

import java.util.Scanner;

public class numbers2 {
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b, a % b);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        System.out.printf("GCD of %d and %d: %d",a,b,gcd(a,b));
    }
}
