import java.io.*;
import java.util.*;

public class sumarr1
 {
      public static void main(String args[])
		
	{
                try
                {
                        Scanner s = new Scanner(System.in);
                        int[] arr;
                        int n,i,sum=0;
                        System.out.println("Enter the size of the array:");
                        n=s.nextInt();
		        arr= new int[n];
                        if(n<=0) 
                        {
                           System.out.println("Enter the valid size of array");
                        }
                        else
                        {
             
			System.out.println("Enter the elements of the array:");
			for (i = 0; i < n; i++) 
                        {

				
				arr[i] = s.nextInt();
			}
                        for(i=0;i<n;i++)
                        {
                               sum=sum+arr[i];
                        }

                        System.out.println("sum="+sum);
                       }
                        
		}
		catch (ArrayIndexOutOfBoundsException e)
                {
			
			System.out.println("Array Bounds Exceeded...\nTry Again");
		}
               catch(Exception e)
                {
                      System.out.println("Invalid due to character exception or floating point exception");
               }
	}
}