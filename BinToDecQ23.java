/*Q23 Binary to Decimal */
package classFile;

class BinToDecQ23
{
	static int power(int b, int p)
     {       
              int n=1;
              for(int i=0;i<p;i++)
              {
                       n=b*n;
              }
              return n;
     } 
	
	static int binToDec(int x[])
	{
		int i,temp,s=0,sum=0;
		
		System.out.print("Given Binary Number: ");
		for(i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		
		temp=x.length-1;
		for(i=0;i<x.length;i++)
		{
			s=x[i]*power(2,temp);
			sum+=s;
			temp--;
		}
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		int decimal= binToDec(new int[]{1,1,0,0,1,0});
		System.out.println();
		System.out.println("Decimal Value: "+decimal);
	}
}
		