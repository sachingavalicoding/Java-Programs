class RangeOfFib 
{
	public static void main(String[] args) 
	{
		int n1 = 0;
		int n2 = 1;
		int n3;
		int start = 8;
		int end = 1000;
		while(n2 <= end) {
		  n3 = n1 + n2;
		  if(n3 >= start && n3 <= end) {
			System.out.print(n3 + " ");  
		  }
		  n1 = n2;
		  n2 = n3;
		}
	}
}
