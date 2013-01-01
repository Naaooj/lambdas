package fr.free.naoj.lambdas.impl;

/**
 * Defines the mapping between an input and its return,
 * regardless the given objects
 * 
 * @author Naoj
 *
 * @param <T>
 * @param <U>
 */
public interface Mapper<T, U> {
	U map(T t);
}
