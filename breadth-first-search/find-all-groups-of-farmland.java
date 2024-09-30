class Solution {
    public int[][] findFarmland(int[][] land) {
        ArrayList<int[]> arr = new ArrayList<>();
        //ArrayList<Integer>ans=new ArrayList<>();
        int r=land.length;
        int c=land[0].length;
       // int x=0;
        // for (int i = 0; i < r; i++) {
        //     arr.add(new ArrayList<>());
        // }
        int vis[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               if (land[i][j] == 1 && vis[i][j] == 0){
              int[] ans = new int[4];
              ans[0]=i;
              ans[1]=j;
                dfs(i,j,vis,land,ans);
            
            arr.add(ans);
            }}
        }
      int[][] result = new int[arr.size()][4];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }
        return result;
        
    }
    static void dfs(int i,int j,int[][] vis,int land[][],int[] ans){
        int r=land.length;
        int c=land[0].length;
        if(i<0|| i>=r ||j<0 ||j>=c || vis[i][j]==1 || land[i][j]!=1){
            return;
        }
        vis[i][j]=1;
        ans[2] = Math.max(ans[2], i);
        ans[3] = Math.max(ans[3], j);
         dfs(i-1,j,vis,land,ans);
          dfs(i+1,j,vis,land,ans);
           dfs(i,j-1,vis,land,ans);
            dfs(i,j+1,vis,land,ans);
    }
}