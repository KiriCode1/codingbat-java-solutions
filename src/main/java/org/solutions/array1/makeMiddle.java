class makeMiddle {
	public static void main(String... args) {
		System.out.println("makeMiddle");
	}

	/*
	 *	Given an array of ints of even length, return a new array length 2 containing 
	 *	the middle two elements from the original array. 
	 *	The original array will be length 2 or more.
	 */

	public int[] solution(int[] nums) {
  		int[] arr = new int[2];
  		arr[0] = nums[nums.length / 2 - 1];
  		arr[1] = nums[nums.length / 2];
  
  		return arr;
	}
}
