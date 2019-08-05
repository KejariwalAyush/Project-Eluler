class prime
{
	public static void main(String args[])
	{
	   int j,i;
           long n=2,c=0; 
	   for(i=3;i<2000000;i+=2)
	   {
		
	    for(j=3;j<=Math.pow(i, 0.5) + 1;j+=2)
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
