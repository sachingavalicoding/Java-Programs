class MethodsOfNumberPrograms 
{
	// print digit 
	public static void printNum(int n){
		System.out.print(n + " " );	
	}
	
	// square of number
	public static int squareOfNum(int n){
	 return n * n;	
	}
		// cube of number
	public static int squareOfNum(int n){
	 return n * n * n;	
	}
	
	// power of number 
	public static int powerOfNum(int base , int raise){
		int ans = 1;
		for(int i = 0; i < raise; i++){
			ans = ans * base;
		}
		
		return ans;
	}
	
	// even check
	
	public static boolean checkEven(int n) {
		return (n % 2 == 0);	
	}
	
	// odd check
	public static boolean checkEven(int n) {
		return (n % 2 != 0);	
	}
	
	// number is divisible by number 
	
	public static boolean checkDivisibleByThree(int n , int divde) {
		return (n % divde == 0);
	}
	
		// sum of n numbers 
	
	public static int sumOfNum(int n ) {
		int sum = 0; 
		while(n >= 1) {
			sum += n;	
			n--;
		}
		return sum;
	}
	
	// extract digit
	public static int extractDigit(int n) {
		return n % 10;	
	}
	
	// update digit by one unit place 
	public static int updateDigit(int n) {
		n /= 10;
		return n;	
	}
	
	// extract number
	public static void extractNumber(int n){
		while(n != 0) {
			printNum(extractDigit(n));
			 n = updateDigit(n);
		}
	}
	
	// reverse number 
	
	public static int reverseNum(int n){
		int rev = 0;
		while(n != 0) {
			 rev = (rev *  10) + extractDigit(n);
			 n = updateDigit(n);
		}
		return rev;
	}
	
	// check palindrome 
	
	public static boolean checkPalindrome(int n){
		return (reverseNum(n) == n);
	}
	
	
	
	// factorial of number 
	public static int factorialOfNum(int n) {
		int fact = 1;
		for(int i = 1; i <= n; i++){
			fact = fact * i;
		}
		return fact;
	}
	
	// factors of number
	public static void factorOfNum(int n){
		for(int i = 1; i <= n/2; i++){
			if(n % i == 0){
				printNum(i);
			}
		}
		printNum(n);
	}
	
	
	// check prime 
	public static boolean checkPrime(int n){
		
		for(int i = 2; i < n / 2; i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
	
	
	// check buzz number 
	public static boolean buzz(int n) {
		return ((n % 7 == 0 ) && (n % 10 == 7));
	}
	
	// check duck number
	public static boolean duck(int n) {
		
	}
	public static void main(String[] args) 
	{
		factorOfNum(12);
	}
}
