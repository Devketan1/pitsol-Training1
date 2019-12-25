package pitsol_training;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class String_Operations 
{
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println("The following operations can be performed :\n");
		System.out.println("1. Comparison of two Strings\n2. Reverse of a String\n3. ToggleCase Operation\n4. Finding largest word in the String");
		System.out.println("\nEnter your choice :");
		int choice=sc1.nextInt();
		switch(choice)
		{
			case 1:
					System.out.println("Enter first string :");
					String first=sc1.next();
					System.out.println("Enter second string :");
					String second=sc2.next();
					if(compare(first,second))
					{
						System.out.println("Strings are equal...");
					}
					else
					{
						System.out.println("Strings are not equal...");
					}
					break;
					
			case 2:
					System.out.println("Enter string to be reversed :");
					String str=sc2.nextLine();
					System.out.println("The reverse of "+str+ " is :"+reverse(str));
					break;
					
			case 3:
					System.out.println("Enter string to be toggled :");
					String str1=sc2.nextLine();
					System.out.println("The toggled String of "+str1+" is: "+toggle(str1));
					break;
					
			case 4:
					System.out.println("Enter the string :");
					String str2=sc2.nextLine();
					System.out.println(largest(str2));
					break;
			default:System.out.println("Wrong option chosen.");
					
		}
	}

	private static String largest(String str) 
	{
		int i=0,j=0,count=0,c=0;
		int max=0,max_index=0;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				c++;
		}
		int arr[]=new int[c+1];
		
		String[] individual_words=str.split(" ");
		
		
		for(i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)==' ')
			{
				arr[j]=count;
				j++;
				count=0;
			}
			else if(i==str.length()-1)
			{
				arr[j]=count+1;
			}
			else
			{
				count++;
			}
			
		}
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				max_index=i;
			}
		}
		return individual_words[max_index];
	}

	private static String toggle(String str) 
	{
		String strtoggle="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				strtoggle+=""+(char)(str.charAt(i)-32);
			}
			else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				strtoggle+=""+(char)(str.charAt(i)+32);
			}
			else
				strtoggle+=""+str.charAt(i);
		}
		return strtoggle;
	}

	private static String reverse(String str) 
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=""+str.charAt(i);
		}
		return rev;
	}

	private static boolean compare(String first, String second) 
	{
		boolean flag=true;
		if(first.length()!=second.length())
		{
			flag=false;
			return flag;
		}
		for(int i=0;i<first.length();i++)
		{
			if(first.charAt(i)!=second.charAt(i))
			{
				flag=false;
				return flag;
			}
		}
		return flag;
	}

}
