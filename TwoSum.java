class TwoSum {
    static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] x = {3, 2, 4};
        int target = 6;

        for (int i : twoSum(x, target)){
            System.out.println("Index: " + i);
        }

    }
}
