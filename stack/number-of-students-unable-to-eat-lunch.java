class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
    Stack<Integer>st=new Stack<>();
    Queue<Integer>qu=new LinkedList<>();
    for(int c:students){
        qu.add(c);
    }
    for(int j=sandwiches.length-1;j>=0;j--){
        st.push(sandwiches[j]);
    }while(!st.isEmpty() && qu.contains(st.peek())){
        if(qu.peek()==st.peek()){
            int x=qu.peek();
            qu.poll();
            st.pop();
        }else{
            int x=qu.peek();
            qu.poll();
            qu.add(x);
        }
    }
    return st.size();
    }
}