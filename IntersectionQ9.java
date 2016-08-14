/*Q9 find intersection of two arrays*/
package classFile;

class IntersectionQ9
{
	static void intersection(int x[],int y[])
	{
		int z[],i,j,k=0,temp;
		int len= x.length>y.length?y.length : x.length;
		z=new int[len];
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
			for(j=0;j<y.length;j++)
			{
				if(x[i]==y[j])
				{
					z[k++]=x[i];
				}
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
		System.out.println("Array1 intersection Array2: ");
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
		intersection(new int[]{8,2,5,1,6,9,10},new int[]{9,2,13,10,1,67});
	}
}