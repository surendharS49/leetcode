class Solution {
    public static boolean isSafe(char[][] arr,int r,int c ,int n){
        for(int i=c-1;i>=0;i--){
            if(arr[r][i]=='Q'){
                return false;
            }
        }
        for(int i=r-1,j=c-1;i>=0 && j>=0;i--,j--){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        for(int i=r,j=c;i<n&& j>=0;i++,j--){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void fun(char[][] arr,int c ,int n,List<List<String>>res ){
        if(c==n){
            List<String>sum=new ArrayList<>();
            for(int i=0;i<n;i++){
                String str="";
                for(int j=0;j<n;j++){
                    str+=arr[i][j];
                }
                sum.add(str);
            }
            res.add(sum);
            return ;
        }else
        for(int r=0;r<n;r++){
            if(isSafe(arr,r,c,n)){
        arr[r][c]='Q';
        fun(arr,c+1,n,res);
        arr[r][c]='.';}
    }}
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        char[][] arr=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]='.';
            }
        }
        fun(arr,0,n,res);
        return res;
        
    }
}