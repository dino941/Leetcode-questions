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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dum=new ListNode(0);
        dum.next=head;
        ListNode pre=dum;
        ListNode cur=dum;
        for(int i=0;i<=n;i++){
            cur=cur.next;
        }
        while(cur!=null){
            cur=cur.next;
            pre=pre.next;
        }
        pre.next=pre.next.next;
        return dum.next;
    }
}