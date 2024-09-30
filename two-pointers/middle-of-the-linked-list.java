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
    public ListNode middleNode(ListNode head) {
       Stack<ListNode>q=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            q.push(temp);
            temp=temp.next;
        }
        int n=q.size()/2;
        int i=0;
        while(i<n &&head.next!=null){
            head=head.next;
            i++;
        }
        return head;
    }
}