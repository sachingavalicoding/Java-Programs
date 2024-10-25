import java.util.Scanner;

class EvenOddCount {
public static void main(String [] args ) {
	
	int num;
	int evenCount = 0;
	int oddCount = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter a Number ");
	num = sc.nextInt();
	while(num > 0) {
	int rem = num % 10;
	if(rem % 2 == 0) {
         evenCount++;
	}
	else {
	oddCount++;
	}
	num /= 10;
     }	
	System.out.println("Even Count is : " + evenCount + " Odd count is : " + oddCount);
	
   }

}