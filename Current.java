import java.util.Scanner;
public class Current
{
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   double a=s.nextFloat();
	   double bill=0;
	   if(a<=50)  bill=a*0.50;
	   else if(a<=150) bill=(50*0.5+(a-50)*0.75);
	   else if(a<=250) bill=(50*0.5 + 100*0.75 + (a-150) );
	   else bill=a*1.50;
	   bill+=bill*0.2;
	   System.out.print("Bill: "+bill);
	   s.close();
	   }
	}
