/*Q10 Matrix Addition */
package classFile;

class MatrixAddQ10
{
	static void matAdd(int x[][],int y[][])
	{
		int i,j;
		int z[][]=new int[3][3];
		System.out.println("Given Matrix 1: ");
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
			
		}
			
		System.out.println("Given Matrix 2: ");
		for(i=0;i<y.length;i++)
			{
				for(j=0;j<y[i].length;j++)
				{
					System.out.print(y[i][j]+" ");
				}
				System.out.println();
			}
		
		
		for(i=0;i<z.length;i++)
		{
			for(j=0;j<z[i].length;j++)
			{
				z[i][j]=x[i][j]+y[i][j];
			}

		}
		System.out.println("Addition Result: ");
		for(i=0;i<y.length;i++)
			{
				for(j=0;j<y[i].length;j++)
				{
					System.out.print(z[i][j]+" ");
				}
				System.out.println();
			}
		
	}

	
	public static void main(String[] args)
	{
		matAdd(new int[][]{{2,3,4},{1,3,2},{4,2,1}}, new int[][]{{2,1,3},{1,4,1},{2,2,1}});
	}
}