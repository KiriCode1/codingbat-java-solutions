import java.util.List;

class moreY {
	public static void main(String... args) {
		System.out.println("moreY");
	}

	/*
	 *	Given a list of strings, return a list where each string has "y" added at its start and end.
	 */

	public List<String> solution(List<String> strings) {
  		strings.replaceAll(str -> "y" + str + "y");
  		return strings;
	}
}
