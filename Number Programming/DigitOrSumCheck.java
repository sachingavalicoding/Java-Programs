import java.util.Scanner;

public class DigitOrSumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ener Number ");
        int num = sc.nextInt();
        int sumOfDigit = 0;
        int productOfDigit = 1;
        while(num != 0){
            sumOfDigit += (num % 10);
            productOfDigit *= (num % 10);
            num /= 10;
        }
        if(sumOfDigit == productOfDigit){
            System.out.println( " Sum of Digit " + sumOfDigit + " and Product of Digit is " + productOfDigit + " is equal ");
        }
        else{
            System.out.println( " Sum of Digit " + sumOfDigit + " and Product of Digit is " + productOfDigit + " is Not  equal ");
        }
    }
}
