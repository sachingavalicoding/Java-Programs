class SumOfDigits 
{
	public static int sumOfDigit(int n , int ct) {
		if(n == 0) {
			return ct;	
		}
		
		ct += (n % 10);
		 return sumOfDigit(n/=10, ct);
	}
	public static void main(String[] args) 
	{
		System.out.println(sumOfDigit(9284 , 0));
	}
}
