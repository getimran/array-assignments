/*Q30 HCF of n Numbers */
package classFile;

class HcfQ30
{
	static int hcf2Num(int n1, int n2)
	{
		int temp;
		while (n2 > 0)
		{
			temp = n2;
			n2 = n1 % n2; 
			n1 = temp;
		}
    return n1;
	}
	
	static int hcfNnum(int x[])
	{
		int i,hcf;
		System.out.println("Given numbers : ");
		for(i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		
		System.out.println();
		hcf = x[0];
		for(i = 1; i < x.length; i++) 
		{
			hcf = hcf2Num(hcf, x[i]);
		}
    return hcf;
	}

	public static void main(String[] args)
	{
		int result= hcfNnum(new int[]{24,30,12,34,56});
		System.out.println("HCF of given numbers is: "+result);
	}
}
		
		
		
		