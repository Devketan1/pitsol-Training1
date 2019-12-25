package pitsol_training;

import java.util.Scanner;

public class HexaDec_Opt 
{
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			int ch;
			do {
			System.out.println("Enter 1st Hexadecimal number :");
			String first=sc.next().toUpperCase();
			System.out.println("Enter 2nd Hexadecimal number :");
			String second=sc.next().toUpperCase();
			System.out.println("Enter your choice of operation :");
			System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Comparison");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1: System.out.println("The addition of "+first+"and "+second+" is :"+addHexa(first,second));
						break;
				case 2: System.out.println("The subtraction of "+first+"and "+second+" is :"+subHexa(first,second));
						break;
				case 3: System.out.println("The multiplication of "+first+"and "+second+" is :"+mulHexa(first,second));
						break;
				case 4: System.out.println("The division of "+first+"and "+second+" is :"+divHexa(first,second));
						break;
				case 5: System.out.println(comparingTwoValues(first,second));
						break;
				default: System.out.println("Wrong value opted.");
			}
			System.out.println("Do you wish to continue...Press 1 to continue else press any key to Exit.");
			ch=sc.nextInt();
			}while(ch==1);
	}

	private static String comparingTwoValues(String first, String second) 
	{
		int res=first.compareTo(second);
		if(res==0)
		{
			return "Both the Hexadecimal values are equal";
		}
		if(res>0)
		{
			return "The "+first+" is greater than "+second;
		}
		else
			return "The "+second+" is greater than "+first;
	}

	private static String divHexa(String first, String second) 
	{
		int num1=toDecimal(first);
		int num2=toDecimal(second);
		int res=num1/num2; 
		String answer = Integer.toHexString(res);
		return answer;

	}

	private static String mulHexa(String first, String second) 
	{
		int num1=toDecimal(first);
		int num2=toDecimal(second);
		int res=num1*num2; 
		String answer = Integer.toHexString(res);
		return answer;
	}

	private static String subHexa(String first, String second)
	{
		int num1=toDecimal(first);
		int num2=toDecimal(second);
		int res=num1-num2; 
		String answer = toHexString(res);
		return answer;
		
	}

	private static String addHexa(String first, String second) 
	{	
		int num1=toDecimal(first);
		int num2=toDecimal(second);
		int res=num1+num2; 
		String answer =toHexString(res);
		return answer;
	}

	/* Method for returning the decimal representation of hexadecimal number.*/
	private static int toDecimal(String str) 
	{
		int m;
		int len=str.length();
		int dec=0;
		int base=1;
		for(int i=len-1;i>=0;i--)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				dec+=(str.charAt(i)-48)*base;              //Here 48 represents the ASCII value of 0. 
			}
			else if(str.charAt(i)>='A' && str.charAt(i)<='F')
			{
				dec+=(str.charAt(i)-55)*base;				//Since value of A is 10 ...and ASCII value of A is 65,so we subtracted 55 .
			}
			base*=16;
		}
		return dec;
	}
	/* Method for returning the hexadecimal representation of decimal number.*/
	private static String toHexString(int n) 
	{
		String str="";
		int rem=0;
		char hexValues[]= {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		while(n>0)
		{
			rem=n%16;
			str=hexValues[rem]+str;
			n=n/16;
		}
		
		return str;
	}
}
