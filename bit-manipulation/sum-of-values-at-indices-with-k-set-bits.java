class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int s=nums.size();
        int sum=0;
        for(int i=0;i<s;i++){
           int x=fun(i);
            if(x==k){
                sum=sum+nums.get(i);
            }
        }return sum;
    }
    public int fun(int num){
        String st=Integer.toBinaryString(num);
            int n=Integer.parseInt(st);
            int q=0;
            while(n>0){
                q=q+n%10;
                n=n/10;
            }
            return q;
    } 
}