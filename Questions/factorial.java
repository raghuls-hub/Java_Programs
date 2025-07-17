package Questions;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter num:");
        int n=sc.nextInt(),N=1;
        while(n!=0){
            N*=n;
            n--;
        }
        System.out.print("Factorial: "+N);

    }
}
