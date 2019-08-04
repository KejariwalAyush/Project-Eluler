import java.math.BigInteger;

public class q20{
	public static void main(String[] args) {
		BigInteger f = new BigInteger("1");
		BigInteger a= new BigInteger("10");
		for(int i=2;i<=100;i++)
    	f=f.multiply(BigInteger.valueOf(i));
    	
    	BigInteger s = new BigInteger("1");
    	BigInteger sum = new BigInteger("0");
    	while(f.compareTo(s)>0)
    	{
    		s=f.remainder(a);
    		sum=sum.add(s);
    		
    		f=f.divide(a);
    	}
    
		System.out.println(sum);
	}
}
