package gatekeeper.ctci.ch01;

/*
 * 1.5 - One Away: 
 * There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check if they are
 * one edit (or zero edits) away.
 * 
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 * 
 */

public class OneAway15 {

	public static void main(String[] args) {
		String first = "palest";
		String second = "balest";
		boolean result = isOneAway(first, second);
		String resultMessage = "First: [" + first + "] is" + (result? "" : " not") + " One Away from Second: [" + second + "]";
		System.out.println(resultMessage);
	}

	public static boolean isOneAway(String str1, String str2) {
		if (null == str1 || null == str2) {
			return false;
		}
		String first = (str1.length() > str2.length()) ? str1 : str2;
		String second = (str1.length() > str2.length()) ? str2 : str1;
		if (first.length() - second.length() > 1) {
			return false;
		}
		boolean oneAway = false;
		int ctr1 = 0;
		int ctr2 = 0;
		while (ctr1 < first.length() && ctr2 < second.length()) {
			if (first.charAt(ctr1) != second.charAt(ctr2)) {
				if (oneAway) {
					// Second difference found
					return false;
				}
				oneAway = true;
				if (first.length() == second.length()) {
					// Replace case, increment both
					ctr2++;
				}
			} else {
				// Character match, increment both
				ctr2++;
			}
			// Increment longer
			ctr1++;
		}
		System.out.println("CTR1: " + ctr1 + " # CTR2: " + ctr2 + " # ONEAWAY: " + oneAway);
		return oneAway;
	}
}
