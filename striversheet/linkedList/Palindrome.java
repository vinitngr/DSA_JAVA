package striversheet.linkedList;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2, new ListNode(2, new ListNode(1, new ListNode(2, new ListNode(1, new ListNode(1))))));
        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<>();
        while (head != null) {
            vals.add(head.val);
            head = head.next;
        }
        int left = 0, right = vals.size() - 1;
        while (left < right) {
            if (vals.get(left) != vals.get(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}


//version two
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//    public boolean isPalindrome(ListNode head) {
//        int count = 0 ;
//        ListNode node = head;
//        while( node != null ){
//            count ++;
//            node = node.next;
//        }
//
//        ListNode midNode = head;
//        int k = 0;
//        while( k < count/2){
//            midNode = midNode.next;
//            k++;
//        }
//
//        ListNode prev = null;
//        ListNode curr = midNode ;
//
//        while (curr != null) {
//            ListNode next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//
//        ListNode first = head;
//        ListNode second = prev;
//        while (second != null) {
//            if (first.val != second.val) return false;
//            first = first.next;
//            second = second.next;
//        }
//
//        return true;
//
//    }
