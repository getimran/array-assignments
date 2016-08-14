/*Q32 Find Minimum number of Operation required to get Desired Array */

package classFile;
class NumberOfOperationQ32
{
	static void countOperation(int x[])
	{
		int countIncrements = 0;
		int countDoubles = 0;
		int tempDoubles;
	for (int i=0;i<x.length;i++)
	{
		tempDoubles = 0;
		while (x[i] != 0)
		{
			if ((x[i]%2) == 0)
			{
				x[i] /= 2;
				tempDoubles++;
			}
			else
			{
				x[i]--;
				countIncrements++;
			}
		}
		if (tempDoubles > countDoubles)
			countDoubles = tempDoubles;
	}
	System.out.println("Minimum number of operations: "+(countIncrements + countDoubles));
		
		
	}
	
	public static void main(String[] args)
	{
		countOperation(new int[]{16,16,16});
		countOperation(new int[]{2,1});
	}
}
				
		