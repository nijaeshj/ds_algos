package self.training;

public class EqPoint {

    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        long sum = 0;
        long eqP = -1;
        long befSum = 0;
        long aftSum = 0;

        if(arr.length < 2)
            eqP = 1;
        else {
            for(int i = 0; i < n; i++)
                sum = sum + arr[i];

            aftSum = sum - arr[0];

            for(int j = 1; j < n-1; j++) {
                befSum = befSum + arr[j-1];
                aftSum = aftSum - arr[j];

                if(befSum == aftSum) {
                    eqP = j + 1;
                    break;
                }
            }

        }

        return (int) eqP;
    }

    public static void main (String[] args) {

        int n = 5;
        long A[] = {1,3,5,2,2};

        int res = equilibriumPoint(A, n);
        System.out.print(res);
    }
}
