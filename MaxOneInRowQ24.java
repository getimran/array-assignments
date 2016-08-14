/*Q24 Find the maximum number of one in a row and also fine number of ones in that row */
package classFile;

class  MaxOneInRowQ24
{
	static void maxOne(int x[][])
	{
		int i,j,k=0,count,max,row=0,temp[];
		temp=new int[2*x.length];
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
		for(i=0;i<x.length;i++)
		{
			count=0;
			for(j=0;j<x[i].length;j++)
			{
				if(x[i][j]==1)
				{
					count++;
				}
			}
			temp[k++]= count;
		}
		
		max=temp[0];
		for(k=0;k<temp.length;k++)
		{
			if(max<temp[k])
			{
				max=temp[k];
				row=k+1;
			}
		}
		System.out.println("Row with maximum number of 1: "+row+"          Number of 1's present in row "+row+" is: "+max);
	}
	
	public static void main(String[] args)
	{
		maxOne(new int[][]{{0,0,0,0,1},{1,1,1,1,1},{0,0,1,1,1},{0,0,0,1,1},{0,0,0,0,1}});
	}
}
		
		