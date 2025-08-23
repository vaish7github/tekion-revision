public class reorder {
    static class ListNode {
        int data ;
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
        ListNode result = reorder(head);
        ListNode temp = result ;
        while (temp!= null){
            System.out.print(temp.data+ " ");
        }
        System.out.println();
    }
    public static ListNode arrtoll(int [] nums){
        if (nums.length ==0){
            return null;
        }
        ListNode head = new  ListNode(nums[0]);
        ListNode curr = head;
        for (int i =1;i< nums.length ;i++){
            curr.next= new ListNode (nums[i]);
            curr= curr.next;
        }
        return head;
    }    
    public static ListNode reorder(ListNode head){
        if (head == null || head.next== null){
            return null;
        }

        // now we will be going to the middle of the list
        ListNode fast= head;
        ListNode slow = head;
        while (fast!= null && fast.next!= null){
            slow = slow.next;
            fast= fast.next.next;
        }
        // now we will be reversing the middle of the list
        ListNode split = slow.next;
        slow.next = null;


        // now we will be reversing 
        ListNode prev = null;
        ListNode curr = split;
        while (curr!= null){
            ListNode next = curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        split = prev; // this is the head of the reversed array
        
    }
}
