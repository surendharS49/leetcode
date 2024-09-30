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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode temp=head;
        int size=1;
        while(temp.next!=null){
            size++;
            temp=temp.next;
        }
        k = k % size;
        if (k == 0) {
            return head;
        }
        int l=1;
        ListNode a=head;
        while(l<size-k){
            a=a.next;
            l++;
        }
        ListNode b=a.next;
        a.next=null;
        ListNode start=b;
        while(b.next!=null){
            b=b.next;
        }
        b.next=head;
        return start;
    }
}