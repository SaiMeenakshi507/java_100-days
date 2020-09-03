package program2;
import java.util.*;
public class Collatz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();
		int Even = n/2;
		int Odd = (3*n)+1;
		while(n != 1)
		{
			if(n%2==0)
			{
				System.out.println(n+ " ");
				Even = n/2;
				n = Even;
			}
			else if(n%2 != 0)
			{
				System.out.println(n+" ");
				Odd = (3*n)+1;
				n = Odd;
				
			}
			
		}
System.out.println(n);
	}

}
