import java.util.Scanner;
public class Swap
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a,b;
	    a=sc.nextInt();
	    b=sc.nextInt();
	    System.out.println("Before: "+a+" "+b);
	    
	    a=a-b;
	    b=a+b;
	    a=b-a;
	    
	    System.out.println("After: "+a+" "+b);
		sc.close();
	}
}
