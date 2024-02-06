package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main3 {
 public static void main(String[] args) {
	List<String> list = Arrays.asList("Banana", "Orange","Cheray");
	Stream<String> stream = list.stream();
	
	String [] arrys = { "apple","Banana","Cheary"};
	Stream<String> stream2 = Arrays.stream(arrys);
	
	Stream<Integer> stream3 = Stream.of(1,2,3,4);
	
	Stream<Integer> limit = Stream.iterate(0,n -> n+1).limit(100);
	
	Stream<Integer> limit2 = Stream.generate(() -> (int)Math.random()*100).limit(5);
	
 }
}
