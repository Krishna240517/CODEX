/*
    Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

    You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
    
    Input: num1 = "11", num2 = "123"
    Output: "134"
 */


public class Q2025_08_02_easy {
    public static void main(String[] args) {
        System.out.println(addStrings("11","123"));
    }
    public static String addStrings(String a,String b){
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 || j >= 0) {
            int sum = carry;
            if(i >= 0) {
                sum+=a.charAt(i)-'0';
            }
            if(j >= 0) {
                sum+=b.charAt(j)-'0';
            }
            sb.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
