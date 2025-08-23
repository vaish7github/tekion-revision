import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int [] nums = new int[n];
        for (int i =0;i< nums.length ;i++){
            nums[i]= sc.nextInt();
        }
        sc.close();
        int result = maxprofit(nums);
        System.out.println(result);
    }
    public static int maxprofit(int [] nums){
        int curr= 0;
        int max = 0;
        int min= nums[0];
        // now we will be finding the minimum number in the array
        for (int i =0;i< nums.length ;i++){
            if (nums[i]<min){
                min = nums[i];
            }

            if (nums[i]> min){
                curr= nums[i]- min;
                max= Math.max(max, curr);
            }
        }
        return max;
    }
}