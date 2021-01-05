package numbers;
import java.util.*;
public class Pairs1 {
	static int pairs1(int arr[],int n,int x)
	{
		int i;
		for(i=0; i < n-1; i++)
			if(arr[i] > arr[i+1])
					break;
			int r = i;
			int l = (i+1)%n;
			int cnt = 0;
			while(l != r)
			{
				if(arr[l] + arr[r] == x)
				{
					cnt++;
					if( l == (r-l+n)%n)
						return cnt;
					l = (l+1)%n;
					r = (r-1+n)%n;
				}
				else if (arr[l]+arr[r] < x)
					l = (l+1)%n;
				else
					r = (n+r-1)%n;
			}
			return cnt;
	}
	public static void main(String[] args) {
		int arr[] = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 6 values:");
		for(int i=0;i<6;i++)
			arr[i]=sc.nextInt();
		int n=6;
		int sum =16;
		System.out.println(pairs1(arr,n,sum)+"pairs");

	}

}
