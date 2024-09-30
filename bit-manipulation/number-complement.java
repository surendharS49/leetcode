class Solution {
    public int findComplement(int num) {
        String s=Integer.toBinaryString(num);
        int l=s.length();
        int a=l-1;
        StringBuilder st=new StringBuilder(s);
         for (int i = 0; i < l; i++){
            if(st.charAt(i)=='1'){
                st.setCharAt(i,'0');
            }
            else if(st.charAt(i)=='0'){
                st.setCharAt(i,'1');
            }
        }
        return Integer.parseInt(st.toString(),2);
    }
}