class prime
{
	public static void main(String args[])
	{
		int i,n=0,c=0;
		for(i=2;n<=10000;i++)
		{
		
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				c++;
			}
			if(c==0)
			{
				n++;
			}
			c=0;
			
		}
       System.out.println(i-1);
   }    
}
    