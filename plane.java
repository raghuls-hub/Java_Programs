import java.util.Scanner;

public class plane {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
                if(i==j){
                    if(arr[i][j]>17 && arr[i][j]<60) count++;
                }
            }
        }
        System.out.print(count);
        
    }
}
