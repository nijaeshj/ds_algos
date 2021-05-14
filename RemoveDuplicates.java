package self.training;

import java.util.HashMap;

public class RemoveDuplicates {

    String removeDups(String S) {
        // Code here
        char[] ch = S.toCharArray();
        HashMap<Character, Integer> iHash = new HashMap<>();
        StringBuffer res = new StringBuffer("");

        for(int i = 0; i < ch.length; i++) {

            if(!iHash.containsKey(ch[i])) {
                iHash.put(ch[i], i);
                res.append(ch[i]);
            }
        }

        return res.toString();

    }

    public static void main(String[] args) {

        String s = "zvvo";
        RemoveDuplicates obj = new RemoveDuplicates();
        String r = obj.removeDups(s);
        System.out.print(r);
    }
}
