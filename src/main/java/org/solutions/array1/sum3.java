class sum3 {
	public static void main(String... args) {
		System.out.println("sum3");
	}

	/*
	 *	Given an array of ints length 3, return the sum of all the elements.
	 */

	public int solution(int[] nums) {
  		int sum = 0;
  		for (int i = 0; i < nums.length; i++) {
    			sum += nums[i];
  		}
  		return sum;
	}
}
