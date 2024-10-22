class RangeOfArmStrong 
{
	public static boolean isArmStrong(int num){
		int sum = 0;
		int temp = num;
		while (num != 0)
		{
			sum += ( (num % 10) * (num % 10) * (num % 10) );
			num /= 10;
		}
		
		return sum == temp ? true : false;
		
	}
	public static void main(String[] args) 
	{
		int start = 0;
		int limit = 1000;
		for(int i = start; i < limit; i++){
			
			if(isArmStrong(i)) {
		   System.out.println(i + " is a Armstrong number ");	
		   }
		
		}
		
	}
}
