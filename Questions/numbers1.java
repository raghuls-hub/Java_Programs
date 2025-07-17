package Questions;

import java.util.Scanner;

public class numbers1 {
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b, a % b);
    } 
    public static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        System.out.printf("LCM of %d and %d: %d",a,b,lcm(a,b));
    }
}
