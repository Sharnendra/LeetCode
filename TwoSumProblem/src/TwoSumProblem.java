public class TwoSumProblem {
    public static void main(String[] args) {
        int[] input = {2,5,5,11};

        twoSum(input, 10);
    }

    public static int[] twoSum(int[] nums, int target) {
        boolean found = false;
        int[] output = new int[2];
        for(int i=0; i<nums.length-1 && !found; i++) {
            for(int j=1; j<nums.length; j++) {
                int sum = 0;
                int right = 0;
                sum = nums[i] + nums[j];
                if(sum == target && i != j){
                    output[0] = i;
                    output[1] = j;
                    found = true;
                    break;
                }
            }
        }
        return output;
    }
}
