import java.util.*;
class Main{
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            data =x;
            left= null;
            right= null;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
    }
    public static TreeNode arrtotree(int [] nums){
        if ( nums.length ==0){
            return null;
        }

        TreeNode head = new TreeNode(nums[0]);
        Queue<TreeNode > queue = new LinkedList<>();
        queue.offer(head);
        int i =1;
        while (!queue.isEmpty() && i< nums.length ){
            TreeNode curr= queue.poll();

            while(i< nums.length && nums[i]!= -1){
                curr.left = new TreeNode (nums[i]);
                queue.offer(curr.left);
            }
            i++;
            while (i< nums.length && nums[i]!= -1){
                curr.right = new TreeNode (nums[i]);
                queue.offer(curr.right);
            }
            i++;
        }
        return head ;
    }
    public static TreeNode inverseTree(TreeNode head){
        inverse(head);
        return head;
    }
    public static TreeNode inverse(TreeNode head){
        if(head == null){
            retunr null;
        }
        
        TreeNode temp= head.left;
        left= head.right;
        right = temp;

// yo meow meow 
    }
}