class Factorial 
{
	// without recursion
	/* 
	public static int factorial(int num ) {
		
		int fact = 1;
		for(int i = num; i > 1; i--){
			fact *= i;	
		}
		return fact;
		
	}
	*/
	
	// with recursion
	
	public static int factorial(int num ) {
		// base condition 
		if(num == 1){
			return 1;
		}
		
		return num * factorial(num - 1);
	}
	public static void main(String[] args) 
	{
		int num = 5;
		System.out.println(factorial(num));
	}
}
