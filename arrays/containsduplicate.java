import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int [n];
        for (int i =0;i< n;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
        boolean result = isduplicate(nums);
        System.out.println(result);
    }
    public static  boolean isduplicate(int [] nums){
        Set<Integer> set = new HashSet<>();
        for (int i =0;i< nums.length ;i++){
            if (set.contains(nums[i])){
                return true; // this means that we do have a duplicate
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

}