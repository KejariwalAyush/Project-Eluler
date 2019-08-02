class pallindrom
 {
	public static void main(String[] args) 
	{
		int max=0;
		for(int i=999;i>=100;i--)
		{
			for(int j=i;j>=100;j--)
			{
			int p=i*j;
			if(p<max)
			break;
			int n=p;
			int r=0;
			while(n!=0)
			{
				r=r*10+n%10;
				n/=10;
			}
			if(p==r && p>max)
			max=p;
			}
		}
		System.out.println(max);
	}
}
