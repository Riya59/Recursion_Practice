import java.util.*; 
class Solution {
    public void find(int index, int candidates[],int n, int target, ArrayList<Integer>temp, List<List<Integer>>ans){
       
            if(target == 0){
                ans.add(new ArrayList<Integer>(temp));
                return;
            }
          
        
        for(int i=index;i<n;i++){
            if(i > index && candidates[i] == candidates[i-1]){
                continue;
            }
            if(candidates[i] > target){
                break;
            }
            temp.add(candidates[i]);
            find(i+1,candidates,n,target - candidates[i],temp,ans);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int n = candidates.length;
        Arrays.sort(candidates);
        List<List<Integer>>ans = new ArrayList<>();
        find(0,candidates,n,target,new ArrayList<>(),ans);
        return ans;
    }
}