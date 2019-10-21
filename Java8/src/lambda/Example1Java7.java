package lambda;

interface Calculator {
	void greetCalculator();
	int sum(int a, int b);
}

class CalculatorImpl implements Calculator {
	@Override
	public void greetCalculator() {
		System.out.println("Hello Calculator");
	}

	@Override
	public int sum(int a, int b) {
		return a + b;
	}
}

public class Example1Java7 {

	public static void main(String[] args) {
		Calculator cal = new CalculatorImpl();
		cal.greetCalculator();
		System.out.println(cal.sum(1,2));

		Calculator cal1 = new Calculator() {

			@Override
			public int sum(int a, int b) {
				return a+b;
			}

			@Override
			public void greetCalculator() {
				System.out.println("Hi Calculator");
			}
		};
		cal1.greetCalculator();
		cal1.sum(3, 4);
	}

}
