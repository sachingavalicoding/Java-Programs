class ReverseArray 
{
	public static void reversedArray(int [] nums){
		for(int i = nums.length - 1; i >= 0; i--){
			System.out.print(nums[i] + " ");	
		}
	}
	
	//method 2 
	public static void reversedArray2(int [] nums){
		int start = 0;
		int end = nums.length-1;
		while(start <= end) {
				
		}
	}
	public static void main(String[] args) 
	{
		int [] nums = {10, 20, 30, 40, 50};
		reversedArray(nums);
	}
}
