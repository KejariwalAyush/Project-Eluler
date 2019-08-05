class LargestPrimeFactor
{
	public static void main(String args[])
	{
		long i,j,flag=0,n,m,s=0;      
       long a=600851475143L;    
            
 
       for(j=2;j*j<=a;j++)
       {      
          if(a%j==0)
          {      
             n=j;
             m=n/2;      
             if(n>1)
             {  
               for(i=2;i<=m;i++)
               {      
                if(n%i==0)
                {             
                   flag=1;      
                    break;      
                 }      
               }      
               if(flag==0) 
               { 
               	s=n;
               	
                }  
             }
         
          }
          }
         System.out.println(s + " is largest prime factor ");
         
	}
}
