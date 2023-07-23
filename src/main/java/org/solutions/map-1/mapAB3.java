import java.util.Map;

class mapAB3 {
	public static void main(String... args) {
		System.out.println("mapAB3");
	}

	/*
	 *	Modify and return the given map as follows: 
	 *	if exactly one of the keys "a" or "b" has a value in the map (but not both), 
	 *	set the other to have that same value in the map.
	 */

	public Map<String, String> solution(Map<String, String> map) {
  		if (map.get("a") != null && map.get("b") == null) {
    			map.put("b", map.get("a"));
  		} else if (map.get("a") == null && map.get("b") != null) {
    			map.put("a", map.get("b"));
  		}
  		return map;
	}
}
