class swapEnds {
	public static void main(String... args) {
		System.out.println("swapEnds");
	}

	/*
	 *	Given an array of ints, swap the first and last elements in the array. 
	 *	Return the modified array. The array length will be at least 1.
	 */

	public int[] solution(int[] nums) {
  		int begin = nums[0];
  		int end = nums[nums.length - 1];
  		nums[0] = end;
  		nums[nums.length - 1] = begin;
  
  		return nums;
	}
}
