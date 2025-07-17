package Questions;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt(),N=0;
        while(n!=0){
            N=N*10+ n%10;
            n/=10;
        }
        System.out.print("Reversed number:"+N);
    }
}
