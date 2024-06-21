class Solution {
    public String clearDigits(String s) {
        int n=s.length();
        Stack<Character>st=new Stack<>();
        char[] ch=s.toCharArray();
        for(char i:ch){
            if(i>=47 && i<=57){
                if(!st.empty())
                    st.pop();
            }else{
                st.push(i);
            }
       }String sa="";
       for(int i=0;i<st.size();i++){
        sa+=st.get(i);
       }
       return sa;
    }
}