import java.util.Scanner;

class SumOfEvenOddDigit {
public static void main(String [] args ) {
	
	int num;
	int evenSum = 0;
	int oddProduct = 1;
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter a Number ");
	num = sc.nextInt();
	while(num > 0) {
	int rem = num % 10;
	if(rem % 2 == 0) {
         evenSum += rem;
	}
	else {
	oddProduct *= rem;
	}
	num /= 10;
     }	
	System.out.println("Even Sum is : " + evenSum + " Odd Product is  : " + oddProduct);
	
   }

}