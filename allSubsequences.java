//leetcode
import java.util.*;
public class allSubsequences {
    public void subsequence(int index, int nums[], ArrayList<Integer>temp, List<List<Integer>>ans,int n){
       ans.add(new ArrayList<Integer>(temp));
       for(int i=index;i<n;i++){
           if(i!=index && nums[i] == nums[i-1]){
               continue;
           }
           temp.add(nums[i]);
           subsequence(i+1,nums,temp,ans,n);
           temp.remove(temp.size()-1);
       }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        int n = nums.length;
        subsequence(0,nums,new ArrayList<>(),ans,n);
        return ans;
    }

}

