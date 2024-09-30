class Solution {
    public static void solve(int open,int close,String str,ArrayList<String>arr){
        if(open ==0 && close==0){
            arr.add(str);
        }
        if(open >0){
            solve(open-1,close,str+"(",arr);
        }
        if(close>0 && close>open){
            solve(open,close-1,str+")",arr);
        }


   }
    public List<String> generateParenthesis(int n) {
        ArrayList<String>arr=new ArrayList<>();
        String str="";
        solve(n,n,str,arr);
        return arr;
    }
}