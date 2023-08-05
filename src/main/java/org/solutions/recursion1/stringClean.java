class stringClean {
	public static void main(String... args) {
		System.out.println("stringClean");
	}

	/*
	 *	Given a string, return recursively a "cleaned" string where adjacent chars that are 
	 *	the same have been reduced to a single char. So "yyzzza" yields "yza".
	 */

	public String stringCleanSolution(String str) {
  		if (str.length() <= 1) {
    			return str;
  		} else if (str.charAt(0) == str.charAt(1)) {
    			return stringCleanSolution(str.substring(1));
  		}
  
  		return str.charAt(0) + stringCleanSolution(str.substring(1));
	}
}
