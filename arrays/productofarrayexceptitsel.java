import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        int[] result = productexceptitself(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] productexceptitself(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }
        int[] right = new int[n];
        right[n - 1] = 1;
        for (int i = n - 2; i > -1; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        int[] ans = new int[n];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = right[i] * left[i];
        }
        return ans;
    }
}