package pattern2;

public class pattern50 {

	public static void main(String[] args) {
		int n=3;
		for(int i=n; i>=-n; i--)
		{
			for(int j= n; j>= Math.abs(i); j--)
				System.out.print(j+" ");
			System.out.println();
	}	}

}
