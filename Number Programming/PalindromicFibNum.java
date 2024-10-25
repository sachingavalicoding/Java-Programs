import java.util.Scanner;

public class PalindromicFibNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ener Number ");
        int num = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;
        int rev = 0;
        boolean isPalindromicFibNum = false;
        for(int i = num; i != 0; i/=10){
            rev = rev * 10 + (i % 10);
        }
        if(num == rev){
            while(num >= n2){
                n3 = n1 + n2;
                if(num == n2){
                    isPalindromicFibNum = true;
                    break;
                }
                n1 = n2 ;
                n2 = n3;
            }
        }
        if(isPalindromicFibNum){
            System.out.println(" It is Palindromic Fib number");
        }
        else{
            System.out.println(" Not a Palindromic fib number");
        }
    }
}
