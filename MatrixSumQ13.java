/*Q13 Matrix Sum */
package classFile;

class MatrixSumQ13
{
	static void matSum(int x[][])
	{
		int i,j,sumRow,sumCol,sumDiag1=0,sumDiag2=0;
		System.out.println("----------Matrix Sum-------------");
		System.out.println();
		
		for(i=0;i<x.length;i++)
		{
			sumRow=0;
			System.out.print("  ");
			for(j=0;j<x[i].length;j++)
			{
				sumRow+=x[i][j];
				System.out.print(x[i][j]+" ");
			}
			System.out.print(" "+sumRow);
			System.out.println();
		}
		
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				if(i+j==2)
				{
					sumDiag1+=x[i][j];
				}
			}
		}
		System.out.print(sumDiag1+" ");
		
		for(i=0;i<x.length;i++)
		{
			sumCol=0;
			for(j=0;j<x[i].length;j++)
			{
				sumCol+=x[j][i];
			}
			System.out.print(sumCol+" ");
			
		}
		
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				if(i==j)
				{
					sumDiag2+=x[i][j];
				}
			}
		}
		System.out.print(sumDiag2);
	
	}
	
	public static void main(String[] args)
	{
		matSum(new int[][]{{3,1,2},{5,2,3},{4,3,2}});
	}
}