class sameFirstLast {
	public static void main(String... args) {
		System.out.println("sameFirstLast");
	}

	/*
	 *	Given an array of ints, return true if the array is length 1 or more, 
	 *	and the first element and the last element are equal.
	 */

	public boolean solution(int[] nums) {
  		if (nums.length < 1) {
    			return false;
  		}
  		return nums[0] == nums[nums.length - 1];
	}
}
