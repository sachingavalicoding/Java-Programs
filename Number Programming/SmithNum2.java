class SmithNum2
{
	// sum of digits 
	public static int sumOfDigit(int n ) {
		int sum = 0;
		while(n != 0){
			sum += (n % 10);
			n /= 10;
		}
		return sum;
	}
	
	public static boolean checkPrime(int n ) {
		
	}
	public static void main(String[] args) 
	{
		int num = 110;
	}
}
