//Reference to a static method.
package methodreference;

import java.util.function.BiFunction;


public class Example1_1 {

	public static int addint(int i, int j) {
		return i + j;
	}

	public static float addfloat(int i, float j) {
		return i + j;
	}

	public static void main(String[] args) {
		// T: denotes the type of the first argument to the function
		// U: denotes the type of the second argument to the function
		// R: denotes the return type of the function
		BiFunction<Integer, Integer, Integer> fa = Example1_1::addint;
		System.out.println(fa.apply(2, 4));
		
		// T: denotes the type of the first argument to the function
		// U: denotes the type of the second argument to the function
		// R: denotes the return type of the function
		BiFunction<Integer, Float, Float> fb = Example1_1::addfloat;
		System.out.println(fb.apply(2, 4.9f));
	}
}
