/*Q4 Find min number in Array of Arrays*/
package classFile;

class MinQ4
{
	static int min(int x[][])
	{
		int i,j,minNum;
		minNum= x[0][0];
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			if(x[i][j]<minNum)
			{	
				minNum=x[i][j];
			}
		}
		return minNum;
	}
	
	public static void main(String[] args)
	{
		int minimum= min(new int[][]{{4,3,29},{9,122,10},{5,67,11}});
		System.out.println("Smallest number among the given numbers in Array of arrays is: "+minimum);
	}
}