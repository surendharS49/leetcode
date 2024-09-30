class Solution {
    public String decodeString(String s) {
        Stack<String>st=new Stack<>();
        StringBuilder str=new StringBuilder();
        Stack<Integer>num=new Stack<>();
        int k=0;
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                k=k*10+(c-'0');
            }
            else if(c=='['){
                num.push(k);
                k=0;
                st.push(str.toString());
                str=new StringBuilder();
            }
            else if(c!=']'){
                str.append(c);
            }
            else{
                StringBuilder temp=new StringBuilder(st.pop());
                int count=num.pop();
                for(int i=0;i<count;i++){
                    temp.append(str);
                }
                str=temp;
            }
        }
        return str.toString();
    }
}