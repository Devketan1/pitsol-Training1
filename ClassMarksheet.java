package pitsol_training;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ClassMarksheet 
{
	public static void main(String[] args) 
	{
		int i;
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.00");
		System.out.println("Enter the number of students in the class :");
		int no_of_stud=sc.nextInt();
		float[] array_grades=new float[no_of_stud];
		System.out.println("Enter grades for the students. :");
		for(i=0;i<array_grades.length;i++)
		{
			System.out.println("Enter grade for student "+(i+1));
			array_grades[i]=sc.nextFloat();
		}
		System.out.println("1.Average of all grades\n2. Maximum of all grades\n3. Minimum of all grades.\n4. Percentage of students passed.");
		System.out.println("\nEnter your choice :");
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1: System.out.println("The average of all grades for "+no_of_stud+ " is: "+df.format(average(array_grades)));
					break;
			case 2:System.out.println("The maximum among all grades is: "+max(array_grades));
					break;
			case 3:System.out.println("The minimum among all grades is: "+min(array_grades));
					break;
			case 4:System.out.println("The percentage of students passed are :"+(percent(array_grades,no_of_stud)));
		}
	}

	private static float percent(float[] array_grades, int no_of_stud) 
	{
		int num=0;
		for(float grades:array_grades)
		{
			if(grades>40.00)
			{
				num++;
			}
		}
		float percent_of_stud_passed=((num/(float)no_of_stud)*100);
		
		return percent_of_stud_passed;
	}

	private static float min(float[] array_grades) 
	{
		float min=0;
		for(float grades:array_grades)
		{
			if(grades<min)
			{
				min=grades;
			}
		}
		return min;

	}

	private static float max(float[] array_grades)
	{
		float max=0;
		for(float grades:array_grades)
		{
			if(grades>max)
			{
				max=grades;
			}
		}
		return max;
	}

	private static float average(float[] array_grades) 
	{
		float sum=0;
		for(float grades:array_grades)
		{
			sum+=grades;
		}
		float average=sum/array_grades.length;
		return average ;
	}

}
