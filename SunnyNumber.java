class SunnyNumber 
{
	public static void main(String[] args) 
	{
		int num = 15;
		int temp = 1;
		while(true) {
			if(temp * temp == num + 1){
			    System.out.println(" Yes ");
				break;
			}
			else if(temp * temp > num + 1 ) {
			System.out.println(" NO ");
			break;
		}
			temp++;
		}
		
	}
}