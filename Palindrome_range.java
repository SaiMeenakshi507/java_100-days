package numbers;
import java.util.*;
public class Palindrome_range {
	static int ispalindrome(int n)
	{
		int rev =0;
		for(int i=n; i>0; i/=10){
			rev = rev*10+ i%10;
			}
		return(n==rev) ? 1:0;
	}
	static void display(int n1,int n2)
	{
		for(int i=n1; i<=n2; i++)
			if(ispalindrome(i)==1)
				System.out.println(i+"");
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 2number:");
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	display(n1,n2);
	}
}
