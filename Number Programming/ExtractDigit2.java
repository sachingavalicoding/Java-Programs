public class ExtractDigit2 {
    public static void main(String[] args) {
        int num = 1234;
        // for loop 
        // for(int i = num; i != 0; i/=10){
        //     System.err.println(i % 10 );
        // }

        // do while loop 
        do{
           System.out.println(num % 10);
           num /= 10;
        }while(num != 0);
    }
}
