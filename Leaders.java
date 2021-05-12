package self.training;

import java.util.ArrayList;

public class Leaders {

    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> lst = new ArrayList<>();
        //16,17,4,3,5,2
        int max = arr[n-1];

        for(int i = n-2; i > 0; i--) {

            if(arr[i] > max) {
                max = arr[i];
                lst.add(arr[i]);
            }
        }

        int first = 0;
        int last = lst.size() - 1;

        while(first < last) {
            int temp = lst.get(first);
            lst.set(first, lst.get(last));
            lst.set(last, temp);
            ++first;
            --last;
        }

        lst.add(arr[n-1]);

        return lst;
    }

    public static void main(String[] args) {

        int n = 6;
        int A[] = {16,17,4,3,5,2};
        ArrayList<Integer> lst = leaders(A, n);

        for(int i = 0; i < lst.size(); i++)
            System.out.print(lst.get(i)+" ");
    }
}
