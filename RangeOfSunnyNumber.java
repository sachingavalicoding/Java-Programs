class RangeOfSunnyNumber 
{
	public static void main(String[] args) 
	{
		int start = 20;
		int end = 200;
		int idx = 1;
		while((idx * idx) <= end ) {
			if((idx * idx) >= start && idx <= end) {
			    System.out.print( ((idx * idx) - 1) + " "  ); 	
			}
			idx++;
		}
	}
}
