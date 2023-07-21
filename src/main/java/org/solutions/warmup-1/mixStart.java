class mixStart {
	public static void main(String... args) {
		System.out.println("mixStart");
	}

	/*
	 *	Return true if the given string begins with "mix", 
	 *	except the 'm' can be anything, so "pix", "9ix" .. all count.
	 */

	public boolean solution(String str) {
  		if (str.length() < 3) {
    			return false;
  		} else {
    			String substr = str.substring(1, 3);
    			if (substr.equals("ix")) {
      				return true;
    			}
  		}
  		return false;
	}
}
