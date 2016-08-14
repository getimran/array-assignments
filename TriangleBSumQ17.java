/*Q17 Triangle B Sum */
package classFile;

class TriangleBSumQ17
{
	static void TriBSum(int x[][])
	{
		int i,j,sum=0;
		System.out.println("----------Triangle B Sum-------------");
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
					sum+=x[i][j];
				}
			}
		}
		System.out.println("Sum of the numbers present in Triangle B is "+sum);
	
	}
	
	public static void main(String[] args)
	{
		TriBSum(new int[][]{{3,1,2},{5,2,3},{4,3,2}});
	}
}