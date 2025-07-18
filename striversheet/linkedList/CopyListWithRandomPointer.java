package striversheet.linkedList;

public class CopyListWithRandomPointer {
    public static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Node copy = head;
        while (copy != null) {
            Node temp = copy.next;
            Node newNode = new Node(copy.val);
            copy.next = newNode;
            newNode.next = temp;
            copy = copy.next.next;
        }

        copy = head;
        while (copy != null) {
            if (copy.random != null) {
                copy.next.random = copy.random.next;
            }
            copy = copy.next.next;
        }

        copy = head;
        Node copyHead = head.next;
        while (copy != null) {
            Node temp = copy.next;
            copy.next = temp.next;
            copy = copy.next;
            if (copy != null) {
                temp.next = copy.next;
            }
        }

        return copyHead;

    }


    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            String randomVal = curr.random != null ? String.valueOf(curr.random.val) : "null";
            System.out.print(curr.val + "(" + randomVal + ")");
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node n0 = new Node(7);
        Node n1 = new Node(13);
        Node n2 = new Node(11);
        Node n3 = new Node(10);
        Node n4 = new Node(1);

        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        n0.random = null;
        n1.random = n0;
        n2.random = n4;
        n3.random = n2;
        n4.random = n0;

        System.out.println("Original List:");
        printList(n1);

        CopyListWithRandomPointer sol = new CopyListWithRandomPointer();
        Node copied = sol.copyRandomList(n1);

        System.out.println("Copied List:");
        printList(copied);
    }
}

//version first
//class Solution {
//    public Node copyRandomList(Node head) {
//        if(head == null) return null;
//        Map<Node, Node> map = new HashMap<>();
//
//        Node node = new Node(head.val);
//        Node nodeHead = node;
//        Node copy = head;
//        while(copy != null){
//            node.next = copy.next == null ? null : new Node(copy.next.val);
//            map.put(copy, node);
//            node = node.next;
//            copy = copy.next;
//        }
//
//        Node something = nodeHead;
//        copy = head;
//        while(copy != null){
//            something.random = map.get(copy.random);
//            something = something.next ;
//            copy = copy.next;
//        }
//
//        return nodeHead;
//    }
//}
