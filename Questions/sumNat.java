package Questions;

import java.util.Scanner;

public class sumNat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter number: ");
        int n = sc.nextInt(),sum=0;
        for(int i=n;i>0;i--){
            sum+=i;
        }
        System.out.print("Sum of Natural numbers: "+sum);
    }
}
