
import java.util.Arrays;
import java.util.Scanner;

public class LargestSmallest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++) arr[i]=sc.nextInt();
        int l=arr[a-1],s=arr[0];
        Arrays.sort(arr);

        System.out.println("Largest number: "+l+" and smallest number: "+s);
        sc.close();
    }
}

