package guvi;

public class CountNumberOfTwos {

	public static void main(String[] args) {
		System.out.println(function(100));

	}

	private static int function(int input) {
		int count=0;
		for(int i=0;i<=input;i++){
			String a=""+i;
			if(a.contains(""+2)){
				count++;
			}
		}
		return count;
	}

}
