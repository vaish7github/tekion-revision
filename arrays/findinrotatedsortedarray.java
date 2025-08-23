import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int [n];
        for (int i =0;i< nums.length;i++){
            nums[i]= sc.nextInt();
        }
        sc.close();
        int result = minsorted(nums);
        System.out.println(result);
    }

    public static int minsorted(int [] nums){
        int start =0;
        int end = nums.length -1;
        while (start<end){
            if (nums[start]<= nums[end]){
                return nums[start];
            }

            int mid = start+ (end -start)/2;
            if (nums[mid]>= nums[start]){
                end = mid;
            } else {
                start= mid+1;
            }
        }
        return nums[start];
    }
}


// this code basically tells us how many times an array has been rotated 