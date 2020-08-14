package pac1;
import java.util.Scanner;
public class File3 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter studentno");
		int studentno = obj.nextInt();
		System.out.println("enter studentname");
		String studentname = obj.next();
		System.out.println("enter studentage");
		byte studentage= obj.nextByte();
		System.out.println("enter studentfee");
		float studentfee= obj.nextFloat();
	System.out.println(" studentno = "+studentno+"\n studentname = "+studentname+"\n studentage = "+studentage+"\n studentfee = "+studentfee);
	}
}
