package pitsol_training;

public class CountClumps 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,2,2,2,2,3,4,4,2,2,5,5,5,4,4,2,2,2};
		int count=0,temp=-100;									//temp has been set to -100 as we are performing only on positive numbers,
		for(int i=0;i<arr.length-1;i++)							//so if a number has a clump then it must be stored in temp..so that it 
		{														// cannot have a count till whole of that clump is finished. 
			if(arr[i]==arr[i+1] && arr[i]!=temp)
			{
				temp=arr[i];
				count++;
			}
			else
			{
				if(arr[i]!=temp)
				{
					temp=-100;
				}
			}
				
		}
		System.out.println(count);
	}

}
