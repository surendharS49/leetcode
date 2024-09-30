class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int l1=jewels.length();
        int l2=stones.length();
        HashMap<Character,Integer>hm=new HashMap<>();
        int count=0;
        //i=0;
       for(char c:stones.toCharArray()){
        if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
       }
       for(char c1:jewels.toCharArray()){
        if(hm.containsKey(c1))
        count += hm.get(c1);
       }
        return count;  
    }
}