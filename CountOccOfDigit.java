import java.util.Scanner;

class CountOccOfDigit {

   public static void main(String [] args ) {
	
	int num;
	int digit;
	int count = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter a Number ");
	num = sc.nextInt();
	System.out.println(" Enter a Digit  ");
	digit = sc.nextInt();
	while(num > 0) {
	int rem = num % 10;
	if(digit == rem) {
	count++;
	}
	num /= 10;
     }	
	System.out.println(" Occ of Digit in Number is  " + count);
	
   }
}