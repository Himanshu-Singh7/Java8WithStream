package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
 public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	list.add(1);
	list.add(6);
	list.add(0);
	list.add(99);
	list.add(23);
	list.add(23);
	list.add(12);
	
	Collections.sort(list , (a,b) -> a-b);
	for(Integer list1 : list) {
		System.out.println(list1);
	}
	
	
  }
}
