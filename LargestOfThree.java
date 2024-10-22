public class LargestOfThree {
    public static void main(String[] args) {
        int n1 = 130;
        int n2 = 2430;
        int n3 = 330;

        // Method 1
        /*
         * int large = n1 > n2 ? n1 : n2;
         * int largest = large > n3 ? large : n3 ;
         * System.out.println(largest);
         */

        /*
         * 
         * // Method 2
         * int largest = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
         * System.out.println(largest);
         */

        /*
         * // Method 3
         * int largest = n1 > (n2 > n3 ? n2 : n3) ? n1 : (n2 > n3 ? n2 : n3);
         * System.out.println(largest);
         */

        /*
         * // Method 4
         * int large;
         * int largest = n1 > (large = n2 > n3 ? n2 : n3) ? n1 : large;
         * 
         * System.out.println(largest);
         */

       /*  // Method 4
        int largest = (n1 > n2 && n1 > n3) ? n1 : (n2 > n3 ? n2 : n3);
        System.out.println(largest); */
    }
}
