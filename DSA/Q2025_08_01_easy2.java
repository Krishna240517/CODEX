/*

    You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:

    Characters ('a' to 'i') are represented by ('1' to '9') respectively.
    Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
    Return the string formed after mapping.

    Input: s = "10#11#12"
    Output: "jkab"
    Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
 */



public class Q2025_08_01_easy2 {
    public static void main(String[] args) {
        System.out.println(mapString("10#11#11"));
    }

    public static String mapString(String s) {
        StringBuilder result = new StringBuilder();
        int i = s.length()-1;
        while(i >= 0) {
            char ch = s.charAt(i);
            if(ch == '#') {
                int digit = Integer.parseInt(s.charAt(i-1)+""+s.charAt(i-2));
                result.append((char)97-1+digit);
                i=i-3;
            } else {
                int val = ch-'0';
                result.append((char)'a'+val - 1);
                i--;
            }
        }
        return result.reverse().toString();
    }
}
