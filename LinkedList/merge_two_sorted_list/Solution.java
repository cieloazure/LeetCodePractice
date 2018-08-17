/*
// Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
*/ 
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = null; 
        ListNode head = null;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                if(l3 == null){
                    l3 = new ListNode(l1.val);
                    head = l3;
                }else{
                    l3.next = new ListNode(l1.val);
                    l3 = l3.next;
                }
                l1 = l1.next;
            }else{
               if(l3 == null){
                   l3 = new ListNode(l2.val);
                   head = l3;
               }else{
                   l3.next = new ListNode(l2.val);
                   l3 = l3.next;
               } 
               l2 = l2.next; 
            }
        }
        
        while(l1 != null){
            if(l3 == null){
                l3 = new ListNode(l1.val);
                head = l3;
            }else{
                l3.next = new ListNode(l1.val);
                l3 = l3.next;
            }
            l1 = l1.next;
        }
        
        while(l2 != null){
           if(l3 == null){
               l3 = new ListNode(l2.val);
               head = l3;
           }else{
               l3.next = new ListNode(l2.val);
               l3 = l3.next;
           } 
           l2 = l2.next; 
        }
        
        return head;
    }
}
