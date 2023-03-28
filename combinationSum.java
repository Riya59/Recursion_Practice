import java.util.*;
class Solution {
    public void printSub(int index, int candidates[],int n, int target,ArrayList<Integer>temp,List<List<Integer>>ans){
        if(index == n){
            if(target == 0){
                ans.add(new ArrayList<Integer>(temp));
            }
            return;
        }
        // temp.add(candidates[index]);
        // s1 = s1+candidates[index];
        // printSub(index+1,candidates,n,s1,target,temp,ans);
        // s1 = s1 - candidates[index];
        // temp.remove(temp.size()-1);
        // printSub(index+1,candidates,n,s1,target,temp,ans);
        if(candidates[index] <= target){
            temp.add(candidates[index]);
            printSub(index,candidates,n,target - candidates[index],temp,ans);
            temp.remove(temp.size()-1);
        }
        printSub(index+1,candidates,n,target,temp,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<List<Integer>>res = new ArrayList<>();
        printSub(0,candidates,n,target,new ArrayList<>(),res);
        return res;
    }
}