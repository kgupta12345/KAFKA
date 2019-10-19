package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class People{
	String firstName;
	String secondName;
	
	public People(String firstName, String secondName) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
	}	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", secondName=" + secondName + "]";
	}
}

public class Example2Java8 {

	public static void main(String[] args) {
		List peopleList = new ArrayList();
		peopleList.add(new People("Rahul","Vaish"));
		peopleList.add(new People("Shah","Alam"));
		peopleList.add(new People("Shah","Jahan"));
		peopleList.add(new People("Akbar","Oman"));
		
		//Sort the list by last name
		Collections.sort(peopleList,(People p1,People p2)->p1.getSecondName().compareTo(p2.getSecondName()));
		System.out.println(peopleList);
		
		System.out.println("----------LISTING ALL--------------");
		
		peopleList.forEach((n)->System.out.println(n));
	}

}
