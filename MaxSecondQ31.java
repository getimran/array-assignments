/*Q31 Find 2nd and 3rd maximum number without sorting*/
package classFile;

class MaxSecondQ31
{
	static int max(int x[])
	{
		int i,k=0,maxNum,temp[];
		temp=new int[x.length];
		System.out.println("Given Numbers: ");
		for(i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();
		
		maxNum= x[0];
		for(i=0;i<x.length;i++)
		{
			if(x[i]>maxNum)
			{	
				maxNum=x[i];
			}
		}
		
		temp[k++]= maxNum;
		maxNum=0;
		for(i=0;i<x.length;i++)
		{
			if(x[i]!=temp[0])
			{
				if(x[i]>maxNum)
				{	
					maxNum=x[i];
				}
			}
		}
		System.out.println("2nd Greatest number among the given numbers is: "+maxNum);
		temp[k++]= maxNum;
		
		maxNum=0;
		for(i=0;i<x.length;i++)
		{
			if(x[i]!=temp[0]&&x[i]!=temp[1])
			{
				if(x[i]>maxNum)
				{	
					maxNum=x[i];
				}
			}
		}
		return maxNum;
	}
	
	public static void main(String[] args)
	{
		int maximum= max(new int[]{4,3,29,9,12,1,32,11});
		System.out.println("3rd Greatest number among the given numbers is: "+maximum);
	}
}