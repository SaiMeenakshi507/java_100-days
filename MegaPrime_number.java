package program1;
import java.util.*;
public class MegaPrime_number {
	int isPrime(int n)
	{
		int i=0,flag=0;
		if(n==1)
			return 0;
		else
		{
			int t = (int)Math.sqrt(n);
			for(i=2; i<=t;i++)
			{
				if((n%i) == 0)
				{
					flag = 1;
					break;
				}
			}
		}
		if(flag ==1)
			return 0;
		else
			return 1;
	}
	int isMegaPrime(int n)
	{
		int i=0, flag = 0, temp = 0;
		if(isPrime(n)==0)
			return 0;
		else
		{
			while(n != 0)
			{
				temp = n%10;
				flag = isPrime(temp);
				if(flag ==0)return 0;
				n =n/10;
				}
		}
		if(flag == 1)
			return 1;
		else 
			return 0;
		}

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter number:");
       int a = sc.nextInt();
      MegaPrime_number obj = new MegaPrime_number();
      int n = obj.isMegaPrime(a);
      if(n==1)
    	  System.out.println("mega prime number = "+a);
      else
    	  System.out.println("not a mega prime number"+a);
      }

}
