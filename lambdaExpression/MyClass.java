package lambdaExpression;

public class MyClass {
 
	public static void main(String[] args) {
		Empolyee sde = () -> "Software eng";
		Empolyee sde2 = () -> "Appilication Manager";
		
		System.out.println(sde.getName());
        System.out.println(sde2.getName());
	}
}
