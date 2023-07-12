package questions.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {

    public static void main(String[] args) {
       int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int idxOne=0;
        int idxTwo=0;
        int current = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;



        List<List<Integer>> result = new ArrayList<>();
        while(idxOne<nums1.length && idxTwo<nums2.length){
            List<Integer> subResult = new ArrayList<>();

            if(nums1[idxOne]<nums2[idxTwo]){
                current = nums2[idxTwo]-nums1[idxOne];
                idxOne++;
            }else if(nums1[idxOne]>nums2[idxTwo]){
                current = nums1[idxOne]-nums2[idxTwo];
                idxTwo++;
            }else{
                subResult.add(nums1[idxOne]);
                subResult.add(nums2[idxTwo]);
                idxOne++;
                idxTwo++;
            }

            if(smallest>current){
                smallest = current;
                subResult.add(nums1[idxOne]);
                subResult.add(nums2[idxTwo]);

            }

            System.out.println(subResult.toString());

        }


    }
}
