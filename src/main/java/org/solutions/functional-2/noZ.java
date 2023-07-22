import java.util.List;

class noZ {
	public static void main(String... args) {
		System.out.println("noZ");
	}

	/*
	 *	Given a list of strings, return a list of the strings, omitting any string that contains a "z". 
	 *	(Note: the str.contains(x) method returns a boolean)
	 */

	public List<String> solution(List<String> strings) {
  		strings.removeIf(str -> str.contains("z"));
  		return strings;
	}
}
