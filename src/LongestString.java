import java.util.HashSet;
import java.util.Set;

public class LongestString {



    public static int lengthOfLongestSubstring(String s) {

        int pointa = 0;
        int pointb = 0;
        int max = 0;
        Set<Character> set = new HashSet();
        while(pointb< s.length()){

            if(!set.contains(s.charAt(pointb))){
                set.add(s.charAt(pointb));
                pointb++;
                max = Math.max(set.size(),max);
            }else{
                set.remove(s.charAt(pointa));
                pointa++;
            }

        }
        return max;

    }
    public static void main(String[] args){

        String s = "aaba";
        System.out.println(lengthOfLongestSubstring(s));
    }

}
