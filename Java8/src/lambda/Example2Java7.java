package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	String firstName;
	String secondName;
	
	public Person(String firstName, String secondName) {
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

class secondNameComp implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getSecondName().compareTo(o2.getSecondName()); 
	}
}

public class Example2Java7 {

	public static void main(String[] args) {
		List <Person>personList = new ArrayList<Person>();
		personList.add(new Person("Rahul","Vaish"));
		personList.add(new Person("Shah","Alam"));
		personList.add(new Person("Shah","Jahan"));
		personList.add(new Person("Akbar","Oman"));

		//Sort the list by last name
		Collections.sort(personList,new secondNameComp());
		System.out.println(personList);
		
		System.out.println("----------LISTING ALL--------------");
		
		for(Person p : personList) {
			System.out.print(p);
		}
		
		
		
	}
	

}
