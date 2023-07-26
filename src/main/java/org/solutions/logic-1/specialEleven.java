class specialEleven {
	public static void main(String... args) {
		System.out.println("specialEleven");
	}

	/*
	 *	We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple 
	 *	of 11. Return true if the given non-negative number is special.
	 */

	public boolean solution(int n) {
  		if ((n - 1) % 11 == 0 || n % 11 == 0) {
    			return true;
  		}
  		return false;
	}
}
