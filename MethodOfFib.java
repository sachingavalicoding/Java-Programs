class MethodOfFib

{
	// display series up to n 
	public static void DisplayFibSeries(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3;
		for(int i = 0; i < n; i++){
				n3 = n1 + n2;
				System.out.print(n1 + " ");
				n1 = n2;
				n2 = n3;
		}
	}
	
	// check number is fib number or not 
	public static boolean checkFib(int n){
		int n1 = 0;
		int n2 = 1;
		int n3;
		while(n2 < n){
				n3 = n1 + n2;
				if(n == n3){
				  return true;	
				}
				n1 = n2;
				n2 = n3;
		}	
		return false;
	}
	
	// range of fib series 
	public static void rangeOfFib(int start , int end ){
		
		int n1 = 0;
		int n2 = 1;
		int n3;
		while(n2 <= end){
			n3 = n1 + n2;
			if(n1 >= start && n1 <= end){
			  System.out.print(n1 + " ");	
			}
			n1 = n2;
			n2 = n3;
		}
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println(checkFib(15));
		rangeOfFib(15 , 400);
		
	}
}
