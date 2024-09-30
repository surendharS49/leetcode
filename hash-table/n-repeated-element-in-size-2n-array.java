class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        int count=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
                 
        for(int i:nums){
             if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
             }
             else{
                hm.put(i,1);
             }
            }
            for(int j:nums){
                if(hm.get(j)==n){
                    return j;
                }
            }
        
        return 0;
    }
}