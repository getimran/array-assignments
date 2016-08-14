/*Q2 Find min number in Array*/
package classFile;

class MinQ2
{
	static int min(int x[])
	{
		int i,minNum;
		minNum= x[0];
		for(i=0;i<x.length;i++)
		{
			if(x[i]<minNum)
			{	
				minNum=x[i];
			}
		}
		return minNum;
	}
	
	public static void main(String[] args)
	{
		int minimum= min(new int[]{4,3,29,9,12,10});
		System.out.println("Smallest number among the given numbers is: "+minimum);
	}
}