package programs9;
import java.util.*;
public class Triperfect_number {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number:");
	int n = sc.nextInt();
	int sum = 1+n;
	int i = 2;
	while(i*i <=n)
	{
		if(n%i ==0)
		{
			if(n/i==i)
				sum = sum+i;
			else
				sum = sum+i+n/i;
		}
		i =i+1;
	}
	if(sum == 3*n)
		System.out.println(n + " is triperfect number");
	else
		System.out.println(n +" is not a triperfect number");
		

	}

}
