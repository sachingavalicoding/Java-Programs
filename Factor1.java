public class Factor1 {
    public static void main(String[] args) {
        int num = 12; // 1 , 2 , 3 , 4, 6 , 12
        for(int i = 1; i <= num / 2; i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
          
        }
        System.out.print(num);
    }
}
