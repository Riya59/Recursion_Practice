import java.util.*;
public class uniqueSubset {
    public void find(int index, int nums[],int n,List<List<Integer>>ans,ArrayList<Integer>temp){
        ans.add(new ArrayList<Integer>(temp));
        for(int i=index;i<n;i++){
            if(i!=index && nums[i] == nums[i-1]){
                continue;
            }
             temp.add(nums[i]);
        find(i+1,nums,n,ans,temp);
        temp.remove(temp.size()-1);
        }
       
        // find(index+1,nums,n,ans,temp);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans = new ArrayList<>();
        int n = nums.length;
        find(0,nums,n,ans,new ArrayList<>());
        return ans;
    }
}
