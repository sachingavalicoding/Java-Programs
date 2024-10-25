class KeithNumber 
{
	public static int sumOfDigit(int n ) {
		int sum = 0;
		while(n != 0){
			sum += n % 10;	
			n /= 10;
		}
		return sum;
	}
	
	public static int newMem(int n1 , int n2 , int n3 ){
		return n1 + n2 + n3;	
	}
	public static void main(String[] args) 
	{
		int num = 742;	
		int n1 = 4;
		int n2 = 2;
		int n3 = 13;
		int n4;
		while(n3 < num) {
		n4 = newMem(n1 , n2 , n3); //19 
		n1 = n2 ;// 2 
		n2 = n3 ;// 13
		n3 = n4;//19
		if(n4 == num){
			System.out.println(" Yes  ");	
			break;
		}
			
		System.out.println(" n4 " + n4);	
		}
	}
}
