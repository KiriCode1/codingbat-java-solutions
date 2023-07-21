import java.util.List;

class addStar {
	public static void main(String... args) {
		System.out.println("addStar");
	}

	/*
	 *	Given a list of strings, return a list where each string has "*" added at its end.
	 */

	public List<String> solution(List<String> strings) {
  		strings.replaceAll(str -> str + "*");
  		return strings;
	}
}
