package methodreference;

//Reference to an instance method.
@FunctionalInterface
interface FunInt1 {
	void f1();
}

@FunctionalInterface
interface FunInt2 {
	int f2();
}

@FunctionalInterface
interface FunInt3 {
	int f3(int i, int j);
}

class InstanceMethodImpl {
	void function1() {
		System.out.println("HELLO");
	}

	int function2() {
		return 1;
	}

	int function3(int i, int j) {
		return i + j;
	}
}

public class Example2 {
	public static void main(String[] args) {
		InstanceMethodImpl instance = new InstanceMethodImpl();
		FunInt1 i1 = instance::function1;
		i1.f1();

		FunInt2 i2 = instance::function2;
		System.out.println(i2.f2());
		
		FunInt3 i3 = instance::function3;
		System.out.println(i3.f3(1,2));
	}
}
