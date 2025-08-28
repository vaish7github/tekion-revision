import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums= new int[n];   
        
        for (int i =0;i< n;i++){
            nums[i]= sc.nextInt();
        }
        sc.close();
        int result = maxsubarray(nums);
        System.out.println(result);

        // this is an edit 
    }
    public static int maxsubarray(int [] nums){
        int curr = nums[0];
        int max= nums[0];

        for (int i =1;i< nums.length ;i++){
            curr= Math.max(nums[i], curr+nums[i]);
            max= Math.max(max, curr);
        }
        return max;
    }
}