class sleepIn {
	public static void main(String... args) {
		System.out.println("sleepIn");
	}
	
	/*
	 *	The parameter weekday is true if it is a weekday, 
	 *	and the parameter vacation is true if we are on vacation.
	 *	We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
	 */

	public boolean solution(boolean weekday, boolean vacation) {
  		if (weekday == false && vacation == false) {
    			return true;
  		} else if (weekday == true && vacation == false) {
    			return false;
  		} else {
    			return true;
  		}
	}
}
