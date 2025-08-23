import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();
        int [] result = twosum(nums,target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twosum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int compliment =  target- nums[i];
            if (map.containsKey(compliment)) {
                return new int[] { map.get(compliment), i };
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] { -1, -1 };
    }
}