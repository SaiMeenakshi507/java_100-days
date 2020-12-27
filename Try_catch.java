package hackerank_prgms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Try_catch{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner (System.in);
            try
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a/b);
            }
        catch(InputMismatchException e)
        {
            System.out.println(e.getClass().getName());
        }
        catch(ArithmeticException e1)
        {
            System.out.println(e1.getClass().getName()+": / by zero");
        }       
    }    
}