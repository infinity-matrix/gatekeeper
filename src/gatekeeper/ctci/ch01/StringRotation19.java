package gatekeeper.ctci.ch01;

/**
 * 1.9 String Rotation:
 * Assume you have a method isSubstring which checks if one word is a substring of another.
 * Given two strings, S1 and S2, write code to check if S2 is a rotation of S1 using only one
 * call to isSubstring (e.g.,"waterbottle" is a rotation of "erbottlewat")
 */
public class StringRotation19 {

    public static void main (String ... args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        // Use command line agrs if we got at least 2
        if (args.length > 1) {
            s1 = args[0];
            s2 = args[1];
        }
        System.out.println("S1: " + s1 + " | S2: " + s2 + " | isRotation: " + isRotation(s1, s2));
    }

    /**
     * Checks if S2 is a rotation of S1 using only one call to isSubstring
     * @param s1 String to check against
     * @param s2 String to check for
     * @return true if S2 is a rotation of S1; false otherwise
     */
    public static boolean isRotation(String s1, String s2) {
        String tempStr = s2 + s2;
        System.out.println("TempStr: " + tempStr + " | S1: " + s1);
        return isSubstring(s1, tempStr);
    }

    /**
     * Checks if first parameter is a substring of the second parameter
     * @param s1 Word to check for substring
     * @param s2 Word in which to check for substring
     * @return true if s1 is a substring of s2; false otherwise
     */
    public static boolean isSubstring(String s1, String s2) {
        return s2.contains(s1);
    }

}
