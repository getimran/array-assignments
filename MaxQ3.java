/*Q3 Find max number in Array of Arrays*/
package classFile;

class MaxQ3
{
	static int max(int x[][])
	{
		int i,j,maxNum;
		maxNum= x[0][0];
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			if(x[i][j]>maxNum)
			{	
				maxNum=x[i][j];
			}
		}
		return maxNum;
	}
	
	public static void main(String[] args)
	{
		int maximum= max(new int[][]{{4,3,29},{9,122,1},{5,67,11}});
		System.out.println("Greatest number among the given numbers in Array of arrays is: "+maximum);
	}
}