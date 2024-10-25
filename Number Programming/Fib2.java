import java.util.Scanner;

public class Fib2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        int n3;
        boolean isFibNum = false;
        System.out.println(" Enter a Number ");
        int num = sc.nextInt();
          while(num >= n2){
            n3 = n1 + n2;
            if (n3 == num) {
                isFibNum = true;
                break;
            }
            n1 = n2;
            n2 = n3;
            System.out.println(n2);
        }
        if (isFibNum) {
            System.out.println(" It is Fib Number " + num);

        } else {
            System.out.println(" Number " + num + " Is not a Fibonachhi number");
        }
    }
}
