class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(char i:s.toCharArray()){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }
        int a=hm.get(s.charAt(0));
        for(char i:hm.keySet()){
            if(hm.get(i)!=a){
                return false;
            }
        }
        return true;        
    }
}