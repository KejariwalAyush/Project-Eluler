
class sumFactorial
{
	public static void main(String args[])
	{
		long a=100,i,j,sum=0,x=0;
		long f=1;
		for(i=1;i<=a;i++)
		{
			f*=i;
		}
		System.out.println(f);
		int l=String.valueOf(f).length();
		for(j=1;j<=l;j++)
		{
			x=(int)f%10;
			sum+=x;
			x=0;
			f/=10;
		}
		System.out.println(sum);
   }    
}
