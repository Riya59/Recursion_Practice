//leetcode
import java.util.*;
public class countSubsequence {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = 0, l = 0, r = n-1, mod = (int)1e9+7;
        int arr[] = new int[n];
        arr[0] = 1;
        for(int i=1;i<n;i++){
            arr[i] = arr[i-1] * 2 % mod;
        }
        while(l<=r){
            if(nums[l]+nums[r] > target){
                r--;
            }
            else{
                res = (res + arr[r-l++])%mod;
            }
        }
        return res;
    }
}
