class RangeOfFibo 
{
	public static void fibo(int start , int end , int n1 , int n2 ){
		if(start == end ){
			return;
		}
		int n3 = n1 + n2;
		if(n1 >= start && n1 <= end){
			System.out.print(n1 + " ");	
		}
		System.out.print(start + " ");	
		n1 = n2;
		n2 = n3;
		fibo(start+1 , end , n2 , n3);
	}
	
	public static void main(String[] args) 
	{
		fibo(100,2000,0,1);
	}
}
