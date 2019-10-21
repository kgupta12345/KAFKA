package predicate;

import java.util.function.Predicate;

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


        Person person1 = new Person("Rahul", "Lucknow");
        Person person2 = new Person("Rajan", "Lucknow");

        // Creating & CALLING predicate [SAMPLE#1]
        Predicate<String> name = n -> n.length()>4;
        Predicate<String> city = c -> c.startsWith("L");

        System.out.println(name.test("SHAH"));
        System.out.println(city.test("London"));
        System.out.println(name.and(city).test("Lakhan"));



        // Creating & CALLING predicate [SAMPLE#2]
        Predicate<Integer> lesserthan = i -> (i <= 10);
        Predicate<Integer> greaterthan = j -> (j >= 10);
        Predicate<Integer> qualto = k -> (k == 10);

        System.out.println(greaterthan.test(10) && lesserthan.test(10));
        System.out.println(greaterthan.and(lesserthan).and(qualto).test(10));
    }



}
