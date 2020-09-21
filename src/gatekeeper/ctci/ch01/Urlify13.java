package gatekeeper.ctci.ch01;

/*
 * URLify: 
 * Write a method to replace all spaces in a string with '%20: You may assume that the string has sufficient 
 * space at the end to hold the additional characters, and that you are given the "true" length of the string.
 * Note: If implementing in Java, please use a character array so that you can perform this operation in place.
 */

public class Urlify13 {

	public static int urlify(char[] charArray, int strLength) {
		// Check the number of spaces in the string
		int numSpaces = 0;
		for (char chr : charArray) {
			if (chr == ' ') {
				numSpaces++;
			}
		}
		if (numSpaces == 0) {
			return strLength;
		}
		int tmpEnd = strLength + (numSpaces * 2) - 1;
		System.out.println("Number of spaces: " + numSpaces + " # New End: " + tmpEnd);
		// begin from the end and move towards the front
		for (int i = strLength - 1; i >= 0; i--) {
			if (charArray[i] == ' ') {
				// replace space with "%20"
				charArray[tmpEnd] = '0';
				charArray[tmpEnd-1] = '2';
				charArray[tmpEnd-2] = '%';
				tmpEnd-=3;
			} else {
				charArray[tmpEnd] = charArray[i];
				tmpEnd--;
			}
		}
		return strLength + (numSpaces * 2);
	}

	public static int numSpaces(char[] charArray) {
		// Check the number of spaces in the string
		int numSpaces = 0;
		for (char chr : charArray) {
			if (chr == ' ') {
				numSpaces++;
			}
		}
		return numSpaces;
	}

	public static void main(String[] args) {
		String inputStr = " this is a test string containing spaces in it ";
		int strLength = inputStr.length();
		int numSpaces = numSpaces(inputStr.toCharArray());
		int newLength = strLength + (2 * numSpaces);
		System.out.println("Number of spaces: " + numSpaces + " # New Length: " + newLength);
		char [] resultCharArray = new char[newLength];
		for (int i = 0; i < inputStr.length(); i++) {
			resultCharArray[i] = inputStr.charAt(i);
		}
		int resultLength = urlify(resultCharArray, strLength);
		String result = new String(resultCharArray);
		System.out.println("String length: " + strLength + " # New length: " + resultLength + " # Result string: " + result);
	}

}
