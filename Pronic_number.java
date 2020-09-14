package new1;
import java.util.*;
public class Pronic_number {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number :");
	int num = sc.nextInt(); // num= 20
	int x = 0;
	for(int i=0 ; i<num; i++) // i = 4
	{
		    if(i*(i+1)== num) // 20 == 20 -> t
		    {
		    	  x = 1;
		    	  break;
		    }
	}
    if(x ==1 )
    	    System.out.println("pronic number");
    else
    	    System.out.println("not a pronic Number");
	}

}
