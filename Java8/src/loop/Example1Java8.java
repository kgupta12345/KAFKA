package loop;

import java.util.ArrayList;
import java.util.List;

public class Example1Java8 {

    public static void main(String[] args) {
        List<String>list = new ArrayList<String>();
        list.add("Q");
        list.add("W");
        list.add("E");
        list.add("R");
        list.add("T");
        list.add("Y");

        list.forEach(l -> System.out.println(l));
        System.out.println("_______________________");

        list.forEach(l -> System.out.println(l.toString().toLowerCase()));
        System.out.println("_______________________");

        //USE ()->{} STYLE
        list.forEach((String l) -> {
            if (l.equals("W")) {
                System.out.println("doubleu");
            } else {
                System.out.println(l);
            }
        });

    }
}
