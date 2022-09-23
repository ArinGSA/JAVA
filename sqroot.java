import java.util.Scanner;
class persqr
{
public static void main(String[] args)
{
System.out.print("Enter a number: ");

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
if(n<=0)
{
   if(n==0)
   {
      System.out.println("Zero doesn't have any square root value");
    }
   else
   {
     System.out.println("Due to negative value ");
   }
}

else
{
  System.out.println("The square root of "+ n+ " is: "+squareRoot(n)+"and"+"-"+squareRoot(n));
}
}

public static double squareRoot(int num)
{

double t;
double sqrtroot=num/2;
do
{
t=sqrtroot;
sqrtroot=(t+(num/t))/2;
}
while((t-sqrtroot)!= 0);
return sqrtroot;
}
}