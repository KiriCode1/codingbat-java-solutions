class endX {
	public static void main(String... args) {
		System.out.println("endX");
	}

	/*
	 *	Given a string, compute recursively a new string where all the lowercase 'x' 
	 *	chars have been moved to the end of the string.
	 */

	public String endXSolution(String str) {
  		if (str.equals("")) {
    			return str;
  		} else if (str.charAt(0) == 'x') {
    			return endXSolution(str.substring(1)) + 'x';
  		}
  
  		return str.charAt(0) + endXSolution(str.substring(1));
	}
}
