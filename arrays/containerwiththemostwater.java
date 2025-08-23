import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int [n];
        for (int i =0;i< n;i++){
            nums[i]= sc.nextInt();
        }
        sc.close();
        int result = container(nums);
        System.out.println(result);
    }
    public static int container(int [] nums){
        int left =0;
        int right = nums.length -1;
        int water=0;
        while (left<right){
            int length = right - left;
            int area = length *Math.min(nums[right], nums[left]);
            water= Math.max(water, area);

            if (nums[left]<nums[right]){
                left++;
            } else {
                right--;
            }
        }
        return water;

    }
}