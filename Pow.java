public class Pow {
    public static void main(String[] args) {
        int base = 2;
        int raise = 2;
        int pow = 1;
        // while(raise != 0){
        //     pow = pow * base;
        //     raise--;
        // }

        do{
            pow *= base;
            raise--;
        }while(raise != 0);

        System.out.println(pow);
    }
}
