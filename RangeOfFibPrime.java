class RangeOfFibPrime 
{
	public static void main(String[] args) 
	{
		int limit=100;
		int n1=0;
		int n2=1;
		int n3;
		for(int i=1;i<=limit;i++){
			for(int j=2;j<n2;j++){
				if(i%j==0){
					System.out.println(i);
					break;
				}
			}
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}
}
