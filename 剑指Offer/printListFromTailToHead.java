// 递归的方法不理解


/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;

// 先反转链表，然后加入
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        listNode = reverseList(listNode);
        ArrayList<Integer> list = new ArrayList<>();
        while (listNode != null) {
            list.add(listNode.val);
            listNode = listNode.next;
        }
        return list;
    }
    
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reverseHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverseHead;
    }
}



import java.util.ArrayList;
import java.util.Stack;

// 利用栈
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> newList = new ArrayList<>();
        
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.empty()) {
            newList.add(stack.pop());
        }
        return newList;
    }
}

// 类似栈，每次插入头
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        while (listNode != null) {
            list.add(0, listNode.val);
            listNode = listNode.next;
        }
        return list;
    }
}