import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public  class Test {


    
    private  static void m1(int l){
        System.out.println("long");

    }
    private  static void m1(String l){
        System.out.println("string");

    }
    public void getName(){}

    public static void main(String[] args)
    {

        m1(null);
        //System.out.println("from main");
        //System.out.println("Value of a : "+a);
        //System.out.println("Value of b : "+b);
       /* Arrays.stream(new int[] {1,2,3}).map(i->{
            System.out.println(i);
            return i*2;
        });*/
       /* Arrays.stream(new int[] {1,2,3}).map(i->{
            System.out.println(i);
            return i*2;
        }).sum();*/
        //List<Integer> list = Arrays.asList(12,11,22,43,45);

        /*list.stream().sorted(Comparator.comparing(Integer.valueOf(i1).compareTo(i2))).
                collect(Collectors.toList()).forEach(System.out.println());*/
        /*Stream<Integer> aa = Stream.of(3,3,3,3,4,4,4,5,6,6,7,7,7,7,7,7,7,1,1,1,1,2,2);
        List<String> list = aa.map(i->String.valueOf(i)).collect(Collectors.toList());*/

        List<Integer> list = Arrays.asList(3,3,3,3,3,4,4,4,5,6,6,7,7,7,7,7,7,7,1,1,1,1,2,2);
        List<Integer> list1= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .map(Map.Entry::getKey).

                collect(Collectors.toList());

        System.out.println("list of numbers generated by flatMap : " + list1);

    }

}