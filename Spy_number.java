package program2;
import java.util.*;
public class Spy_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number:");
		int n = sc.nextInt();
		int num = n;
		int sum =0, mul = 1;
		while(num > 0)
		{
			int r = num%10;
			sum = sum+ r;
			mul = mul *r;
			num = num/10;
		}
		if(mul == sum)
			System.out.println(n +"is a spy number");
		else
			System.out.println(n +"is not a spy number");
		}
	}
