class ContagiouSubArray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.print(max_SubArray(nums));
    }
    public static int max_SubArray(int[] nums) {
        if (nums.length < 1) {
            return 0;

        }
        int max = 0;
        int current = 0;
        for (int i = 0; i  <= nums.length-1; i ++){
            current = current + nums[i];
            if (current < max){
                max = current;
            }
            if (current < 0 ){
                current = 0;
            }
        }
        return max;

    }
}
