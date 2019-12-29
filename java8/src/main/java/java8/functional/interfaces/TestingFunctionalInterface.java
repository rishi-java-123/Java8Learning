package java8.functional.interfaces;

public class TestingFunctionalInterface {
	
	public static void main(String[] args) {
		StringProcessor sonp = new StringProcessor() {
			
			@Override
			public String process(String s) {
				// TODO Auto-generated method stub
				return s.toLowerCase();
			}
		};
		
		StringProcessor toUpperCase = new StringProcessor() {
		    @Override
		    public String process(String s)
		    {
		        return s.toUpperCase();
		    }
		};
		
		String s = sonp.process("FUNCTIONALINTERFACE");
		System.out.println(s);
		System.out.println("Lower case: " + StringProcessor.isLowercase(s));
		System.out.println("Upper case: " + StringProcessor.isUppercase(s));
		String t = toUpperCase.process(s);
		System.out.println("\n" + t);
		System.out.println("Lower case: " + StringProcessor.isLowercase(t));
		System.out.println("Upper case: " + StringProcessor.isUppercase(t));
		
	}
	

}
