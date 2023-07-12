import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {

    // find a subarray whose sum =0;
    public static void main(String[] args) {

        int[] arr = {2,3,4,-5,5};
        Set<Integer> set = new HashSet<>();
        int sum =0;
        boolean find = false;
        for(Integer  e : arr){

            set.add(sum);

            sum+=e;

            // if the condition is  the sum of subarray is k;--then  if(set.contains(sum-k)){}
            if(set.contains(sum)){
                find = true;
            }

        }

        System.out.println(find);






    }
}
