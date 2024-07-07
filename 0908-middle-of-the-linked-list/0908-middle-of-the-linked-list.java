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
        int length=0;
        ListNode dummy= head;
        while(dummy!=null)
        {
            length++;
            dummy = dummy.next;
        }
        int half =(length/2);
        while(half>0)
        {
            head = head.next;
            half--;
        }
        return head;
    }
}