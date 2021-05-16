package self.training;

import java.util.HashMap;

public class Anagram {

    public static boolean isAnagram(String a,String b)
    {
        // Your code here
        char[] chA = a.toCharArray();
        char[] chB = b.toCharArray();
        HashMap<Character, Integer> iHash = new HashMap<>();
        boolean isAna = false;

        if(chA.length == chB.length) {
            for (int i = 0; i < chA.length; i++) {

                if (iHash.containsKey(chA[i])) {
                    iHash.put(chA[i], iHash.get(chA[i])+1);
                } else {
                    iHash.put(chA[i], 1);
                }
            }

            for (int i = 0; i < chB.length; i++) {

                if(iHash.containsKey(chB[i])) {
                    if(iHash.get(chB[i]) > 1)
                        iHash.put(chB[i], iHash.get(chB[i]) - 1);
                    else
                        iHash.remove(chB[i]);
                }
            }

            if(iHash.isEmpty())
                isAna = true;

        }

        return isAna;
    }

    public static void main (String[] args) {

        String a = "allergy", b = "allergic";
        System.out.print(isAnagram(a,b));
    }
}
