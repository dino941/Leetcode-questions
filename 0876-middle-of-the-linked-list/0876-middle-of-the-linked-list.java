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
        ListNode tmp=head;
        int c=0;
        while(tmp!=null){
            c++;
            tmp=tmp.next;
        }
        c=c/2;
        for(int i=0;i<c;i++){
            head=head.next;
        }
        return head;
    }
}