class RangeOfStrong 
{
	public static void main(String[] args) 
	{
		int start = 1;
		int end = 1000;
		while(start <= end){
			int factSum = 0;
			for(int i = start; i != 0; i /= 10) {
				
				int fact = 1;
				// factorial of number 
				for(int j = i % 10; j > 1; j--) {
				   fact *= j; 	
				}
				factSum += fact;
			}
			if(factSum == start){
				System.out.println(start);
			}
			start++;
		}
	}
}
