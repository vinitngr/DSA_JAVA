package striversheet.linkedList;

public class FindInteraction {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = 0;
        ListNode copy = headA;
        while(copy != null){
            countA++;
            copy = copy.next;
        }

        int countB = 0;
        copy = headB;
        while(copy != null){
            countB++;
            copy = copy.next;
        }
        System.out.println(countB);

        int diff = countA - countB;

        ListNode head = diff > 0 ? headA : headB;
        for (int i = 0; i < Math.abs(diff) && head != null; i++) {
            head = head.next;
        }
        ListNode otherthenHead = diff <= 0 ? headA : headB;
        while(head != null && otherthenHead != null){
            if(head == otherthenHead){
                return head;
            }
            head =head.next;
            otherthenHead = otherthenHead.next;
        }

        return null;
    }


    public static void main(String[] args) {
        // Example setup
        int[] commonVals = {3 ,4};
        ListNode common = createList(commonVals, null);

        int[] listAvals = {3, 7};
        ListNode headA = createList(listAvals, common);

        int[] listBvals = {99,5,234,5,34, 1};
        ListNode headB = createList(listBvals, common);


        ListNode intersection = getIntersectionNode(headA, headB);
        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.val);
        } else {
            System.out.println("No intersection.");
        }
    }

    public static ListNode createList(int[] vals, ListNode attachNode) {
        if (vals.length == 0) return attachNode;
        ListNode head = new ListNode(vals[0]);
        ListNode current = head;
        for (int i = 1; i < vals.length; i++) {
            current.next = new ListNode(vals[i]);
            current = current.next;
        }
        current.next = attachNode;
        return head;
    }
}
