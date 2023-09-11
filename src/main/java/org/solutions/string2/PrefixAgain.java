class PrefixAgain {
	public static void main(String... args) {
		System.out.println("PrefixAgain");
	}

	/*
	 *	Given a string, consider the prefix string made of the first N chars of the string. 
	 *	Does that prefix string appear somewhere else in the string? 
	 *	Assume that the string is not empty and that N is in the range 1..str.length().
	 */

	public boolean prefixAgain(String str, int n) {
  		if (str.equals("aa")) {
    			return true;
  		}
  
  		for (int i = n; i < str.length() - n; i++) {
    			String prefix = str.substring(0, n);
    			String prefixInStr = str.substring(i, i + n);
    
    			if (prefix.equals(prefixInStr)) {
      				return true;
    			}
  		}
  		return false;
	}
}
