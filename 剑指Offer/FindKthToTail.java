/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/

// 倒序遍历链表思路，递归
// TODO:快指针，慢指针
public class Solution {
    int index = 0;
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null) {
            return null;
        }
        ListNode node = FindKthToTail(head.next, k);
        if (node != null)
            return node;
        index++;
        if (index == k) {
            return head;
        }
        return null;
    }
}