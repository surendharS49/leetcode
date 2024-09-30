class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            if(!st.empty() && st.peek()==s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        String str="";
        while(!st.empty()){
            str+=st.pop();
        }
        return str;
    }
}