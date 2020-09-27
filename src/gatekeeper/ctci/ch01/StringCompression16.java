package gatekeeper.ctci.ch01;

/**
 * 1.6 String Compression:
 * 
 * Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. 
 * If the "compressed" string would not become smaller than the original string, your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 *
 */
public class StringCompression16 {

	public static String compressString(String input) {
		String result = input;
		char chr = input.charAt(0);
		int ctr = 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < input.length(); i++) {
			if (chr == input.charAt(i)) {
				ctr++;
			} else {
				sb.append(chr).append(ctr);
				chr = input.charAt(i);
				ctr = 1;
			}
		}
		sb.append(chr).append(ctr);
		result = sb.toString();
		if (result.length() > input.length()) {
			return input;
		}
		return result;
	}

	public static void main(String[] args) {
		String str = "aabcccccaaa";
		System.out.println("Compressed String: " + compressString(str));
	}

}
