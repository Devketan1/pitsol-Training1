package pitsol_training;

import java.util.Scanner;

public class FCFS 
{
	private int Completion_Time[];
	private int TA_Time[];
	private int Waiting_Time[];
	private static int number_process;

	public static void main(String args[])
	{
		int i,j;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of processes :");
		number_process=sc.nextInt();
		int process[][]=new int[number_process][2];
		for(i=0;i<number_process;i++)
		{
			System.out.println("Enter values of arrival time and burst time for the process "+i);
			for(j=0;j<2;j++)
			{
				process[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Values you entered are :");
		for(int row[]:process)
		{
			for(int val:row)
			{
				System.out.print(val+"\t");
			}
			System.out.println();
		}
		calculateCompletionTime(process);
	}

	private static void calculateCompletionTime(int process[][]) 
	{
		int Completion_Time[]=new int[number_process];
		int CT=0;
		int extra;
		for(int i=0;i<number_process;i++)
		{
				if(process[i][0]<=CT)
				{
					CT+=process[i][1];
				}
				else
				{
					extra=process[i][0]-CT;
					CT+=process[i][1]+extra;
				}
				Completion_Time[i]=CT;
		}
		System.out.println("The completion time for each process is as follows :");	
		for(int i=0;i<Completion_Time.length;i++)
		{
			System.out.println("Process "+(i+1)+" : "+Completion_Time[i]);
		}
		calculateTAT(Completion_Time,process);
	}
	
	private static void calculateTAT(int[] completion_Time, int[][] process) 
	{
		int TA_Time[]=new int[number_process];
		for(int i=0;i<number_process;i++)
		{
			TA_Time[i]=completion_Time[i]-process[i][0];
		}
		System.out.println("The Turn Around time for each process is as follows :");
		for(int i=0;i<TA_Time.length;i++)
		{
			System.out.println("Process "+(i+1)+" : "+TA_Time[i]);
		}
		calculateWaitingTime(TA_Time,process);
	}
	
	private static void calculateWaitingTime(int[] Ta_Time, int[][] process) 
	{
		int Waiting_Time[]=new int[number_process];
		for(int i=0;i<number_process;i++)
		{
			Waiting_Time[i]=Ta_Time[i]-process[i][1];
		}
		System.out.println("The Waiting time for each process is as follows :");
		for(int i=0;i<Waiting_Time.length;i++)
		{
			System.out.println("Process "+(i+1)+" : "+Waiting_Time[i]);
		}
		calculateAverageWaitingTime(Waiting_Time);
	}

	private static void calculateAverageWaitingTime(int[] waiting_Time) 
	{
		int averageWT;
		int TotalWT=0;
		for(int avt:waiting_Time)
		{
			TotalWT+=avt;
		}
		averageWT=TotalWT/waiting_Time.length;
		System.out.println("The Average Waiting Time of the whole execution is :"+averageWT);
	}

}
