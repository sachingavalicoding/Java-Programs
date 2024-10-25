class PracticeNumberProgramming 
{
	public static boolean checkPrime(int n) {
		for(int den = 2; den < n; den++){
			if(n % den == 0){
				return false;
			}
	}
	 return true;
	}
	public static void main(String[] args) 
	{
		int limit = 75;
		for(int i = 2; i <= limit; i++){
			if(checkPrime(i)){
				System.out.print(i + " ");
			}
		}
	}
}
