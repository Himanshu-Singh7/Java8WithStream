package Predicates;

import java.util.function.Predicate;

public class Main4 {
public static void main(String[] args) {
	 Predicate<String> startWithLetterH = x -> x.toLowerCase().charAt(0) == 'h';
	 Predicate<String> endsWithLetterL = x -> x.toLowerCase().charAt(x.length() -1) == 'l';
	 Predicate<String> predicate = startWithLetterH.or(endsWithLetterL);
	 System.out.println(predicate.test("Himanshu"));
	 
 }
}
