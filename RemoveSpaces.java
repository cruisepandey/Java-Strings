package Pattern;

public class RemoveSpaces {
	
	static void removeSpace(String inputString){
		
		String[] str = inputString.split("\\s");
		
		for(String s : str)
			System.out.print(s);
		}
	
	public static void main(String[] args) {
		removeSpace("abcd abcdab cd");
	}
}
