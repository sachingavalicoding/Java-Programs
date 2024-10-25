import java.util.Scanner;
class Buzz 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter Number ");
		int num = sc.nextInt();
			if(num % 10 == 7 && num % 7 == 0){
				System.out.print(" Buzz Number ");
			}
			else {
				System.out.println(" Is not Buzz Number ");	
			}
	}
}
