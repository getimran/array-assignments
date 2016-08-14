/*Q8 find union of two arrays*/
package classFile;

class UnionQ8
{
	static void union(int x[],int y[])
	{
		int z[],i,j,k=0,temp;
		z=new int[x.length+y.length];
		System.out.print("Given Array1 : ");
		for(i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.print("Given Array2 : ");
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
			int flag=1;
			for(j=0;j<x.length;j++)
			{
				if(y[i]==x[j])
				{
					flag=0;
				}
				
			}
			if(flag==1)
				{
					z[k++]=y[i];
				}
		}
				
		for(i=0;i<z.length;i++)
		{
			for(j=0;j<z.length-1;j++)
			{
				if(z[i]<z[j])
				{
					temp= z[i];
					z[i]= z[j];
					z[j]= temp;
				}
			}
		}
		System.out.println();
		System.out.println("Array1 union Array2: ");
		for(k=0;k<z.length;k++)
		{
			if(z[k]!=0)
			{
				System.out.print(z[k]+" ");
			}
		}
	}
	
	public static void main(String[] args)
	{
		union(new int[]{8,2,5,1,6,9,10},new int[]{9,2,13,10,1,67});
	}
}