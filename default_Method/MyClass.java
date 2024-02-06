package default_Method;

interface Parent{
   
	default void sayhello() {
		System.out.println("Say hello");
	}
}

class Child implements Parent{
	public void sayhello() {
		System.out.println("Say hello child");
	}
}

public class MyClass{
	public static void main(String[] args) {
		Child c = new Child();
		c.sayhello();
	}
}



