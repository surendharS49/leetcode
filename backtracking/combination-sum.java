class Solution {
    public List<List<Integer>> combinationSum(int[] can, int t) {
        List<List<Integer>>arr=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        int sum=0;
        fun(can,t,arr,temp,0);
        return arr;
    }
    public static void fun(int[] can,int t,List<List<Integer>>arr,List<Integer>temp,int ind){
        if(t==0){
            arr.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=ind;i<can.length;i++){
            if(t-can[i]>=0){
                temp.add(can[i]);
                 fun(can,t-can[i],arr,temp,i);
                 temp.remove(temp.size()-1);
            }
        }
    }
}