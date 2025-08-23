import java.util.*;

class Main {
    static class ListNode {
        ListNode next;
        int data;

        ListNode(int x) {
            data = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        ListNode head = arrtoll(nums);
        ListNode result = reverselinkedlist(head);
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }

    public static ListNode arrtoll(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        ListNode head = new ListNode(nums[0]);
        ListNode curr = head; // this is a list node pointer
        for (int i = 1; i < nums.length; i++) {
            curr.next = new ListNode(nums[i]);
            curr = curr.next;
        }
        return head;
    }

    public static ListNode reverselinkedlist(ListNode head) {
        ListNode prev = null;
        ListNode curr = head; // this is a current pointer
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}