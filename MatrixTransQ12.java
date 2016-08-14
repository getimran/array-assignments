/*Q12 Transpose Matrix */
package classFile;

class MatrixTransQ12
{
	static void matTran(int x[][],int y[][])
	{
		int i,j,k;
		System.out.println("Given Matrix 1: ");
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
			
		}
			
		
		System.out.println("Transpose of  Matrix 1: ");
		for(i=0;i<x.length;i++)
			{
				for(j=0;j<x[i].length;j++)
				{
					System.out.print(x[j][i]+" ");
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
		
		System.out.println("Transpose of  Matrix 2: ");
		for(i=0;i<y.length;i++)
			{
				for(j=0;j<y[i].length;j++)
				{
					System.out.print(y[j][i]+" ");
				}
				System.out.println();
			}
		
	}

	
	public static void main(String[] args)
	{
		matTran(new int[][]{{2,3,4},{1,3,2},{4,2,1}}, new int[][]{{2,1,3},{1,4,1},{2,2,1}});
	}
}