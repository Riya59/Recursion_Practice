
import java.util.*;

import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            boolean ans = obj.checkSubsequenceSum(n, a, k);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}

class Solution {
    public static boolean check(int n, int arr[], int K, int sum, int index) {
        if (sum > K) {
            return false;
        }
        if (sum == K) {
            return true;
        }
        if (index == n) {
            if (sum == K) {
                return true;
            } else {
                return false;
            }
        }
        sum = sum + arr[index];
        if (check(n, arr, K, sum, index + 1) == true) {
            return true;
        }
        sum = sum - arr[index];
        if (check(n, arr, K, sum, index + 1) == true) {
            return true;
        }
        return false;
    }

    public static boolean checkSubsequenceSum(int n, int[] arr, int K) {
        // code here
        int sum = 0;
        return check(n, arr, K, sum, 0);

    }
}
