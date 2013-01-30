package Search;

import java.util.Arrays;
import java.util.Scanner;

public class Kdifference {

	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int result =0;
		int diff = in.nextInt();
		long array[] = new long[count+1];
		for(int i=0;i<count;i++)
		{
			array[i] = in.nextInt();
		}
		//for(int i=0;i<count;i++) System.out.println(array[i]);
		Arrays.sort(array);
		for(int i=1;i<=count;i++) System.out.println(array[i]);
		for(int i=1;i<=count;i++)
		{
			for(int j=i+1;j<=count;j++)
			{
				//System.out.println("Comparing "+array[i]+" & "+array[j]);
				int newDiff = (int) Math.abs(array[i] - array[j]);
				if(newDiff < diff)
				{
					continue;
				}
				else if( newDiff > diff)
				{
					j=count;
				}
				else{
					result++;
					
				}
			}
		}
		System.out.println(result);
		
	}
	
}
