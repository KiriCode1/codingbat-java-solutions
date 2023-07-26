class in1To10 {
	public static void main(String... args) {
		System.out.println("in1To10");
	}

	/*
	 *	Given a number n, return true if n is in the range 1..10, inclusive. 
	 *	Unless outsideMode is true, in which case return true if the number is less or equal to 1, 
	 *	or greater or equal to 10.
	 */

	public boolean solution(int n, boolean outsideMode) {
  		if (outsideMode) {
    			if (n <= 1 || n >= 10) {
      				return true;
    			}
    			return false;
  		} else {
    			if (n >= 1 && n <= 10) {
      				return true;
    			}
    			return false;
  		}
	}
}
