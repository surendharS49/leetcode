class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int count=0;
        for(int i:nums){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }
        for(int j:nums){
            if(hm.get(j)>2 ){
               // count++;
    
            return false;
        // }if(hm.get(j)==2){
        //     return true;
        }
        }
        return true;
    }
} 