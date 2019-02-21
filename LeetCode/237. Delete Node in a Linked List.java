/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 // 修改的值
class Solution {
    public void deleteNode(ListNode node) {
        if (node == null)
            return;
        if (node.next == null) {
            node = null;
            return;
        }
        
        node.val = node.next.val;
        ListNode delNode = node.next;
        node.next = delNode.next;
        
        delNode = null;
        return;
    }
}