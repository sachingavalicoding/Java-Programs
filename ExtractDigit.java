import java.util.Scanner;

public class ExtractDigit {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a Number ");
        num = sc.nextInt();
        // perform logic
        while (num > 0) {
            int rem = num % 10;
            System.out.print(rem + " ");
            num /= 10;
        }

    }
}
