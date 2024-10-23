class SunnyNum 
{
	public static int sqOfNum(int n ) {
		return n * n;
	}
	
	public static boolean isSunnyNum(int n) {
		for(int i = 1 ; i < n ; i++){
			if(sqOfNum(i) == (n + 1)){
			  return true;	
			}
			
		}
		return false;
	}
	public static void main(String[] args) 
	{
		if(isSunnyNum(2)){
			System.out.print( " Is a Sunny number " );
		}
		else{
			System.out.print(" Is Not Sunny number ");	
		}
		
	}
}
