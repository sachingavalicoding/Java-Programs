import java.util.Scanner;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		// prime number:- a Number which only divisible by  1 and  itself.
		int i = 2; // 15 
		 while(true) {
			if((num / 2 ) == i) {
			  System.out.println(" Prime Number ");
			  break;
			}
		   else if(num % i == 0){ 
			   System.out.println( " Not a Prime Number ");
			   break;
			}
			  i++;	
		 }
		 
	}
}
