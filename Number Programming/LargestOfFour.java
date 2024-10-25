 class LargestOfFour {
    public static void main(String[] args) {
        int n1  = 40;
        int n2 = 1230;
        int n3 = 605;
        int n4 = 80;
       /* 
        * Method 1 
        int large = n1 > n2 ? n1 : n2;
        int large1 = large > n3 ? large : n3;
        int largest = large1 > n4 ? large1 : n4;
        System.out.println(largest);
        */

     /*    // Method 2 
        int largest = n1 > n2 ? (n1 > n3 ? (n1 > n4 ? n1 : n4 ) : (n3 > n4  ? n3 : n4 ) ): (n2 > n3  ? ( n2 > n4 ? n2 : n4 ) : (n3 > n4 ? n3 : n4));
        System.out.println(largest); */

       /*
       Method 3 

       int large1 = n1 > n2 ? n1 : n2;
        int large2 = n3 > n4 ? n3 : n4;
        int largest = large1 > large2 ? large1 : large2;
        System.out.println( largest); */

        /* 
        Method 4 
        int largest = (n1 > n2  && n1 > n3  && n1 > n4 ) 
        ? n1 : (n2 > n3 && n2 > n4 )
        ? n2 : (n3 > n4 ? n3 : n4);
        System.out.println(largest); 
        */
       
        // Method 5 
        /*  int large;
        int large2;
        int largest = (large = n2 > n3 ? n2 : n3) > (large2 = n1 > n4 ? n1 : n4) ? large : large2;
        System.out.println(largest); */

        
    }
}
