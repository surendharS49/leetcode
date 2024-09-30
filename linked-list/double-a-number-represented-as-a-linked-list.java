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
    public ListNode doubleIt(ListNode head) {
       ListNode newHead=new ListNode(0,head);
        ListNode pre = newHead;
        ListNode cur = newHead.next;
        while (cur != null) {
            if (cur.val >= 5) {
                pre.val += 1;
                cur.val = (cur.val - 5) * 2;
                pre = cur;
                cur = cur.next;
            } else {
                cur.val = cur.val * 2;
                pre = cur;
                cur = cur.next;
            }
        }
        return (newHead.val==0)?head:newHead;
    }
}