package gatekeeper.ctci.ch01;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation14 {

	public static boolean isPalindromPermutation(String inputStr) {
		Map<String, Boolean> charOccuranceMap = new HashMap<> ();
		for (int i = 0; i < inputStr.length(); i++) {
			String chr = inputStr.substring(i, i+1).toLowerCase();
			if (chr.equals(" ")) {
				continue;
			}
			Boolean occured = Boolean.FALSE;
			if (charOccuranceMap.containsKey(chr)) {
				occured = !charOccuranceMap.get(chr);
			}
			charOccuranceMap.put(chr, occured);
		}
		int oddCount = 0;
		for (String chr : charOccuranceMap.keySet()) {
			if (!charOccuranceMap.get(chr)) {
				System.out.println("For [" + chr + "] value is FALSE");
				oddCount++;
			}
			if (oddCount > 1) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String inputStr = "Tact Coa";
		boolean result = isPalindromPermutation(inputStr);
		String resultMessage = "String [" + inputStr + "] is " + (result ? "" : "not ") + "a permutation of a palindrome";
		System.out.println(resultMessage);
	}

}
