class Solution {
    public String removeTrailingZeros(String num) {
        int s = num.length(); 
        for(int i = num.length() - 1; i >= 0; i--) {
            if(num.charAt(i) != '0') {
                s = i + 1; 
                break;
            }
        }
        return num.substring(0, s);  
    }
}
