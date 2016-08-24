package guvi;

public class EncryptStringUsingLastChar {
	public static void encrypt(String str) {
		int len = str.length();
		char[] a = new char[len];
		int[] asc = new int[len];
		int[] b = new int[len];
		int[] c = new int[len];
		char[] d = new char[len];
		for (int i = 0; i < len; i++) {
			a[i] = str.charAt(i);
			asc[i] = a[i];
		}
		for (int i = 0; i < len; i++) {
			if (a[i] >= 65 && a[i] <= 90) {
				b[i] = a[i] - 64;
			} else if (a[i] >= 97 && a[i] <= 122) {
				b[i] = a[i] - 96;
			} else {
				asc[i] = a[i];
			}
		}
		for (int i = 0; i < len; i++) {
			if (i < len - 1) {
				c[i] = b[i] - b[len - 1];
			} else {
				c[i] = b[i];
			}
			if (c[i] <= 0) {
				c[i] = c[i] + 26;
			}
		}
		String output = "";
		for (int i = 0; i < len; i++) {
			if (asc[i] >= 65 && asc[i] <= 90) {
				d[i] = (char) (c[i] + 64);
			} else if (asc[i] >= 97 && asc[i] <= 122) {
				d[i] = (char) (c[i] + 96);
			} else {
				d[i] = a[i];
			}
			output += "" + d[i];
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		
		encrypt("java");

	}
}
