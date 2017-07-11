/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {

    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public ListNode subtract(ListNode A) {

        ListNode midNode = A;
        ListNode lastNode = A.next;

        //Finding the middle node
        while(lastNode != null && lastNode.next != null){
            midNode = midNode.next;
            lastNode = lastNode.next.next;
        }

        //Reversing the second half of the linked list
        ListNode head2 = reverseList(midNode.next);
        ListNode curr = A;
        ListNode curr2 = head2;

        while(curr2 != null){
            curr.val = curr2.val - curr.val;
            curr = curr.next;
            curr2 = curr2.next;
        }
        reverseList(head2);

        return A;
    }
}
