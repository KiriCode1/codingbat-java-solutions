class rotateLeft3 {
	public static void main(String... args) {
		System.out.println("rotateLeft3");
	}

	/*
	 *	Given an array of ints length 3, return an array with the elements "rotated left" 
	 *	so {1, 2, 3} yields {2, 3, 1}.
	 */

	public int[] solution(int[] nums) {
  		int[] rotatedLeft = new int[3];
 		rotatedLeft[0] = nums[1];
  		rotatedLeft[1] = nums[2];
  		rotatedLeft[2] = nums[0];
  
  		return rotatedLeft;
	}
}
