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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(0,null);
        ListNode ans1 = ans;
        if(list1==null && list2==null) return ans.next;
        if(list1==null) return list2;
        if(list2==null) return list1;
        while(list1 != null && list2 != null)
        {
            ListNode a;
            if(list1.val < list2.val)
            {
                a = new ListNode(list1.val,null);
                list1 = list1.next;
            }
            else
            {
                a = new ListNode(list2.val,null);
                list2 = list2.next;
            }
           
            ans.next = a;
            ans = a;
        }
        while(list1!=null)
        {
            ListNode a = new ListNode(list1.val,null);
            ans.next= a;
            ans = a;
            list1= list1.next;
        }
        while(list2!=null)
        {
            ListNode a = new ListNode(list2.val,null);
            ans.next= a;
            ans = a;
            list2= list2.next;
        }
        return ans1.next;
    }
}