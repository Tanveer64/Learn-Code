package twelve.features;

import java.util.List;
import java.util.stream.Collectors;

public class TeesingCollector {
    public static void main(String[] args) {
        /*
        The Teeing Collector is a new collector in the Collectors class that allows the collection of elements
         into two different results and then merges them into a final result. This feature enhances the
         capabilities of the Streams API, enabling more complex data processing in a single pass.
        */
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
      var result = numbers.stream().collect(Collectors.teeing(Collectors.summingInt(Integer::intValue),
                Collectors.averagingInt(Integer::intValue), (sum, avg) -> "Sum: " + sum + ", Average: " + avg));
      System.out.println("Result = " + result);
      /*
        explanation
           teeing: the teeing() method takes three arguments: two downstream collectors and a merging function. it collects elements into the two downstream collectors and merges the results using the merging function.
           single pass: the teeing collector allows for complex data processing in a single pass through the stream, improving performance and readability.
        */
    }
}
