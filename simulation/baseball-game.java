class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < op.length; i++) {
            if (op[i].equals("C")) {
                st.pop();
            } else if (op[i].equals("D")) {
                int l=st.peek();
                st.push(l * 2);
            } else if (op[i].equals("+")) {
                int a = st.pop();
                int b = st.pop();
                int x = a + b;
                st.push(b);
                st.push(a);
                
                st.push(x);
            } else{
                st.push(Integer.parseInt(op[i]));
            }
        }
        int ans = 0;
        while (!st.isEmpty()) {
            ans = ans + st.pop();
        }
        return ans;
    }
}