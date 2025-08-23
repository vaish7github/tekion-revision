import java.util.*;
class Main{
    static class ListNode{
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
        sc.close();
        ListNode head = arrtoll(nums);
        boolean result = cycle(head);
        System.out.println(result);
    }
    public static ListNode arrtoll(int [] nums){
        if (nums.length == 0){
            return null;
        }

        ListNode head = new ListNode (nums[0]);
        ListNode curr = head;
        for (int i =1;i< nums.length ;i++){
            curr.next= new ListNode (nums[i]);
            curr= curr.next;
        }
        return head;
    }
    public static boolean cycle(ListNode head){
        ListNode fast= head;
        ListNode slow = head;
        while (fast!= null && fast.next != null){
            fast= fast.next.next;
            slow = slow.next;

            if (fast== slow){
                return true;
            }
        }        
        return false;
    }
}