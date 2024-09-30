class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer>hm=new HashMap<>();
        //boolean ans=false;
        for(char c:sentence.toCharArray()){
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }}
             for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!hm.containsKey(ch)) {
                return false;
        }}
        return true;
    }}
