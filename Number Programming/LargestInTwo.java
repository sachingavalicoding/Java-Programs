public class LargestInTwo {
    public static void main(String[] args) {
        int n1  = 40;
        int n2 = 20;
        int n3 = 60;
        int large = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        System.out.println(large);
    }
}
