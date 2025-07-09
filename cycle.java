import java.util.Scanner;

public class cycle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++) arr[i]=sc.nextInt();
        int n=arr[0];
        for(int i=0;i<a-1;i++) arr[i]=arr[i+1];
        arr[a-1]=n;
        System.out.println("The cycled array: ");
        for(int i:arr) System.out.print(i+" ");
    }
}
