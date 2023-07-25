class sum2 {
	public static void main(String... args) {
		System.out.println("sum2");
	}

	/*
	 *	Given an array of ints, return the sum of the first 2 elements in the array. 
	 *	If the array length is less than 2, just sum up the elements that exist, 
	 *	returning 0 if the array is length 0.
	 */

	public int solution(int[] nums) {
  		if (nums.length == 1) {
    			return nums[0];
  		} else if (nums.length == 0) {
    			return 0;
  		}
  
  		int sum = 0;
  		sum += nums[0];
  		sum += nums[1];
  
  		return sum;
	}
}
