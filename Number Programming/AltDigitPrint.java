import java.util.Scanner;

class AltDigitPrint {

   public static void main(String [] args ) {
	
	int num;
	int count = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter a Number ");
	num = sc.nextInt();
	while(num > 0) {
	int rem = num % 10;
	if(count % 2 == 0) {
	 System.out.print(rem + " " );
	}
	count++;
	num /= 10;
     }	
   }
}