package Predicates;

import java.util.function.Predicate;

public class Main3 {
   public static void main(String[] args) {
	Predicate<String> startWithletterV = x -> x.toLowerCase().charAt(0)=='v';
	System.out.println(startWithletterV.test("Vikash"));
 }
}
