import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int [n];
        for (int i =0;i< nums.length ;i++){
            nums[i]= sc.nextInt();
        }
        sc.close();
        int result = trappingrainwater(nums);
        System.out.println(result);
    }
    public static int trappingrainwater(int [] nums){
        int left =0;
        int right =nums.length-1;
        int leftmax= nums[0];
        int water =0;
        int rightmax = nums[right];
        while (left<right){
            if (leftmax<rightmax){
                left++;
                leftmax= Math.max(leftmax, nums[left]);
                water+= leftmax- nums[left];
            } else {
                right--;
                rightmax= Math.max(rightmax, nums[right]);
                water+= rightmax- nums[right];
            }
        }
        return water;
    }
}