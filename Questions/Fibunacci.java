package Questions;
import java.util.*;
public class Fibunacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int a=0,b=1;
        do{
            int temp=a;
            a=b;
            b=temp+b;
            System.out.print(a+" ");
        }while(b<=n);
    }
}
