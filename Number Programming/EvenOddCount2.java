public class EvenOddCount2 {
    public static void main(String[] args) {
        int num = 23123;
        int evenCount = 0 , oddCount = 0;
        int evenSum = 0 , oddSum = 0;
        // for loop 
        for(int i = num; i != 0; i/=10){
               if((i % 10) % 2 == 0){
                evenCount++;
                evenSum += (i % 10);
               }
               else{
                oddCount++;
                oddSum += (i % 10);
               }
        }

        System.out.println(" \n Even count : " + evenCount + " \n Odd Count : " + oddCount+ " \n Even Sum : " + evenSum + " \n Odd Sum : " + oddSum);
    }
}
