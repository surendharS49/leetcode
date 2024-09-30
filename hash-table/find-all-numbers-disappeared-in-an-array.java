class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>arr=new ArrayList<>();
        HashSet<Integer>hs=new HashSet<>();
       for(int i=0;i<nums.length;i++){
        hs.add(nums[i]);
       } 
       for(int i=1;i<=nums.length;i++){
        if(!hs.contains(i)){
            arr.add(i);
        }
       
       }return arr;
       }
}