public class AltDigitPrint2 {
    public static void main(String[] args) {
        int num = 8943234;
        // for loop 
        // for(int i = num ; i != 0; i/=100){
        //     System.out.println(i % 10 );
        // }
        int count = 1;

        do{
            if(count % 2 == 0){
                System.out.println(num % 10);
            }
            num /= 10;
            count++;
        }while(num != 0);
    }
}
