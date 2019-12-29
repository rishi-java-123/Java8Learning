package java8.generic.functional.interfaces;

public class TestGenericTwoArgsProcessor {

	public static void main(String[] args) {
		TwoArgsProcessor<Integer> twoArgs = new TwoArgsProcessor<Integer>() {

			@Override
			public Integer process(Integer args1, Integer args2) {
				// TODO Auto-generated method stub
				return args1 * args2;
			}
		};

		TwoArgsProcessor<Double> doubleTwoArgs = new TwoArgsProcessor<Double>() {

			@Override
			public Double process(Double args1, Double args2) {
				// TODO Auto-generated method stub
				return args1 * args2;
			}
		};

		TwoArgsProcessor<String> stringCompareProcess = new TwoArgsProcessor<String>() {

			@Override
			public String process(String args1, String args2) {
				// TODO Auto-generated method stub
				return args1.compareTo(args2) > 0 ? args1 : args2;
			}
		};
		
		System.out.println(twoArgs.process(3, 4));
		System.out.println(doubleTwoArgs.process(3.4, 5.6));
		System.out.println(stringCompareProcess.process("rishi", "ranjan"));

	}

}
