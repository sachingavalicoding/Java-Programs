import java.util.Scanner;
class PrimeRangeCount4
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Starting Number ");
		int start = sc.nextInt();
		System.out.println("Enter  Ending Number ");
		int end = sc.nextInt();
		int count = 0;
		
		while(start <= end) {
			int den = 2;
			while(start > den/2 + 1 ) {
			   if(start % den == 0) {
				 break;   
			   }
			   den++;
			}
			if(start == den ) {
				count++;
			}
			start++;
		}
		System.out.println(count);
	}
}
