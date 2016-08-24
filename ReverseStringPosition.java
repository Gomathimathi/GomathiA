package guvi;

public class ReverseStringPosition {

	public static String output1;

	public static void reverseWordsAndCase(String sentence) {
		String[] st = sentence.split(" ");
		String str = "";
		for (int i = 0; i < st.length; i++) {
			int k = (st[i].length() - 1);
			for (int j = 0; j < st[i].length(); j++) {
				str += st[i].charAt(k);
				k--;
			}
			if (i != st.length - 1)
				str += " ";
		}
		
			String result="";
			for(int i=0;i<sentence.length();i++){
				if(Character.isUpperCase(sentence.charAt(i))){
					result+=Character.toUpperCase(str.charAt(i));
				}else{
					result+=Character.toLowerCase(str.charAt(i));
				}
			}
			System.out.println(result);
			
				
			}
			
			
		
	
	public static void main(String[] args) {
		reverseWordsAndCase("Welcome To GuVi");

	}


}
