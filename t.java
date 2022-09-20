import java.util.Scanner;

class income
{
    public static void main(String args[])
    {
    	
        int marks[] = new int[4];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<4; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
 
        avg = total/4;
        System.out.print("The student Grade is: ");
        if(avg>=75)
        {
            System.out.print("Distinction");
        }
        else if(avg>=60 && avg<75)
        {
           System.out.print("First division");
        } 
        else if(avg>=50 && avg<60)
        {
            System.out.print("second devision");
        }
        else
        {
            System.out.print("Fail");
        }
    }
}