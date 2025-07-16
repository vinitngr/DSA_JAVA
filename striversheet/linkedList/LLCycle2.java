package striversheet.linkedList;

public class LLCycle2 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                isCycle = true;
                break;
            }
        }
        if (!isCycle) {
            return null;
        }

        slow = head;
        while (fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static ListNode createLinkedList(int[] vals, int pos) {
        if (vals.length == 0) return null;
        ListNode head = new ListNode(vals[0]);
        ListNode current = head;
        ListNode cycleEntry = null;

        for (int i = 1; i < vals.length; i++) {
            current.next = new ListNode(vals[i]);
            current = current.next;
            if (i == pos) {
                cycleEntry = current;
            }
        }
        if (pos >= 0) {
            current.next = cycleEntry;
        }
        return head;
    }

    public static void main(String[] args) {
        LLCycle2 solution = new LLCycle2();

        int[] vals = {3, 2, 0, -4};
        int cyclePos = 1;

        ListNode head = createLinkedList(vals, cyclePos);
        ListNode cycleNode = solution.detectCycle(head);

        if (cycleNode != null) {
            System.out.println("Cycle detected at node with value: " + cycleNode.val);
        } else {
            System.out.println("No cycle detected");
        }
    }
}


//east when you have idea above tortoise hare method
//runtime 100% memory 80% - beat