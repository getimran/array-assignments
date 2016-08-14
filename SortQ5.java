/*Q5 Sort the numbers given in the array*/
package classFile;

class SortQ5
{
	static void sort(int x[])
	{
		int temp,i,j;
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x.length-1;j++)
			{
				if(x[i]<x[j])
				{
					temp= x[i];
					x[i]= x[j];
					x[j]= temp;
				}
			}
		}
		System.out.println("Sorted Numbers in Ascending order: ");
		for(i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
	}
	
	public static void main(String[] args)
	{
		sort(new int[]{23,15,3,10,9,2,7});
	}
}
		