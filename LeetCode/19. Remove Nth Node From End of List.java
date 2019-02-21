/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// 一次遍历
// 双指针
// right与left之间的间距始终是n，然后遍历到left为链表最后，right就是倒数第n个，最后删除
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        
        ListNode left = dummyHead;
        ListNode right = dummyHead;
        
        for (int i = 0; i < n + 1; i++) {
            right = right.next;
        }
        
        while (right != null) {
            left = left.next;
            right = right.next;
        }
        
        ListNode delNode = left.next;
        left.next = delNode.next;
        delNode = null;
        
        ListNode retNode = dummyHead.next;
        dummyHead = null;
        
        
        return retNode;
        
        
    }
}