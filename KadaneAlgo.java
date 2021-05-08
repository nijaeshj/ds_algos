package self.training;

public class KadaneAlgo {

    int maxSubarraySum(int arr[], int n){

        int max_sum = arr[0];
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            if(sum > max_sum)
                max_sum = sum;

            if(sum < 0)
                sum = 0;
        }

        return max_sum;
    }

    public static void main (String[] args) {

        int N = 5;
        int arr[] = {1,2,3,-2,5};

        KadaneAlgo obj = new KadaneAlgo();
        int sum = obj.maxSubarraySum(arr, N);

        System.out.print(sum);
    }
}
