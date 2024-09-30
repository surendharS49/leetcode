class Solution {
    public int countWords(String[] word1, String[] word2) {
       // String[] arr=new String[]
       HashMap<String,Integer>hm=new HashMap<>();
       HashMap<String,Integer>h2=new HashMap<>();
       for(String s: word1){
        if(hm.containsKey(s)){
            hm.put(s,hm.get(s)+1);
        }else{
            hm.put(s,1);
        }
       }
       for(String s: word2){
        if(h2.containsKey(s)){
            h2.put(s,h2.get(s)+1);
        }else{
            h2.put(s,1);
        }
       }int ans=0;
     
        for (String key : hm.keySet()) {
            if (hm.get(key) == 1 && h2.getOrDefault(key, 0) == 1) {
                ans++;
            }
        }
        
        return ans;
    }
}