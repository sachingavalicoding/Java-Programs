class CountOfDigit 
{
	/*
	// without recursion
	
	public static int countOfDigit(int n) {
		int count = 0;
		while(n != 0) {
			count++;
			n /= 10;
		}
		return count;
	}
	
	*/
	
	// with recursion
	
	public static int countOfDigit(int n , int count ){
		if(n == 0) {
			return count;	
		}
		
		return countOfDigit(n/=10 , count+1);
	}
	public static void main(String[] args) 
	{
		System.out.println(countOfDigit(1234 , 0));
	}
}
