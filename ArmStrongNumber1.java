class ArmStrongNumber1 
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
		if(isArmStrong(153)) {
		   System.out.println(" Armstrong number ");	
		}
		else{
			System.out.println(" Not a Armstrong number ");	
		}
		
	}
}
