import java.math.BigInteger;

class q12
 {
    public static void main(String[] args) 
    {
        int n=1,i,a;
       // BigInteger i = new BigInteger("0");
        BigInteger j = new BigInteger("1");
        BigInteger x = new BigInteger("1"); 
        BigInteger k = new BigInteger("0");
        //BigInteger sum = new BigInteger("0");
        
        
        
        //n=0,k=0;
        for(a=0;n<=500;a++)
        {
            k = new BigInteger("1");;n=0;
            for(i=1;i<a;i++)
            {
                k=k.add(BigInteger.valueOf(i));
            }
            j = new BigInteger("1");
               while(j.compareTo(k)>0)
               {
                   if (k.remainder(j).equals(0))
                   n++;
                   j=j.add(x);
                }
                
            }  
           System.out.println(n);
           System.out.println(k);
           //System.out.println(i);
       }
}
	        