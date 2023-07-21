import java.util.List

class noX {
	public static void main(String... args) {
		System.out.println("noX");
	}

	/*
	 *	Given a list of strings, return a list where each string has all its "x" removed.
	 */

	public List<String> solution(List<String> strings) {
  		strings.replaceAll(str -> str.replace("x", ""));
  		return strings;
	}
}
