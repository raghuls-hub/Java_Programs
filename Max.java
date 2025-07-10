import java.util.Scanner;
public class Max
{
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   int a=s.nextInt();
	   int b=s.nextInt();
	   int c=s.nextInt();
	   System.out.print("Maximum of three nummbers: "+Math.max(a,Math.max(b,c)));
	   s.close();
	}
}
