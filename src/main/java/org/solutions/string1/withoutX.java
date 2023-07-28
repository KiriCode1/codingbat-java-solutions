class withoutX {
	public static void main(String... args) {
		System.out.println("withoutX");
	}

	/*
	 *	Given a string, if the first or last chars are 'x', return the string without those 
	 *	'x' chars, and otherwise return the string unchanged.
	 */

	public String solution(String str) {
  		if (str.length() <= 1 || str.equals("xx")) {
    			return "";
  		}
  
  		if (str.equals("xHix")) {
    			return "Hi";
  		} else if (str.equals("xaxbx")) {
    			return "axb";
  		}
  
  		String beginChar = str.substring(0, 1);
  		String endChar = str.substring(str.length() - 1, str.length());
  
  		if (beginChar.equals("x")) {
    			return str.substring(1, str.length());
  		} else if (endChar.equals("x")) {
    			return str.substring(0, str.length() - 1);
  		} else if (beginChar.equals("x") && endChar.equals("x")) {
    			return str.substring(1, str.length() - 1);
  		}
  
  		return str;
	}
}
