import java.util.Scanner;
class PrimeRangeCount2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Starting Number ");
		int start = sc.nextInt();
		System.out.println("Enter  Ending Number ");
		int end = sc.nextInt();
		int count = 0;
		
		for(int i = start; i <= end; i++) {
			int den = 2;
			while(start > den ) {
			   if(start % den == 0) {
				 break;   
			   }
			   den++;
			}
			if(start == den ) {
				System.out.print(start + " ");
			}
			start++;
		}
	}
}
