class fizzString {
	public static void main(String... args) {
		System.out.println("fizzString");
	}

	/*
	 *	Given a string str, if the string starts with "f" return "Fizz". 
	 *	If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, 
	 *	return "FizzBuzz". In all other cases, return the string unchanged.
	 */

	public String solution(String str) {
  		if (str.substring(0, 1).equals("f") 
				&& str.substring(str.length() - 1, str.length()).equals("b")) {
    			return "FizzBuzz";
  		} else if (str.substring(0, 1).equals("f")) {
    			return "Fizz";
  		} else if (str.substring(str.length() - 1, str.length()).equals("b")) {
    			return "Buzz";
  		}
  		return str;
	}
}
