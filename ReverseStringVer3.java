package Pattern;

public class ReverseStringVer3 {
	
	static void reverseStr(String inputString){
		
		String[] str = inputString.split("\\s");
			for(int i = str.length-1 ; i>=0 ;i--){
				String elements = str[i];
				for(int j = elements.length()-1 ; j>=0 ; j--){
					System.out.print(elements.charAt(j));
				}
				System.out.println("");
			}
			
	}
	
	public static void main(String[] args) {
		reverseStr("Abcd efgh ighk");
	}
}
