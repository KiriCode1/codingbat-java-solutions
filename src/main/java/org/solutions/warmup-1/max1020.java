class max1020 {
	public static void main(String... args) {
		System.out.println("max1020");
	}

	/*
	 *	Given 2 positive int values, 
	 *	return the larger value that is in the range 10..20 inclusive, 
	 *	or return 0 if neither is in that range.
	 */

	public int solution(int a, int b) {
  		if (b > a) {
    			int t = a;
    			a = b;
    			b = t;
  		}
  
  		if (a >= 10 && a <= 20) {
    			return a;
  		} else if (b >= 10 && b <= 20) {
    			return b;
  		}
  		return 0;
	}
}
