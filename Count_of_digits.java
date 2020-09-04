package program1;
import java.util.*;
public class Count_of_digits {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number:");
		int num = obj.nextInt();
		int count =0;
		while(num != 0)
		{
			num = num/10;
			++count;
		}
		System.out.println("number of digits:" + count);
	}
	}
