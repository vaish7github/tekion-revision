import java.util.*;

class Main {
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int x) {
            data = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        ListNode list1= arrtoll(nums);
        ListNode list2 = arrtoll(arr);
        ListNode result =merge(list1, list2);

        ListNode temp= result;
        while (temp != null){
            System.out.print(temp.data+ " ");
            temp= temp.next;
        }
        System.out.println();
    }

    public static ListNode arrtoll(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        ListNode head = new ListNode(nums[0]);
        ListNode curr = head;
        for (int i = 1; i < nums.length; i++) {
            curr.next = new ListNode(nums[i]);
            curr = curr.next;
        }
        return head;
    }

    public static ListNode merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                list1.next= merge(list1.next, list2);
                return list1;
            } else {
                list2.next= merge(list1, list2.next);
                return list2;
            }
        }
        return list1;
    }
}