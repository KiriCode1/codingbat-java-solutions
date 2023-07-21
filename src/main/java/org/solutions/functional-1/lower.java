import java.util.List;

class lower {
	public static void main(String... args) {
		System.out.println("lower");
	}

	/*
	 *	Given a list of strings, return a list where each string is converted to lower case 
	 *	(Note: String toLowerCase() method).
	 */

	public List<String> solution(List<String> strings) {
  		strings.replaceAll(str -> str.toLowerCase());
  		return strings;
	}
}
