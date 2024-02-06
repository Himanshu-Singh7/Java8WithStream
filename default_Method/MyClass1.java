package default_Method;

interface A {
	default void sayHello() {
		System.out.println("say hello A");
	}
}

interface B{
	default void sayHello() {
		System.out.println("say hello B");
	}
}


public class MyClass1 implements A,B{
  public static void main(String[] args) {
	
	  MyClass1 my = new MyClass1();
	  my.sayHello();
  }

@Override
public void sayHello() {
	// TODO Auto-generated method stub
	A.super.sayHello();
	B.super.sayHello();
	System.out.println("Self");
	
  }

}
