import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindNthHighestSalary {




    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("anil", 1000);
        map.put("bhavna", 1300);
        map.put("micale", 1500);
        map.put("tom", 1600);
        map.put("aniket", 1200);
        map.put("daniel", 1700);
        map.put("james", 1400);

       // Map.Entry<String, Integer> result = findNthHighest(2,map);

        Map.Entry<Integer, List<String>> result= map.entrySet().stream().
                collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey,
                        Collectors.toList())))
                        .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                        .collect(Collectors.toList()).get(1);

        System.out.println(result);
    }

    private static Map.Entry<String, Integer> findNthHighest(int i, Map<String, Integer> map) {
        return  map.entrySet().stream().
                sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList()).get(i-1);
    }
}
