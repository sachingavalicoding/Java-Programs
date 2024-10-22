class Fib3 
{
	public static void main(String[] args) 
	{
		int n1 = 0;
		int n2 = 1;
		int n3;
		int limit = 20;
		for(int i = 0; i < limit; i++){
			n3 = n1 + n2;
			System.out.print(n1 + " " );
			n1 = n2;
			n2 = n3;
		}
	}
}
