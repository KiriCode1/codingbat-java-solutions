class maxEnd3 {
	public static void main(String... args) {
		System.out.println("maxEnd3");
	}

	/*
	 *	Given an array of ints length 3, figure out which is larger, 
	 *	the first or last element in the array, and set all the other elements to be that value. 
	 *	Return the changed array.
	 */

	public int[] solution(int[] nums) {
  		for (int i = 0; i < nums.length; i++) {
    			if (nums[0] == nums[nums.length - 1]) {
      				nums[i] = nums[0];
    			}
    			if (nums[0] > nums[nums.length - 1]) {
      				nums[i] = nums[0];
    			} else if (nums[nums.length - 1] > nums[0]) {
      				nums[0] = nums[nums.length - 1];
      				nums[1] = nums[nums.length - 1];
      				nums[2] = nums[nums.length - 1];
    			}
  		}
  		return nums;
	}
}
