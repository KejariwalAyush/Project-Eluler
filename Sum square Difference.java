class SumSqDiff
{
	public static void main(String args[])
	{
		int i=0,sum=0,s=0;
		for(i=0;i<101;i++)
		{
			s+=(i*i);
			sum+=i;
		}
       System.out.println((sum*sum)-s);
       
       
	}
}