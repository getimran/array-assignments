/*Q18 Greatest number in Triangle B */
package classFile;

class TriangleBMaxQ18
{
	static int TriBMax(int x[][])
	{
		int i,j,k=0,temp[],maxNum;
		temp=new int[x.length*x.length];
		System.out.println("----------Triangle B Max-------------");
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
		
		maxNum= temp[0];
		for(i=0;i<temp.length;i++)
		{
			if(temp[i]>maxNum)
			{	
				maxNum=temp[i];
			}
		}
		return maxNum;
			
	}
	
	public static void main(String[] args)
	{
		int maximum= TriBMax(new int[][]{{3,1,2},{5,2,13},{4,3,2}});
		System.out.println("Greatest number among the numbers in Triangle B is "+maximum);
	}
}