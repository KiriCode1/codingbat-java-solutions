class array6 {
	public static void main(String... args) {
		System.out.println("array6");
	}

	/*
	 *	Given an array of ints, compute recursively if the array contains a 6. 
	 *	We'll use the convention of considering only the part of the array that begins at the 
	 *	given index. In this way, a recursive call can pass index+1 to move down the array. 
	 *	The initial call will pass in index as 0.
	 */

	public boolean array6Solution(int[] nums, int index) {
  		if (nums.length == 0) {
    			return false;
  		}
  
  		if (nums[index] == 6) {
    			return true;
  		} else if (index >= nums.length - 1) {
    			return false;
  		}
  
  		return array6Solution(nums, index + 1);
	}
}
