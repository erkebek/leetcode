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
        ListNode result = null;
        ListNode tmp;
        ListNode tmp2;
        tmp = head.next;
        tmp2 = tmp.next;
        tmp.next = head;



        return result;
    }

    public ListNode reverseList2(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode result = null;
        ListNode tmp;
        ListNode current = head;
        ListNode next = head.next;
        while (next != null){
            if(current.next == next){
                current.next = null;
            }
            tmp = next.next;
            next.next = current;
            current = next;
            next = tmp;
            if(next == null){
                result = current;
            }
        }
        return result;
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

