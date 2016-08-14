/*Q11 Matrix Multiplication */
package classFile;

class MatrixMultQ11
{
	static void matMult(int x[][],int y[][])
	{
		int i,j,k;
		int mult[][]=new int[3][3];
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
		
		
		for(i=0;i<mult.length;i++)
		{
			for(j=0;j<mult[i].length;j++)
			{
				for(k=0;k<mult[i].length;k++)
				{
					mult[i][j]=mult[i][j]+(x[i][k]*y[k][j]);
				}
			}

		}
		System.out.println("Multiplication Result: ");
		for(i=0;i<mult.length;i++)
			{
				for(j=0;j<mult[i].length;j++)
				{
					System.out.print(mult[i][j]+" ");
				}
				System.out.println();
			}
		
	}

	
	public static void main(String[] args)
	{
		matMult(new int[][]{{2,3,4},{1,3,2},{4,2,1}}, new int[][]{{2,1,3},{1,4,1},{2,2,1}});
	}
}