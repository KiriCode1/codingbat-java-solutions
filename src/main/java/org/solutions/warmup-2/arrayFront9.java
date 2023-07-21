class arrayFront9 {
	public static void main(String... args) {
		System.out.println("arrayFront9");
	}

	/*
	 *	Given an array of ints, return true if one of the first 4 elements in the array is a 9. 
	 *	The array length may be less than 4.
	 */

	public boolean solution(int[] nums) {
  		int end = nums.length;
  		if (end > 4) {
    			end = 4;
  		}
  
  		for (int i = 0; i < end; i++) {
    			if (nums[i] == 9) {
      				return true;
    			}
  		}
  		return false;
	}
}
