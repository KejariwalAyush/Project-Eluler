class prime
{
	public static void main(String args[])
	{
		int i=3,n=1,c=0; 
		while(n<=10000)
		{
			c=0;
			for(int j=3;j<=i/2;j+=2)
			{
			    
			    if(i%j==0)
			    {
					
			        c=1;
				break;
				
			    }
                         }
                         if(c==0)
	                  n++;
			i+=2;
		 }        
              System.out.println(i-2);
   }    
}
    
