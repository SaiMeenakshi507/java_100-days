package data_structures;
import java.util.*;
public class DS_array1 {
    void shiftleft(int arr[],int p,int n)
    {
    	for(int i=0;i<p;i++)
    		shiftByOne(arr,n);
    }
    void shiftByOne(int arr[],int n)
    {
    	int i,temp;
    	temp=arr[0];
    	for(i=0;i<n-1;i++)
    	{
    		arr[i]=arr[i+1];
    	}
    	arr[i]=temp;
    }
    void show(int arr[],int n)
    {
    	for(int i=0;i<n;i++)
    		System.out.print(arr[i]+" ");
    }
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int arr[]=new int[8];
	System.out.println("enter 8 values:");
	for(int i=0;i<8;i++)
	{
		arr[i]=sc.nextInt();
	}
	DS_array1 shift = new DS_array1();
	shift.shiftleft(arr,2,8);
	shift.show(arr,8);
    }
}
