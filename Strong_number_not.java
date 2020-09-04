package program2;
import java.util.*;
public class Strong_number_not {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);	
		System.out.println("enter any number:");
		int n = obj.nextInt();
		int temp = n;
		int sum = 0;
		while(n != 0)
		{
			int fact = 1;
			int i = 1;
			int rem = n%10;
			while(i <= rem)
			{
				fact = fact * i;
				i++;
			}
			sum = sum + fact ;
			n = n/10;
		}
		if( sum == temp)
			System.out.println(temp + " is a strong number");
		else
			System.out.println(temp + " is not a strong number");
		}
}
