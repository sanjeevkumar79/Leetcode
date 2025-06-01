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
    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        while(slow != null){
            ListNode nextNode = slow.next;
            slow.next= prev;
            prev = slow;
            slow = nextNode;

        }
        int maxsum = 0;
        ListNode first = head;
        ListNode second = prev;
        
        while(second != null){
            int sum = first.val + second.val;
            maxsum = Math.max(maxsum, sum);
            first = first.next;
            second = second.next;
        }
        return maxsum;
    }
}