
public class FibRange {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        int minLen = 100;
        int maxLen = 200;
        while(n2 <= maxLen){
            n3 = n1 + n2;
            if(n2 >= minLen){
                System.out.print(n2 + " ");
            }
            n1 = n2 ;
            n2 = n3;
        }
    }
}
