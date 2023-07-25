class reverse3 {
	public static void main(String... args) {
		System.out.println("reverse3");
	}

	/*
	 *	Given an array of ints length 3, return a new array with the elements in reverse order, 
	 *	so {1, 2, 3} becomes {3, 2, 1}.
	 */

	public int[] solution(int[] nums) {
  		int[] destArray = new int[nums.length]; 
  		int j = nums.length; 
  		for (int i = 0; i < nums.length; i++) { 
    			destArray[j - 1] = nums[i]; 
    			j -= 1; 
  		}
  		return destArray;
	}
}
