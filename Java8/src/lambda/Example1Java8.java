package lambda;

// If you compare Java7 way with this Java8 way, you will find that:
// [1] In Java8 interface (meant for Lambda) will have only one method.To ensure this we use @FunctionalInterface
// [2] Writing Lambda expression is evolution to Anonymous Class style ! 


@FunctionalInterface
interface Calculator1 {
	void greetCalculator();
}

@FunctionalInterface
interface Calculator2 {
	int sum(int a, int b);
}

//===================START[NFI]===========================
interface Calculator3 {
	default int sum(int a, int b) {
		return a+b;
	}
	static int mul(int a, int b) {
		return a*b;
	}
}

class Calculator3Impl implements Calculator3{
	
}
//====================END[NFI]===========================

public class Example1Java8 {

	public static void main(String[] args) {

		//EVOLUTION#1
		/*Calculator1 cal1 = new Calculator1() {

			@Override
			public void greetCalculator() {
				System.out.println("Hi Calculator");
			}
		};*/
		
		//EVOLUTION#2
		/*Calculator1 cal1 = () {
		@Override
		public void greetCalculator() {
			System.out.println("Hi Calculator");
		}
	    };*/
		
		//EVOLUTION#3
		/*Calculator1 cal1 = () {
			System.out.println("Hi Calculator");
	    };*/
		
		//EVOLUTION#4
		/*Calculator1 cal1 = () -> {
				System.out.println("Hi Calculator");
		};*/
		
		//EVOLUTION#5
		Calculator1 cal1 = () -> System.out.println("Hi Calculator");
		//NOTE[ABOVE]:
		// () means no parameters. 
		// After -> The statement is returning nothing, therefore void.
		// Interface Calculator1 has a method that satisfies this requirement, therefore all is well !
		Calculator2 cal2 = (a,b) -> {
			if(a<0 || b<0) {
				return 0;
			}
			return a+b;
		};
		//NOTE[ABOVE]:
		// (a,b) means two parameters are expected. 
		// After -> The statement is returning an integer value.
		// Interface Calculator2 has a method that satisfies this requirement, therefore all is well !
		
		cal1.greetCalculator();
		System.out.println(cal2.sum(3, 3));
		//==================START[NFI]=======================
		Calculator3 cal3 = new Calculator3Impl();
		System.out.println(cal3.sum(3, 4));
		System.out.println(Calculator3.mul(2, 4));
		//==================END[NFI]=========================
		
	}
}





