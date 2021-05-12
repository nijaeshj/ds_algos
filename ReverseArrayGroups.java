package self.training;

import java.util.ArrayList;

public class ReverseArrayGroups {

    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        for(int j = 0; j < n; j+=k) {
            int start = j;
            int end = Math.min(j+k-1,n-1);

            while (start < end) {
                int temp = arr.get(start);
                arr.set(start, arr.get(end));
                arr.set(end, temp);
                ++start;
                --end;
            }
        }

        for(int i = 0; i < n; i++)
            System.out.print(arr.get(i)+" ");

    }

    public static void main (String[]  args) {

        int N = 5, K = 3;
        int arr[] = {1,2,3,4,5};

        ArrayList<Integer> lst = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++)
            lst.add(arr[i]);

        ReverseArrayGroups obj = new ReverseArrayGroups();
        obj.reverseInGroups(lst, N, K);
    }

}
