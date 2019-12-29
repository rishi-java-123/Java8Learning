package java8.statics.defaults;

public class Test1 {

	public static void main(String[] args) {
		Interface2.method1();
		
		Interface2 obj1 = new Class2();
		System.out.println(obj1.method2("hello"));
		
		Interface2 obj2 = new Class3();
		System.out.println(obj2.method2("world"));
		
	}
}
