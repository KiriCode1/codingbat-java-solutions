class double23 {
	public static void main(String... args) {
		System.out.println("double23");
	}

	/*
	 *	Given an int array, return true if the array contains 2 twice, or 3 twice. 
	 *	The array will be length 0, 1, or 2.
	 */

	public boolean solution(int[] nums) {
  		if (nums.length < 2) return false;
  
  		if (nums[0] == 2 && nums[1] == 2) return true;
  		if (nums[0] == 3 && nums[1] == 3) return true;
  
  		return false;
	}
}
