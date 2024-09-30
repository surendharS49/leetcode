class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }else{
                hm.put(s.charAt(i),1);
            }
            
        }
        int ans=-1;
        for(int j=0;j<s.length();j++){
            if(hm.get(s.charAt(j))==1){
                ans=j;
                break;
            }
        }
        return ans;
    }
}