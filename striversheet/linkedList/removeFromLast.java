package striversheet.linkedList;


import Utils.utils;

public class removeFromLast {
    public static class ListNode {
        public int val;
        public ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        int count = 1 ;
        while(node.next != null ){
            count++;
            node = node.next;
        }

        if(n== count){
            return head.next;
        }
        int target = count - n;
        node = head;

        for (int i = 0; i < target && node.next != null ; i++) {
            if(i == target-1){
                node.next = node.next.next;
                break;
            }
            node = node.next;
        }
        utils.printLinkedList(head);
        return head;

    }


    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        removeFromLast obj = new removeFromLast();

        ListNode curr = obj.removeNthFromEnd(node1 , 5);
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}


//much better then using one pass method , got 100% runtime and 80% memory


//method 2 // was tryting to use one pass  //which is not actually a one pass method
//public ListNode removeNthFromEnd(ListNode head, int n) {
//    List<ListNode> Llist = new LinkedList<>();
//    ListNode list = head;
//    while (list != null) {
//        Llist.add(list);
//        if (Llist.size() > n + 1) {
//            Llist.removeFirst();
//        }
//        list = list.next;
//    }
//    if (Llist.size() == n) {
//        return head.next;
//    }
//    Llist.getFirst().next = Llist.getFirst().next.next;
//    return head;
//}