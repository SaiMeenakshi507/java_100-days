package basic_prgs;
import java.util.*;

public class Fibo_Series {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number:");
		int n = obj.nextInt();
		int t1 = 0 , t2 = 1;
		System.out.println("Fibonacci series:");
		System.out.println(t1+" "+t2);
		for(int i = 2; i<n; i++)
		{
			int sum = t1 + t2;
			System.out.println(" "+sum);
			t1 = t2;
			t2 = sum;
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
