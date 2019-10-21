//Reference to a static method.
package methodreference;

@FunctionalInterface
interface forfunction1 {
	void f1();
}

@FunctionalInterface
interface forfunction2 {
	String f2();
}

@FunctionalInterface
interface forfunction3 {
	int f3(int i, int j);
}

public class Example1 {
	public static void function1() {
		System.out.println("Hello, this is function1.");
	}

	public static String function2() {
		return "Hello, this is function2.";
	}
	
	public static int function3(int i,int j) {
		return i+j;
	}

	public static void main(String[] args) {
		// Referring static method
		forfunction1 fa = Example1::function1;
		fa.f1();
		// Referring static method
		forfunction2 fb = Example1::function2;
		System.out.println(fb.f2());
		
		forfunction3 fc = Example1::function3;
		System.out.println(fc.f3(2, 4));
	}
}
