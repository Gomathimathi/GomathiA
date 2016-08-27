package guvi;

public class ReverseOddPosition {

	public static void main(String[] args) {
		reverse("This is an example for this question");

	}

	private static void reverse(String string) {
		String[] str = string.split(" ");
		String result = "";
		System.out.println(str.length);
		for (int i = 0; i < str.length; i++) {
			if (i == 0 || i % 2 == 0) {
				for (int j = str[i].length() - 1; j >= 0; j--) {
					result += str[i].charAt(j);
				}
				str[i] = result;
			} else {
				result += str[i];
			}
			result += " ";
		}
		System.out.println(result);
	}
}
