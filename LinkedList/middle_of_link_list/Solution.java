/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int numberOfNodes = 0;
        ListNode pointer = head;
        while(pointer != null){
            numberOfNodes++;
            pointer = pointer.next;
        }
        int middleIndexOfTheList = (numberOfNodes / 2) + 1;
        ListNode middleOfTheList = head;  
        while(middleIndexOfTheList > 1){
            middleIndexOfTheList--;
            middleOfTheList = middleOfTheList.next;
        }
        return middleOfTheList;
    }
}
