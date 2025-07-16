package striversheet.linkedList;

public class ReverseGroup {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int groups = count / k;
        ListNode prev = null;
        ListNode curr = head;
        ListNode output = null;
        ListNode firstEach = null;
        ListNode secondEach = head;
        int i = 1;
        int group = 0;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

            if (i % k == 0) {
                group++;
                if (output == null) output = prev;
                if (firstEach != null) firstEach.next = prev;
                secondEach.next = curr;

                firstEach = secondEach;
                secondEach = curr;
                prev = null;

                if (group == groups) break;
            }

            i++;
        }

        return output;
    }


    public static ListNode buildList(int[] vals) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int val : vals) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseGroup solution = new ReverseGroup();
        int[] vals = {1, 2, 3, 4, 5 , 6, 7};
        ListNode head = buildList(vals);
        printList(head);
        int k = 4;
        ListNode result = solution.reverseKGroup(head, k);
        printList(result);
    }
}
