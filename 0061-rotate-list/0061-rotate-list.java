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
        if (head == null)
            return null;
        ListNode tmp = head;
        int n = 1;
        while (tmp.next != null) {
            n++;
            tmp = tmp.next;
        }
        k = k % n;
        if (k == 0 || k == n)
            return head;
        tmp.next = head;
        ListNode temp = head;
        for (int i = 1; i <= (n - k - 1); i++) {
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;

    }
}