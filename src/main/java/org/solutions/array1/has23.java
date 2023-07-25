class has23 {
	public static void main(String... args) {
		System.out.println("has23");
	}

	/*
	 *	Given an int array length 2, return true if it contains a 2 or a 3.
	 */

	public boolean solution(int[] nums) {
  		for (int i = 0; i < nums.length; i++) {
    			if (nums[i] == 2 || nums[i] == 3) {
      				return true;
    			}
  		}
  		return false;
	}
}
