class RemoveDigits 
{
	public static int removeDigit(int n , int digit ){
		int newNum = 0;
		while(n != 0) {
			if((n % 10 ) != digit){
				newNum = (newNum * 10) + (n % 10);	
			}
			n /= 10;
		}
		return reverse(newNum);
	}
	
	// reverse number 
	public static int reverse(int n ){
		int rev = 0;
		while(n != 0) {
			rev = (rev * 10) + (n % 10);	
			n /= 10;
		}
		return rev;	
	}
	public static void main(String[] args) 
	{
		int n = 4323423;
		int digit = 3;
		System.out.println(removeDigit(n , digit));
	}
}
