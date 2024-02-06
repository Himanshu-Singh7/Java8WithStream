package Predicates;

import java.util.function.Predicate;

public class Main {
	
    
	public static void main(String[] args) {
		Predicate<Integer> salaryisGreaterThanOneLakh = x -> x >= 100000; 
		 System.out.println(salaryisGreaterThanOneLakh.test(10000));
	}
	
}
