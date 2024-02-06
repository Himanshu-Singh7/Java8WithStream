package Consumer;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
  
	public static void main(String[] args) {
	
	Consumer<String> name = s -> System.out.println(s);
	name.accept("Himanshu");
	
	Consumer<List<Integer>> list1 = li -> {
		for(Integer i : li) {
			System.out.println(i + 100);
		}
		
	};
	
	Consumer<List<Integer>> list2 = li -> {
		for(Integer i : li) {
			System.out.println(i);
		}
	};
	Consumer<List<Integer>> consumer = list1.andThen(list2);
	consumer.accept(Arrays.asList(1,2,3,4,5,6));
  }
}
