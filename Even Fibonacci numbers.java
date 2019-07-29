class EvenFibonacciNos
{
	public static void main(String args[])
	{
		int i=0,a=0,b=0,c=1,s=0;
		for(i=0;a<4000000;i++)
		{
			a=b;
			b=c;
			c=a+b;
			if(a%2==0)
			s+=a;
		}
		System.out.println(s);
	}
}