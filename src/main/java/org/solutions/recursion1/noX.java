class noX {
	public static void main(String... args) {
		System.out.println("noX");
	}

	/*
	 *	Given a string, compute recursively a new string where all the 'x' chars have been removed.
	 */

	public String noXSolution(String str) {
  		if (str.equals("")) {
    			return str;
  		} else if (str.charAt(0) == 'x') {
    			return noXSolution(str.substring(1));
  		}
  
  		return str.charAt(0) + noXSolution(str.substring(1));
	}
}
