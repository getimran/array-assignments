/*Q7 Merge sort*/
package classFile;


class MergeSortQ7
{
	static void mergesort(int x[],int y[])
	{
		int z[],i,k=0;
		z=new int[x.length+y.length];
		System.out.println("Given Array 1: ");
		for(i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		
		System.out.println();
		System.out.println("Given Array 2: ");
		for(i=0;i<y.length;i++)
		{
			System.out.print(y[i]+" ");
		}
		
		for(i=0;i<x.length;i++)
		{
			z[k++]=x[i];
		}
		for(i=0;i<y.length;i++)
		{
			z[k++]=y[i];
		}
		
		System.out.println();
		System.out.println("After merging Array 1 and Array 2: ");
		for(k=0;k<z.length;k++)
		{
			System.out.print(z[k]+" ");
		}
		System.out.println();
		SortQ5.sort(z);
	}
	
	public static void main(String[] args)
	{
		mergesort(new int[]{3,7,1,8,31,9}, new int[]{2,21,32,4,11});
	}
}
	