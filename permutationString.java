//{ Driver Code Starts
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    class GFG
    {
        public static void main(String[] args) throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            while(t-->0)
            {
                String S = br.readLine().trim();
                Solution obj = new Solution();
                List<String> ans = obj.find_permutation(S);
                for( int i = 0; i < ans.size(); i++)
                {
                    System.out.print(ans.get(i)+" ");
                }
                System.out.println();
                            
            }
        }
    }
    
    
    // } Driver Code Ends
    
    
    class Solution {
        public void find(String S,String p,ArrayList<String>ans){
            ArrayList<String>temp = new ArrayList<>();
            if(S.length() == 0){
                if(!ans.contains(p)){
                    ans.add(p);
                }
                return;
            }
            for(int i=0;i<S.length();i++){
                char ch = S.charAt(i);
                String left = S.substring(0,i);
                String right = S.substring(i+1);
                String res = left +right;
                find(res,ch+p,ans);
            }
        }
        public List<String> find_permutation(String S) {
            // Code here
            ArrayList<String>ans = new ArrayList<>();
            String p="";
            find(S,p,ans);
            Collections.sort(ans);
            return ans;
        }
    }