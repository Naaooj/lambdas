package fr.free.naoj.lambdas;


public class SimpleRunnableClosure {
	
	public static void main(String[] args) {
		SimpleRunnableClosure a = new SimpleRunnableClosure();
		
		a.executeRunnable();
		a.executeRunnableAsClosure();
	}
	
	private void executeRunnable() {
		new Thread(new Runnable() {			
			public void run() {
				System.out.println("Calling run() method from executeRunnable()");
			}
		}).start();
	}
	
	private void executeRunnableAsClosure() {
		//new Thread(() -> System.out.println("Calling run() method from executeRunnableAsClosure()")).start();
	}
}
