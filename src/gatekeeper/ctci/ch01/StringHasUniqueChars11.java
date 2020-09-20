package gatekeeper.ctci.ch01;

import java.util.HashSet;
import java.util.Set;

// 1.1   Is Unique: 
// Implement an algorithm to determine if a string has all unique characters. 
// What if you cannot use additional data structures?

public class StringHasUniqueChars11 {

	private static boolean checkUniqueChars(String input) {
		Set<String> charsMap = new HashSet<>();
		for (int i = 0; i < input.length(); i++) {
			charsMap.add(input.substring(i, i+1));
		}
		return charsMap.size() == input.length();
	}

	private static boolean checkUniqueCharsWithoutAdditionalDS(String input) {
		for (int i = 0; i < input.length(); i++) {
			String checkingChar = input.substring(i, i+1);
			for (int j = i+1; j < input.length(); j++) {
				if (checkingChar.equals(input.substring(j, j+1))) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean checkUniqueCharsUsingBitVector(String input) {
		boolean [] charPresent = new boolean [256];
		for (int i = 0; i < input.length(); i++) {
			int chr = input.charAt(i);
			if (charPresent[chr]) {
				// Already saw this character earlier on in the this string
				return false;
			}
			charPresent[chr] = true;
		}
		return true;
	}

	public static void main(String[] args) {
		String inputStr = "thisformy pan";
		if (args.length > 0) {
			inputStr = args[0];
		}
		boolean hasUniqueChars = checkUniqueChars(inputStr);
		String result = (hasUniqueChars ? "Has" : "Doesn't have") + " all unique Characters";
		System.out.println("Unique Characters check: string [" + inputStr + "] " + result);

		hasUniqueChars = checkUniqueCharsWithoutAdditionalDS(inputStr);
		result = (hasUniqueChars ? "Has" : "Doesn't have") + " all unique Characters";
		System.out.println("Unique Characters check without additional DS: string [" + inputStr + "] " + result);
		
		hasUniqueChars = checkUniqueCharsUsingBitVector(inputStr);
		result = (hasUniqueChars ? "Has" : "Doesn't have") + " all unique Characters";
		System.out.println("Unique Characters check using bit vector: string [" + inputStr + "] " + result);
	}

}
