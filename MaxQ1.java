/*Q1 Find max number in Array*/
package classFile;

class MaxQ1
{
	static int max(int x[])
	{
		int i,maxNum;
		maxNum= x[0];
		for(i=0;i<x.length;i++)
		{
			if(x[i]>maxNum)
			{	
				maxNum=x[i];
			}
		}
		return maxNum;
	}
	
	public static void main(String[] args)
	{
		int maximum= max(new int[]{4,3,29,9,12,1});
		System.out.println("Greatest number among the given numbers is: "+maximum);
	}
}