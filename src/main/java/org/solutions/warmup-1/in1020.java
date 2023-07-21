class in1020 {
	public static void main(String... args) {
		System.out.println("in1020");
	}

	/*
	 *	Given 2 int values, return true if either of them is in the range 10..20 inclusive.
	 */

	public boolean solution(int a, int b) {
  		if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
    			return true;
  		}
  		return false;
	}
}
