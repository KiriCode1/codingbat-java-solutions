import java.util.List;

class noYY {
	public static void main(String... args) {
		System.out.println("noYY");
	}

	/*
	 *	Given a list of strings, return a list where each string has "y" added at its end, 
	 *	omitting any resulting strings that contain "yy" as a substring anywhere.
	 */

	public List<String> solution(List<String> strings) {
  		strings.replaceAll(str -> str + "y");
  		strings.removeIf(str -> str.contains("yy"));
  		return strings;
	}
}
