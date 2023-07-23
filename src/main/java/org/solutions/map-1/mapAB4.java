import java.util.Map;

class mapAB4 {
	public static void main(String... args) {
		System.out.println("mapAB4");
	}

	/*
	 *	Modify and return the given map as follows: 
	 *	if the keys "a" and "b" have values that have different lengths, 
	 *	then set "c" to have the longer value. 
	 *	If the values exist and have the same length, change them both to the empty string in the map.
	 */

	public Map<String, String> solution(Map<String, String> map) {
  		if (map.get("a") != null && map.get("b") != null) {
    			if (map.get("a").length() > map.get("b").length()) {
      				map.put("c", map.get("a"));
    			} else if (map.get("a").length() < map.get("b").length()) {
      				map.put("c", map.get("b"));
    			} else {
      				map.put("a", "");
      				map.put("b", "");
    			}
  		}
  
  		return map;
	}
}
