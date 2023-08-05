class parenBit {
	public static void main(String... args) {
		System.out.println("parenBit");
	}

	/*
	 *	Given a string that contains a single pair of parenthesis, compute recursively a new string 
	 *	made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
	 */

	public String parenBitSolution(String str) {
  		if (str.length() <= 2) {
    			return str;
  		} else if (str.charAt(0) == '(') {
    			return str.substring(0, str.indexOf(")") + 1);
  		}
  
  		return parenBitSolution(str.substring(1));
	}
}
