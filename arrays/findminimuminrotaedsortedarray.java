import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for (int i =0;i< nums.length;i++){
            nums[i]= sc.nextInt();
        }
        int target= sc.nextInt();
        sc.close();
        int result = minimuminsorted(nums, target);
        System.out.println(result);
    }
    public static int minimuminsorted(int [] nums, int target){
        int start =0;
        int end = nums.length -1;
        while (start<= end ){
            int mid = start+ (end - start)/2;
            if (nums[mid]== target){
                return mid;
            }
            if (nums[mid]>= nums [start]){
                if (target>= nums[start] && target< nums[mid]){
                    end = mid -1;
                } else {
                    start= mid+1;
                }
            } else {
                if (target> nums[mid] && target<= nums[end]){
                    start= mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}