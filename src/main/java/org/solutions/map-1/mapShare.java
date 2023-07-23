import java.util.Map;

class mapShare {
	public static void main(String... args) {
		System.out.println("mapShare");
	}

	/*
	 *	Modify and return the given map as follows: if the key "a" has a value, 
	 *	set the key "b" to have that same value. 
	 *	In all cases remove the key "c", leaving the rest of the map unchanged.
	 */

	public Map<String, String> solution(Map<String, String> map) {
  		if (map.get("a") == null && map.get("c") != null) {
    			map.remove("c");
  		} else if (map.get("a") != null) {
			map.put("b", map.get("a"));
    			map.remove("c");
  		}
  
  		return map;
	}
}
