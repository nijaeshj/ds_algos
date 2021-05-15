package self.training;

public class ImplementStrStr {

    int strstr(String s, String x)
    {
        // Your code here
        char[] chS = s.toCharArray();
        char[] chX = x.toCharArray();
        int index = -1;
        int j = 0;

        for(int i = 0; i < chS.length; i++) {
            if(chS[i] == chX[j]) {
                ++j;
                if(chX.length == j) {
                    index = (i - chX.length)+1;
                    break;
                }
            } else {
                if(index != -1)
                    index = -1;

                if(j > 0)
                    j = 0;
            }
        }

        return index;
    }

    public static void main (String[] args) {

        String s = "GeeksForGeeks", x = "For";
        ImplementStrStr obj = new ImplementStrStr();
        System.out.print(obj.strstr(s,x));
    }
}
