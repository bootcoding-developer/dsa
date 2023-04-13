package dsa.ds.array.basic;

public class RunningSum1DArray {
    public static void main(String[] args) {
        RunningSum1DArray runningSum1DArray = new RunningSum1DArray();
        int[] array = {1, 3, 4, 6, 9 , 23};
        int[] runningSum = runningSum1DArray.runningSum(array);
        System.out.println(runningSum);
    }


    public int[] runningSum(int[] nums) {
        int n = nums.length;
        for(int i = 1; i < n; i++){
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }
}



























