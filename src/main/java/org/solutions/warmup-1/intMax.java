class intMax {
	public static void main(String... args) {
		System.out.println("intMax");
	}

	/*
	 *	Given three int values, a b c, return the largest.
	 */

	public int solution(int a, int b, int c) {
  		if (a > b && a > c) {
    			return a;
  		} else if (b > a && b > c) {
    			return b;
  		}
  		return c;
	}
}
