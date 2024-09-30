/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode>st=new Stack<>();
        Stack<ListNode>st1=new Stack<>();
        l1=reverseList(l1);
        l2=reverseList(l2);
        while(l1!=null){
            st.push(l1);
            l1=l1.next; 
        }
        while(l2!=null){
            st1.push(l2);
            l2=l2.next;
        } 
      ListNode ans = null; 
        int carry = 0;
        while(!st.empty() || !st1.isEmpty() || carry != 0){
            int sum=carry;
            if (!st.isEmpty()) {
                sum += st.pop().val;
            }
            if (!st1.isEmpty()) {
                sum += st1.pop().val;
            }
           carry=sum/10;
           sum=sum%10;
            ListNode res=new ListNode(sum);
            res.next=ans;
            ans=res;
        }
        return reverseList(ans);
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
}

}