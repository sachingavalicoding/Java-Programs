class Pattern4 
{
	public static void main(String[] args) 
	{
		int n = 7;
		/*
		for(int i = 0; i < n; i++){
			for(int j = 0; j < i + 1; j++){
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		*/
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n - i ; j++){
				if (i % 2 == 0){
					System.out.print("*"+ " ");
				}
				else{
					System.out.print(" "+ " ");
				}
			}
			System.out.println();
		}
	}
}