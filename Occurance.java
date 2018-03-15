
package Pattern;

import java.util.HashMap;

public class Occurance {
	
	static void counting(String inputS){
		
		String input = inputS.toLowerCase();
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		char[] chararray =  input.toCharArray();
		
		for(char c : chararray){
			if(charCount.containsKey(c)){
				charCount.put(c, charCount.get(c)+1);
			}
			else{
				charCount.put(c, 1);
			}
		}
		System.out.println(charCount);
	}
	
	public static void main(String[] args) {
		counting("abcd abcd");
	}
}
