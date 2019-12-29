package java8.generic.functional.interfaces;

@FunctionalInterface
public interface TwoArgsProcessor<X> {
	
X	process(X args1,X args2);

}
