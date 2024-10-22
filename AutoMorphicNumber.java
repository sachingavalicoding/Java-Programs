class AutoMorphicNumber  
{
	public static void main(String[] args) 
	{
		int num = 76;
		
		int sq = num * num;
		boolean isSame = true;
		while(num != 0) {
			if((num % 10 )!=(sq %10)){
				isSame = false;
				break;
			}
			num /= 10;
			sq /= 10;
		}
		if(isSame){
		  System.out.println(" Yes ");	
		}
		else{
		 System.out.println(" NO ");		
		}
	}
}
