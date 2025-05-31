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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        ListNode first = head;
        ListNode second = head;
        ListNode prev = null;

        while(first != null && first.next != null){
            first = first.next.next;
            prev = second;
            second = second.next;
        }
        prev.next = second.next;
        return head;
    }
}