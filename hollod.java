import java.util.*;

class sq
{
public static void main(String args[])
{
try
{
Scanner sc=new Scanner(System.in);
System.out.println("row");
int row =sc.nextInt();
System.out.println("column");
int cln = sc.nextInt();
if(row<=0||cln<=0)
{
System.out.println("enter positive");
}
if(row<=0&&cln<=0)
{
System.out.println("enter positive");
}
else
   {
   for(int i=0;i<= row; i++)
	{
	for(int j=0;j<=cln;j++)
	{
	if((i==1)||(i==row)||(j==1)||(j==cln))
		{
		System.out.println("$");
		}
	else
		{
		System.out.println(" ");
		}
    }
    System.out.println();
}
}
}
catch(Exception e)
{
System.out.println("invalid");
}
}
}
	