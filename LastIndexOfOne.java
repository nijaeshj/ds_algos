package self.training;

public class LastIndexOfOne {

    public int lastIndex( String s) {

        char[] chArr = s.toCharArray();
        int index = -1;
        for(int i = s.length()-1; i > -1; i--) {

            if(chArr[i] == '1') {
                index = i;
                break;
            }
        }

        return index;
    }
    public static void main (String[] args) {

        String S = "00001";
        LastIndexOfOne obj = new LastIndexOfOne();
        int r = obj.lastIndex(S);
        System.out.print(r);

    }
}
