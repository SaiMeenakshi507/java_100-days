package program2;
import java.util.*;
public class Smallest_Largets_digits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int num = sc.nextInt();
		int Snum,Lnum,rem;
		Snum = Lnum = num%10;
		while(num>0)
		{
			rem = num%10;
			num = num/10;
			if(rem > Lnum)
			{
				Lnum = rem;
			
			}
			else if(rem <= Snum)
			{
				Snum = rem;
				
			}
		}
		System.out.println("smallest digits = "+ Snum);
		System.out.println("largest digit = "+ Lnum);
		
	}

}
