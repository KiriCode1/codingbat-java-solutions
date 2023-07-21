class arrayCount9 {
	public static void main(String... args) {
		System.out.println("arrayCount9");
	}

	/*
	 *	Given an array of ints, return the number of 9's in the array.
	 */

	public int solution(int[] nums) {
  		int count = 0;
  		for (int i = 0; i < nums.length; i++) {
    			if (nums[i] == 9) {
      				count += 1;
    			}
  		}
  		return count;
	}
}
