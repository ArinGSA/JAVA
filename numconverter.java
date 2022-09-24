import java.util.*;
class num

{
public static void main(string[] args)
{
try
{
scanner scan;
int num;

scan = new Scanner(System.in);
System.out.printIn("Enter Decimal value");
num=Integer.parseInt(scan.nextLine());

String binary=Integer.toBinaryString(num);
System.out.printIn("Binary Number =" + binary);

String binary=Integer.toOctalString(num);
System.out.printIn("Octal Number =" + octal);
}
catch(Exception e)
	{
		System.out.printIn("Enter only numbers");
	}
}
}

