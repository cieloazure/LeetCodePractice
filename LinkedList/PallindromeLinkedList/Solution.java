class Solution {
    public static ListNode reverseList(ListNode head){
        ListNode p = head;
        ListNode q = p.next;
        ListNode r = null; 
        
        while(q != null){
            r = q.next;
            q.next = p;
            if(p == head){
                p.next = null;
            }
            
            p = q;
            q = r;
        }
        return p;
    }
    public static void printList(ListNode head){
      while(head != null){
        System.out.println(head.val);
        head = head.next;
      }
    }
    public static int countNodes(ListNode head){
      int count = 0;
      while(head != null){
        head = head.next;
        count++;
      }
      return count;
    }
    public static ListNode traverseCountNodes(ListNode head, int count){
      ListNode p = head;
      while(p != null && count > 1){
        count--;
        p = p.next; 
      }
      return p;
    }
    public static void main(String args[]){
      ListNode head = new ListNode(1);
      head.next = new ListNode(2);
      head.next.next = new ListNode(1);
      //head.next.next.next = new ListNode(1);
      //head.next.next.next.next = new ListNode(1);
      //head.next.next.next.next.next = new ListNode(6);
      System.out.println(isPalindrome(head));
    }
    public static boolean isPalindrome(ListNode head) {
      if(head.next == null){
        return true;
      }
      int count = countNodes(head);
      int mid = 0;
      if(count % 2 == 0){
        mid = ( count / 2 ) + 1;
      }else{
        mid = ( count / 2 ) + 2;
      }
      ListNode midHead = traverseCountNodes(head, mid);
      ListNode reverse = reverseList(midHead);
      ListNode front= head;
      ListNode back = reverse; 

      while(back != null){
        System.out.printf("%d and %d\n",front.val, back.val);
        if(front.val != back.val){
          return false;
        }
        front = front.next;
        back = back.next;
      }
      return true;
    }
}
