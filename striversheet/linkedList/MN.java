package striversheet.linkedList;

import org.w3c.dom.NodeList;

public class MN {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {

        int count = 0;
        ListNode curr = head;
        while (curr.next != null) {
            count++;
            curr = curr.next;
        }
        count++;
        int mid = count/2;
        ListNode midNode = head;
        count = 0;
        while (count < mid) {
            midNode = midNode.next;
            count++;
        }

        return midNode;
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode node0 = new ListNode(1, node1);

        MN obj = new MN();
        ListNode mid = obj.middleNode(node0);

        ListNode curr = mid;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}


//100% runtime , 20-30% , GPT - we can improve this method's memory using tortoise hare method