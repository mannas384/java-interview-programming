package questions.programming;

import java.util.*;

public class ThreeNumberSum {

    public static void main(String[] args) {

        int[] nums = {-1,0,1,2,-1,-4};

      Arrays.sort(nums);
        int target = 0;
        Set<List<Integer>> result = new HashSet<>();


        for(int i=0;i<nums.length;i++){

            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                if(target==(nums[i]+nums[left]+nums[right])){
                    List<Integer> subResult = new ArrayList<>();
                    subResult.add(nums[i]);
                    subResult.add(nums[left]);
                    subResult.add(nums[right]);
                    result.add(subResult);
                    left++;
                    right--;
                }else if (target>(nums[i]+nums[left]+nums[right])){
                    left++;
                }else if (target<(nums[i]+nums[left]+nums[right])){
                    right--;
                }

            }

        }
        System.out.println(result.toString());
    }
}
