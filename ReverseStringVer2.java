package Pattern;

public class ReverseStringVer2 {
	
	static void reverseStr(String inputString){
		
		String[] str = inputString.split("\\s");
			for(int i = str.length-1 ; i>=0 ;i--){
				String elements = str[i];
				System.out.println(elements);
			}
			
	}
	
	public static void main(String[] args) {
		reverseStr("Abcd efgh ighk");
	}
}
