class TechNum
{
	public static int  countDigit(int n){
		int count = 0;
	   while(n != 0){
		count++;
		n /= 10;
	   }
	   return count;
	}
	public static int revNum(int n) {
		int rev = 0;
		while(n != 0){
			rev = (rev * 10) + (n % 10);
			n /= 10;
		}
		return rev;
	}
	
	public static int sumOfSplit(int n , int idx ){
		int sum1 = 0;
		int sum2 = 0;
		while( n != 0) {
			if(idx > 0){
				sum1 = (sum1 * 10) + (n % 10);
			}
			else{
				sum2 = (sum2 * 10) + (n % 10);
			}
			n = n / 10;
			idx--;
		}
		
		return sum1 + sum2;
	}
	
	
	public static void main(String [] args){
	
		int num = 2025;
		int count = countDigit(num);//4
		int reverseNum = revNum(num ); // 5202
		int ans = sumOfSplit(reverseNum , count / 2);
		
		if((ans * ans ) == num) {
			System.out.println(" Tech Number ");
		}
		else{
			System.out.println(" Not a Tech Number ");
		}
	}
}