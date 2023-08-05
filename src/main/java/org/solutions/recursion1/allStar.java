class allStar {
	public static void main(String... args) {
		System.out.println("allStar");
	}

	/*
	 *	Given a string, compute recursively a new string where all the adjacent chars 
	 *	are now separated by a "*".
	 */

	public String allStarSolution(String str) {
  		if (str.length() <= 1) {
    			return str;
  		}
  
  		return str.charAt(0) + "*" + allStarSolution(str.substring(1));
	}
}
