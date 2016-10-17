package missing_words;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MissingWords {
	
	static String STR1 = "I am using hackerrank to improve programming";
	static String STR2 = "am hackerrank to improve";
	
	static Map<String, Integer> map1 = new HashMap<String, Integer>();
	static Map<String, Integer> map2 = new HashMap<String, Integer>();
	
	public static void main(String [] args){
		creteMap(STR1, map1);
		creteMap(STR2, map2);
		
		printMap(map1);
	}
	
	public static void creteMap(String str, Map<String, Integer> map){
		
		int start = 0;
		int end = 0;
		for (int i = 1; i < str.length(); i++){
			if (" ".equals(str.substring(i-1, i))){
				end = i-1;
				map.put(str.substring(start, end), 1);
				start = end+1;
			}
		}
	}
	
	public static void printMap(Map<String, Integer> map){
		Iterator it = map.entrySet().iterator();
		System.out.println("Map " + map.getClass().getName());
		while(it.hasNext()){
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(String.valueOf(pair.getKey()));
		}
	}
	
	public static void eliminate_dups(Map<String, Integer> map1, Map<String, Integer> map2){
		Iterator it = map1.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pair = (Map.Entry) it.next();
			if(map2.containsKey(pair.getKey())){
				it.remove();
			}
		}
	}
	

}
