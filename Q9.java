class pythogorus
{
	public static void main(String args[])
	{
		
		int x=0,i,j;
		for(i=1;i<1000;i++)
		{
			for(j=i+1;j<1000;j++)
			{
				
				x=1000-i-j;
				if((x*x)==(i*i)+(j*j))
				{
			
				 System.out.println("product of a,b and c is"+(i*j*x));
				 
			 	break;
				}
			}
		}
		
   }    
}
