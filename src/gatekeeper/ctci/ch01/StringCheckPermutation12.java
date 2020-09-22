package gatekeeper.ctci.ch01;

import java.util.Arrays;

// 1.2   Check Permutation: 
// Given two strings, write a method to decide if one is a permutation of the other
public class StringCheckPermutation12 {

	public static boolean checkPermuation(String first, String second) {
		char[] firstArray = first.toCharArray();
		char[] secondArray = second.toCharArray();
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		String sortedFirst = new String(firstArray);
		String sortedSecond = new String(secondArray);
		if (sortedFirst.equals(sortedSecond)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String firstString  = "abcdefghijk";
		String secondString = "gkjahfdicbe";
		boolean isPermutation = checkPermuation(firstString, secondString);
		String result = "First String [" + firstString + "] is" + (isPermutation ? "": " not") + " a permutation of [" + secondString + "] ";
		System.out.println(result);
	}

}
