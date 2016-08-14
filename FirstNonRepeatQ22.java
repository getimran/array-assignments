/*Q22 First Non Repeating Element */
package classFile;

class FirstNonRepeatQ22
{
	static void firstNonRepeat(int  x[])
	{
		int i,j,k,l=0,f,flag,temp[];
		temp=new int[x.length];
		System.out.println("Given numbers in Array: ");
		for(i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		
		System.out.println();
		for(i=0;i<x.length;i++)
		{
			flag=0;
			f=0;
			for(k=0;k<temp.length;k++)
			{
				if(x[i]==temp[k])
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
				for(j=i+1;j<x.length;j++)
				{
					if(x[i]==x[j])
					{
						flag=1;
						temp[l++]=x[i];
						break;
					}
					
				}
				if(flag==0)
				{
					System.out.println("First Non repeating Number: "+x[i]);
					break;
				}
			}
			
		}
	}
	
	public static void main(String[] args)
	{
		firstNonRepeat(new int[]{3,1,5,8,1,4,3,5,8,4,9,11});
	}
}
			