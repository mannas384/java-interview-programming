package questions.programming;

public class MonotonicArray {


    public static void main(String[] args) {
        int[] array = {1,3,2};
        isMonotonic(array);
    }
    public static boolean isMonotonic(int[] nums) {

        Boolean isNonIncreaing=true;
        Boolean isNonDecreasing=true;

        for(int i =1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                isNonDecreasing=false;

            }
            if(nums[i]>nums[i-1]){
                isNonIncreaing=false;

            }


        }

        return isNonIncreaing || isNonDecreasing;

    }
}
