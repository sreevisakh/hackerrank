package Search;

import java.util.Scanner;

public class Billboard {

	static int[] array;
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		array = new int[n];
		int i;
		
		for(i=0;i<n;i++)
		{
			array[i]=in.nextInt();
		}
		i=0;
		while(i<n)
		{
			if(i<n && i+1<n&& i+2<n)
			{
				int mini = min(i);
				
			}
			
					
			
		}
		
	}
	int min(int arg1)
	{
		
		return arg1;
		
	}
	
	
	
}
