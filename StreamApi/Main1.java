package StreamApi;
import java.util.Arrays;


public class Main1 {
   public static void main(String[] args) {
	Integer [] arr = {1, 2,3,4,5,6,7,8,31,32,33};
	Integer[] arraysorted = Arrays
	.stream(arr)
	.filter(x -> x > 2)
	.sorted((a,b) -> Integer.compare(b, a))
	.toArray(Integer[]::new);
	
	System.out.println(Arrays.toString(arraysorted));
 }
}
