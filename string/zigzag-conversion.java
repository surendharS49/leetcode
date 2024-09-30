class Solution {
    public String convert(String st, int n) {
        int s=0;
        int r=0;
        if(n==1){
            return st;
        }
        int x=0;
        int flag=0;
         char[][] arr=new char[n][st.length()];
         for(char row[]:arr){
            Arrays.fill(row,' ');
         }
        while(x<st.length()){
            arr[r][s]=st.charAt(x);
            x++;
            if(r==n-1){
                flag=1;
            }
            if(r==0){
                flag=0;
            }
            if(flag==0){
                r++;
            }
            if(flag==1){
                r--;
                s++;
            }
        }
        String ans="";
        for(int i=0;i<n;i++){
            for(int j=0;j<s+1;j++){
                if(arr[i][j]!=' '){
                ans+=arr[i][j];}
            }
        }
        return ans;
    }
}