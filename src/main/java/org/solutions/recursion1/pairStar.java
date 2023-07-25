class pairStar {
	public static void main(String... args) {
		System.out.println("pairStar");
	}

	/*
	 *	Given a string, compute recursively a new string where identical chars 
	 *	that are adjacent in the original string are separated from each other by a "*".
	 */

	public String pairStarSolution(String str) {
  		if (str.equals("") || str.length() == 1) {
    			return str;
  		} else if (str.charAt(0) == str.charAt(1)) {
    			return str.charAt(0) + "*" + pairStarSolution(str.substring(1));
  		}
  
  		return str.charAt(0) + pairStarSolution(str.substring(1));
	}
}
