import java.util.Scanner;
class Lcm1 
{
	public static void main(String[] args) 
	{
		// lcm = least common multiple
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a Number " );
		int n1 = sc.nextInt();
		System.out.println(" Enter a Number " );
		int n2 = sc.nextInt();
		int lcm = n1 > n2 ? n1 : n2; // 15 
		int big = lcm;
		while(true){
			if(lcm % n1 == 0 && lcm % n2 == 0){
				System.out.println(" LCM " + lcm );
				break;
			}
			System.out.println( " No of Iteration " + (lcm - big));
			lcm++;
		}
	}
}
