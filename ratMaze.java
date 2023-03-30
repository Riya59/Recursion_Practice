import java.util.*;
public class ratMaze {
    public static void rat(int m[][], int r, int c, int n, String s, ArrayList<String>ans){
        if(r == n-1 && c == n-1 && m[r][c] == 1){
            ans.add(s);
            return;
        }
        if(r>=n || r<0 || c>=n || c<0){
            return;
        }
        if(m[r][c] == 0){
            return;
        }
        m[r][c] = 0;
        rat(m,r+1,c,n,s+"D",ans);
        rat(m,r,c-1,n,s+"L",ans);
        rat(m,r,c+1,n,s+"R",ans);
        rat(m,r-1,c,n,s+"U",ans);
        m[r][c] = 1;
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String>ans = new ArrayList<String>();
        rat(m,0,0,n,"",ans);
        return ans.size()>0?ans: new ArrayList<>(List.of("-1"));
    }
}
