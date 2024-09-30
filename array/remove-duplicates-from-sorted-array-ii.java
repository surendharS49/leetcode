class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        // Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            // int c=nums[i];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    if (count > 2) {
                        nums[j] = '_';
                        count--;
                    }

                }
            }
            Arrays.sort(nums);
        }
        int a = 0;
        Arrays.sort(nums);
        for (int l : nums) {
            if (l != '_') {
                a++;
            }
        }
        return a;
    }
}