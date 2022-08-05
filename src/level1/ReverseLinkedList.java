package level1;

import java.util.Stack;

public class ReverseLinkedList {

    public static void main(String[] args) {
        int[] list1 = new int[]{1,2,3,4,5};
        ListNode linkedList1 = null;
        ListNode prevList = null;
        for (int i : list1) {
            if (prevList == null) {
                linkedList1 = new ListNode(i);
                prevList = linkedList1;
            } else {
                prevList.next = new ListNode(i);
                prevList = prevList.next;
            }
        }
        System.out.println(new ReverseLinkedList().reverseList(linkedList1));
    }

    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }

    private ListNode reverse(ListNode current, ListNode prev){
        if(current == null){
            return prev;
        }
        ListNode next = current.next;
        current.next = prev;
        return reverse(next, current);
    }

    public ListNode reverseList2(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while (current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public ListNode reverseList3(ListNode head) {
        if(head == null) return null;
        Stack<ListNode> listNodes = new Stack<>();
        ListNode tmp;
        ListNode current = head;
        while (current != null){
            tmp = current.next;
            current.next = null;
            listNodes.push(current);
            current = tmp;
        }
        ListNode result = listNodes.pop();
        current = result;
        while (!listNodes.isEmpty()) {
            current.next = listNodes.pop();
            current = current.next;
        }
        return result;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return val + " " + next;
        }
    }
}

