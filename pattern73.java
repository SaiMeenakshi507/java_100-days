package pattern4;

public class pattern73 {

	public static void main(String[] args) {
		int n=4;
		int j;
		int x=1;
        for(int i=n; i>=-n; i--)
        {
      	  for(j=1; j<=Math.abs(i); j++)
      		  System.out.print(" ");
      	  x=(i>0)?1:j;
      	  if(i>0)
      		  x=1;
      	  else
      		  x=j;
      	  for(int k=n; k>=Math.abs(i); k--)
      	  {
      		  System.out.print((char)(x+64)+"");
      		  x=x+1;
      	  }
      	  System.out.println();
        }
	}

}
