package java8.statics.defaults;

public interface Interface2 {
	
	String s = "rishi1";
	
	static void method1() {
		System.out.println(s);
	}
	
	default String method2(String x) {
		return x+s;
		
	}

}
