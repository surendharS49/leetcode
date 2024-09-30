class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:arr){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }HashSet<Integer> counts = new HashSet<>();
        
        
        for(int i:hm.values()){
            if(!counts.add(i)){
                return false;
            }
            
        }
        return true;     
    }
}