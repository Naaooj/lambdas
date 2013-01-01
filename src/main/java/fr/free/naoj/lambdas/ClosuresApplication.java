package fr.free.naoj.lambdas;

import java.util.function.Function;

import fr.free.naoj.lambdas.impl.Entry;

public class ClosuresApplication {
	
	public static void main(String[] args) {
		Entry entry = new Entry(0, "Demo");
		
		final ReferencedMethodCaller<Integer> getGroupIdMethod = entry::getGroupId;
		final ReferencedMethodCaller<String> getNameMethod = entry::getName;
		
		printOut(() -> "Playing with a functional interface");
		printOut(() -> getGroupIdMethod.invoke() + ":" + getNameMethod.invoke());
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
}
