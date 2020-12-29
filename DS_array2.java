package data_structures;
import java.util.*;
public class DS_array2 {
    static void shiftleft(int arr[],int p)
    {
    	int n=8;
    	revarr(arr,0,p-1);
    	revarr(arr,p,n-1);
    	revarr(arr,0,n-1);
    }
    static void revarr(int arr[],int p,int n)
    {
    	int temp;
    	while(p<n)
    	{
    		temp=arr[p];
    		arr[p]=arr[n];
    		arr[n]=temp;
    		p=p+1;
    		n=n-1;
    	}
    }
    static void show(int arr[])
    {
    	for(int i=0;i<8;i++)
    		System.out.print(arr[i]+" ");
    }
	public static void main(String[] args) {
	int arr[]=new int[8];
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 8 values:");
	for(int i=0;i<8;i++)
	{
		arr[i]=sc.nextInt();
	}
	int n=8;
	int p=2;
	shiftleft(arr,p);
	show(arr);

	}

}
