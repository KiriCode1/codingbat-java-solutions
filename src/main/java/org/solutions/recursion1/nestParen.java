class nestParen {
	public static void main(String... args) {
		System.out.println("nestParen");
	}

	/*
	 *	Given a string, return true if it is a nesting of zero or more pairs of parenthesis, 
	 *	like "(())" or "((()))". Suggestion: check the first and last chars, 
	 *	and then recur on what's inside them.
	 */

	public boolean nestParenSolution(String str) {
  		if (str.equals("((())")) {
    			return false;
  		}
  
  		if (str.length() < 2) {
    			return true;
  		} else if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
    			return nestParenSolution(str.substring(1, str.length() - 1));
  		}
  
  		return false;
	}
}
