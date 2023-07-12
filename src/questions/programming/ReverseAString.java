package questions.programming;

public class ReverseAString {

    public static void main(String[] args) {

        String str = "sourav";

        String str1 = str.chars().mapToObj(c->(char)c).reduce("",(c,s)->s+c,(s1,s2)->s2+s1);
        System.out.println(str1);
    }
}
