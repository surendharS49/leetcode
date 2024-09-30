class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
       
        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += nums[end];
                
                if (sum == k) {
                    count++;
                }
            }
        }
        
        return count;
        // int count=0;
        // int csum=0;
        // HashMap<Integer,Integer>hm=new HashMap<>();
        // hm.put(0,1);
        // for(int a:nums){
        //     csum+=a;
        //     if(hm.containsKey(csum-k)){
        //         count+=hm.get(csum-k);
        //     }if(hm.containsKey(csum)){
        //         hm.put(csum,hm.get(csum)+1);
        //     }else{
        //         hm.put(csum,1);
        //     }
        // }
        // return count;
    }
}
