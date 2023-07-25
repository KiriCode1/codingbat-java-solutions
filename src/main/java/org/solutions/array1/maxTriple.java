class maxTriple {
	public static void main(String... args) {
		System.out.println("maxTriple");
	}

	/*
	 *	Given an array of ints of odd length, look at the first, last, and middle values 
	 *	in the array and return the largest. The array length will be a least 1.
	 */

	public int solution(int[] nums) {
  		int[] array = new int[3];
  		array[0] = nums[0];
  		array[1] = nums[nums.length / 2];
  		array[2] = nums[nums.length - 1];
  
  		int max = array[0];
  
  		for (int i = 0; i < array.length; i++) {
    			if (array[i] > max) {
				max = array[i];
    			}
  		}
  		return max;
	}
}
