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
    public ListNode reverseList(ListNode head) {

        Stack<ListNode> stack = new Stack();
        ListNode previous = null;
        while(head!=null){

            ListNode save = head.next;
            head.next = previous;
            previous=head;
            head = save;
            
        }
        
        return previous;
    }
}
