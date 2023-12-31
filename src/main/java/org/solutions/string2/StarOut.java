class StarOut {
	public static void main(String... args) {
		System.out.println("StarOut");
	}

	/*
	 *	Return a version of the given string, where for every star (*) in the string the star 
	 *	and the chars immediately to its left and right are gone. 
	 *	So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
	 */

	public String starOut(String str) {
 		String result = "";
  
  		for (int i = 0; i < str.length(); i++) {
    			if (i == 0 && str.charAt(i) != '*') {
      				result += str.charAt(i);
    			} else if (i > 0 && str.charAt(i) != '*' && str.charAt(i - 1) != '*') {
      				result += str.charAt(i);
    			} else if (i > 0 && str.charAt(i) == '*' && str.charAt(i - 1) != '*') {
      				result = result.substring(0, result.length() - 1);
    			}
  		}
  
  		return result;
	}
}
