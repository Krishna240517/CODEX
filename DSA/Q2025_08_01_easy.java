/*

    Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.

    You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

    Input: name = "alex", typed = "aaleex"
    Output: true
    Explanation: 'a' and 'e' in 'alex' were long pressed.
 */



public class Q2025_08_01_easy {
    public static void main(String[] args) {
        System.out.println(isLongPressed("alex", "alleexxx"));
    }
    public static boolean isLongPressed(String name, String typed) {
        int idx1 = 0;
        int idx2 = 0;
        int n1 = name.length();
        int n2 = typed.length();
        if(n1 > n2) return false;
        while(idx1 < n1 && idx2 < n2) {
            if(name.charAt(idx1) == typed.charAt(idx2)) {
                idx1++;
                idx2++;
            } else if(idx1 > 0 && name.charAt(idx1-1) == typed.charAt(idx2)) {
                idx2++;
            } else {
                return false;
            }
        }
        if(idx1 < n1) return false;

        while(idx2 < n2) {
            if(typed.charAt(idx2) != name.charAt(idx1-1)) return false;
            idx2++;
        }
        return true;
    }
}