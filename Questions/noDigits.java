package Questions;

import java.util.Scanner;

public class noDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter number: ");
        int n = sc.nextInt(),i=0;
        if(n==0) i=1;
        while(n>0){
            n/=10;
            i++;
        }
        System.out.print("Number of Digits: "+i);
    }
}
