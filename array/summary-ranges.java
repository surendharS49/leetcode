class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String>li=new ArrayList<>();
        int n=nums.length;
        int s=0;
        for(int i=0;i<n;i++){
            int e=i;
            if(i==nums.length-1 || nums[i]+1!=nums[i+1]){
                if(s==e){
                li.add(String.valueOf(nums[s]));
            }else{
                li.add(nums[s]+"->"+nums[e]);
            }
            s=i+1;
        }}
        return li;
    }
}