package threadusinglambda;

public class Main {
 public static void main(String[] args) {
	
	Runnable runnable = () -> {
		
		for(int i = 1 ; i <=10 ; i++) {
			System.out.println("Hello : " + i);
		}
	};
	 
	 Thread childthread = new Thread(runnable);
	 childthread.run();
//	 for(int i = 1; i <= 10; i++ ) {
//			System.out.println("bye : " + i);
//		}
  }
}
