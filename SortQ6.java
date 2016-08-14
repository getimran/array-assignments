/*Q6 Sort the numbers given in Array of arrays*/
package classFile;

class SortQ6
{
	static void sort(int x[][])
	{
		int temp,i,j,k,l;
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				for(k=0;k<x.length;k++)
				{
					for(l=0;l<x[i].length;l++)
					{
						if(x[i][j]<x[k][l])
						{
							temp= x[i][j];
							x[i][j]= x[k][l];
							x[k][l]= temp;
						}
					}
				}
			}
		}
		System.out.println("Sorted Numbers in Ascending order: ");
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+" ");
			}
		}
	}
	
	public static void main(String[] args)
	{
		sort(new int[][]{{23,15,3},{10,9,2},{7,5,22}});
	}
}
		