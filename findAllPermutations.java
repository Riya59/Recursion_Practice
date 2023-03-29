import java.util.*;
public class findAllPermutations {
    public void find(int index, int nums[], List<List<Integer>>ans){
        if(index == nums.length){
            ArrayList<Integer>ds = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            find(index+1,nums,ans);
            swap(i,index,nums);
        }
    }
    public void swap(int i, int j, int nums[]){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        find(0,nums,ans);
        return ans;
    }

}
