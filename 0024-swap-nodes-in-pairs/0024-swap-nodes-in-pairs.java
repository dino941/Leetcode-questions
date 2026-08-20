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
    public ListNode swapPairs(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode dum=new ListNode(0);
        dum.next=head;
        ListNode pre=dum;
        while(head!=null&&head.next!=null){
            ListNode first=head;
            ListNode sec=head.next;
            pre.next=sec;
            first.next=sec.next;
            sec.next=first;
            pre=first;
            head=first.next;
        }
        return dum.next;
    }
}