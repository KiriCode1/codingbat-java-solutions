class frontAgain {
	public static void main(String... args) {
		System.out.println("frontAgain");
	}

	/*
	 *	Given a string, return true if the first 2 chars in the string also appear at the end 
	 *	of the string, such as with "edited".
	 */

	public boolean solution(String str) {
  		if (str.length() <= 1) {
    			return false;
  		}
  
  		if (str.length() == 2) {
   			return true;
  		}
  
  		if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
    			return true;    
  		}
  		return false;
	}
}
