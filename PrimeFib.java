import java.util.Scanner;

class PrimeFib
{
	public static void main(String [] args ) {
		// step 1 
		Scanner sc = new Scanner(System.in);
        System.out.println(" Enter  Number "); 
		int num = sc.nextInt();
		// step 2 
		int den = 2;
		int fact = 1;
		while(num > den ) {
		   if(num % den == 0) {
			break;   
		   }
		   den++;
		}
		if(den == num) {
		   System.out.println(" Prime Number " + num );	
		   int n1 = 0;
		   int n2 = 1;
		   int n3;
		   while(true) {
			   n3 = n1 + n2;
			   if(n3 == num ) {
				System.out.println(" Fibonacci Number "+num);
				break;
			   }
			   else if(n3 > num) {
				System.out.println(" Not a Fibonacci Number "+num);    
				break;
			   }
			   n1 = n2;
			   n2 = n3;
		   }
		}
		else{
			for(int i = num ; i > 1; i--) {
				fact *= i;
			}
			
			System.out.println(" Factorial of Number is " + fact); 
		}
	}
}