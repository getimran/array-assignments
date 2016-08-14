/*Q19 Smallest number in Triangle B */
package classFile;

class TriangleBMinQ19
{
	static int TriBMin(int x[][])
	{
		int i,j,k=0,temp[],minNum;
		temp=new int[x.length*x.length];
		System.out.println("----------Triangle B Min-------------");
		System.out.println();
		
		System.out.println("Given Matrix: ");
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		
		
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				if(i>=j)
				{
					temp[k++]=x[i][j];
				}
			}
		}
		
		
		minNum= temp[0];
		for(i=0;i<temp.length;i++)
		{
			if(temp[i]!=0 && temp[i]<minNum)
			{	
				minNum=temp[i];
			}
		}
		return minNum;
			
	}
	
	public static void main(String[] args)
	{
		int minimum= TriBMin(new int[][]{{13,1,2},{5,2,13},{4,3,12}});
		System.out.println("Smallest number among the numbers in Triangle B is "+minimum);
	}
}