package basic_prgs;
import java.util.*;
public class Square_or_Not {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number:");
		double x = obj.nextDouble();
		double sr = Math.sqrt(x);
		if( (sr - Math.floor(sr)) == 0)
		       System.out.println("square number");
		       else
              System.out.println("not square number");
		       
		
		}

}
