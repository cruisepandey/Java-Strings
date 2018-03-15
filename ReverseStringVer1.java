package Pattern;

public class ReverseStringVer1 {
	
	static void reverseStr(String inputString){
		
		for(int i=inputString.length()-1; i>=0 ; i--){
			
			char c = inputString.charAt(i);
			System.out.print(c);
			
		}
		
	}
	
	public static void main(String[] args) {
		reverseStr("I have everything!");
	}

}
