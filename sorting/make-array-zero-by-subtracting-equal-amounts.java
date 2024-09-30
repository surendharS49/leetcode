import java.util.ArrayList;

class Solution {
    public int minimumOperations(int[] nums) {
        // Filter out non-zero elements
        //System.out.print(nums);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : nums) {
            if (num != 0) {
                arr.add(num);
            }
        }

        int count = 0;
        while (!arr.isEmpty()) {
            int min = Integer.MAX_VALUE;
            for (int num : arr) {
                if (num < min) {
                    min = num;
                }
            }
            
            ArrayList<Integer> newArr = new ArrayList<>();
            for (int num : arr) {
                if (num - min > 0) {
                    newArr.add(num - min);
                }
            }

            arr = newArr;
            count++;
        }

        return count;
    }
}
