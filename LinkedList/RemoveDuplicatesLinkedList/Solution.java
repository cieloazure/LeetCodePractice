/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev_ptr = head;
        ListNode ptr = null;
        if(head != null){
            ptr = head.next;
        }
        while(ptr != null){
            if(prev_ptr.val == ptr.val){
                prev_ptr.next = ptr.next;
                ptr = ptr.next;
            }else{
                prev_ptr = ptr;
                ptr = ptr.next;
            }
        }
        return head;
    }
}
