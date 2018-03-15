package Pattern;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
	
	static void duplicateChar(String inputString){
		
		String inputStringLower	= inputString.toLowerCase();
		
		HashMap<Character, Integer> duplicate = new HashMap<Character, Integer>();
		
		char[] tochar = inputStringLower.toCharArray();
		
		for(char c : tochar){
			
			if(duplicate.containsKey(c)){
				duplicate.put(c, duplicate.get(c)+1);
			}
			else{
				duplicate.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : duplicate.entrySet()){
			
			int a = entry.getValue();
			if(a>1){
			Character s = entry.getKey();
			System.out.println(s);
			}
		}
		
	}
	
	public static void main(String[] args) {
		duplicateChar("ABBABBA");
	}
}
