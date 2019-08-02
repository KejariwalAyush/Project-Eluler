class prime
{
	public static void main(String args[])
	{
		int i,n=0,c=0; 
		for(i=1;n<=10001;i++)
		{
		
			for(int j=2;j<i;j++)
			{
			    c=0;
			    if(i%j==0)
			    {
					
			        c=1;
				break;
				
			    }
                         }
                         if(c==0)
	                  n++;
		 }        
              System.out.println(i-1);
   }    
}
    
