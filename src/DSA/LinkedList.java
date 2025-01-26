package DSA;

public class LinkedList {


     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int list1=0;
            int list2=0;
            while(l1.next!=null)
            {
                list1 = (list1*10) + l1.val;
                l1 = l1.next;
            }
            while(l2.next!=null)
            {
                list1 = (list1*10) + l2.val;
                l2 = l2.next;
            }
            int sum = list1+list2;
            ListNode head = new ListNode();

            head.val = sum%10;
            head.next=null;
            sum = sum/10;
            while(sum!=0)
            {
                ListNode node = new ListNode();
                node.val=sum%10;
                node.next=null;
                head.next=node;
                sum = sum/10;
            }
            return head;
        }
    }
}
