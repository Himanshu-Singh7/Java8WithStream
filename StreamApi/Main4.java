package StreamApi;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main4 {
    public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,68,6,9,10,0,11,6,34,56,73);
		List<Integer> filterNumber = numberList
				.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x /2)
				.distinct()
				.sorted((a,b) -> (b-a))
				.collect(Collectors.toList());
		
		
		
		System.out.println(filterNumber);
	
	List<Integer> collect = Stream
			.iterate(0, n -> n+ 1)
			.limit(101)
			.skip(1)
			.filter(n -> n % 2 == 0)
			.map(n -> n /10)
			.distinct()
			.skip(1)
			.sorted((a,b) -> (b-a))
			.peek(n -> System.out.println(n))
			.collect(Collectors.toList());
	
		 
	}
}
