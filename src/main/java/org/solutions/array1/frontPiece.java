class frontPiece {
	public static void main(String... args) {
		System.out.println("frontPiece");
	}

	/*
	 *	Given an int array of any length, return a new array of its first 2 elements. 
	 *	If the array is smaller than length 2, use whatever elements are present.
	 */

	public int[] solution(int[] nums) {
  		if (nums.length < 2) {
    			return nums;
  		}
  
  		int[] array = {nums[0], nums[1]};
  
  		return array;
	}
}
