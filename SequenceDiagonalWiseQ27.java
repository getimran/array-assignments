/*Q27 Sequence Diagonal Wise */
package classFile;

class SequenceDiagonalWiseQ27
{
	static int R=5,C=5;
	static boolean isvalid(int i, int j)
{
    
	if (i < 0 || i >= R || j >= C || j < 0) return false;
    return true;
}
	
	static void sequenceDiagonal(int x[][])
	{
		int i,j,k;
		System.out.println("Given Matrix: ");
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Sequence Diagonal wise Print: ");
		
		for(k=0;k<R;k++)
		{
			if((k+1)%2==0)
			{
				System.out.print(x[0][k]+" ");
				i=1;
				j=k-1;
			
				while(isvalid(i,j))
				{
					System.out.print(x[i][j]+" ");
					i++;
					j--;
				}
			}
			else
			{
				System.out.print(x[k][0]+" ");
				i=k-1;
				j=1;
			
				while(isvalid(i,j))
				{
					System.out.print(x[i][j]+" ");
					i--;
					j++;
				}
			}
			System.out.println();
		}
		
		
		for(k=1;k<C;k++)
		{
			if((k+1)%2==0)
			{
				System.out.print(x[k][R-1]+" ");
				i=k+1;
				j=R-2;
			
				while(isvalid(i,j))
				{
					System.out.print(x[i][j]+" ");
					i++;
					j--;
				}
			}
			else
			{
				System.out.print(x[R-1][k]+" ");
				i=R-2;
				j=k+1;
			
				while(isvalid(i,j))
				{
					System.out.print(x[i][j]+" ");
					i--;
					j++;
				}
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args)
	{
		sequenceDiagonal(new int[][]{{31,32,33,34,35},{36,37,38,39,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}});
	}
}