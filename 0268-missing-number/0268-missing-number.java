public class Solution {
    public int missingNumber(int[] nums) {
        boolean[] app = new boolean[nums.length + 1];
        for (int i = 0; i < nums.length; i ++) {
            app[nums[i]] = true;
        }
        for (int i = 0; i < app.length; i ++) {
            if (!app[i]) {
                return i;
            }
        }
        return 0;
    }
}