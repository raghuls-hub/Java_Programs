package Questions;

import java.util.Scanner;

public class sumDigi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter number: ");
        int n = sc.nextInt(),sum=0;
        while(n>0){
            sum+=(n%10);
            n/=10;
        }
        System.out.print("Sum of Digits: "+sum);
    }
}
