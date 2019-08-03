class prime
{
	public static void main(String args[])
	{
	   int j,i;
           long n=0,c=0; 
	   for(i=2;i<2000000;i++)
	   {
		
	    for(j=2;j<=Math.pow(n, 0.5) + 1;j++)
	    {
                c=0;
                if(i%j==0)
                {		
		   c=1;
                   break;	
	        }
            }
            if(c==0)
	     n+=i;
        }        
        System.out.println(n);
   }    
} 
