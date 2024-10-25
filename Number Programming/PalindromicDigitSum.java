import java.util.Scanner;

public class PalindromicDigitSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Ener Number ");
        int num = sc.nextInt();
        int sumOfDigit = 0;
        int productOfDigit = 1;
        int rev = 0;
        for(int i = num; i != 0; i/=10){
            rev = rev * 10 + (i % 10);
            sumOfDigit += (i % 10);
            productOfDigit *= (i % 10);
        }
       
        if(num == rev){
            System.out.println(" Palindromic Number " + num + " Sum of Digits " + sumOfDigit);
        }
        else{
            System.out.println(" Not a Palindromic Number " + num + " Product of Digits " + productOfDigit);
        }
    }
}

