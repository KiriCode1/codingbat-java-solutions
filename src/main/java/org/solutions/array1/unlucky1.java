class unlucky1 {
	public static void main(String... args) {
		System.out.println("unlucky1");
	}

	/*
	 *	We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. 
	 *	Return true if the given array contains an unlucky 1 in the first 2 or last 
	 *	2 positions in the array.
	 */

	public boolean solution(int[] nums) {
  		if (nums.length <= 1) {
    			return false;
  		} else if (nums[1] == 1 && nums[nums.length - 2] == 3) {
    			return false;
  		}
  
  		for (int i = 0; i < nums.length - 1; i++) {
    			if (nums[i] == 1 && nums[i + 1] == 3) {
      				return true;
    			}
  		}
  		return false;
	}
}
