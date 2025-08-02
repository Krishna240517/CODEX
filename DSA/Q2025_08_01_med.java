/*

    Input: num = 3749

    Output: "MMMDCCXLIX"

    Explanation:

    3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
    700 = DCC as 500 (D) + 100 (C) + 100 (C)
    40 = XL as 10 (X) less of 50 (L)
    9 = IX as 1 (I) less of 10 (X)
    Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places
 */


public class Q2025_08_01_med {
    public static void main(String[] args) {
        System.out.println(intToRoman(3524));
    }
    public static String intToRoman(int num) {
        String f="";
        int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        for(int i = 0;i<13;i++){
            if(num == 0) break;
            else{
                if(num >= arr[i]){
                    int times = num / arr[i];
                    f=f + returnCharacter(arr[i]).repeat(times);
                    num = num % arr[i];
                }
            }
        }
        return f;
    }
    public static String returnCharacter(int i){
        switch(i){
            case 1000: return "M";
            case 900: return "CM";
            case 500: return "D";
            case 400: return "CD";
            case 100: return "C";
            case 90: return "XC";
            case 50: return "L";
            case 40: return "XL";
            case 10: return "X";
            case 9: return "IX";
            case 5: return "V";
            case 4: return "IV";
            case 1: return "I";
        }
        return "";
    }
}