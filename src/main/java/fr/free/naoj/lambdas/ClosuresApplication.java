package fr.free.naoj.lambdas;

import java.util.function.Function;

import fr.free.naoj.lambdas.impl.Entry;

public class ClosuresApplication {
	
	public static void main(String[] args) {		
		final ReferencedConstructorCaller<Entry> entryConstructor = Entry::new;
		final ReferencedConstructorCaller<Dummy> dummyConstructor = Dummy::new;
		final ReferencedConstructorCaller<Entry> otherEntryConstructor = (i, s) -> new Entry(i, s); 
		
		printOut(() -> "Playing with a functional interface, calling toString() on newly created object");
		printOut(() -> entryConstructor.create(0, "Demo"));
		printOut(() -> dummyConstructor.create(1, "DummyDemo"));
		printOut(() -> otherEntryConstructor.create(2, "OtherDemo"));
	}
	
	public static void printOut(ReferencedMethodCaller<?> caller) {
		System.out.println(caller.invoke());
	}
	
	/**
	 * Functional interface representing the invocation
	 * of any method that has no argument
	 * 
	 * @author Naoj
	 *
	 * @param <T> the attented return type
	 */
	private interface ReferencedMethodCaller<T> {
		T invoke();
	}
	
	/**
	 * Functional interface representing the constructor
	 * of type T, taking two parameters. Able to return a 
	 * new instance of the type T
	 * 
	 * @author Naoj
	 *
	 * @param <T>
	 */
	private interface ReferencedConstructorCaller<T> {
		T create(int groupId, String name);
	}
	
	private static class Dummy {
		
		private int i;
		private String s;
		
		public Dummy(int i, String s) {
			this.i = i;
			this.s = s;
		}
		
		@Override
		public String toString() {
			return i + ":" + s;
		}
	}
}
