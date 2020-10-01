package patterens;

public class Patteren_alpabet2 {

		public static void main(String[] args) {
			for(int i= 'E'; i>= 'A'; i--)
			{
				for(int j='A'; j<=i; j++)
				{
					System.out.print((char)i+" ");
				}
				System.out.println();
			}
		}

	}


