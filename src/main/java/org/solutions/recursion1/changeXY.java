class changeXY {
	public static void main(String... args) {
		System.out.println("changeXY");
	}

	/*
	 *	Given a string, compute recursively (no loops) a new string where all the lowercase 
	 *	'x' chars have been changed to 'y' chars.
	 */

	public String changeXYSolution(String str) {
  		if (str.equals("")) {
    			return str;
  		} else if (str.charAt(0) == 'x') {
    			return 'y' + changeXYSolution(str.substring(1));
  		}
  
  		return str.charAt(0) + changeXYSolution(str.substring(1));
	}
}
