/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 // 头结点处理起来特殊，所以虚拟一个头结点
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        
        ListNode cur = dummyHead;
        
        while (cur.next != null) {
            if (cur.next.val == val) {
                // 删除cur.next
                ListNode delNode = cur.next;
                cur.next = delNode.next;
                delNode.next = null;
            } else {
                cur = cur.next;
            }
        }
        return dummyHead.next;
    }
}