import java.util.*;
class Main{
    static class ListNode {
        int data;
        ListNode next;
        ListNode(int x){
            data =x;
            next= null;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int [n];
        for (int i =0;i< nums.length ;i++){
            nums[i]= sc.nextInt();
        }
        int m = sc.nextInt();
        sc.close();
        ListNode head =arrtoll(nums);
        ListNode result =returnnode(head, m);
        ListNode temp = result;
        while (temp!= null){
            System.out.print(temp.data+ " ");
            temp= temp.next;
        }
        System.out.println();

    }
    public static ListNode arrtoll(int [] nums){
        if(nums.length ==0){
            return null;
        }
        ListNode head = new ListNode(nums[0]);
        ListNode curr = head;
        for (int i =1;i< nums.length ;i++){
            curr.next= new ListNode(nums[i]);
            curr = curr.next;
        }
        return head;
    }
    public static ListNode returnnode (ListNode head, int m){
        ListNode fast = head;
        ListNode slow = head;
        for (int i =0;i< m;i++){
            fast= fast.next;
        }
        if (fast== null){
            return head.next;
        }
        while (fast.next!= null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}