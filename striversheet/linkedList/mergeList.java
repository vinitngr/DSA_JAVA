package striversheet.linkedList;

public class mergeList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode head = (list1.val <= list2.val) ? list1 : list2;
        ListNode p1 = (list1.val <= list2.val) ? list1 : list2;
        ListNode p2 = (list1.val <= list2.val) ? list2 : list1;

        while (p2 != null) {
            if (p1.next == null) {
                p1.next = p2;
                break;
            }

            if (p1.val <= p2.val && p2.val <= p1.next.val) {
                ListNode temp = p2.next;
                p2.next = p1.next;
                p1.next = p2;
                p2 = temp;
            } else {
                p1 = p1.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode l1_3 = new ListNode(5);
        ListNode l1_2 = new ListNode(3, l1_3);
        ListNode l1_1 = new ListNode(1, l1_2);

        ListNode l2_3 = new ListNode(6);
        ListNode l2_2 = new ListNode(4, l2_3);
        ListNode l2_1 = new ListNode(2, l2_2);

        mergeList obj = new mergeList();
        ListNode curr = obj.mergeTwoLists(l1_1, l2_1);
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
