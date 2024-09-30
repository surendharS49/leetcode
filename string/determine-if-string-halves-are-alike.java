class Solution {
    public boolean halvesAreAlike(String s) {
        String str=s.toLowerCase();
        String v="aeiou";
        int l=s.length();
        int count1=0;
        int count2=0;
        String s1=str.substring(0,l/2);
        String s2=str.substring(l/2,l);
        for (int i = 0; i < l / 2; i++) {
            if (v.indexOf(str.charAt(i)) != -1) {
                count1++;
            }
        }
        
       
        for (int i = l / 2; i < l; i++) {
            if (v.indexOf(str.charAt(i)) != -1) {
                count2++;
            }
        }
        return count1==count2;
    }
}