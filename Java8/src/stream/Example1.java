package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Person{
	String name;
	String city;
	
	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	
}

public class Example1 {

	public static void main(String[] args) {
		List <Person> personList = new ArrayList<Person>();
		personList.add(new Person("SHAH","AGRA"));
		personList.add(new Person("AKBAR","DELHI"));
		personList.add(new Person("NOOR","LUCKNOW"));
		personList.add(new Person("HUMANYUN","LAHORE"));
		
		//WITHOUT STREAM:
		/* for(Person p : personList) {
			if(p.getCity().startsWith("L")) {
				System.out.println("L===>"+p.getCity());
			}
		}*/
		
		//WITH STREAM:
		List<String> personList2 = personList.stream().filter(p -> p.getCity().startsWith("L")).map(p -> p.getCity()).collect(Collectors.toList());
		System.out.println(personList2);
		
		//WITH STREAM:
		personList.stream().filter(p -> p.getCity().startsWith("L")).forEach(p->System.out.println(p.getCity()));
		
		//ALSO IN STREAM:
		personList.stream().filter(p -> p.getCity().startsWith("L")).forEachOrdered(p->System.out.println(p.getCity()));
		//By the way: AL & LL both maintain the elements insertion order which means while displaying ArrayList and LinkedList
		//elements the result set would be having the same order in which the elements got inserted into the List.
		
	}

}
