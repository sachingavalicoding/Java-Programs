import java.util.Scanner;
class PrimeRangeCount 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Starting Number ");
		int start = sc.nextInt();
		System.out.println("Enter  Ending Number ");
		int end = sc.nextInt();
		int count = 0;
		
		
		while(start <= end ) {
			int den = 2;
			while(start > den) {
				if( start % den == 0) {
					break;	
				}
				den++;
			}
			if(den == start){
			    System.out.println( " "+ start);	
				count++;
			}
			start++;
		   
		} 
		  int i = 2;
		  while(count > i){
		   if(count % i == 0) {
			   System.out.println(" Count is not prime "+ count);
			   break;   
			 }
		   i++;
		}
		if(i == count){
			System.out.print( " Count is Prime "+ count);	
		}
	}
}
