package guvi;

public class charRepeted {
	public static void function(String input) {
		char[] a = input.toCharArray();
		char b[] = new char[50];
		int r[] = new int[50];
		String str = "";
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println(i);
			if (Character.isAlphabetic(a[i])) {
				b[k] = a[i];
				System.out.println("b=" + b[k]);
			}
			if (i < a.length - 2) {
				if (Character.isDigit(a[i + 1])) {
					r[k] = (r[k] * 10) + Character.getNumericValue(a[i + 1]);
					System.out.println("r1=" + r[k]);
				}
				if (Character.isDigit(a[i + 2])) {
					r[k] = (r[k] * 10) + Character.getNumericValue(a[i + 2]);
					System.out.println("r2=" + r[k]);

				}
				i++;
			}
			k++;
		}
		for (int i = 0; i < r.length; i++) {
			for (int j = 0; j < r[i]; j++) {
				str += b[i];
			}

		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		function("g4p14");

	}

}
