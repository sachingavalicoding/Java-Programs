class SpyNum 
{
	// spy num = sum of digit = proudct of digit
	public static boolean checkSpyNum(int n ) {
		int sum = 0;
		int product = 1;
		for(int i = n; i != 0; i/=10){
			sum += (i % 10);
			product *= (i % 10);
		}
		
		return (sum == product);
	}
	public static void main(String[] args) 
	{
		int num = 1234;
		System.out.println(checkSpyNum(num));
		
	}
}
