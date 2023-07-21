class startHi {
	public static void main(String... args) {
		System.out.println("startHi");
	}

	/*
	 *	Given a string, return true if the string starts with "hi" and false otherwise.
	 */

	public boolean solution(String str) {
  		if (str.length() < 2) {
    			return false;
  		} else {
    			String hi = str.substring(0, 2);
    			if (hi.equals("hi")) {
      				return true;
    			}
  		}
  		return false;
	}
}
