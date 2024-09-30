class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer>qu=new LinkedList<>();
        for(int i=1;i<=n;i++){
            qu.add(i);
        }
        int c=1;
        while(qu.size()!=1){
            if(c%k==0){
                qu.poll();
                c++;
            }else{
                int x=qu.peek();
                qu.poll();
                qu.add(x);
                c++;
            }
        }
        return qu.peek();
    }
}