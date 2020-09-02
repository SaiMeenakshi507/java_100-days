package program2;
import java.util.*;
public class Sum_Of_Even_Odd_Dgts {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number :");
		int n= obj.nextInt();
		int Even_sum =0, Odd_sum =0;
		while(n!=0)
		{
			int rem = n%10;
			if(rem%2 == 0)
				Even_sum = Even_sum + rem;
			else
				Odd_sum = Odd_sum + rem;
			n = n/10;
		}
		System.out.println("Even sum = "+ Even_sum);
		System.out.println("Odd sum = "+ Odd_sum);
		}
		
		
	}

