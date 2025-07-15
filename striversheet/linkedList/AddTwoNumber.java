package striversheet.linkedList;

import org.w3c.dom.NodeList;

public class AddTwoNumber {
    public static class ListNode {
        int val;
        AddTwoNumber.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, AddTwoNumber.ListNode next) { this.val = val; this.next = next; }
    }

    //considering p1 always equal or greater then that of p2
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode p1 = l1;
//        ListNode p2 = l2;
//        int carry = 0;
//
//        while (p1 != null || p2 != null) {
//            int p1value = p1 != null ? p1.val : 0;
//            int p2value = p2 != null ? p2.val : 0;
//
//            int sum = p1value + p2value + carry;
//            if (p1 != null) {
//                p1.val = sum % 10;
//            } else {
//                p1 = new ListNode(sum % 10);
//                ListNode temp = l1;
//                while (temp.next != null) temp = temp.next;
//                temp.next = p1;
//            }
//            carry = sum / 10;
//
//            if ((p1.next == null && p2 != null && p2.next != null) || (p2 == null && p1.next == null && carry > 0)) {
//                p1.next = new ListNode(0);
//            }
//
//            p1 = p1.next;
//            if (p2 != null) p2 = p2.next;
//        }
//
//        if (carry > 0) {
//            ListNode temp = l1;
//            while (temp.next != null) temp = temp.next;
//            temp.next = new ListNode(carry);
//        }
//
//        return l1;
//    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = null;
        ListNode curr = null;
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;

            ListNode node = new ListNode(sum % 10);
            carry = sum/10;

            if (head == null) {
                head = node;
                curr = node;
            } else {
                curr.next = node;
                curr = curr.next;
            }

            if( l1 != null) l1 = l1.next;
            if( l2 != null) l2 = l2.next;
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


        AddTwoNumber obj = new AddTwoNumber();

        AddTwoNumber.ListNode curr = obj.addTwoNumbers(l1_1, l2_1);
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
