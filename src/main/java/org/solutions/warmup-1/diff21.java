class diff21 {
	public static void main(String... args) {
		System.out.println("diff21");
	}

	/*
	 *	Given an int n, return the absolute difference between n and 21, 
	 *	except return double the absolute difference if n is over 21.
	 */

	public int solution(int n) {
  		int res = 0;
  		if (n > 21) {
    			res = (21 - n) * 2;
    			return Math.abs(res);
  		} else {
    			return 21 - n;
  		}
	}
}
