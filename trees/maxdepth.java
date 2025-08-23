import java.util.*;
class Main{
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            data =x;
            left= null;
            right = null;
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
        TreeNode head = arrtotree(nums);
        int result =maxdepth(head);
        System.out.println(result);
    }
    public static TreeNode arrtotree(int [] nums){
        if (nums.length ==0){
            return null;
        }
        TreeNode head = new TreeNode(nums[0]);
        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(head);
        int i =1;
        while (!queue.isEmpty() && i< nums.length){
            TreeNode curr= queue.poll();
            if (i< nums.length && nums[i]!=-1){
                curr.left= new TreeNode (nums[i]);
                queue.offer(curr.left);
            }
            i++;
            if (i< nums.length && nums[i]!=-1){
                curr.right= new TreeNode (nums[i]);
                queue.offer(curr.right);
            }
            i++;
        }
        return head;
    }

    public static int  maxdepth(TreeNode head){
        if (head ==null){
            return 0;
        }
        int left = maxdepth(head.left)+1;
        int right = maxdepth(head.right)+1;
        return Math.max(left,right);
    }
}