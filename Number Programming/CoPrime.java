class CoPrime 
{
	public static void main(String[] args) 
	{
		int n1 = 15;
		int n2 = 8;
		int smaller = n1 < n2 ? n1 : n2;
		while(true){
		   if( smaller == 1) {
			System.out.println(" Co Prime Number "); 
			break;
		  }
		  else if(n1 % smaller == 0 && n2 % smaller == 0 ){
			System.out.println(" Not a Co Prime Number ");  
			break;
		  }
		  else {
			  System.out.println(smaller);
			smaller--;  
		  }
		}
	}
}