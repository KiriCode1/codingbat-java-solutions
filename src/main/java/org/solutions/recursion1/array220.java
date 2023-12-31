class array220 {
	public static void main(String... args) {
		System.out.println("array220");
	}

	/*
	 *	Given an array of ints, compute recursively if the array contains somewhere a value followed 
	 *	in the array by that value times 10. We'll use the convention of considering only the part of 
	 *	the array that begins at the given index. In this way, a recursive call can pass index+1 
	 *	to move down the array. The initial call will pass in index as 0.
	 */

	public boolean array220Solution(int[] nums, int index) {
  		if (index >= nums.length - 1) {
    			return false;
  		} else if (nums[index + 1] == nums[index] * 10) {
    			return true;
  		}
  
  		return array220Solution(nums, index + 1);
	}
}
