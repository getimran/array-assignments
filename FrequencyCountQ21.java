/*Q21 Frequency Count */
package classFile;

class FrequencyCountQ21
{
	static void frequencyCount(int x[])
	{
		int i,j,k,l=0,count,flag,temp[];
		temp=new int[x.length];
		
		System.out.println("Given numbers in Array: ");
		for(i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		
		System.out.println();
		System.out.println("Digit"+"        "+"Frequency");
		for(i=0;i<x.length;i++)
		{
			flag=0;
			count=0;
			for(k=0;k<temp.length;k++)
			{
				if(temp[k]==x[i])
				{
					flag=1;
				}
			}
			
			if(flag==0)
			{
				
				for(j=0;j<x.length;j++)
				{
					if(x[i]==x[j])
					{
						count++;
					}
				}
				System.out.println(" "+x[i]+"              "+count);
				temp[l++]=x[i];
			}
		}
	}

		
	public static void  main(String[] args)
	{
		frequencyCount(new int[]{1,2,1,3,2,4,1,4,1});
	}
}