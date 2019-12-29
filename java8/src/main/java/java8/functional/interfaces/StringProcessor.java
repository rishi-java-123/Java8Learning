package java8.functional.interfaces;

@FunctionalInterface
public interface StringProcessor {
	public String process(String s);

	static boolean isLowercase(String s) {
		boolean result = true;
		
		for (int i = 0; i < s.length() && result ; ++i) {
			result &= Character.isLowerCase(s.charAt(i));
		}
		return result;
		

	}
	
	static boolean isUppercase(String s) {
		boolean result = true;
		
		for (int i = 0; i < s.length() && result ; ++i) {
			result &= Character.isUpperCase(s.charAt(i));
		}
		return result;
		

	}

	default String method2(String x) {
		return "rishi";

	}

}
