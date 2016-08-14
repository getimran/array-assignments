/* Q28 Print Rigth Angle Triangle Wise */
package classFile;

class PrintTriangleQ28
{
	static void printTriangle(int x[])
	{
		int i,j;
		System.out.println("Given Numbers in Array: ");
		for(i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		
		System.out.println();
		System.out.println("Triangle Wise Print: ");
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(x[j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		printTriangle(new int[]{1,2,3,4,5});
	}
}