import java.util.List;

class no34 {
	public static void main(String... args) {
		System.out.println("no34");
	}

	/*
	 *	Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
	 */

	public List<String> solution(List<String> strings) {
  		strings.removeIf(str -> str.length() == 3 || str.length() == 4);
  		return strings;
	}
}
