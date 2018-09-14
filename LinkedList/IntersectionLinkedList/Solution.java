
public class Solution {

 
  public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    int lengthA = length(headA);
    int lengthB = length(headB);
    int diff = lengthA - lengthB;
    ListNode headX = headA;
    ListNode headY = headB;
    if(diff > 0){
      headX = traverse(headA, diff);
      headY = headB;
    }else if(diff < 0){
      headX = traverse(headB, -1 * diff);
      headY = headA;
    }
    if(headX == headY){
      return headX;
    }

    while(headX != null && headY != null){
      if(headX.next == headY.next){
        return headX.next;
      }else{
        headX = headX.next;
        headY = headY.next;
      }
    }
    return null;
  }
  
  public static void main(String args[]){
    ListNode l = new ListNode(1);
    ListNode l2 = new ListNode(2);
    l.next = l2;
    ListNode l3 = new ListNode(3);
    l2.next = l3;
    ListNode l4 = new ListNode(4);
    l3.next = l4;
    ListNode l5 = new ListNode(5);
    l4.next = l5;
    System.out.println(length(l));
    ListNode l6 = traverse(l, 3);
    System.out.println(l6.val);
  }

  public static int length(ListNode head){
    int length = 0;
    ListNode p = head;
    while(p != null){
      length++;
      p = p.next;
    }
    return length;
  }

  public static ListNode traverse(ListNode head, int count){
    ListNode p = head;
    while(count > 0){
      count--;
      p = p.next;
    }
    return p;
  }
}
