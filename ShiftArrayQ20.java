/*Q20 Shift Array */
package classFile;

class ShiftArrayQ20
{
	static void shift(int x[])
	{
		int i,j=0,k=0,temp,negative[],positive[],result[];
		negative= new int[x.length];
		positive= new int[x.length];
		result=new int[x.length];
		
		System.out.println("Given numbers in Array: ");
		for(i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		
		for(i=0;i<x.length;i++)
		{
			if(x[i]<0)
			{
				negative[j++]=x[i];
			}
			else
			{
				positive[k++]=x[i];
			}
		}
		
		for(i=0;i<negative.length;i++)
		{
			for(j=0;j<negative.length-1;j++)
			{
				if(negative[i]>negative[j])
				{
					temp= negative[i];
					negative[i]= negative[j];
					negative[j]= temp;
				}
			}
		}
		
		for(i=0;i<positive.length;i++)
		{
			for(j=0;j<positive.length-1;j++)
			{
				if(positive[i]<positive[j])
				{
					temp= positive[i];
					positive[i]= positive[j];
					positive[j]= temp;
				}
			}
		}
		
		
		
		j=0;
		for(i=0;i<negative.length;i++)
		{
			if(negative[i]!=0)
			{
				result[j++]=negative[i];
			}
		}
		for(i=0;i<positive.length;i++)
		{
			if(positive[i]!=0)
			{
				result[j++]=positive[i];
			}
		}
		
		System.out.println();
		System.out.println("After Shifting: ");
		for(i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}
		
	}
	
	public static void main(String[] args)
	{
		shift(new int[]{-1,4,-3,-4,2,1,-2,3,-5,6,-6,5});
	}
}
				