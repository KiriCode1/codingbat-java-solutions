class changePi {
	public static void main(String... args) {
		System.out.println("changePi");
	}

	/*
	 *	Given a string, compute recursively (no loops) a new string where all 
	 *	appearances of "pi" have been replaced by "3.14".
	 */

	public String changePiSolution(String str) {
  		if (str.equals("") || str.length() < 2) {
    			return str;
  		}
  
  		if (str.charAt(0) == 'p' && str.charAt(1) == 'i') { 
    			return "3.14" + changePiSolution(str.substring(2));
  		}
  
  		return str.charAt(0) + changePiSolution(str.substring(1));
	}
}
