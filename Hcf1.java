import java.util.Scanner;
class Hcf1 
{
	public static void main(String[] args) 
	{
		// hcf = hightest common factor 
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter Number ");
		int n1 = sc.nextInt();
		System.out.print(" Enter Number ");
		int n2 = sc.nextInt();
		int hcf = n1 < n2 ? n1 : n2;
		while(true){
			if(n1 % hcf == 0 && n2 % hcf == 0){
				System.out.print(" HCF " + hcf);
				break;
			}
			hcf--;
		}
	}
}
