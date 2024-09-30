class Solution {
    public int minCost(String colors, int[] neededTime) {
        int a=0;

       // char ch=clorts.toCharArray();
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)==colors.charAt(i-1)){
                a=a+Math.min(neededTime[i],neededTime[i-1]);
                neededTime[i]=+Math.max(neededTime[i],neededTime[i-1]);
                }
            }
        return a;
    }
}