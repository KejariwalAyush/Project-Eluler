class Prime
{
	public static void main(String args[])
	{
		int i, number, count;
		long s=0; 
		
		System.out.println(" sum of Prime Numbers from 1 to 100 are : ");	
		for(number = 1; number <= 2000000; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	s+=number;
		    	//System.out.print(number + " ");
		    }  
		}
		System.out.println(" ");
		System.out.println(s);
   }    
}
    
