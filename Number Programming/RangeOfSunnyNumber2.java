class RangeOfSunnyNumber2
{
	// square 
	// print number 
	// sunny number check 
	public static int squareOfNum(int n){
	 return n * n;	
	}
	
	public static void printNum(int n){
		System.out.print(n + " " );	
	}
	
	public static int sunnyNum(int n) {
	   return n - 1;	
	}
	
	public static void main(String[] args) 
	{
		int start = 40;
		int end = 2000;
		for(int i = 1; squareOfNum(i) <= end; i++){
			if( squareOfNum(i) >= start) {
				printNum(sunnyNum(squareOfNum(i)));	
			}
		}
		
	}
}
