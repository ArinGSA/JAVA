import java.io.*;
import java.util.*;
class triangle

	{
	  try
	   {
			
	    int i, j, n;
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the number.of.rows:");
	    n=sc.nextInt();
	    
        for (i=0; i<n; ++i)   
        {  
            for (j=1; j>=0; j++)        
            {  
                System.out.print(i+"\t");   
            
		}
         System.out.println(); 
	  }
	  }
 catch(Exception e)
           {
               System.out.println("Enter a valid number:");
           }
}
}