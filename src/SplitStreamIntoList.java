import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SplitStreamIntoList {


    public static void main(String[] args) {
        // Create stream using Stream builder()
        Stream.Builder<String> builder
                = Stream.builder();

        // Adding elements in the stream of Strings
        Stream<String> stream = builder.add("a")
                .add("b")
                .add("c").add("d").add("e").add("f").add("g").add("h").add("i")
                .build();

        List<String> list = IntStream.range(0, 30).mapToObj(String::valueOf).collect(Collectors.toList());

        AtomicInteger prev = new AtomicInteger(0);
        IntStream.range(1, (int) (3 * (Math.ceil(Math.abs(stream.count() / 3.0)))))
                .filter(i -> i % 3 == 0 || i == stream.count())
                .forEach(i -> {
                    List<String> chunk = list.subList(prev.get(), i);
                    System.out.println("Processing " + chunk);
                    prev.set(i);
                });
    }
}
