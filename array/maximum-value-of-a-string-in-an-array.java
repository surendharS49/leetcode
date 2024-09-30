class Solution {
    public int maximumValue(String[] strs) {
        int max=0;
        for(String s:strs){
            if(isNumeric(s)){
                int a=Integer.parseInt(s);
                if(a>max){
                    max=a;
                }
            }
            else{
                int n=s.length();
                if(n>max){
                    max=n;
                }
            }
        }
        return max;
    }
    public boolean isNumeric(String s) {
  
    for (char c : s.toCharArray()) {
        if (!Character.isDigit(c)) {
            return false;
        }
    }
    return true;
}
}