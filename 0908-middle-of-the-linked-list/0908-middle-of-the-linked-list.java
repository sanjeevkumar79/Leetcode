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

        
        if(head == null){
            return null;
        }
        ListNode first = head;
        ListNode second = head;

        while(first != null && first.next != null){
            first = first.next.next;
            second = second.next;
        }
        return second;
        
    }
}