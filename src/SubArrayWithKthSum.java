import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubArrayWithKthSum {

    // find a subarray whose sum =k;
    public static void main(String[] args) {

        int[] arr = {2,3,4,5,5};
        int k = 7;
        int kthcount = 0,count, i =0, sum = 0;

        Map<Integer,Integer>  map = new HashMap<>();

        while(i<arr.length){

            sum+=arr[i];

            if(sum==k){
                kthcount++;
            }

            if(map.containsKey(sum-k)){
                kthcount= map.get(sum-k);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);

            i++;
        }



        System.out.println(kthcount);

    }
}
