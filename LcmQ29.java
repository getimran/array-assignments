/*Q29 LCM of n Numbers */
package classFile;

class LcmQ29
{
	static int lcm2Num(int n1, int n2)
	{
		 return n1 * (n2 / HcfQ30.hcf2Num(n1, n2));
	}
	
	static int lcmNnum(int x[])
	{
		int i,lcm;
		System.out.println("Given numbers : ");
		for(i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		
		System.out.println();
		lcm = x[0];
		for(i = 1; i < x.length; i++) 
		{
			lcm = lcm2Num(lcm, x[i]);
		}
    return lcm;
	}

	public static void main(String[] args)
	{
		int result= lcmNnum(new int[]{24,30,12});
		System.out.println("LCM of given numbers is: "+result);
	}
}
		
		
		
		