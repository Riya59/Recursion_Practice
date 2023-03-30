import java.util.*;
public class mColorGraph {
    public boolean isValid(int node, boolean graph[][], int color[], int n, int m){
        for(int i=0;i<n;i++){
            if(graph[node][i] && color[i] == m){
                return false;
            }
        }
        return true;
     }
     public boolean solve(int node, boolean graph[][], int color[], int n,int m){
         if(node == n){
             return true;
         }
         for(int i=1;i<=m;i++){
             if(isValid(node,graph,color,n,i)){
                 color[node] = i;
                 
                  if(solve(node+1,graph,color,n,m) == true){
                     return true;
                 }
                 color[node] = 0;
                
             }
         }
         return false;
     }
     public boolean graphColoring(boolean graph[][], int m, int n) {
         // Your code here
         int color[] = new int[n];
         if(solve(0,graph,color,n,m) == true){
             return true;
         }
         return false;
         
     }
}
