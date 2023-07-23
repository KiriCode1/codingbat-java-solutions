import java.util.Map;

class mapAB2 {
	public static void main(String... args) {
		System.out.println("mapAB2");
	}

	/*
	 *	Modify and return the given map as follows: 
	 *	if the keys "a" and "b" are both in the map and have equal values, remove them both.
	 */

	public Map<String, String> solution(Map<String, String> map) { 
  		if (map.get("a") == null || map.get("b") == null) {
    			return map;
  		}
  
  		String a = map.get("a");
  		String b = map.get("b");
    
  		if (a.equals(b)) {
    			map.remove("a");
    			map.remove("b");
  		}
  
  		return map;
	}
}
