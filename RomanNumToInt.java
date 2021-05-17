package self.training;

import java.util.HashMap;

public class RomanNumToInt {

    public int romanToDecimal(String str) {
        // code here
        HashMap<Character, Integer> iHash = new HashMap<>();
        iHash.put('I', 1);
        iHash.put('V', 5);
        iHash.put('X', 10);
        iHash.put('L', 50);
        iHash.put('C', 100);
        iHash.put('D', 500);
        iHash.put('M', 1000);

        char[] chS = str.toCharArray();
        int rInt = 0;
        int i = 0;
        //CMXVI
        while(i < chS.length) {

            if(i < chS.length - 1) {
            if(iHash.get(chS[i]) >= iHash.get(chS[i+1])) {
                rInt += iHash.get(chS[i]);
                ++i;
            } else {
                rInt -= iHash.get(chS[i]);
                ++i;
                rInt += iHash.get(chS[i]);
                ++i;
            }
            } else {
                rInt += iHash.get(chS[i]);
                ++i;
            }
        }

        return rInt;

    }

    public static void main(String[] args) {

        String s = "CMXVI";
        RomanNumToInt obj = new RomanNumToInt();
        System.out.print(obj.romanToDecimal(s));
    }
}
