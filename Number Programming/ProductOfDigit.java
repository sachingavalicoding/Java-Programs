import java.util.Scanner;

class ProductOfDigit {

   public static void main(String [] args ) {
	
	int num;
	int product = 1;
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter a Number ");
	num = sc.nextInt();
	while(num > 0) {
	int rem = num % 10;
	product = product * rem;
	num /= 10;
     }	
	System.out.println(" Multiplication of Given Number is " + product);
	
   }
}