package gatekeeper.ctci.ch01;

import java.util.HashSet;
import java.util.Set;

// Is Unique: 
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
		//TODO: Implement this method
		Set<String> charsMap = new HashSet<>();
		for (int i = 0; i < input.length(); i++) {
			charsMap.add(input.substring(i, i+1));
		}
		return charsMap.size() == input.length();
	}

	public static void main(String[] args) {
		String inputStr = "this is a test";
		if (args.length > 0) {
			inputStr = args[0];
		}
		boolean hasUniqueChars = checkUniqueChars(inputStr);
		String result = (hasUniqueChars ? "Has" : "Doesn't have") + " all unique Characters";
		System.out.println("Unique Characters check: string [" + inputStr + "] " + result);

		hasUniqueChars = checkUniqueCharsWithoutAdditionalDS(inputStr);
		result = (hasUniqueChars ? "Has" : "Doesn't have") + " all unique Characters";
		System.out.println("Unique Characters check without additional DS: string [" + inputStr + "] " + result);
	}

}
