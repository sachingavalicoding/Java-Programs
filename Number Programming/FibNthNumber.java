class FibNthNumber 
{
	public static void main(String[] args) 
	{
		int n = 3; // 0 1 1 2 3 5 8
		int n1 = 0;
		int n2 = 1;
		int n3;
		int count = 0;
		while(true){
			n3 = n1 + n2;
			if(count == n){
			   System.out.println(n1);
			   break;
			}
			count++;
			n1 = n2;
			n2 = n3;
		}
	}
}