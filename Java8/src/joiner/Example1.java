package joiner;

import java.util.StringJoiner;

public class Example1 {
	public static void main(String[] args) {

		// public StringJoiner(CharSequence delimiter)
		StringJoiner joinNames0 = new StringJoiner(","); // passing comma(,) as delimiter
		joinNames0.add("aaa");
		joinNames0.add("bbb").add("ccc");
		System.out.println(joinNames0);
		System.out.println(joinNames0.length());

		// public StringJoiner(CharSequence delimiter,CharSequence prefix,CharSequence suffix)
		StringJoiner joinNames1 = new StringJoiner(",", "#", "!"); // passing comma(,) as delimiter
		joinNames1.add("aaa");
		joinNames1.add("bbb").add("ccc");
		System.out.println(joinNames1);
		System.out.println(joinNames1.length());
		
		System.out.println(joinNames0.merge(joinNames1)); // THE PREFIX-POSTFIX did not turned up !

		//___________________________________________________________________
		//Apart from StringJoiner, String Class also provides .join() method.
		//___________________________________________________________________

		String stringJoin1=String.join(",","A","B");
		System.out.println(stringJoin1);

		//DO NOT USE:
		String stringJoin0 = "aaa";
		stringJoin0.join("bbb").join("ccc");
		System.out.println(stringJoin0);


	}
}
