package striversheet.linkedList;

public class RotateList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        if (k == 0) {
            return head;
        }
        int count = 1;
        ListNode curr = head;
        while(curr.next != null){
            count++;
            curr = curr.next;
        }
        curr.next = head;
        k = k % count;

        int c = count - k;
        curr = head;
        for(int i = 1; i < c; i++){
            curr = curr.next;
        }
        ListNode root = curr.next;
        curr.next = null;

        return root;
    }

    public static void main(String[] args) {
        RotateList rl = new RotateList();

        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        int k =4;
        ListNode rotated = rl.rotateRight(head, k);

        while (rotated != null) {
            System.out.print(rotated.val + " ");
            rotated = rotated.next;
        }
    }
}

