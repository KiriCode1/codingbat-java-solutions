class countX {
	public static void main(String... args) {
		System.out.println("countX");
	}

	/*
	 *	Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
	 */

	public int countXSolution(String str) {
  		if (str.length() == 0) {
    			return 0;
  		} else if (str.substring(0, 1).equals("x")) {
    			return 1 + countXSolution(str.substring(1, str.length()));
  		}
  		return countXSolution(str.substring(1, str.length()));
	}
}
