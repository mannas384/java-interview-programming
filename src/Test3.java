import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

final public class Test3 {

    /*private static int count = 0;
    public static int countArrangement(int N) {
        if(N==0) return 0;
        int[] res = new int[N+1];
        for(int i=0; i<=N; i++) res[i] = i;
        helper(res, N);
        return count;

    }
    private static void helper(int[] nums, int start) {
        if (start == 0) {
            count++;
            return;
        }
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] != 0 && (nums[i] % start == 0 || start % nums[i] == 0)) {
                nums[i] = 0;
                helper(nums, start - 1);
                nums[i] = i;
            }
        }

    }*/

    public static void main(String[] args) {
        /*Stream<Integer> aa = Stream.of(3,3,3,3,4,4,4,5,6,6,7,7,7,7,7,7,7,1,1,1,1,2,2);
        List<String> list = aa.map(i->String.valueOf(i)).collect(Collectors.toList());

        //List<String> list = Arrays.asList(String.valueOf(a));
        List<String> list1= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .map(Map.Entry::getKey).

                collect(Collectors.toList());
        list1.stream().forEach(s->System.out.println(s));
        list1.stream();
        int[] a ={1,2,8,1,1,2,2,4,3};


        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i =0;i<a.length;i++){

            if(map.containsKey(a[i])){
                //int count = map.get(a[i]);
                map.put(a[i], map.get(a[i])+1);
            }else{
                map.put(a[i],1);
            }
        }

        for(Map.Entry<Integer,Integer>  m: map.entrySet()){
            System.out.println(m.getKey()+ "   "+ m.getValue());
        }*/
        Integer[]  array = {1,2,3,4,5,6};
        List<Integer> list =  Arrays.asList(array);



        list.stream().forEach(s->System.out.println(s));

        for(int i =0;i<list.size();i++){

           // System.out.println(list.get(i));
        }


        Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[0]+t[1]}).limit(10).map(i->i[0]).forEach(System.out::println);


    }





}
