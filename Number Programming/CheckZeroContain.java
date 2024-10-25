import java.util.Scanner;

class CheckZeroContain {

   public static void main(String [] args ) {
	
	int num;
	boolean isZeroContain = false;
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter a Number ");
	num = sc.nextInt();
	while(num > 0) {
	int rem = num % 10;
        System.out.println(rem);
	if(rem == 0) {
        isZeroContain = true;
	break;
	}
	num /= 10;
     }	

	if(isZeroContain){
	 System.out.println(" Yes Zero Contain "  );
	}
	else{
	 System.out.println(" No Zero Contain "  );

      }
     
   }
}