package self.training;

public class ZigZagArray {

    void zigZag(int arr[], int n) {
        // code here
        boolean flag = true;
        int temp =0;

        for (int i=0; i<=arr.length-2; i++)
        {
           if (flag)
           {
             if (arr[i] > arr[i+1])
             {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
             }
           }
           else
           {
             if (arr[i] < arr[i+1])
             {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
             }
           }
           flag = !flag;
         }
    }

    public static void main (String[] args) {

        int N = 7;
        int Arr[] = {4, 3, 7, 8, 6, 2, 1};

        ZigZagArray obj = new ZigZagArray();
        obj.zigZag(Arr, N);

        for(int i = 0; i < Arr.length; i++)
            System.out.print(Arr[i]+" ");
    }
}
