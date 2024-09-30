class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int a=image[sr][sc];
        if(a!=color){
            dfs(image,sr,sc,color,a);}
        return image;
    }
    public static void dfs(int image[][],int sr,int sc,int color,int a){
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length || image[sr][sc]!=a){
            return ;
        }
        image[sr][sc]=color;
         dfs(image,sr+1,sc,color,a);
          dfs(image,sr-1,sc,color,a);
           dfs(image,sr,sc+1,color,a);
            dfs(image,sr,sc-1,color,a);
    }
}