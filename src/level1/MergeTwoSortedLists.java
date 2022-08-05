package level1;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
//        int[] list1 = new int[]{1,2,4};
//        int[] list2 = new int[]{1,3,4};
        int[] list1 = new int[]{2};
        int[] list2 = new int[]{1};
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
        ListNode linkedList2 = null;
        prevList = null;
        for (int i : list2) {
            if (prevList == null) {
                linkedList2 = new ListNode(i);
                prevList = linkedList2;
            } else {
                prevList.next = new ListNode(i);
                prevList = prevList.next;
            }
        }
        System.out.println(linkedList1);
        System.out.println(linkedList2);
        System.out.println(new MergeTwoSortedLists().mergeTwoLists(linkedList1, linkedList2));
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode tmpList1;
        ListNode tmpList2;
        if (list1.val > list2.val) {
            return mergeTwoLists(list2, list1);
        }
        if (list1.next != null && list2.val < list1.next.val) {
            tmpList1 = list1.next;
            list1.next = list2;
            tmpList2 = list2.next;
            list2.next = tmpList1;
            return mergeTwoLists(list1, tmpList2);
        }
        list1.next = mergeTwoLists(list1.next, list2);
        return list1;
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

