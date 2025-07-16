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
