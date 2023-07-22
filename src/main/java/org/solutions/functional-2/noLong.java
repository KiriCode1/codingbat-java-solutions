import java.util.List;

class noLong {
	public static void main(String... args) {
		System.out.println("noLong");
	}

	/*
	 *	Given a list of strings, return a list of the strings, omitting any string length 4 or more.
	 */

	public List<String> solution(List<String> strings) {
  		strings.removeIf(str -> str.length() >= 4);
  		return strings;
	}
}
