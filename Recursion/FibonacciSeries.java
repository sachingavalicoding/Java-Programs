class FibonacciSeries 
{
	/* 
	public static void fibo(int n , int n1, int n2){
		while(true){
			
			if(n == 0) {
				break;
			}
			int n3 = n1 + n2;
			System.out.print(n1 + " ");
			n1 = n2;
			n2 = n3;
			n = n - 1;
		}
	}	
	*/
	
	public static void fibo(int n , int n1, int n2){
		if(n==0){
			return;
		}
		int n3 = n1 + n2;
		System.out.print(n1 + " ");
		fibo(n-1, n2, n3);
	}
	
	public static void main(String[] args) 
	{
		fibo(10 , 0 , 1);
	}
}
