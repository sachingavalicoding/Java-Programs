import java.util.Scanner;
class DigitSum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int even = 1;
		int odd = 0;
		while(num != 0) {
			if( (num % 10) % 2 == 0 ){
				even *= num % 10;	
			}
			else{
			    odd += num % 10;
			}
			num /= 10;	
		}
		System.out.println(" Multiplicatio of even number is " + even + " Sum of odd is " + odd);
	}
}
